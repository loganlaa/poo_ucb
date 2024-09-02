package data.info;

public class Data {
    int dia;
    int mes;
    int ano;

    void imprimirData(){
        System.out.printf("%02d/%02d/%d", dia, mes, ano);
    }
}
