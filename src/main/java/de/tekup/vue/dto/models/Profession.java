package de.tekup.vue.dto.models;

import lombok.Getter;

@Getter
public enum Profession {
	DEVELOPER("Developer"), TESTER("Tester"), ARCHITECT("Architect");

	private final String displayValue;

	private Profession(String displayValue) {
		this.displayValue = displayValue;
	}
}
