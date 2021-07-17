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
@Entity
@Table(name="reasons")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","datas"})
public class Reason {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reason_id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@OneToMany(mappedBy = "reason")
	private List<DataEntity> datas;
}
