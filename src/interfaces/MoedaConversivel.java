package interfaces;

import java.math.BigDecimal;

import enums.Moeda;

public interface MoedaConversivel {
	
	BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais);
	
	BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda);
}
