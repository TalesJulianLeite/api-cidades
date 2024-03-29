package com.tales.apicidades.dtos;

/**
 * 
 * @author Tales
 *
 */
public class CityDTO {

	private Integer ibge_id;
	private String uf;
	private String name;
	private Boolean capital;
	private Double lon;
	private Double lat;
	private String no_accents;
	private String alternative_names;
	private String microregion;
	private String mesoregion;
	
	public CityDTO() {
		
	}
	
	/**
	 * 
	 * @param ibge_id
	 * @param uf
	 * @param name
	 * @param capital
	 * @param lon
	 * @param lat
	 * @param no_accents
	 * @param alternative_names
	 * @param microregion
	 * @param mesoregion
	 */
	public CityDTO(Integer ibge_id, String uf, String name, Boolean capital, Double lon, Double lat,
			String no_accents, String alternative_names, String microregion, String mesoregion) {
		super();
		this.ibge_id = ibge_id;
		this.uf = uf;
		this.name = name;
		this.capital = capital;
		this.lon = lon;
		this.lat = lat;
		this.no_accents = no_accents;
		this.alternative_names = alternative_names;
		this.microregion = microregion;
		this.mesoregion = mesoregion;
	}
	/**
	 * @return the ibge_id
	 */
	public Integer getIbge_id() {
		return ibge_id;
	}
	/**
	 * @param ibge_id the ibge_id to set
	 */
	public void setIbge_id(Integer ibge_id) {
		this.ibge_id = ibge_id;
	}
	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capital
	 */
	public Boolean getCapital() {
		return capital;
	}
	/**
	 * @param capital the capital to set
	 */
	public void setCapital(Boolean capital) {
		this.capital = capital;
	}
	/**
	 * @return the lon
	 */
	public Double getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}
	/**
	 * @return the lat
	 */
	public Double getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}
	/**
	 * @return the no_accents
	 */
	public String getNo_accents() {
		return no_accents;
	}
	/**
	 * @param no_accents the no_accents to set
	 */
	public void setNo_accents(String no_accents) {
		this.no_accents = no_accents;
	}
	/**
	 * @return the alternative_names
	 */
	public String getAlternative_names() {
		return alternative_names;
	}
	/**
	 * @param alternative_names the alternative_names to set
	 */
	public void setAlternative_names(String alternative_names) {
		this.alternative_names = alternative_names;
	}
	/**
	 * @return the microregion
	 */
	public String getMicroregion() {
		return microregion;
	}
	/**
	 * @param microregion the microregion to set
	 */
	public void setMicroregion(String microregion) {
		this.microregion = microregion;
	}
	/**
	 * @return the mesoregion
	 */
	public String getMesoregion() {
		return mesoregion;
	}
	/**
	 * @param mesoregion the mesoregion to set
	 */
	public void setMesoregion(String mesoregion) {
		this.mesoregion = mesoregion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alternative_names == null) ? 0 : alternative_names.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((ibge_id == null) ? 0 : ibge_id.hashCode());
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((lon == null) ? 0 : lon.hashCode());
		result = prime * result + ((mesoregion == null) ? 0 : mesoregion.hashCode());
		result = prime * result + ((microregion == null) ? 0 : microregion.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no_accents == null) ? 0 : no_accents.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDTO other = (CityDTO) obj;
		if (alternative_names == null) {
			if (other.alternative_names != null)
				return false;
		} else if (!alternative_names.equals(other.alternative_names))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (ibge_id == null) {
			if (other.ibge_id != null)
				return false;
		} else if (!ibge_id.equals(other.ibge_id))
			return false;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (lon == null) {
			if (other.lon != null)
				return false;
		} else if (!lon.equals(other.lon))
			return false;
		if (mesoregion == null) {
			if (other.mesoregion != null)
				return false;
		} else if (!mesoregion.equals(other.mesoregion))
			return false;
		if (microregion == null) {
			if (other.microregion != null)
				return false;
		} else if (!microregion.equals(other.microregion))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no_accents == null) {
			if (other.no_accents != null)
				return false;
		} else if (!no_accents.equals(other.no_accents))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [ibge_id=" + ibge_id + ", uf=" + uf + ", name=" + name + ", capital=" + capital + ", lon=" + lon
				+ ", lat=" + lat + ", no_accents=" + no_accents + ", alternative_names=" + alternative_names
				+ ", microregion=" + microregion + ", mesoregion=" + mesoregion + "]";
	}
	
	
}
