package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="card_comet")
public class CardComet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="customer_full_name",length = 60, nullable = false)
	private String customerFullName;
	
	@Column(name="customer_designation",length = 60, nullable = false)
	private String customerDesignation;
	
	@Column(name="customer_information",length = 1024, nullable = false)
	private String customerInformation;
	
	@Column(name="customer_mobile_number",length = 12, nullable = false,unique = true)
	private String customerMobileNumer;
	
	@Column(name="customer_mail_id",length = 40, nullable = false)
	private String customerMailId;
	
	@Column(name="customer_address",length = 256, nullable = false)
	private String customerAddress;
	
	@Column(name="customer_website",length = 512, nullable = false)
	private String customerWebsite;
	
	@Column(name="customer_instagram_id",length = 512, nullable = false, unique = true)
	private String customerInstagramId;
	
	@Column(name="customer_whatsapp_number",length = 12, nullable = false,unique = true)
	private String customerWhatsappNumber;

	@Column(name="url_cover_photo",length = 1024, nullable = false)
	private String urlCoverPhoto;
	
	@Column(name="url_profile_photo",length = 1024, nullable = false)
	private String urlProfilePhoto;
	
	@Column(name="register_date", nullable = false)
	private LocalDate registerDate;
	
	
}
