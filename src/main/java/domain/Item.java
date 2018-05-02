package domain;

import java.util.Date;

/**
 * Created by zhangshuyi1 on 2018/2/12.
 */
public class Item {
    private Long id;
    private String name;
    private String shortName;
    private String englistName;
    private Double price;
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEnglistName() {
        return englistName;
    }

    public void setEnglistName(String englistName) {
        this.englistName = englistName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
}
