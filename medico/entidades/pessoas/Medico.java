package entidades.pessoas;

import java.security.PublicKey;
import java.time.LocalDate;


import entidades.Endereco;
import entidades.Especialidade;
import entidades.salas.Consultorio;

public class Medico extends Pessoa{
    private Especialidade especialidade;
    private Consultorio consultorio;
    private String CRM;
    private double valorHora;


    public Medico(String nome, String cpf, Endereco endereco, LocalDate dataNascimento, String CRM, double valorhora) {
        super(nome, cpf, endereco, dataNascimento);
        this.especialidade = new Especialidade();
        this.consultorio = new Consultorio();
        this.CRM = CRM;
        this.valorHora = valorhora;

    }

    public void defineValorHora(double valor) {
        this.valorHora = valor;
    }

    public double calculaAtendimento(int numHoras){
        return this.valorHora * numHoras;
    }

    public void alocaConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void cadastraEespecialidade(Especialidade especialidade){
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico " + super.toString() + "\n" + 
        "CRM" + this.CRM +
        "Valor Hora: " + this.valorHora + "\n";

           
    }
    
}
