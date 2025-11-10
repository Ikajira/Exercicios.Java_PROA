package Caneta;

public class CanetaClasse {
    String Tipo;
    String Cor;
    Integer Carga;
    Integer Ponta;
    Boolean Desenhar;
    Boolean FechadaOuAberta;

    void FecharCaneta(){
        FechadaOuAberta = true;
    }

    void AbrirCaneta(){
        FechadaOuAberta = false;
    }

    void ReporCarga(){
        Carga = 100;
    }
}
