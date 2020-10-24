package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraController {
	
	private CalculadoraView view;
	private CalculadoraModel model;
	
	public CalculadoraController(CalculadoraView view, CalculadoraModel model) {
		this.view = view;
		this.model = model;
	}

}


