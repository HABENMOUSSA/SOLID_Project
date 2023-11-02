package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

import com.directi.training.dip.example_refactored.Equipment;

public class encoding {
	private Model _model;
	private String _type;
	public encoding(Model model)
    {
        _model = model;
    }
	public void encode() throws IOException {
		String whattype = _type;
		if (whattype == "Files") {
			_model.encodeWithFiles();
		}
		else if (whattype == "OnNetworkandDatabase") {
			_model.encodeBasedOnNetworkAndDatabase();
		}
	}
}
