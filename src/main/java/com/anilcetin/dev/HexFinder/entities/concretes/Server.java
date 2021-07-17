package com.anilcetin.dev.HexFinder.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="servers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
@Entity
public class Server {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="server_id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@OneToMany(mappedBy = "server")
	private List<User> users;

}
