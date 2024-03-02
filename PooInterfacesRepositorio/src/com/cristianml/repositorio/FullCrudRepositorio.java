package com.cristianml.repositorio;

public interface FullCrudRepositorio extends ContableRepositorio, PaginableRepositorio,
                    OrdenableRepositorio, CrudRepositorio{
    // Aquí unimos todoas las interfaces, o sea hacemos una herencia para que cuando se requieran
    // implementar interfaces en las clases sólo se tenga que implementar esta que obtiene a todas.
}
