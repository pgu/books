package com.pgu.books.server.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pgu.books.shared.Book;

public class BooksDB {

    public final static Map<String, List<Book>> DB = new HashMap<String, List<Book>>();
    static {
        // wc -l $( find -name '*.txt' ) | sort -n
        // 0 ./Galicia_ling_miscelanea.txt
        // 0 ./Libros_austral.txt
        // 0 ./Poesia_esp_y_extranjera.txt
        // 3 ./Errores_de_pegado.txt
        // 40 ./Losada.txt
        // 49 ./Adonais_poesia.txt
        // 54 ./Vallad_castilla_leon.txt
        // 105 ./Restos.txt
        // 122 ./Biblioteca_el_sol.txt
        // 147 ./Salvat_muy_interesante.txt
        // 169 ./Repes_frances_italoport.txt
        // 333 ./Teoreligion_2.txt
        // 336 ./Budismagibrujocult.txt
        // 359 ./Sexmujer.txt
        // 388 ./Lradio.txt
        // 389 ./Filoespanola.txt
        // 469 ./Fsillon.txt
        // 477 ./Psicologia_y_medicina.txt
        // 512 ./Arte_historia_musica.txt
        // 603 ./Lpuerta.txt
        // 679 ./Liternovela_ex_espanola.txt
        // 771 ./Libros_antiguos.txt
        // 773 ./Filoextranjera.txt
        // 871 ./Filocont_2.txt
        // 7649 total
    }

}
