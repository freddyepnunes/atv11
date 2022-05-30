/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rgm:11211100784 Nome : Gabriel Boschi Tanikawa
 * @author Rgm:11211202211 Nome : freddye Pontes Nunes
 */
public class aluno {
    
    String nome,sobrenome,data,curso,sexo,rgm;

    public aluno(String nome, String sobrenome, String data, String curso, String sexo, String rgm) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data = data;
        this.curso = curso;
        this.sexo = sexo;
        this.rgm = rgm;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
 
}
