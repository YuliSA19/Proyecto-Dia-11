package com.ventas.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.ventas.model.Producto;

@FeignClient(value="ventas", url="http://localhost:8082")
public interface VentasUtilities {

	@GetMapping("/soproduc/")
	ResponseEntity<List<Producto>> getAllProducto();
}
