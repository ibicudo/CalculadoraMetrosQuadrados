package br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.services;

import br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.dtos.CasaDTO;
import br.com.calculadoraMetrosQuadrados.CalculadoraMetrosQuadrados.dtos.ComodoDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculadoraService {

    public static double getMetrosQuadrados (CasaDTO casa){
        List<ComodoDTO> comodos = casa.getComodos();
        double area=0;
        for(ComodoDTO c: comodos){
            area+=c.getLargura()*c.getComprimento();
        }
        return area;
    }

    public static double getValor(CasaDTO casa){
        return getMetrosQuadrados(casa)*800;
    }

    public static String maiorComodo(CasaDTO casa){
        List<ComodoDTO> comodos = casa.getComodos();
        ComodoDTO comodo = comodos.stream().max((comodo1,comodo2)->{
            double areaC1= comodo1.getLargura()*comodo1.getComprimento();
            double areaC2= comodo2.getLargura()*comodo2.getComprimento();
            return (int) (areaC1-areaC2);
        }).get();

        return comodo.getNome();
    }

    public static Map<String, Double> getAreasComodos(CasaDTO casa){
        List<ComodoDTO> comodos = casa.getComodos();
        Map<String, Double> areasComodos= new HashMap<String, Double>();
        double area;
        for (ComodoDTO c: comodos){
            area= c.getLargura()*c.getComprimento();
            areasComodos.put(c.getNome(),area);
        }
        return areasComodos;
    }
}
