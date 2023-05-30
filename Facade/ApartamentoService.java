package Facade;

public class ApartamentoService implements IApartamentoService{


    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isPartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        }

        return cadastrarNoBanco(apartamento);

    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //logica de cadastro
        return true;
    }

    private Boolean isPartamentoCadastrado(Apartamento apartamento) {
        //ir no banco e verificar se esta cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;

    }
}
