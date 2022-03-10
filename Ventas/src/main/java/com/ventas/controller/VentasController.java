package com.ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.model.Producto;
import com.ventas.util.VentasUtilities;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	@Autowired
	private VentasUtilities ventasUtilities;
	
	@GetMapping("/productos")
	public ResponseEntity<List<Producto>> GetProductos() {
		return ventasUtilities.getAllProducto();
	}
}
