package com.entity;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type;
@Entity
@Table(name="eproduct")
public class EProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="eid")
	private long id;
	
	@Column(name="ename")
	private String name;
	
	@Column(name="price")
	private BigDecimal price;

	@Column(name="date")
	private Date dateAdded;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "eproduct")
	private List<Color>colors;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "eproduct")
	private Collection<ScreenSize>screenSizes;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "eproduct")
	private Set<OS> os;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "eproduct")
	private Set<Finance> finance;
	
	
	public EProduct() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	public List<Color> getColors() {
		return colors;
	}
	public void setColors(List<Color> colors) {
		this.colors = colors;
	}
	public Collection<ScreenSize> getScreenSizes() {
		return screenSizes;
	}
	public void setScreenSizes(Collection<ScreenSize> screenSizes) {
		this.screenSizes = screenSizes;
	}
	public Set<OS> getOs() {
		return os;
	}
	public void setOs(Set<OS> os) {
		this.os = os;
	}
	public Set getFinance() {
		return finance;
	}
	public void setFinance(Set finance) {
		this.finance = finance;
	}
	

}
