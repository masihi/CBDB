package com.tenico.sirs.CommonTypes;

import java.util.Date;
import java.util.UUID;

public class Patient_Clinician {
	private int patient_id;
	private int clinician_id;
	
	public Patient_Clinician(int patient_id, int clinician_id) {
		this.patient_id = patient_id;
		this.clinician_id = clinician_id;
	}

	public int getPatient_id() { return patient_id;	}
	public int getClinician_id() {
		return clinician_id;
	}
}
