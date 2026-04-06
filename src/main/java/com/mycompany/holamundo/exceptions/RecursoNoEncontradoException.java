package com.mycompany.holamundo.exceptions;

public class RecursoNoEncontradoException extends RuntimeException {

    private final Long id;

    public RecursoNoEncontradoException(Long id) {
        super("Recurso no encontrado con id: " + id);
        this.id = id;
    }

    public Long getId() { return id; }

//    public Usuario buscarUsuario(Long id) {
//        return repo.findById(id)
//                .orElseThrow(() -> new RecursoNoEncontradoException(id));
//    }
}
