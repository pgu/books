package com.pgu.books.server.rpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pgu.books.shared.Book;

public class BooksDB {

    public final static Map<String, List<Book>> DB = new HashMap<String, List<Book>>();
    static {
        DB.put("Adonais_poesia", new ArrayList<Book>());
        fillAdonais();
        DB.put("Arte_historis_musica", new ArrayList<Book>());
        // fillArte();
        DB.put("Biblioteca_el_sol", new ArrayList<Book>());
        DB.put("Budismagibrujocult", new ArrayList<Book>());
        DB.put("Errores_de_pegado", new ArrayList<Book>());
        DB.put("Filocont_2", new ArrayList<Book>());
        DB.put("Filoespanola", new ArrayList<Book>());
        DB.put("Filoextranjera", new ArrayList<Book>());
        DB.put("Fsillon", new ArrayList<Book>());
        DB.put("Galicia_ling_miscelanea", new ArrayList<Book>());
        DB.put("Libros_antiguos", new ArrayList<Book>());
        DB.put("Libros_austral", new ArrayList<Book>());
        DB.put("Liternovela_ex_espanola", new ArrayList<Book>());
        DB.put("Losada", new ArrayList<Book>());
        DB.put("Lpuerta", new ArrayList<Book>());
        DB.put("Lradio", new ArrayList<Book>());
        DB.put("Poesia_esp_y_extranjera", new ArrayList<Book>());
        DB.put("Psicologia_y_medicina", new ArrayList<Book>());
        DB.put("Repes_frances_italoport", new ArrayList<Book>());
        DB.put("Restos", new ArrayList<Book>());
        DB.put("Salvat_muy_interesante", new ArrayList<Book>());
        DB.put("Sexmujer", new ArrayList<Book>());
        DB.put("Teoreligion_2", new ArrayList<Book>());
        DB.put("Vallad_castilla_leon", new ArrayList<Book>());
    }

    // private static void fillArte() {
    // final List<Book> b = DB.get("Arte_historis_musica");
    // }

    private static void fillAdonais() {
        final List<Book> b = DB.get("Adonais_poesia");
        b.add(new Book("Concha Zardoya", "Rialp", 1946, "", "Pájaros del nuevo mundo XXVII", "Adonais_poesia"));
        b.add(new Book("FRIEDRICH HÖLDERLIN", "Rialp", 1949, "", "Doce poemas Adonais LXI", "Adonais_poesia"));
        b.add(new Book("Antonio Gamoneda", "Rialp", 1960, "", "Sublevación inmóvil CLXXXII", "Adonais_poesia"));
        b.add(new Book("Julia Uceda", "Rialp", 1962, "", "Extraña juventud CCIII", "Adonais_poesia"));
        b.add(new Book("Juan Gil-Albert", "Rialp", 1951, "", "Concertar es amor LXXII", "Adonais_poesia"));
        b.add(new Book("T. S. ELIOT", "Rialp", 1951, "", "Cuatro cuartetos LXXVI-LXXVII", "Adonais_poesia"));
        b.add(new Book("Pierre Emmanuel", "Rialp", 1964, "", "Antología Poética CCXVIII-CCXIX", "Adonais_poesia"));
        b.add(new Book("Manuel Arce", "Rialp", 1952, "", "Sombra de un amor LXXXVI", "Adonais_poesia"));
        b.add(new Book("Julián Andujar", "Rialp", 1952, "", "La soledad y el encuentro LXXXVIII", "Adonais_poesia"));
        b.add(new Book("Miguel Torga", "Rialp", 1952, "", "Antología poética LXXXVIII", "Adonais_poesia"));
        b.add(new Book("Susana March", "Rialp", 1953, "", "La tristeza", "Adonais_poesia"));
        b.add(new Book("Adolfo Casais Monteiro", "Rialp", 1954, "", "Antología CIII", "Adonais_poesia"));
        b.add(new Book("STEFAN GEORGE", "Rialp", 1954, "", "Peregrinajes CV", "Adonais_poesia"));
        b.add(new Book("Elisabet Barret Bronwning", "Rialp", 1954, "", "Sonetos del portugués CX", "Adonais_poesia"));
        b.add(new Book("José Antonio Muñoz Rojas", "Rialp", 1954, "", "Cantos a Rosa CXIV", "Adonais_poesia"));
        b.add(new Book("Carlos Murciano", "Rialp", 1955, "", "Viento en la carne CXVI", "Adonais_poesia"));
        b.add(new Book("Manuel Alvarez Ortega", "Rialp", 1955, "", "Exilio CXXI", "Adonais_poesia"));
        b.add(new Book("DYLAN THOMAS", "Rialp", 1955, "", "Poemas CXXIV", "Adonais_poesia"));
        b.add(new Book("Julio Mariscal Montes", "Rialp", 1955, "", "Pasan Hombres obscuros", "Adonais_poesia"));
        b.add(new Book("Prólogo de Vicente Aleixandre", "Rialp", 1956, "", "Antología de Adonais C-CI",
                "Adonais_poesia"));
        b.add(new Book("Paul Valery", "Rialp", 1956, "", "La serpiente y la parca joven CXXVII", "Adonais_poesia"));
        b.add(new Book("Angel González", "Rialp", 1956, "", "Aspero Mundo CXXX", "Adonais_poesia"));
        b.add(new Book("Gonzáles Alegre R. (recop.)", "Rialp", 1959, "",
                "Ant. de la Poesía Gallega contemp. CLXI-CLVII", "Adonais_poesia"));
        b.add(new Book("Gabriel Celaya", "Rialp", 1956, "", "De claro en claro CXXXV", "Adonais_poesia"));
        b.add(new Book("Salvador Espriu", "Rialp", 1956, "", "Antología Lírica CXXXVI-VII", "Adonais_poesia"));
        b.add(new Book("María Elvira Lacaci", "Rialp", 1957, "", "Humana voz CXXXVIII", "Adonais_poesia"));
        b.add(new Book("William Butler Yeats", "Rialp", 1957, "", "Poemas CXL", "Adonais_poesia"));
        b.add(new Book("Saint John Perse", "Rialp", 1957, "", "ANABASIS CXLII", "Adonais_poesia"));
        b.add(new Book("Roy Campbell", "Rialp", 1958, "", "Poemas CLVII", "Adonais_poesia"));
        b.add(new Book("Julio Aumente", "Rialp", 1958, "", "Los silencios", "Adonais_poesia"));
        b.add(new Book("Aquilino Duque", "Rialp", 1958, "", "El campo de la verdad", "Adonais_poesia"));
        b.add(new Book("Ezra Pound", "Rialp", 1960, "", "Los cantos Pisanos CLXXVIII-CLXXIX", "Adonais_poesia"));
        b.add(new Book("Angel Crespo", "Rialp", 1961, "", "Ant. de la nueva poesía portuguesa CLXXXIII-CLXXXI",
                "Adonais_poesia"));
        b.add(new Book("MIJA'IL UN`AYMA", "Rialp", 1956, "", "El rumor de los párpados CXXXII", "Adonais_poesia"));
        b.add(new Book("Aurora de Albornoz", "Rialp", 1961, "", "Poemas para alcanzar un segundo CXCI",
                "Adonais_poesia"));
        b.add(new Book("Salustiano Masó", "Rialp", 1961, "", "Historia de un tiempo futuro CXCII", "Adonais_poesia"));
        b.add(new Book("Elena Andrés", "Rialp", 1961, "", "Eterna vela CXCIII", "Adonais_poesia"));
        b.add(new Book("Prólogo de Vicente Aleixandre", "Rialp", 1962, "", "Segunda Antología de \"ADONAIS\" CC",
                "Adonais_poesia"));
        b.add(new Book("José Ruiz Sánchez", "Rialp", 1962, "", "Los soportales CCI", "Adonais_poesia"));
        b.add(new Book("Alfonso Canales", "Rialp", 1962, "", "Cuenta y razón CCII", "Adonais_poesia"));
        b.add(new Book("Félix Grande", "Rialp", 1964, "", "Las piedras CCXV", "Adonais_poesia"));
        b.add(new Book("Alvarez Ortega", "Rialp", 1964, "", "Invención de la muerte CCXVI", "Adonais_poesia"));
        b.add(new Book("Elena Andrés", "Rialp", 1964, "", "Dos caminos CCXVII", "Adonais_poesia"));
        b.add(new Book("Rainer María Rilke", "Rialp", 1968, "", "Elegías duinesas y Poemas de la noche  nº 255-256",
                "Adonais_poesia"));
        b.add(new Book("Jacinto Herrero Esteban", "Rialp", 1974, "Dedicado",
                "La trampa del cazador Pról. J. J.  Lozano nº 314", "Adonais_poesia"));
        b.add(new Book("Greta Engberg", "Rialp", 1961, "", "Poetas suecos contemporáneos CXC", "Adonais_poesia"));
        b.add(new Book("Apollinaire", "Rialp", 1960, "", "La canción del mal amado y otros poemas CLXXVII",
                "Adonais_poesia"));
        b.add(new Book("Clementina Arderiu", "Rialp", 1961, "", "Antología poética CXCIV-CXCV", "Adonais_poesia"));
        b.add(new Book("María Elvira Lacaci", "Rialp", 1962, "", "Sonido de Dios CCIV", "Adonais_poesia"));
    }
}
