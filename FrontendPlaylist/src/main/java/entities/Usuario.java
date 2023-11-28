package entities;

import javax.swing.JOptionPane;

public class Usuario {
    public Long id;
    public String nome;
    private String email;
    private Playlist playlists;
    private Integer senha;
    private String dataNasc;

    public Usuario(Long id, String nome, String email, Playlist playlists, Integer senha, String dataNasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.playlists = playlists;
        this.senha = senha;
        this.dataNasc = dataNasc;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.equals("")){
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email.equals("")){
            throw new IllegalArgumentException("E-mail inválido.");
        }
        
        if (email.contains("@") || email.contains(".com")) {
            
        } else {
            throw new IllegalArgumentException("E-mail inválido.");
        }
        
        this.email = email;
    }

    public Playlist getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Playlist playlists) {
        this.playlists = playlists;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        String senhaStr = String.valueOf(senha);
        if (senhaStr.length() < 5) {
            throw new IllegalArgumentException("Senha inválida (Necessário mais de 5 characteres).");
        }

        this.senha = senha;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return id + " nome: " + nome;
    }
    
    
    
}
