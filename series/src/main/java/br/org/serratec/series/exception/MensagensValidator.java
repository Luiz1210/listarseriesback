package br.org.serratec.series.exception;

public final class MensagensValidator {
    
    // Mensagens de validação para campos em branco
    public static final String NOT_BLANK = "Este campo não pode estar em branco.";
    
    // Mensagens de validação para tamanho máximo
    public static final String INVALID_MAX_SIZE = "O tamanho máximo permitido é de {max} caracteres.";

    // Construtor privado para impedir instâncias
    private MensagensValidator() {
        throw new UnsupportedOperationException("Classe utilitária não deve ser instanciada.");
    }
}
