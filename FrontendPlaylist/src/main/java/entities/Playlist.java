package entities;

import jakarta.annotation.Nonnull;
import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
    private Long id;
    @Nonnull
    private List<Musica> musicas;
    private String nome;
    private LocalDateTime dataCriacao;

    public Playlist(Long id, List<Musica> musicas, String nome, LocalDateTime dataCriacao) {
        this.id = id;
        this.musicas = musicas;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public Playlist() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }    

    @Override
    public String toString() {
        return "Playlist{" + "id=" + id + ", musicas=" + musicas + ", nome=" + nome + ", dataCriacao=" + dataCriacao + '}';
    }
    
}
