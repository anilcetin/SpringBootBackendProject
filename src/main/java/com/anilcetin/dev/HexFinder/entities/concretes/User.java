package com.anilcetin.dev.HexFinder.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","datas"})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String password;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="last_active")
	private Date lastActive;
	
	@ManyToOne()
	@JoinColumn(name="server_id")
	private Server server;
	
	@ManyToOne()
	@JoinColumn(name="cliem_id")
	private Cliem cliem;
	
	@OneToMany(mappedBy = "user")
	private List<DataEntity> datas;

}
