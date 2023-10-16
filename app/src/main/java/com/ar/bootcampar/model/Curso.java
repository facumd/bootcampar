package com.ar.bootcampar.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private long id;
    private String imageName;
    private String title;
    private String description;
    @Deprecated
    private boolean isFavorite;

    private int nivel;

    public Curso(long id, String title, String description, boolean isFavorite, String imageName, int nivel) {
        if (id <= 0) throw new RuntimeException("El id es inválido");
        if (title == null || title.trim().isEmpty()) throw new RuntimeException("El título es inválido");
        if (description == null || description.trim().isEmpty()) throw new RuntimeException("La descripción es inválida");
        // TODO: Encontrar como validar link
        if (imageName == null || imageName.trim().isEmpty()) throw new RuntimeException("El link de imágen es inválido");
        if (nivel <= 0 || nivel > 3) throw new RuntimeException("El nivel es inválido");

        this.id = id;
        this.title = title;
        this.description = description;
        this.isFavorite = isFavorite;
        this.imageName = imageName;
        this.nivel = nivel;
    }

    public String getImageName() {
        return imageName;
    }

    public String getTitle() {
        return title;
    }

    @Deprecated
    public boolean isFavorite() {
        return isFavorite;
    }

    public String getDescription() { return description; }

    public long getId() { return id; }

    public int getNivel() { return nivel; }

    public static List<Curso> getDefaultCourses() {
        List<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(new Curso(1, "Android Básico desde 0", "Con este curso podrá crear su primera aplicación en Android.", true, "android_logo", 2));
        listaCursos.add(new Curso(2, "Programación con Java", "Aprenda a programar en Java desde cero con este curso único!", false, "java", 1));
        listaCursos.add(new Curso(3, "JavaScript para Novatos", "Un curso simple para aprender el ABC de JavaScript.", true, "js", 1));
        listaCursos.add(new Curso(4, "Master en Python", "Conviértase en un experto utilizando nuestro curso de cero a héroe!", true, "python", 3));
        listaCursos.add(new Curso(5, "Aprende Html como un Profesional", "Este curso le enseñará a crear sitios web con diseño responsivo.", false, "html", 1));
        listaCursos.add(new Curso(6, "Desarrollo con Wordpress", "Aprenda a utilizar el framework más popular del mundo.", true, "wordpress", 1));
        listaCursos.add(new Curso(7, "Test Unitarios conceptos Avanzados", "Con este curso aprenderá a escribir código sólido utilizando pruebas unitarias.", true, "unittest", 2));
        listaCursos.add(new Curso(8, "Logra el Mejor Diseño con CSS", "Un curso de nivel avanzado para aprender a realizar animaciones en CSS.", false, "css", 3));
        listaCursos.add(new Curso(9, "Angular de cero a Experto", "El mejor curso en Angular. Aprenda realizando cinco copias de sitios populares.", true, "angular", 3));

        return listaCursos;
    }
}