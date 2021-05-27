package br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.controllers;

import br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.dtos.CasaDTO;
import br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.dtos.ComodoDTO;
import br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.services.CalculadoraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CalculadoraController {

    @PostMapping("/metrosTotal")
    public double getMetrosQuadrados(@RequestBody CasaDTO casa ){
        return CalculadoraService.getMetrosQuadrados(casa);
    }

    @PostMapping("/valorCasa")
    public double getValorCasa(@RequestBody CasaDTO casa){
        return CalculadoraService.getValor(casa);
    }

    @PostMapping("/maiorComodo")
    public String getMaiorComodo (@RequestBody CasaDTO casa){
        return CalculadoraService.maiorComodo(casa);
    }

    @PostMapping("/areasComodos")
    public Map<String, Double> getMetrosQuadradosComodos (@RequestBody CasaDTO casa){
        return CalculadoraService.getAreasComodos(casa);
    }

}
