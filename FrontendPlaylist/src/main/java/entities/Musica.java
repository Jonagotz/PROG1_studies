package entities;

import io.micrometer.common.lang.NonNull;
import java.util.Objects;

public class Musica {
    public int id;
    @NonNull
    public String titulo;
    @NonNull
    private String artista;
    private String url;

    public Musica(int id, String titulo, String artista, String url) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.url = url;
    }

    public Musica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Musica)) {
            return false;
        }
        Musica other = (Musica) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " - " + titulo;
    }    
    
}
