package com.telus.shipping.model;

import lombok.Data;

/**
 * The city bean.
 *
 * @author John Dexter Reyes
 */
@Data
public class City {

	private long uuid;

	private String code;

	private String city;

	private String name;

	private String region;

	private double latitude;

	private double longitude;

}
