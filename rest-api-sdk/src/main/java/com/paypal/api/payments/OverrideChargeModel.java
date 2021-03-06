package com.paypal.api.payments;

import com.paypal.core.rest.JSONFormatter;
import com.paypal.api.payments.Currency;

public class OverrideChargeModel  {

	/**
	 * ID of charge model.
	 */
	private String chargeId;

	/**
	 * Updated Amount to be associated with this charge model.
	 */
	private Currency amount;

	/**
	 * Default Constructor
	 */
	public OverrideChargeModel() {
	}

	/**
	 * Parameterized Constructor
	 */
	public OverrideChargeModel(String chargeId, Currency amount) {
		this.chargeId = chargeId;
		this.amount = amount;
	}


	/**
	 * Setter for chargeId
	 */
	public OverrideChargeModel setChargeId(String chargeId) {
		this.chargeId = chargeId;
		return this;
	}

	/**
	 * Getter for chargeId
	 */
	public String getChargeId() {
		return this.chargeId;
	}


	/**
	 * Setter for amount
	 */
	public OverrideChargeModel setAmount(Currency amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Getter for amount
	 */
	public Currency getAmount() {
		return this.amount;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}
