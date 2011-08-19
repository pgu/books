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
        DB.put("Arte_historia_musica", new ArrayList<Book>());
        fillArte();
        DB.put("Biblioteca_el_sol", new ArrayList<Book>());
        fillElSol();
        DB.put("Budismagibrujocult", new ArrayList<Book>());
        fillBudis();
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

    private static void fillBudis() {
        // TODO PGU
    }

    private static void fillElSol() {
        final List<Book> b = DB.get("Biblioteca_el_sol");
        b.add(new Book("Prosper Merimée", "Carmen", "El Sol", "1991", "51", "Biblioteca_el_sol"));
        b.add(new Book("Antón Chejóv", "El monje negro", "El Sol", "1991", "54", "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "Sherlock Holmes El tratado naval", "El Sol", "1991", "78",
                "Biblioteca_el_sol"));
        b.add(new Book("Alfredo Conde", "El tercer lugar", "El Sol", "1991", "112", "Biblioteca_el_sol"));
        b.add(new Book("Miguel Delibes", "El conejo", "El Sol", "1991", "115", "Biblioteca_el_sol"));
        b.add(new Book("Jorge Edwards", "El regalo", "El Sol", "1991", "117", "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "El anillo de Theth", "Altamira, SAIG", "1991", "231", "Biblioteca_el_sol"));
        b.add(new Book("Rudyard Kipling", "La casa de los deseos", "Altamira, SAIG", "1992", "261", "Biblioteca_el_sol"));
        b.add(new Book("Leopoldo Alas \"Clarín\"", "El caballero de la mesa redonda", "Altamira, SAIG", "1992", "266",
                "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "Jugando con fuego", "Altamira, SAIG", "1992", "268", "Biblioteca_el_sol"));
        b.add(new Book("Jorge Manrique", "Coplas", "Altamira, SAIG", "1992", "269", "Biblioteca_el_sol"));
        b.add(new Book("Ignacio Aldecoa", "El corazón y otros frutos amargos", "Altamira, SAIG", "1992", "273",
                "Biblioteca_el_sol"));
        b.add(new Book("Francisco de Quevedo", "Poesía lírica", "Altamira, SAIG", "1992", "244", "Biblioteca_el_sol"));
        b.add(new Book("Alejandro Dumas", "Los caballeros templarios", "Altamira, SAIG", "1992", "245",
                "Biblioteca_el_sol"));
        b.add(new Book("Cristina Peri Rosi", "La ciudad de Luzbel", "Altamira, SAIG", "1992", "248",
                "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "Las joyas", "Altamira, SAIG", "1992", "251", "Biblioteca_el_sol"));
        b.add(new Book("Fiodor M. Dostoyevski", "Noches blancas", "Altamira, SAIG", "1991", "64", "Biblioteca_el_sol"));
        b.add(new Book("Isabel Allende", "Niña perversa", "Altamira, SAIG", "1991", "79", "Biblioteca_el_sol"));
        b.add(new Book("Juan Carlos Onetti", "La novia robada", "Altamira, SAIG", "1991", "130", "Biblioteca_el_sol"));
        b.add(new Book("Gustave Flaubert", "Un corazón simple", "Altamira, SAIG", "1992", "235", "Biblioteca_el_sol"));
        b.add(new Book("Alvaro Pombo", "Cinco relatos sobre la falta de sustancia", "Altamira, SAIG", "1992", "",
                "Biblioteca_el_sol"));
        b.add(new Book("Manuel Múgica Laínez", "El brazalete", "Altamira, SAIG", "1992", "", "Biblioteca_el_sol"));
        b.add(new Book("Almudena Grandes", "Los ojos rotos", "Altamira, SAIG", "1992", "", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "Rinconete y cortadillo", "El Sol", "1991", "138", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "El Borracho", "El Sol", "1991", "153", "Biblioteca_el_sol"));
        b.add(new Book("Voltaire", "El hombre de los cuarenta escudos", "El Sol", "1991", "157", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "La ilustre fregona", "El Sol", "1991", "168", "Biblioteca_el_sol"));
        b.add(new Book("Wenceslao Fernández Flórez", "Perros, gatos y otras amistades", "El Sol", "1991", "195",
                "Biblioteca_el_sol"));
        b.add(new Book("Charles Dickens", "Canción de Navidad 1 y 2", "El Sol", "1991", "204/205", "Biblioteca_el_sol"));
        b.add(new Book("Alejandro Dumas", "El mártir Urbano Grandier", "El Sol", "1991", "215", "Biblioteca_el_sol"));
        b.add(new Book("", "El mártir Urbano Grandier", "Altamira, SAIG", "1991", "215", "Biblioteca_el_sol"));
        b.add(new Book("Jorge Manrique", "Coplas", "Altamira, SAIG", "1992", "269", "Biblioteca_el_sol"));
        b.add(new Book("Jack London", "La peste escarlata", "Altamira, SAIG", "1991", "155", "Biblioteca_el_sol"));
        b.add(new Book("Leopoldo Alas \"Clarín\"", "El duo de la tos", "Altamira, SAIG", "1991", "158",
                "Biblioteca_el_sol"));
        b.add(new Book("Stendhal", "Los Cenci", "Altamira, SAIG", "1991", "163", "Biblioteca_el_sol"));
        b.add(new Book("Franz Kafka", "Un médico rural", "Altamira, SAIG", "1991", "164", "Biblioteca_el_sol"));
        b.add(new Book("Jack London", "El mejicano", "Altamira, SAIG", "1991", "167", "Biblioteca_el_sol"));
        b.add(new Book("Jack London", "Cara de luna", "Altamira, SAIG", "1991", "173", "Biblioteca_el_sol"));
        b.add(new Book("José Mª Merino", "Las palabras del mundo", "Altamira, SAIG", "1991", "178", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El amante liberal La tía fingida", "Altamira, SAIG", "1991", "180",
                "Biblioteca_el_sol"));
        b.add(new Book("", "El Borracho", "Altamira, SAIG", "1991", "153", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El licenciado Vidriera Las dos doncellas", "Altamira, SAIG", "1991",
                "156", "Biblioteca_el_sol"));
        b.add(new Book("Voltaire", "El hombre de los cuarenta escudos", "Altamira, SAIG", "1991", "157",
                "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "La fuerza e la sangre La señora Cornelia", "Altamira, SAIG", "1991",
                "162", "Biblioteca_el_sol"));
        b.add(new Book("Luis Mateo Díez", "Albanito, amigo mío", "Altamira, SAIG", "1991", "166", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "La ilustre fregona", "Altamira, SAIG", "1991", "168",
                "Biblioteca_el_sol"));
        b.add(new Book("Augusto Monterroso", "Las ilusiones perdidas", "Altamira, SAIG", "1991", "172",
                "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El soliloquio de los perros El casamiento engañoso", "Altamira, SAIG",
                "1991", "174", "Biblioteca_el_sol"));
        b.add(new Book("Jack London", "El hombre de la cicatriz", "Altamira, SAIG", "1991", "179", "Biblioteca_el_sol"));
        b.add(new Book("E. O. James", "Hª de las religiones Zoroastrismo y Judaísmo", "Altamira, SAIG", "1991", "181",
                "Biblioteca_el_sol"));
        b.add(new Book("Francisco Ayala", "Historia de macacos", "Altamira, SAIG", "1991", "182", "Biblioteca_el_sol"));
        b.add(new Book("O. Henry", "Un amante tacaño", "Altamira, SAIG", "1991", "183", "Biblioteca_el_sol"));
        b.add(new Book("Mario Benedetti", "Quién de vosotros", "Altamira, SAIG", "1991", "184", "Biblioteca_el_sol"));
        b.add(new Book("Rudyard Kipling", "El ojo de Alá", "Altamira, SAIG", "1991", "185", "Biblioteca_el_sol"));
        b.add(new Book("Edmundo de Amicis", "De los apeninos a los andes", "Altamira, SAIG", "1991", "191",
                "Biblioteca_el_sol"));
        b.add(new Book("Wenceslao Fernández Flórez", "Perros, gatos y otras amistades", "Altamira, SAIG", "1991",
                "195", "Biblioteca_el_sol"));
        b.add(new Book("San Juan de la Cruz", "Poesías", "Altamira, SAIG", "1991", "197", "Biblioteca_el_sol"));
        b.add(new Book("Cristian Kupchik", "Mozart: los silencios de un prodigio", "Altamira, SAIG", "1991", "200",
                "Biblioteca_el_sol"));
        b.add(new Book("Charles Dickens", "Canción de Navidad 1 y 2", "Altamira, SAIG", "1991", "204/205",
                "Biblioteca_el_sol"));
        b.add(new Book("Gustave Flaubert", "Memorias de un loco", "Altamira, SAIG", "1991", "206", "Biblioteca_el_sol"));
        b.add(new Book("Juan Valera", "El pájaro verde", "Altamira, SAIG", "1991", "209", "Biblioteca_el_sol"));
        b.add(new Book("Antonio Pereira", "Relatos de andar el mundo", "Altamira, SAIG", "1991", "212",
                "Biblioteca_el_sol"));
        b.add(new Book("Alejandro Dumas", "El mártir Urbano Grandier", "Altamira, SAIG", "1991", "215",
                "Biblioteca_el_sol"));
        b.add(new Book("Dante", "La vida nueva", "Altamira, SAIG", "1991", "216", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "Magnetismo", "Altamira, SAIG", "1991", "223", "Biblioteca_el_sol"));
        b.add(new Book("Horacio Quiroga", "El mono que asesinó", "Altamira, SAIG", "1991", "227", "Biblioteca_el_sol"));
        b.add(new Book("Hans Cristian Andersen", "Viaje por España De Granada a Cádiz", "Altamira, SAIG", "1991",
                "228", "Biblioteca_el_sol"));
        b.add(new Book("José Antonio Millán", "Fresa rústica", "Altamira, SAIG", "1991", "230", "Biblioteca_el_sol"));
        b.add(new Book("Puchkin", "El azar en el juego", "Altamira, SAIG", "1992", "233", "Biblioteca_el_sol"));
        b.add(new Book("Mario Benedetti", "Recuerdos olvidados", "Altamira, SAIG", "1992", "242", "Biblioteca_el_sol"));
        b.add(new Book("Nathaniel Hawthorne", "El experimento del Dr. Heidegger", "Altamira, SAIG", "1992", "247",
                "Biblioteca_el_sol"));
        b.add(new Book("H. P. Lorecraft", "El superviviente", "Altamira, SAIG", "1992", "249", "Biblioteca_el_sol"));
        b.add(new Book("Dashiell Hammlett", "La herradura dorada", "Altamira, SAIG", "1992", "255", "Biblioteca_el_sol"));
        b.add(new Book("Edgar Allan Poe", "Cuentos (1 y 2)", "El Sol", "1991", "23- 24", "Biblioteca_el_sol"));
        b.add(new Book("Cyrano de Bergerac", "Viaje a la luna", "El Sol", "1991", "42", "Biblioteca_el_sol"));
        b.add(new Book("Franz Kafka", "La metamorfósis", "El Sol", "1991", "52", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "Un parricida", "El Sol", "1991", "73", "Biblioteca_el_sol"));
        b.add(new Book("Juan García Hortelano", "Mucho cuento", "El Sol", "1991", "77", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "El miedo", "El Sol", "1991", "89", "Biblioteca_el_sol"));
        b.add(new Book("Robert L. Stevenson", "El dinamitero (1 y 2)", "El Sol", "1991", "65-66", "Biblioteca_el_sol"));
        b.add(new Book("Carlos Fuentes", "Los días enmascarados", "El Sol", "1991", "97", "Biblioteca_el_sol"));
        b.add(new Book("Manuel Vázquez Montalbán", "Buscando a Sherezade", "El Sol", "1991", "121", "Biblioteca_el_sol"));
        b.add(new Book("Edgar Allan Poe", "El gato negro", "El Sol", "1991", "127", "Biblioteca_el_sol"));
        b.add(new Book("Ana María Matute", "Sino espada", "El Sol", "1991", "113", "Biblioteca_el_sol"));
        b.add(new Book("Giovanni Boccaccio", "El Decamerón 1 y 2 (Selección)", "El Sol", "1991", "11- 12",
                "Biblioteca_el_sol"));
        b.add(new Book("G. K. Chesterton", "El paraíso de los ladrones", "El Sol", "1991", "131", "Biblioteca_el_sol"));
        b.add(new Book("Stendhal", "Vanina Vanini", "El Sol", "1991", "133", "Biblioteca_el_sol"));
        b.add(new Book("Stendhal", "Los Cenci", "El Sol", "1991", "163", "Biblioteca_el_sol"));
        b.add(new Book("Luis Mateo Díez", "Albanito, amigo mío", "El Sol", "1991", "166", "Biblioteca_el_sol"));
        b.add(new Book("José Mª Merino", "Las palabras del mundo", "El Sol", "1991", "178", "Biblioteca_el_sol"));
        b.add(new Book("Francisco Ayala", "Historia de macacos", "El Sol", "1991", "182", "Biblioteca_el_sol"));
        b.add(new Book("Mario Benedetti", "Quién de vosotros", "El Sol", "1991", "184", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "Cuentos de Guerra", "El Sol", "1991", "21", "Biblioteca_el_sol"));
        b.add(new Book("Edmundo de Amicis", "De los apeninos a los andes", "El Sol", "1991", "191", "Biblioteca_el_sol"));
        b.add(new Book("Gustave Flaubert", "Memorias de un loco", "El Sol", "1991", "206", "Biblioteca_el_sol"));
        b.add(new Book("San Juan de la Cruz", "Poesías", "Altamira, SAIG", "1991", "197", "Biblioteca_el_sol"));
        b.add(new Book("Mario Benedetti", "Recuerdos olvidados", "El Sol", "1992", "242", "Biblioteca_el_sol"));
        b.add(new Book("Mario Benedetti", "Recuerdos olvidados", "Altamira, SAIG", "1992", "242", "Biblioteca_el_sol"));
        b.add(new Book("Francisco de Quevedo", "Poesía lírica", "Altamira, SAIG", "1992", "244", "Biblioteca_el_sol"));
        b.add(new Book("Hans Cristian Andersen", "Cuentos", "El Sol", "1991", "22", "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "Un duelo y otros cuentos", "El Sol", "1991", "36", "Biblioteca_el_sol"));
        b.add(new Book("Oscar  Wilde", "El fantasma de Canterville", "El Sol", "1991", "39", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "Don Quijote dela Mancha I, II, III, IV, V y VI", "El Sol", "1991",
                "55-60", "Biblioteca_el_sol"));
        b.add(new Book("José Mª Castroviejo", "Las tribulaciones del cura de Neceda", "El Sol", "1991", "67",
                "Biblioteca_el_sol"));
        b.add(new Book("Gustavo Adolfo Bécquer", "La corza blanca", "El Sol", "1991", "70", "Biblioteca_el_sol"));
        b.add(new Book("Alfredo Bryce Echenique", "Eisenhower y la Tiqui-Tiqui-Tin", "El Sol", "1991", "71",
                "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "Sherlock Holmes El ritual de Musgrave", "El Sol", "1991", "84",
                "Biblioteca_el_sol"));
        b.add(new Book("María de Zayas y Sotomayor", "Novelas ejemplares y amorosas (1)", "El Sol", "1991", "49",
                "Biblioteca_el_sol"));
        b.add(new Book("Conan Doyle", "Sherlock Holmes El hombre encorbado", "El Sol", "1991", "72",
                "Biblioteca_el_sol"));
        b.add(new Book("Guy de Monpassant", "La mano", "El Sol", "1991", "100", "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "Sherlock Holmes El carbunclo azul", "El Sol", "1991", "102",
                "Biblioteca_el_sol"));
        b.add(new Book("José Mª Castroviejo", "La montaña herida", "El Sol", "1991", "103", "Biblioteca_el_sol"));
        b.add(new Book("Arthur Conan Doyle", "Sherlock Holmes El misterio de Boscombre Valley", "El Sol", "1991",
                "120", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "La gitanilla", "El Sol", "1991", "144", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El licenciado Vidriera Las dos doncellas", "El Sol", "1991", "156",
                "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "La fuerza e la sangre La señora Cornelia", "El Sol", "1991", "162",
                "Biblioteca_el_sol"));
        b.add(new Book("Franz Kafka", "Un médico rural", "El Sol", "1991", "164", "Biblioteca_el_sol"));
        b.add(new Book("Augusto Monterroso", "Las ilusiones perdidas", "El Sol", "1991", "172", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El soliloquio de los perros El casamiento engañoso", "El Sol", "1991",
                "174", "Biblioteca_el_sol"));
        b.add(new Book("Miguel de Cervantes", "El amante liberal La tía fingida", "El Sol", "1991", "180",
                "Biblioteca_el_sol"));
        b.add(new Book("Cristian Kupchik", "Mozart: los silencios de un prodigio", "El Sol", "1991", "200",
                "Biblioteca_el_sol"));
        b.add(new Book("Antonio Pereira", "Relatos de andar el mundo", "El Sol", "1991", "212", "Biblioteca_el_sol"));

    }

    private static void fillArte() {
        final List<Book> b = DB.get("Arte_historia_musica");
        b.add(new Book("Peter Gay", "La cultura de Weimar La inclusión de lo excluido", "Argos Vergara", "1984", "",
                "Arte_historia_musica"));
        b.add(new Book("José Luis Herrera", "Doña Sofía", "Fies", "1984", "", "Arte_historia_musica"));
        b.add(new Book("Christopher Dawson", "Dinámica de la Historia Universal", "Rialp", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("Gerald Brenan", "El laberinto español", "Plaza Janés", "1984", "", "Arte_historia_musica"));
        b.add(new Book("Richard Ford", "Las cosas de España", "Turner", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Luciano Represa de Partearroyo", "Madrigal del Cid de la Reina", "C.S.I.C.", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Herbert Rutledge Southworth", "El mito de la cruzada de Franco", "Ruedo Ibérico", "1963", "",
                "Arte_historia_musica"));
        b.add(new Book("Carlos Díaz", "El anarquismo como fenómeno político moral", "Ed. Mex. Unidos", "1977",
                "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Indalecio Prieto", "Dentro y fuera del Gobierno Discursos P.", "Oásis", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Julian Besteiro", "Obras Completas Tomos I, II y III", "C. Est. Constituc.", "1983", "",
                "Arte_historia_musica"));
        b.add(new Book("Indro Montanelli", "Historia de los griegos", "C. Lectores", "1996", "", "Arte_historia_musica"));
        b.add(new Book("Indro Montanelli", "Historia de Roma", "Plaza Janés", "1963", "", "Arte_historia_musica"));
        b.add(new Book("Herman Kinder Wrener Hilgemann", "Atlas Histórico Mundial De los orígenes a la Rev. Francesa",
                "Istmo", "1986", "13ª ed.", "Arte_historia_musica"));
        b.add(new Book("Herman Kinder Wrener Hilgemann", "Atlas Histórico Mundial De la Rev. Francesa a nuestros días",
                "Istmo", "1988", "14ª ed.", "Arte_historia_musica"));
        b.add(new Book("Hugh Thomas", "Una Historia del mundo", "Grijalbo, S.A.", "1982", "", "Arte_historia_musica"));
        b.add(new Book("Hugh Thomas", "La guerra civil española 1º y 2º Tomo", "Diario 16", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("ABC", "Vida de Franco", "ABC", "", "", "Arte_historia_musica"));
        b.add(new Book("F. Franco Salgado-Araújo", "Mis conversaciones privadas con Franco", "Planeta", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Varios autores", "Visiones de España", "C. Lectores", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Zoé Olderbourg", "Las cruzadas", "Destino", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Gui Bretón", "Historias de amor de la Hª de Francia Tomos 1 a 10", "Bruguera", "1970", "",
                "Arte_historia_musica"));
        b.add(new Book("Fernand Braudel G. Duby y otros", "El mediterráneo", "Espasa Calpe", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("E. A. Kosminsky", "Historia de la Edad Media", "Futuro", "1962", "", "Arte_historia_musica"));
        b.add(new Book("José Alcina Franch", "Los orígenes de América", "Alhambra", "1985", "", "Arte_historia_musica"));
        b.add(new Book("Joan Alberich y otros", "Griegos y romanos", "Alhambra", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Agnes Heller", "Teoría de la Historia", "Fontamara", "1982", "", "Arte_historia_musica"));
        b.add(new Book("M. I. Finley", "Uso y abuso de la historia", "Crítica", "1979", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Johan Huizinga", "El concepto de la historia", "F.C.E.", "1977", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("R. G. Collingwood", "Idea de la historia", "F.C.E.", "1965", "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("James T. Shotwell", "Historia de la historia en el mundo antiguo", "F.C.E.", "1982",
                "1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("Ferdinand Gregorovins", "Roma y Atenas en la Edad media", "F. C. E.", "1982", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("John Boardman y otros", "Historia Oxford del mundo clásico 1 Grecia", "Alianza", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("John Boardman y otros", "Historia Oxford del mundo clásico 2 Roma", "Alianza", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Wilhelm Nestle", "Historia del espíritu griego", "Ariel", "1961", "", "Arte_historia_musica"));
        b.add(new Book("G. E. M. de Ste. Croix", "La lucha de clases en el mundo griego antiguo", "Crítica", "1988",
                "", "Arte_historia_musica"));
        b.add(new Book("Peter E. Russell, ed.", "Introd. a la cultura hispánica I Hª, arte, música", "Crítica", "1982",
                "", "Arte_historia_musica"));
        b.add(new Book("Adam Schatt", "Historia y verdad", "Crítica", "1976", "", "Arte_historia_musica"));
        b.add(new Book("Manuel Azaña", "La velada de Benicarló", "Castalia", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Angel Alvarez de Miranda", "Obras T. I y II", "C. Hispánica", "1959", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul Petit", "Historia de la antigüedad", "Labor, S.A.", "1986", "8ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Jerome Carcopino", "La vida cotidiana de Roma en el apogeo del imperio", "Temas de hoy",
                "1989", "", "Arte_historia_musica"));
        b.add(new Book("Robert Flaceliere", "La vida cotidiana de Grecia en el siglo de Pericles", "Temas de hoy",
                "1989", "", "Arte_historia_musica"));
        b.add(new Book("Georges Bordonove", "La vida cotidiana de los templarios en el siglo XIII", "Temas de hoy",
                "1989", "", "Arte_historia_musica"));
        b.add(new Book("Pierre Guichard", "Al-Andalus. Estructura antropológica…", "Barral", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Mijail Bajtin", "La cultura popular en la E. Media y en el Renacimiento", "Barral", "1974", "",
                "Arte_historia_musica"));
        b.add(new Book("Ludovico Geymonat", "Galileo Galilei", "Península", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Thadee Zielinski", "Historia de la civilización antigua", "Aguilar", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Jacques Le Goff", "Los intelectuales en la Edad Media", "Gedisa", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("Arnold J. Toynbee", "La Europa de Hitler", "Sarpe", "1985", "(M)", "Arte_historia_musica"));
        b.add(new Book("Robert París", "Los orígenes del fascismo", "Sarpe", "1985", "(M)", "Arte_historia_musica"));
        b.add(new Book("Hernán Cortés", "Cartas de la conquista de México", "Sarpe", "1985", "(M)",
                "Arte_historia_musica"));
        b.add(new Book("M. Núñez de Arenas-M. Tuñón de Lara", "Historia del movimiento obrero español", "Nova Terra",
                "1970", "(M)", "Arte_historia_musica"));
        b.add(new Book("Arturo López Muñoz", "Capitalismo español: una etapa decisiva", "Zero, S.A.", "1970", "(M)",
                "Arte_historia_musica"));
        b.add(new Book("Rafael Abella", "Julio 1936 Dos Españas frente a frente", "Plaza Janés", "1981", "(M)",
                "Arte_historia_musica"));
        b.add(new Book("Federico Bravo Morata", "La reforma agraria de la república", "Fenicia", "1978", "(M)",
                "Arte_historia_musica"));
        b.add(new Book("Ramón Tamames", "Problemas fundamentales de la agricultura española", "Zero, S.A.", "1971",
                "2ª ed. (M)", "Arte_historia_musica"));
        b.add(new Book("Michael Crawford", "La república romana", "Taurus", "1981", "", "Arte_historia_musica"));
        b.add(new Book("J. K. Davies", "La democracia y la Grecia clásica", "Taurus", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("R. M. Ogilvie", "Roma antigua y los etruscos", "Taurus", "1982", "", "Arte_historia_musica"));
        b.add(new Book("José María Pemán", "La Hª de España contada con sencillez", "Escelicer, S.A.", "1965",
                "6ª ed.", "Arte_historia_musica"));
        b.add(new Book("Pierre Vilar", "Historia de España", "L. Espagnole", "1963", "", "Arte_historia_musica"));
        b.add(new Book("Karl Gutbrod", "Historia de las antiguas culturas del mundo", "Del Serbal", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Claudio Sánchez Albornoz", "Historia y libertad", "Jucar", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Nikos Kazantzakis", "España y viva la muerte", "Jucar", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Peter Sager", "Nuevas formas de realismo", "Alianza", "1986", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("Philip Wheelwright", "Metáfora y realidad", "Espasa Calpe", "1979", "", "Arte_historia_musica"));
        b.add(new Book("Max Ernst", "Una semana de bondad", "G. Gili, S.A.", "1980", "", "Arte_historia_musica"));
        b.add(new Book("J. Berger", "Modos de ver", "G. Gili, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Jürgen Habermas", "La lógica de las ciencias sociales", "Tecnos", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Jürgen Habermas", "Historia y crítica de la opinión pública", "G. Gili, S.A.", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Anthony Guiddens y otros", "Habermas y la modernidad", "Cátedra", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Robert S. Kieve", "El arte radiofónico", "E.P.E.S.A.", "1945", "", "Arte_historia_musica"));
        b.add(new Book("André Malraux", "Psicología del cine", "J. I. Editor", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Theodor W. Adorno", "El cine y la música", "Fundamentos", "1976", "", "Arte_historia_musica"));
        b.add(new Book("Kurt Lipfert", "La televisión", "Espasa Calpe", "1940", "", "Arte_historia_musica"));
        b.add(new Book("Eliseo Verón", "Conducta, estructura y comunicación", "Jorge Alvarez", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Eliseo Verón", "Conducta, estructura y comunicación", "Tiempo Cont.", "1972",
                "2ª ed. Cor. y aum.", "Arte_historia_musica"));
        b.add(new Book("Isaac Joseph", "El transeunte y el espacio urbano", "Gedisa", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Giorgio Fano", "Neopositivismo, análisis del lenguaje y cibernética", "A. Redondo", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("Roberto Vacca", "La próxima Edad Media", "Edra. Nacional", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Jean Baudrillard", "Cool Memories", "Anagrama", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Marshall Mc Luhan", "Contraexplosión", "Paidos", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Marshall Mc Luhan Quentin Fiore", "El medio es el masaje", "Paidos", "1969", "",
                "Arte_historia_musica"));
        b.add(new Book("Marshall Mc Luhan Quentin Fiore", "El medio es el masaje", "Paidos", "1987", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("O. Friedrich Bollnow", "Hombre y espacio", "Labor, S.A.", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Pedro Sempere", "La Galaxia Mc Luhan", "F. Torres", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Aaron Copland", "Música e imaginación", "Emecé", "1955", "", "Arte_historia_musica"));
        b.add(new Book("Paul Collaer", "Orientaciones actuales de la música", "Troquel", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("Biblioteca Salvat Grandes Temas", "La música contemporánea", "Salvat", "1973", "",
                "Arte_historia_musica"));
        b.add(new Book("Eric Salzman", "La música del siglo XX", "Victor Leru", "1979", "", "Arte_historia_musica"));
        b.add(new Book("Julio López", "La música de la posmodernidad", "Anthropos", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Armando Gentilucci", "Guía para escuchar la música contemporánea", "Monte Avila", "1977", "",
                "Arte_historia_musica"));
        b.add(new Book("Donald Mitchell", "El lenguaje de la música moderna", "Lumen", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("Enrico Fubini", "La estética musical del  s. XVIII a nuestros días", "Barral", "1971", "",
                "Arte_historia_musica"));
        b.add(new Book("Ann Livermore", "Historia de la música española", "Barral", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Arthur Jacob", "Breve historia de la música occidental", "Monte Avila", "1979", "",
                "Arte_historia_musica"));
        b.add(new Book("Rudolf Reti", "Tonalidad Atonalidad Pantonalidad", "Rialp", "1965", "", "Arte_historia_musica"));
        b.add(new Book("Otto Károlyi", "Introducción a la música", "Alianza", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Richard Wagner", "Escritos y confesiones", "Labor, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Igor Stravinsky y Robert Craft", "Conversaciones con Stravinsky", "Nueva Visión", "1964", "",
                "Arte_historia_musica"));
        b.add(new Book("Manuel de Falla", "Escritos sobre música y músicos", "Esp.  Calpe, S.A.", "1988",
                "4ª ed. aument.", "Arte_historia_musica"));
        b.add(new Book("André Lavagne", "Chopin", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Yves y Ada Rémy", "Mozart", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Oliver Alain", "Bach", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Emile Damais", "Haendel", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Yves Hucher Jacqueline Morini", "Berlioz", "Esp.  Calpe, S.A.", "1974", "",
                "Arte_historia_musica"));
        b.add(new Book("Pierrette Mari", "Bartók", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Gerges Gourdet", "Debussy", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Ghislaine Juramie", "Tschaikosky", "Esp.  Calpe, S.A.", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Mara Meunier-Thouret", "Vivaldi", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Pierre Petit", "Ravel", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("France-Ivonne Bril", "Verdi", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Jean Gallois", "Schuman", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("André Gauthier", "Wagner", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Editorial Teide, S. A.", "Leonardo Da Vinci V. I", "Teide, S. A.", "1971", "2ª ed. Revis.",
                "Arte_historia_musica"));
        b.add(new Book("Editorial Teide, S. A.", "Leonardo Da Vinci V. I I", "Teide, S. A.", "1967", "",
                "Arte_historia_musica"));
        b.add(new Book("Raoul-Jean Moulin", "Fuentes de la pintura", "Aguilar, S. A.", "1968", "nº 1",
                "Arte_historia_musica"));
        b.add(new Book("Robert Boulanger", "Pintura egipcia y del antiguo oriente", "Aguilar, S. A.", "1968", "nº 2",
                "Arte_historia_musica"));
        b.add(new Book("Tony Spiteris", "Pintura griega y etrusca", "Aguilar, S. A.", "1968", "nº 3",
                "Arte_historia_musica"));
        b.add(new Book("Gerald Gassiot-Talabot", "Pintura romana y paleocristiana", "Aguilar, S. A.", "1968", "nº 4",
                "Arte_historia_musica"));
        b.add(new Book("Kostas Papaioannon", "Pintura bizantina y rusa", "Aguilar, S. A.", "1968", "nº 5",
                "Arte_historia_musica"));
        b.add(new Book("Joseph Pichard", "Pintura románica", "Aguilar, S. A.", "1969", "nº 6", "Arte_historia_musica"));
        b.add(new Book("Michel Herubel", "Pintura gótica I y II", "Aguilar, S. A.", "1969", "nº 7 y 8",
                "Arte_historia_musica"));
        b.add(new Book("Elie-Charles Flamand", "El renacimiento I", "Aguilar, S. A.", "1969", "nº 9",
                "Arte_historia_musica"));
        b.add(new Book("Elie-Charles Flamand", "El renacimiento II y III", "Aguilar, S. A.", "1970", "nº 10 y 11",
                "Arte_historia_musica"));
        b.add(new Book("Philippe Dandy", "El siglo XVII T. I y II", "Aguilar, S. A.", "1970", "nº 12 y 13",
                "Arte_historia_musica"));
        b.add(new Book("Claire Gay", "El siglo XVIII", "Aguilar, S. A.", "1969", "nº 14", "Arte_historia_musica"));
        b.add(new Book("Raymond Cogniat", "El romanticismo", "Aguilar, S. A.", "1969", "nº 15", "Arte_historia_musica"));
        b.add(new Book("Jacques Lassaigne", "El impresionismo", "Aguilar, S. A.", "1968", "nº 16",
                "Arte_historia_musica"));
        b.add(new Book("Michel Ragon", "El expresionismo", "Aguilar, S. A.", "1968", "nº 17", "Arte_historia_musica"));
        b.add(new Book("Michel-Claude Jalard", "El postimpresionismo", "Aguilar, S. A.", "1968", "nº 18",
                "Arte_historia_musica"));
        b.add(new Book("José Pierre", "El cubismo", "Aguilar, S. A.", "1968", "nº 19", "Arte_historia_musica"));
        b.add(new Book("José Pierre", "El futurismo y el dadaismo", "Aguilar, S. A.", "1968", "nº 20",
                "Arte_historia_musica"));
        b.add(new Book("José Pierre", "El surrealismo", "Aguilar, S. A.", "1969", "nº 21", "Arte_historia_musica"));
        b.add(new Book("Georges Charensol", "Los grandes maestros de la pintura moderna", "Aguilar, S. A.", "1969",
                "nº 22", "Arte_historia_musica"));
        b.add(new Book("Jean-Claude Lambert", "Pintura abstracta", "Aguilar, S. A.", "1969", "nº 23",
                "Arte_historia_musica"));
        b.add(new Book("Michel Curtois", "Pintura china", "Aguilar, S. A.", "1969", "nº 24", "Arte_historia_musica"));
        b.add(new Book("Théo Lésoualc'h", "Pintura japonesa", "Aguilar, S. A.", "1969", "nº 25", "Arte_historia_musica"));
        b.add(new Book("J. J. Lévéque - Nicole Ménnant", "Pintura islámica e india", "Aguilar, S. A.", "1969", "nº 26",
                "Arte_historia_musica"));
        b.add(new Book("Vincent Bonnoure", "Pintura americana", "Aguilar, S. A.", "1969", "nº 27",
                "Arte_historia_musica"));
        b.add(new Book("Mario Bucci", "Joan Miró", "C. Lectores", "1970", "", "Arte_historia_musica"));
        b.add(new Book("S. Gasch y F. Draper", "Aguilar Moré", "C. Lectores", "1972", "", "Arte_historia_musica"));
        b.add(new Book("Giuseppe Gatt", "Oskar Kokoschka", "C. Lectores", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Hans L. Jaffe", "Paul Klee", "C. Lectores", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Revista de arte nº 7 (jul.-ag.)", "Goya", "S. Ribadeneyra", "1955", "", "Arte_historia_musica"));
        b.add(new Book("Museo del Prado", "Goya y el espíritu de la ilustración", "Julio Soto", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Fundación Central Hispano", "Paisaje y figura del 98", "Fund. C. Hisp.", "1998", "",
                "Arte_historia_musica"));
        b.add(new Book("Selecciones de Reader's Digest", "El misterio de las grandes civilizaciones  desaparecidas",
                "Reader's D.", "1981", "", "Arte_historia_musica"));
        b.add(new Book("Central Hispano", "Goya La década de los caprichos", "Ac. B. Artes", "1992", "",
                "Arte_historia_musica"));
        b.add(new Book("José Jiménez Lozano", "Los ojos del icono", "G. Andrés Martín", "1988", "Dedicado",
                "Arte_historia_musica"));
        b.add(new Book("Las edades del hombre", "El arte en la iglesia de Cª y León", "Europa Art. G.", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("David Larkin", "Arte fantástico", "Jucar", "1973", "", "Arte_historia_musica"));
        b.add(new Book("David Larkin", "Magritte", "Jucar", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Rudolf Aruhaeim", "Arte y percepción visual", "Eudeba", "1969", "3ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Fundación Juan March", "Matisse", "Barral", "1980", "", "Arte_historia_musica"));
        b.add(new Book("Ministerio de Cultura", "Matta", "Jomagar", "1983", "", "Arte_historia_musica"));
        b.add(new Book("Mateo Marangoni", "Cómo se mira un cuadro", "Destino", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Plaisir de France, Editeur", "Styles espagnols", "Bobigny", "1961", "", "Arte_historia_musica"));
        b.add(new Book("Miguel Dalmau, Editor", "Aubrey Beardsley La palidez del exilio", "Mascaron", "1983", "",
                "Arte_historia_musica"));
        b.add(new Book("Kurt Lange Max Hirmer", "Egipto", "Plaza Janés", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Clásicos del Arte Noguer", "Botticelli", "Noguer", "1970", "", "Arte_historia_musica"));
        b.add(new Book("Clásicos del Arte Noguer", "Grünewald", "Noguer", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Clásicos del Arte Noguer", "Leonardo", "Noguer", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Clásicos del Arte Noguer", "Picasso azul y rosa", "Noguer", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Gustavo Gili, S. A.", "Picasso Dibujos", "G. Gili", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Gustavo Gili, S. A.", "Picasso Obra gráfica 1954-1965", "G. Gili", "1967", "",
                "Arte_historia_musica"));
        b.add(new Book("Michael Grant", "Eros en Pompeya", "Daimon", "1976", "", "Arte_historia_musica"));
        b.add(new Book("John Boardman y Eugenio La Rocca", "Eros en Grecia", "Daimon", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Rene Huyghe y Jean Rudel", "El arte y el mundo moderno 1 1880-1920", "Planeta", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("Rene Huyghe y Jean Rudel", "El arte y el mundo moderno 2 1920 a nuestros días", "Planeta",
                "1973", "", "Arte_historia_musica"));
        b.add(new Book("René Huyghe", "El arte y el hombre V. I", "Planeta", "1965", "", "Arte_historia_musica"));
        b.add(new Book("René Huyghe", "El arte y el hombre V. II", "Planeta", "1966", "", "Arte_historia_musica"));
        b.add(new Book("René Huyghe", "El arte y el hombre V. III", "Planeta", "1967", "", "Arte_historia_musica"));
        b.add(new Book("Pierre Demargne", "El universo de las formas Nacimiento del arte griego", "Aguilar", "1964",
                "", "Arte_historia_musica"));
        b.add(new Book("Jean Charbonneaux y otros", "El universo de las formas Grecia arcáica", "Aguilar", "1969", "",
                "Arte_historia_musica"));
        b.add(new Book("ean Charbonneaux y otros", "El universo de las formas Grecia clásica", "Aguilar", "1970", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul-Marie Duval", "El universo de las formas Los celtas", "Aguilar", "1977", "",
                "Arte_historia_musica"));
        b.add(new Book("Louis Grodecki y otros", "El universo de las formas El siglo del año mil", "Aguilar", "1973",
                "", "Arte_historia_musica"));
        b.add(new Book("José Camón Aznar", "Museo de los impresionistas Librofilm", "Aguilar", "1972",
                "2ª ed. 1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("José Camón Aznar", "Museo de arte moderno Librofilm", "Aguilar", "1972", "2ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("Francesco Valcanovar", "Venecia Galería de Bellas Artes Librofilm", "Aguilar", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("E. Lafuente Ferrari", "El Prado Escuela italiana y francesa Librofilm", "Aguilar", "1977",
                "1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("E. Lafuente Ferrari", "El Prado La pintura nórdica Librofilm", "Aguilar", "1977", "",
                "Arte_historia_musica"));
        b.add(new Book("E. Lafuente Ferrari", "Museo del Prado Pintura española S. XVII y XVIII", "Aguilar", "1972",
                "2ª ed. 1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("E. Lafuente Ferrari", "El Prado Del románico al Greco Librofilm", "Aguilar", "1974",
                "3ª ed. 1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("SUMMA ARTIS", "Hª General del Arte Tomos I al XXV", "Esp. Calpe, S.A.", "1950",
                "Varias edics.", "Arte_historia_musica"));
        b.add(new Book("Hans-Georges Bandi y otros", "La edad de piedra", "Praxis, S.A.", "1960", "",
                "Arte_historia_musica"));
        b.add(new Book("Elsy Lenzinger", "Africa negra", "Praxis, S.A.", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Alfred Bühler y otros", "Oceanía y Australia", "Praxis, S.A.", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("Irmgard Woldering", "Egipto", "Praxis, S.A.", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Leonard Wolley", "Mesopotamia y Asia anterior", "Praxis, S.A.", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("Edith Porada", "Antiguo Irán", "Praxis, S.A.", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Karl Jettmar", "Estepas euroasiáticas", "Praxis, S.A.", "1964", "", "Arte_historia_musica"));
        b.add(new Book("Katharina Otto-Dorn", "El Islám", "Praxis, S.A.", "1965", "", "Arte_historia_musica"));
        b.add(new Book("Hermann Goetz", "India", "Praxis, S.A.", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Bernard Philippe Groslier", "Indochina y Malaca", "Praxis, S.A.", "1963", "",
                "Arte_historia_musica"));
        b.add(new Book("Frits A. Wagner", "Indonesia", "Praxis, S.A.", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Alexander B. Griswold y otros", "Birmania, Corea y Tibet", "Praxis, S.A.", "1963", "",
                "Arte_historia_musica"));
        b.add(new Book("Dietrich Seckel", "Arte Budista", "Praxis, S.A.", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Werner Speiser", "China", "Praxis, S.A.", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Klaus Laukheit", "Revolución y restauración", "Praxis, S.A.", "1965", "",
                "Arte_historia_musica"));
        b.add(new Book("Hans-D. Disselhott y S. Linné", "América Precolombina", "Praxis, S.A.", "1962", "",
                "Arte_historia_musica"));
        b.add(new Book("Pierre Daix", "Picasso", "C. Lectores", "1969", "", "Arte_historia_musica"));
        b.add(new Book("François Fosca", "Renoir", "C. Lectores", "1970", "", "Arte_historia_musica"));
        b.add(new Book("Jean-François Chabrun", "Goya", "C. Lectores", "1966", "", "Arte_historia_musica"));
        b.add(new Book("Jean Bouret", "Degas", "C. Lectores", "1966", "", "Arte_historia_musica"));
        b.add(new Book("Jean Bouret", "Toulouse-Lautrec", "C. Lectores", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Frank Elgar", "Cézanne", "C. Lectores", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Marcel Brion", "Ticiano", "C. Lectores", "1972", "", "Arte_historia_musica"));
        b.add(new Book("Joseph-Emile Muller", "Rembrandt", "C. Lectores", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Joseph-Emile Muller", "Velázquez", "C. Lectores", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Pierre Cabanne", "Van Gogh", "C. Lectores", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Jacques Lassaigne", "El Greco", "C. Lectores", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Reneé Arbour", "Miguel Angel", "C. Lectores", "1966", "", "Arte_historia_musica"));
        b.add(new Book("Roland Pensose", "Miró", "C. Lectores", "1976", "", "Arte_historia_musica"));
        b.add(new Book("Filippo Rossi", "Museos de Florencia", "C. Lectores", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Fundación Juan March", "Goya: caprichos, desastres, tauromaquia...", "Julio Soto", "1979", "",
                "Arte_historia_musica"));
        b.add(new Book("Revista Tropos", "Creación, arte y cultura", "Marsiega, S.A.", "1973", "",
                "Arte_historia_musica"));
        b.add(new Book("Jan Bialostocki", "Estilo e iconografía", "Barral", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Arnold Hanser", "Sociología del arte V. 1 y 2", "Guadarrama", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Octavio N. Derisi", "Lo eterno y lo temporal en el arte", "Emecé", "1967", "",
                "Arte_historia_musica"));
        b.add(new Book("Antón Ehrenzweig", "El orden oculto del arte", "Labor, S. A.", "1973", "",
                "Arte_historia_musica"));
        b.add(new Book("Pierre Francastel", "La figura y el lugar", "Laia", "1988", "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Etienne Gilson", "Pintura y realidad", "Aguilar", "1961", "", "Arte_historia_musica"));
        b.add(new Book("Raymond Bayer", "Historia de la estética", "F. C. E.", "1965", "", "Arte_historia_musica"));
        b.add(new Book("Nicos Hadjinicolaon", "Historia del arte y lucha de clases", "Siglo XXI", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Erich Kahler", "La desintegración de la forma  en el arte", "Siglo XXI", "1969", "",
                "Arte_historia_musica"));
        b.add(new Book("Wilhelm Pinder", "El problema de las generaciones en la Hª del arte", "Losada, S. A.", "1946",
                "", "Arte_historia_musica"));
        b.add(new Book("Mª Luisa Gengaro", "Orientaciones actuales del arte", "Troquel", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("Raymond Bayer", "Orientaciones actuales de la estética", "Troquel", "1961", "",
                "Arte_historia_musica"));
        b.add(new Book("José Camón Aznar", "Problemática del arte contemporáneo", "Univ. M y Pelayo", "1959", "",
                "Arte_historia_musica"));
        b.add(new Book("Editor-Coord. Colin Saxton", "Curso de arte", "H. Blume", "1982", "", "Arte_historia_musica"));
        b.add(new Book("Junta Cª y León", "Conservación y Restauración El Pat. cult. de Cª y L.", "Closaga Orgoyen",
                "1987", "", "Arte_historia_musica"));
        b.add(new Book("Norbert Lynton", "Historia del arte moderno", "Destino", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Lionello Venturi", "Cómo entender la pintura", "Destino", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Federico Zeri", "Detrás de la imagen. Conver. sobre el arte", "Tusquets", "1989", "",
                "Arte_historia_musica"));
        b.add(new Book("Donald Drew Egbert", "El arte y la izquierda en Europa", "Gustavo Gili", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("V. Combalia Dexeus (Editor)", "Estudios sobre Picasso", "Gustavo Gili", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("José Mª Moreno Galván", "Introduc. a la pintura española actual", "Public. Esp.", "1960", "",
                "Arte_historia_musica"));
        b.add(new Book("Catálogo Exposición 3º Centenario", "Velázquez y lo velazqueño 1660-1960", "Mº Educ. Nac.",
                "1960", "", "Arte_historia_musica"));
        b.add(new Book("James Laver Introductor", "Costume in antiquity", "James Hudson", "1964", "",
                "Arte_historia_musica"));
        b.add(new Book("Alois Dempf", "La expresión artística de las culturas", "Rialp", "1962", "",
                "Arte_historia_musica"));
        b.add(new Book("H. Sedlmayr", "El arte descentrado", "Labor, S.A.", "1959", "", "Arte_historia_musica"));
        b.add(new Book("Leonardo Da Vinci", "Cuaderno de notas", "Felmar", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Matteo Marangoni", "Para saber ver", "E. Calpe, S.A.", "1962", "", "Arte_historia_musica"));
        b.add(new Book("Jorge Beristayn", "Antropología de la pintura", "E. Calpe, S.A.", "1959", "",
                "Arte_historia_musica"));
        b.add(new Book("José Camón Aznar", "El tiempo en el arte", "Soc. Est. Pub.", "1958", "", "Arte_historia_musica"));
        b.add(new Book("Herbert Read", "Breve historia de la pintura moderna", "Ed. Del Serbal", "1984", "",
                "Arte_historia_musica"));
        b.add(new Book("F. W. J. Schelling", "Filosofía del arte", "Nova", "1949", "", "Arte_historia_musica"));
        b.add(new Book("F. Pérez Dolz", "Introducción a la teoría del arte", "Apolo", "1947", "3ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("F. Pérez Dolz", "Iniciación a la técnica de la pintura", "Apolo", "1941", "",
                "Arte_historia_musica"));
        b.add(new Book("Picasso", "Obra gráfica original 1904-1971 Dos volúmenes", "Mº Cultura", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("André Chastel", "Arte y humanismo en Florencia Época de L. M.", "Cátedra", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Nokolaus Pevsner", "Las academias de arte. Pasado y presente", "Cátedra", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Bencard", "Diseños anatómicos de Leonardo da Vinci", "Emograph", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Giulio Carlo Argan", "El arte moderno T. I y II", "F. Torres", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Giulio Carlo Argan", "Renacimiento y barroco I  De Gioto a L. Da Vinci", "Akal", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Giulio Carlo Argan", "Renacimiento y barroco II De M. Angel a Tiépolo", "Akal", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("J. Sureda / A. Mª Guasch", "La trama de lo moderno", "Akal", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Simón Marchán Fiz", "Del arte objetual al arte de concepto", "Akal", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("Alciato", "Emblemas", "Akal", "1985", "", "Arte_historia_musica"));
        b.add(new Book("Kenneth Clark", "Introducción a Rembrandt", "Nerea", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Ernst H.Gombrich", "Historia del arte Nº 5", "Alianza", "1981", "3ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Mario De Micheli", "Las vanguardias artísticas del s. XX Nº 7", "Alianza", "1987", "5ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("Kenneth Clark", "El desnudo Nº 18", "Alianza", "1981", "", "Arte_historia_musica"));
        b.add(new Book("Ernst H. Gombrich", "El legado de Apeles nª 23", "Alianza", "1982", "", "Arte_historia_musica"));
        b.add(new Book("Edith Helman", "Trasmundo de Goya Nº 32", "Alianza", "1983", "", "Arte_historia_musica"));
        b.add(new Book("E. H. Gombrich", "Imágenes simbólicas Nº 34", "Alianza", "1986", "", "Arte_historia_musica"));
        b.add(new Book("E. H. Gombrich", "Norma y forma Nº 39", "Alianza", "1984", "", "Arte_historia_musica"));
        b.add(new Book("Rudolf Aruheim", "El poder del centro Nº 45", "Alianza", "1988", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("Jonathan Brown y otros", "Visiones del pensamiento Estudios sobre el Greco Nº 46", "Alianza",
                "1984", "", "Arte_historia_musica"));
        b.add(new Book("Charles de Tolnay", "Miguel Angel Escultor, pintor y arquitecto Nº 48", "Alianza", "1985", "",
                "Arte_historia_musica"));
        b.add(new Book("Martin Robertson", "El arte griego Nº 50", "Alianza", "1985", "", "Arte_historia_musica"));
        b.add(new Book("Kenneth Clark", "Leonardo Da Vinci Nº 52", "Alianza", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Nicos Stangos", "Conceptos de arte moderno Nº 53", "Alianza", "1987", "1ª reimp.",
                "Arte_historia_musica"));
        b.add(new Book("E. H. Gombrich", "Nuevas visiones de viejos maestros Nº 62", "Alianza", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Simón Marchán Fiz", "La estética en la culrura moderna Nº 64", "Alianza", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("E. H. Gombrich", "La imagen y el ojo Nº 65", "Alianza", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Millard Meiss", "Pintura de Florencia y Siena desp.  de la peste negra Nº 70", "Alianza",
                "1988", "", "Arte_historia_musica"));
        b.add(new Book("Francisco Calvo Serraller", "Del futuro al pasado Arte español contem. Nº 74", "Alianza",
                "1988", "", "Arte_historia_musica"));
        b.add(new Book("Kenneth Clark", "El arte del humanismo", "Alianza", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Octavio Paz", "Apariencia desnuda La obra de M. Duchamp Nº 81", "Alianza", "1989", "",
                "Arte_historia_musica"));
        b.add(new Book("Frederick Antal", "El mundo florentino y su ambiente social Nº 82", "Alianza", "1989", "",
                "Arte_historia_musica"));
        b.add(new Book("Ramón de la Calle", "En torno al hecho artístico", "F. Torres", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Arianna Stassinopoulos Huffington", "Picasso creador y destructor", "Maeva-Lasser", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Fred Berence", "Leonardo da Vinci", "Grijalbo, S.A.", "1971", "3ª ed.", "Arte_historia_musica"));
        b.add(new Book("Pierre Francastel", "La realidad figurativa I y II", "Paidós", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Angel del Olmo Gª / B. Varas Verano", "Románico erótico en Cantabria", "Lifer, S.A.", "1988",
                "", "Arte_historia_musica"));
        b.add(new Book("Victor L. Tapie", "Barroco y clasicismo", "Cátedra", "1981", "", "Arte_historia_musica"));
        b.add(new Book("Jurgis Baltrusaitis", "La edad media fantástica", "Cátedra", "1983", "", "Arte_historia_musica"));
        b.add(new Book("Karin Thomas", "Estilos de las artes plásticas en el s. XX", "E. del Serbal", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("J. P. Valgañón y R. Páez", "Teoría e historia de las artes plásticas", "Ceres", "1964", "",
                "Arte_historia_musica"));
        b.add(new Book("Titus Burckhardt", "El arte del Islám", "Tradición U.", "1988", "", "Arte_historia_musica"));
        b.add(new Book("La Gaya Ciencia", "Los cuadernos de la Gaya C. II Arte y verdad", "La Gaya C.", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Julius von Scholosser", "Las cámaras artísticas del renacimiento tardío", "Akal", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Luis Rosales", "El desnudo en el arte y otros ensayos", "ICI", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Sebastián Miranda", "Recuerdos y añoranzas", "Prensa Esp.", "1973", "5ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Luis Racionero", "El desarrollo de Leonardo da Vinci", "Plaza Janés", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("F. Antal", "Rafael entre el clasicismo y el manierismo", "Visor", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("A. Von Hildebrand", "El problema de la forma en la obra del arte", "Visor", "1989", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul Valery", "Escritos sobre Leonardo da Vinci", "Visor", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Plinio", "Textos de Historia del Arte", "Visor", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Folke Nordström", "Goya Saturno y melancolía", "Visor", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Pedro Madrigal Devesa", "Robert Musil y la crisis del arte", "Tecnos", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Novalis, F. Schiller y otros", "Fragmentos para una Tª romántica del arte", "Tecnos", "1987",
                "", "Arte_historia_musica"));
        b.add(new Book("Denis Diderot", "Pensamientos sueltos sobre la pintura", "Tecnos", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Giulio Carlo Argan et Alt.", "El revival de las artes plásticas, la arq., el cine...",
                "Gustavo Gili", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Bernd Rau", "Pablo Picasso Obra gráfica", "Gustavo Gili", "1982", "", "Arte_historia_musica"));
        b.add(new Book("John Hospers", "Significado y verdad en el arte", "F. Torres", "1980", "",
                "Arte_historia_musica"));
        b.add(new Book("Mikel Dufrenne", "Fenomenología de la experiencia estética I", "F. Torres", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Mikel Dufrenne", "Fenomenología de la experiencia estética II", "F. Torres", "1983", "",
                "Arte_historia_musica"));
        b.add(new Book("Guillermo Fatás - Gonzalo M. Borrás", "Diccionario de términos de arte", "Guara", "1980",
                "Fotocopia", "Arte_historia_musica"));
        b.add(new Book("Vito Fumagalli", "Las piedras vivas", "Nerea", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Julio E. Pairo", "Cezanne Gauguin Van Gogh y Seurat", "Nova", "1963", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Pere Salabert", "(D)efecto de la pintura", "Anthropos", "1985", "", "Arte_historia_musica"));
        b.add(new Book("Juan José Lahuerta", "1927 La abstracción necesaria en el arte y la arquitectura", "Anthropos",
                "1989", "", "Arte_historia_musica"));
        b.add(new Book("Prof. Gerhard Ulrich", "El mundo de la pintura", "C. Lectores", "1974", "",
                "Arte_historia_musica"));
        b.add(new Book("Erwin Panofsky", "Renacimiento y renacimientos en el arte occidental", "Alianza", "1988",
                "6ª reimp.", "Arte_historia_musica"));
        b.add(new Book("Julián Díaz Sánchez", "Excursiones por el Museo del Prado", "Penthalon", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Umberto Eco", "La definición del arte", "Mnez. Roca", "1970", "", "Arte_historia_musica"));
        b.add(new Book("Charles Chassé", "Gauguin sin leyenda", "N. C. Labor", "1968", "", "Arte_historia_musica"));
        b.add(new Book("M. Gauffretean-Sévy", "Hieronymus Bosch \"el bosco\"", "N. C. Labor", "1969", "",
                "Arte_historia_musica"));
        b.add(new Book("Gina Pischel", "Breve historia del Arte chino", "N. C. Labor", "1967", "",
                "Arte_historia_musica"));
        b.add(new Book("Jean Guichard-Meili", "Cómo mirar la pintura", "N. C. Labor", "1970", "",
                "Arte_historia_musica"));
        b.add(new Book("C. Rodríguez Aguilera", "Picasso 85", "N. C. Labor", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Jean Duvignand", "Sociología del arte", "Península", "1988", "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Walter Benjamin", "El concepto de crítica de arte en el rom. Alemán", "Península", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Diccionarios Rioduero", "Arte I y II", "Rioduero", "1978", "", "Arte_historia_musica"));
        b.add(new Book("Diccionarios Rioduero", "El arte en la antigüedad", "Rioduero", "1985", "",
                "Arte_historia_musica"));
        b.add(new Book("René Berger", "El conocimiento de la pintura I, II y III", "Noguer", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Fernando Checa y otros", "Guía para el estudio de la Hª del arte", "Cátedra", "1985", "",
                "Arte_historia_musica"));
        b.add(new Book("Alfonso Pérez Sánchez", "Hª del dibujo en España de la E. Media a Goya", "Cátedra", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("Dirigida por Ursula Hatje", "Historia de los estilos artísticos I y II", "Istmo", "1973", "",
                "Arte_historia_musica"));
        b.add(new Book("John Rewald", "Historia del impresionismo I y II", "Seix Barral", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("Alberto Terenti", "Florencia en la época de los Médicis", "Península", "1974", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul Gauguin", "Escritos de un salvaje", "Barral", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Sarat Kofman", "El nacimiento del arte", "Siglo XXI", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Desmond Morris", "La biología del arte", "Siglo XXI", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Emilio Orozco Díaz", "Introducción al barroco T. I y II", "Univ. Granada", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "3 horas en el Museo del Prado", "Caro Raggio", "", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "Arte de entreguerras", "M. Aguilar", "", "", "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "Las ideas y las formas", "Aguilar", "", "", "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "Goya Picasso Zabaleta", "Aguilar", "", "", "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "Menester del crítico del arte", "Aguilar", "", "", "Arte_historia_musica"));
        b.add(new Book("Eugenio D'ors", "Mis salones", "Aguilar", "", "", "Arte_historia_musica"));
        b.add(new Book("Mario Dionisio", "Introducción a la pintura", "Alianza", "1972", "", "Arte_historia_musica"));
        b.add(new Book("Pierre Francastel", "Sociología del arte", "Alianza", "1972", "", "Arte_historia_musica"));
        b.add(new Book("José Antonio Maravall", "Velázquez y el espíritu de la modernidad", "Alianza", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Jean Galard - François Châtelet", "La muerte de las bellas artes Carta con la mano...",
                "Fundamentos", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Martin Chuster Horst Beisl", "Psicología del arte", "Blume", "1982", "", "Arte_historia_musica"));
        b.add(new Book("Victoria Cambalia y otros", "El descrédito de las vanguardias artísticas", "Blume", "1980", "",
                "Arte_historia_musica"));
        b.add(new Book("Alessandro Ballarin", "Tiziano", "Toray, S. A.", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Richard Wollheim", "El arte y sus objetos", "Seix Barral", "1972", "", "Arte_historia_musica"));
        b.add(new Book("Jean Louis Schefer", "Escenografía de un cuadro", "Seix Barral", "1970", "",
                "Arte_historia_musica"));
        b.add(new Book("Sidney Fin Kelstein", "El realismo en el arte", "Grijalbo", "1969", "", "Arte_historia_musica"));
        b.add(new Book("E. H. Gombrich", "Freud y la psicología del arte", "Barral", "1971", "", "Arte_historia_musica"));
        b.add(new Book("F. Leger", "Funciones de la pintura", "Edicusa", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Santiago Amón", "Picasso", "Edicusa", "1973", "", "Arte_historia_musica"));
        b.add(new Book("V. Aguilera Cerni", "El arte impugnado", "Edicusa", "1969", "", "Arte_historia_musica"));
        b.add(new Book("Jaime Espinar", "El Romanticismo", "Atlántida, S.A.", "1947", "", "Arte_historia_musica"));
        b.add(new Book("Vicente Marrero", "Picasso y el monstruo", "Univ. Compl.", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Rafael Argullol", "Tres miradas sobre el arte", "Destino", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Ernts Fischer", "La necesidad del arte", "Península", "1970", "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Winckel Manu", "Reflexiones sobre la imitación del arte griego...", "Península", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Ed. De Angel González García", "Leonardo da Vinci Tratado de pintura", "Akal", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("Ernesto Grassi", "Arte y mito", "Nueva Visión", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Juan Antonio Gaya Nuño", "Ataraxia y desasosiego en el arte", "Inst. Ibys", "1958", "",
                "Arte_historia_musica"));
        b.add(new Book("Pablo Picasso", "Exposición itinerante", "Mº Ed. Y C.", "1968", "", "Arte_historia_musica"));
        b.add(new Book("Claude Levi-Strauss", "Arte lenguaje etnología", "Siglo XXI", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Wilfold Rybczynski", "La casa Historia de una idea", "Nerea", "1989", "",
                "Arte_historia_musica"));
        b.add(new Book("Mario Praz", "Mnemosyne", "Taurus", "1981", "", "Arte_historia_musica"));
        b.add(new Book("Frank Kermode", "Formas de atención", "Gedisa", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Félix Schwartzmann", "Teoría de la expresión", "Univ. Chile", "1966", "",
                "Arte_historia_musica"));
        b.add(new Book("André Breton", "Los manifiestos del surrealismo", "Nueva Visión", "1965", "",
                "Arte_historia_musica"));
        b.add(new Book("George Kubler", "La configuración del tiempo", "Nerea", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Michel Tournier", "El Tabor y el Sinai", "Versal", "1989", "", "Arte_historia_musica"));
        b.add(new Book("José Gutiérrez Solana", "La España negra", "Barral", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Sthephane Lupasco", "Nuevos aspectos del arte y de la ciencia", "Guadarrama", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Antoni Tapies", "La práctica del arte", "Ariel", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Librofilm Aguilar", "Saint-Jacques de Compostelle", "Aguilar", "1965", "Francés",
                "Arte_historia_musica"));
        b.add(new Book("J.J. Lozano - A. Calleja", "Monasterios de Valladolid", "Miñón", "1980", "",
                "Arte_historia_musica"));
        b.add(new Book("Colección Central Hispano", "Del realismo a la actualidad", "Bº Central-Hisp-", "", "",
                "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara I", "Angel Cabo Marcelo Vigil Edad Antigua", "Alianza U.", "1973",
                "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara III", "A. Domínguez Ortiz El antiguo Régimen", "Alianza U.",
                "1973", "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara IV", "Gonzalo Anes El antiguo régimen: Los Borbones",
                "Alianza U.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara VI", "M. Mnez. Cuadrado La burguesía conservadora (1874-1931",
                "Alianza U.", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara VII", "Ramón Tamames La república La era de Franco", "Alianza U.",
                "1973", "", "Arte_historia_musica"));
        b.add(new Book("Ramón J. Sender", "Crónica del Alba 1, 2 y 3", "Alianza U.", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Javier Varela", "Jovellanos", "Alianza U.", "1989", "", "Arte_historia_musica"));
        b.add(new Book("Claudio Sánchez Albornoz", "Ensayos sobre historia de España", "Siglo XXI", "1973", "",
                "Arte_historia_musica"));
        b.add(new Book("François Chatelet", "El nacimiento de la historia 1 y 2", "Siglo XXI", "1978", "",
                "Arte_historia_musica"));
        b.add(new Book("José Luis Abellán", "De la guerra civil al exilio republicano (1936-1977)", "Mezquita", "1982",
                "", "Arte_historia_musica"));
        b.add(new Book("Carlos Díaz", "Las teorías anarquistas", "Zero", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Rudolf Bultmann", "Historia y escatología", "Studium", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Jan Morris", "Presencia de España", "Turner", "1984", "", "Arte_historia_musica"));
        b.add(new Book("Bernal Díaz del Castillo", "Hª verdadera de la conquista de la Nueva España (3)",
                "Historia 16", "1991", "", "Arte_historia_musica"));
        b.add(new Book("L. Alonso Tejada", "Historias de amor de la Hª de España I", "Bruguera", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("L. Alonso Tejada", "Historias de amor de la Hª de España II", "Bruguera", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Bernard Michal", "Los grandes enigmas de los tiempos de antaño", "Crémille", "1970", "",
                "Arte_historia_musica"));
        b.add(new Book("Emile Temime y dos más", "Historia de la España contemporánea", "Ariel", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Eduardo Storni", "Bruckner", "Esp.  Calpe, S.A.", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Martine Cadieu", "Boulez", "Esp.  Calpe, S.A.", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Yves y Ada Remy", "Brahms", "Esp.  Calpe, S.A.", "1978", "", "Arte_historia_musica"));
        b.add(new Book("Jean Maillard", "Couperin", "Esp.  Calpe, S.A.", "1978", "", "Arte_historia_musica"));
        b.add(new Book("Sylvie Dermoncourt", "Mahaler", "Esp.  Calpe, S.A.", "1979", "", "Arte_historia_musica"));
        b.add(new Book("Jean Clausse", "Franck", "Esp.  Calpe, S.A.", "1980", "", "Arte_historia_musica"));
        b.add(new Book("André Lischké", "Stravinski", "Esp.  Calpe, S.A.", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña", "La música en la vida espiritual Nº 5", "Taurus", "1958", "",
                "Arte_historia_musica"));
        b.add(new Book("Wielhelm Dilthey", "La gran música de Bach Nº 51", "Taurus", "1963", "", "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña", "Música y antimúsica en Unamuno Nº 63", "Taurus", "1965", "",
                "Arte_historia_musica"));
        b.add(new Book("Norbert Dufourcq, Director", "La música I", "Planeta", "1973", "3ª ed.", "Arte_historia_musica"));
        b.add(new Book("Norbert Dufourcq, Director", "La música II", "Planeta", "1965", "", "Arte_historia_musica"));
        b.add(new Book("Norbert Dufourcq", "Breve historia de la música Nº 3", "F. C. E.", "1963", "",
                "Arte_historia_musica"));
        b.add(new Book("David D. Boyden", "Introducción a la música T. I, II y III", "Felmar", "1979", "",
                "Arte_historia_musica"));
        b.add(new Book("José Subirá", "Historia de la Música T. I y II", "Salvat Editores", "1951", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Francois Michel, Director", "Enciclopedia Salvat de la Música T. I, II III y IV", "Salvat",
                "1967", "", "Arte_historia_musica"));
        b.add(new Book("Roland de Candé", "Historia universal de la música T. 1 y 2", "Aguilar", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Yehudi Menuhin y  Curtis Davis", "La música del hombre", "Fondo Ed. Int.", "1979", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul Henry Lang", "La música en la civilización occidental", "EUDEBA", "1969", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Josef Rufer", "Músicos sobre música", "EUDEBA", "1964", "", "Arte_historia_musica"));
        b.add(new Book("John Redfield", "Música: ciencia y arte", "EUDEBA", "1969", "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña", "Historia de la música", "E.P.E.S.A.", "1954", "2ª ed. Cor. aum.",
                "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña", "Historia de la música", "E.P.E.S.A.", "1962", "3ª ed. Cor. aum.",
                "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña", "Música y literatura", "Rialp", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Federico Sopeña Ibáñez", "Estudios sobre Mahler", "Serv. Pub. MEC", "1976", "",
                "Arte_historia_musica"));
        b.add(new Book("Marc Vignal", "Mahler Mi tiempo llegará", "M. Castellote", "1974", "", "Arte_historia_musica"));
        b.add(new Book("Paul Banks Donald Mitchell", "Gustav Mahler", "Muchnik", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Arnold Liberman", "G. Mahler o el corazón abrumado", "Altalena", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Quirino Principe", "Mahler", "J. Vergara", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Theodor W. Adorno", "Mahler", "Península", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Theodor W. Adorno", "Impromptus Artículos musicales", "Laia", "1985", "",
                "Arte_historia_musica"));
        b.add(new Book("Theodor W. Adorno", "Filosofía de la nueva música", "Sur", "1966", "", "Arte_historia_musica"));
        b.add(new Book("Theodor W. Adorno", "Disonancias", "Rialp", "1966", "", "Arte_historia_musica"));
        b.add(new Book("C. F. Abdy Williams", "Bach", "Anaconda", "1950", "", "Arte_historia_musica"));
        b.add(new Book("Douglas R. Hofstadter", "Gódel, Escher, Bach", "Tusquest", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Adolfo Salazar", "J. Sebastian Bach Un ensayo", "Colegio México", "1951", "",
                "Arte_historia_musica"));
        b.add(new Book("Pierre Boulez", "Puntos de referencia", "Gedisa", "1984", "", "Arte_historia_musica"));
        b.add(new Book("Mondadori", "Guía ilustrada de C. de música clásica", "Mondadori", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Arnold Toynbee", "Cómo la historia grecoromana ilumina historia  universal", "C. Bermejo",
                "1952", "", "Arte_historia_musica"));
        b.add(new Book("Arnold Schoenberg", "Cartas", "Turner Música", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Claude Samuel", "Panorama de la música contemporánea", "Guadarrama", "1965", "",
                "Arte_historia_musica"));
        b.add(new Book("Jesús Mª Caamaño (Coordinador)", "Relaciones artísticas entre España y Portugal",
                "Europa, A.G.", "1986", "", "Arte_historia_musica"));
        b.add(new Book("Manuel Valls Gorina", "Aproximación a la música", "Salvat", "1970", "Libro TV",
                "Arte_historia_musica"));
        b.add(new Book("Oskar Kokoschka", "Mi vida", "Tusquets", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara II", "J. A. Gª de Cortázar La época medieval", "Alianza U.",
                "1973", "", "Arte_historia_musica"));
        b.add(new Book("Historia de España Alfaguara V", "Miguel Artola La burguesía revolucionaria (1808-1869)",
                "Alianza U.", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Georges Duby", "Diálogo sobre la historia", "Alianza U.", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Antonio Ramos Oliveira", "Historia de España I, II y III", "Cía. Gral. Ed. S.A.", "1952", "",
                "Arte_historia_musica"));
        b.add(new Book("Oswyn Murray", "Grecia antigua", "Taurus", "1981", "", "Arte_historia_musica"));
        b.add(new Book("Ranuccio Bianchin Bandinelli", "Historia y civilización de los Griegos Tomos I al X", "Ikaria",
                "1980", "1984", "Arte_historia_musica"));
        b.add(new Book("Mario Bucci", "Marc  Chagall", "C. Lectores", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Mº de Cultura Bº Bilbao", "Juan Gris (1/887-1927)", "Barral", "1985", "",
                "Arte_historia_musica"));
        b.add(new Book("L. P. Gachard", "Carlos V y Felipe II (C. Cisneros)", "Atlas", "1944", "nº 100",
                "Arte_historia_musica"));
        b.add(new Book("The Phaidon  Press", "Michelangelo", "Phaidon", "1959", "3ª ed. Inglés", "Arte_historia_musica"));
        b.add(new Book("Roland Villeneuve", "Le musée des supplices", "Azur", "1968", "Francés Piel",
                "Arte_historia_musica"));
        b.add(new Book("Liev Semionovich Vigotski", "Psicología del arte", "Barral", "1972", "", "Arte_historia_musica"));
        b.add(new Book("Rudolf y Margot Wittkower", "Nacidos  bajo el signo de Saturno", "Cátedra", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Jonh Rewald", "El postimpresionismo De Van Gogh a Gaugin", "Alianza", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Mya Cinotti", "La femme nue par les peintres", "E. de Varenne", "1951", "Francés",
                "Arte_historia_musica"));
        b.add(new Book("J. M. Bermudo", "El mcluhanismo: ideología de la tecnología", "Picazo", "1972", "",
                "Arte_historia_musica"));
        b.add(new Book("Meyers  Chapiro", "Estudios sobre el arte de la antig. Tardía  Nº 59", "Alianza", "1986", "",
                "Arte_historia_musica"));
        b.add(new Book("Paul  Westheim", "Arte antiguo de México Nº 67", "Alianza", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Nicolás García Ruiz", "Eisenhower Stalin", "Cervantes", "1958", "2ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Meyers  Chapiro", "El arte moderno Nº 73", "Alianza", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Rensselaer W. Lee", "Ut pictura poesis La Tª humanística de la pintura", "Cátedra", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Francisca Pérez Carreño", "Los placeres del parecido Icono y representación", "La balsa M.",
                "1988", "", "Arte_historia_musica"));
        b.add(new Book("José Alcina", "Las claves del arte precolombino", "Ariel", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Jean Clay", "Rostros del arte moderno", "Monte Avila", "1971", "", "Arte_historia_musica"));
        b.add(new Book("Estela Ocampo", "Diccionario de términos artísticos y arqueológicos", "Montesinos", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Giorgio de Chirico", "Hebdómeros", "E. del Cotal SA", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Oto Bihalji-Merin", "El arte Naif", "Labor,  S.A.", "1978", "", "Arte_historia_musica"));
        b.add(new Book("Carl E. Schorske", "Viena Fin-de-Siecle Política y Cultura", "GG Arte", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Antonin Artaud", "Cartas a André Bretón", "Calamus Script.", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Ed. de Josep M. Rovira", "León Battista Alberti. Antología", "Península", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Santiago Sebastián", "Contrarreforma y barroco Nº 21", "Alianza", "1981", "2 ejemplares",
                "Arte_historia_musica"));
        b.add(new Book("Paul Hazard", "La crisis de la conciencia europea (1680-1715)", "Alianza U.", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Georges  Duby", "El año mil", "Gedisa", "1988", "", "Arte_historia_musica"));
        b.add(new Book("J. A. Ferrer Benimeli (Coordinador)", "La masonería en la España del s. XIX Tomos I y II",
                "Junta Cª y León", "1987", "", "Arte_historia_musica"));
        b.add(new Book("Edmund Carpenter-M. Mc  Luhan", "El aula sin muros", "Cult. Popular", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Aaron Copland", "Copland habla sobre música", "Siglo veinte", "1967", "Intonso",
                "Arte_historia_musica"));
        b.add(new Book("Eduardo Alonso", "Guía lírica del auditor de conciertos", "Sagitario", "1948", "",
                "Arte_historia_musica"));
        b.add(new Book("André Coeuroy", "La música y sus  formas", "Schapire", "1953", "", "Arte_historia_musica"));
        b.add(new Book("André Gauthier", "Beethoven", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("André Gauthier", "Liszt", "Esp.  Calpe, S.A.", "1975", "", "Arte_historia_musica"));
        b.add(new Book("André Gauthier", "Gershwin", "Esp.  Calpe, S.A.", "1977", "", "Arte_historia_musica"));
        b.add(new Book("Rafael Kubelik", "El mundo de la sinfonía", "Labor, S. A.", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Naime Kattan y otros", "Análisis de Marshall Mc Luhan", "EBA, S.A.", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Federico Wattenberg", "Museo Nacional  de Escultura de Valladolid", "Aguilar", "1972",
                "2ª ed. 1ª reimp.", "Arte_historia_musica"));
        b.add(new Book("Carl Friedrich von Weizsäcker", "El hombre en su historia", "C. Lectores", "1993", "",
                "Arte_historia_musica"));
        b.add(new Book("Gregory Bateson", "Metálogos", "EBA, S.A.", "1982", "", "Arte_historia_musica"));
        b.add(new Book("Harold E. Hatt", "Cibernética e imagen del hombre", "Mnez. Roca", "1968", "",
                "Arte_historia_musica"));
        b.add(new Book("Peter C. Sutton", "El siglo de oro del paisaje holandés", "F. Thissen-Born.", "1994", "",
                "Arte_historia_musica"));
        b.add(new Book("Robert Simpson", "Iniciación a la música 4 Y 5 La sinfonía I y II", "Taurus", "1983", "",
                "Arte_historia_musica"));
        b.add(new Book("Colección Central Hispano", "Del renacimiento al romanticismo", "Bº Central-Hisp-", "", "",
                "Arte_historia_musica"));
        b.add(new Book("Adolfo Salazar", "Conceptos fundamentales en la Hª de la música", "Alianza M.", "1988", "",
                "Arte_historia_musica"));
        b.add(new Book("Casper Höweler", "Enciclopedia de la música. Manual", "Noguer", "1974", "4ª ed.",
                "Arte_historia_musica"));
        b.add(new Book("Walter Panofsky", "Richard Strauss", "Alianza M.", "1988", "", "Arte_historia_musica"));
        b.add(new Book("Claude Debussy", "El Sr. Corchea y otros escritos", "Alianza M.", "1987", "",
                "Arte_historia_musica"));
        b.add(new Book("Marshall Mc Luhan", "La Galaxia Gutenberg", "Aguilar", "1972", "", "Arte_historia_musica"));
        b.add(new Book("José Alcina Franch", "Arte y antropología Nº 28", "Alianza", "1982", "2 ejemplares",
                "Arte_historia_musica"));
        b.add(new Book("Douglas Moore", "Iniciación a la música 2 Guía de los estilos musicales", "Taurus", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Ralf Hill", "Iniciación a la música 6 El concierto", "Taurus", "1983", "",
                "Arte_historia_musica"));
        b.add(new Book("H. C. Colles", "Iniciación a la música 3 La evolución de la música", "Taurus", "1982", "",
                "Arte_historia_musica"));
        b.add(new Book("Howard Shanet", "Iniciación a la música 1 Método de lectura musical", "Taurus", "1981", "",
                "Arte_historia_musica"));
        b.add(new Book("Heinrich Wölfflin", "Reflexiones sobre la historia del arte", "Península", "1988",
                "2 ejemplares", "Arte_historia_musica"));
        b.add(new Book("Marcel Durliat", "Introducción al arte medieval en Occidente", "Cátedra", "1979",
                "2 ejemplares", "Arte_historia_musica"));
        b.add(new Book("Manuel Tuñón de Lara", "La España del siglo XIX", "Laia", "1973", "", "Arte_historia_musica"));
        b.add(new Book("Claudio Sánchez Albornoz", "Jalones en la modernización de España", "Ariel", "1975", "",
                "Arte_historia_musica"));
        b.add(new Book("Juan Díaz del Moral", "Historia de las agitaciones campesinas andaluzas", "Alianza", "1977",
                "2ª ed.", "Arte_historia_musica"));
        b.add(new Book("Manuel Tuñón de Lara", "España La quiebra de 1898", "Sarpe", "1986", "", "Arte_historia_musica"));
        b.add(new Book("René Huyghe", "Los poderes de la imagen", "Labor, S.A.", "1968", "", "Arte_historia_musica"));
        b.add(new Book("John Villet", "El rompecabezas expresionista", "Guadarrama", "1970", "2 ejemplares",
                "Arte_historia_musica"));
    }

    private static void fillAdonais() {
        final List<Book> b = DB.get("Adonais_poesia");
        b.add(new Book("Concha Zardoya", "Pájaros del nuevo mundo XXVII", "Rialp", "1946", "", "Adonais_poesia"));
        b.add(new Book("FRIEDRICH HÖLDERLIN", "Doce poemas Adonais LXI", "Rialp", "1949", "", "Adonais_poesia"));
        b.add(new Book("Antonio Gamoneda", "Sublevación inmóvil CLXXXII", "Rialp", "1960", "", "Adonais_poesia"));
        b.add(new Book("Julia Uceda", "Extraña juventud CCIII", "Rialp", "1962", "", "Adonais_poesia"));
        b.add(new Book("Juan Gil-Albert", "Concertar es amor LXXII", "Rialp", "1951", "", "Adonais_poesia"));
        b.add(new Book("T. S. ELIOT", "Cuatro cuartetos LXXVI-LXXVII", "Rialp", "1951", "", "Adonais_poesia"));
        b.add(new Book("Pierre Emmanuel", "Antología Poética CCXVIII-CCXIX", "Rialp", "1964", "", "Adonais_poesia"));
        b.add(new Book("Manuel Arce", "Sombra de un amor LXXXVI", "Rialp", "1952", "", "Adonais_poesia"));
        b.add(new Book("Julián Andujar", "La soledad y el encuentro LXXXVIII", "Rialp", "1952", "", "Adonais_poesia"));
        b.add(new Book("Miguel Torga", "Antología poética LXXXVIII", "Rialp", "1952", "", "Adonais_poesia"));
        b.add(new Book("Susana March", "La tristeza", "Rialp", "1953", "", "Adonais_poesia"));
        b.add(new Book("Adolfo Casais Monteiro", "Antología CIII", "Rialp", "1954", "", "Adonais_poesia"));
        b.add(new Book("STEFAN GEORGE", "Peregrinajes CV", "Rialp", "1954", "", "Adonais_poesia"));
        b.add(new Book("Elisabet Barret Bronwning", "Sonetos del portugués CX", "Rialp", "1954", "", "Adonais_poesia"));
        b.add(new Book("José Antonio Muñoz Rojas", "Cantos a Rosa CXIV", "Rialp", "1954", "", "Adonais_poesia"));
        b.add(new Book("Carlos Murciano", "Viento en la carne CXVI", "Rialp", "1955", "", "Adonais_poesia"));
        b.add(new Book("Manuel Alvarez Ortega", "Exilio CXXI", "Rialp", "1955", "", "Adonais_poesia"));
        b.add(new Book("DYLAN THOMAS", "Poemas CXXIV", "Rialp", "1955", "", "Adonais_poesia"));
        b.add(new Book("Julio Mariscal Montes", "Pasan Hombres obscuros", "Rialp", "1955", "", "Adonais_poesia"));
        b.add(new Book("Prólogo de Vicente Aleixandre", "Antología de Adonais C-CI", "Rialp", "1956", "",
                "Adonais_poesia"));
        b.add(new Book("Paul Valery", "La serpiente y la parca joven CXXVII", "Rialp", "1956", "", "Adonais_poesia"));
        b.add(new Book("Angel González", "Aspero Mundo CXXX", "Rialp", "1956", "", "Adonais_poesia"));
        b.add(new Book("Gonzáles Alegre R. (recop.)", "Ant. de la Poesía Gallega contemp. CLXI-CLVII", "Rialp", "1959",
                "", "Adonais_poesia"));
        b.add(new Book("Gabriel Celaya", "De claro en claro CXXXV", "Rialp", "1956", "", "Adonais_poesia"));
        b.add(new Book("Salvador Espriu", "Antología Lírica CXXXVI-VII", "Rialp", "1956", "", "Adonais_poesia"));
        b.add(new Book("María Elvira Lacaci", "Humana voz CXXXVIII", "Rialp", "1957", "", "Adonais_poesia"));
        b.add(new Book("William Butler Yeats", "Poemas CXL", "Rialp", "1957", "", "Adonais_poesia"));
        b.add(new Book("Saint John Perse", "ANABASIS CXLII", "Rialp", "1957", "", "Adonais_poesia"));
        b.add(new Book("Roy Campbell", "Poemas CLVII", "Rialp", "1958", "", "Adonais_poesia"));
        b.add(new Book("Julio Aumente", "Los silencios", "Rialp", "1958", "", "Adonais_poesia"));
        b.add(new Book("Aquilino Duque", "El campo de la verdad", "Rialp", "1958", "", "Adonais_poesia"));
        b.add(new Book("Ezra Pound", "Los cantos Pisanos CLXXVIII-CLXXIX", "Rialp", "1960", "", "Adonais_poesia"));
        b.add(new Book("Angel Crespo", "Ant. de la nueva poesía portuguesa CLXXXIII-CLXXXI", "Rialp", "1961", "",
                "Adonais_poesia"));
        b.add(new Book("MIJA'IL UN`AYMA", "El rumor de los párpados CXXXII", "Rialp", "1956", "", "Adonais_poesia"));
        b.add(new Book("Aurora de Albornoz", "Poemas para alcanzar un segundo CXCI", "Rialp", "1961", "",
                "Adonais_poesia"));
        b.add(new Book("Salustiano Masó", "Historia de un tiempo futuro CXCII", "Rialp", "1961", "", "Adonais_poesia"));
        b.add(new Book("Elena Andrés", "Eterna vela CXCIII", "Rialp", "1961", "", "Adonais_poesia"));
        b.add(new Book("Prólogo de Vicente Aleixandre", "Segunda Antología de \"ADONAIS\" CC", "Rialp", "1962", "",
                "Adonais_poesia"));
        b.add(new Book("José Ruiz Sánchez", "Los soportales CCI", "Rialp", "1962", "", "Adonais_poesia"));
        b.add(new Book("Alfonso Canales", "Cuenta y razón CCII", "Rialp", "1962", "", "Adonais_poesia"));
        b.add(new Book("Félix Grande", "Las piedras CCXV", "Rialp", "1964", "", "Adonais_poesia"));
        b.add(new Book("Alvarez Ortega", "Invención de la muerte CCXVI", "Rialp", "1964", "", "Adonais_poesia"));
        b.add(new Book("Elena Andrés", "Dos caminos CCXVII", "Rialp", "1964", "", "Adonais_poesia"));
        b.add(new Book("Rainer María Rilke", "Elegías duinesas y Poemas de la noche  nº 255-256", "Rialp", "1968", "",
                "Adonais_poesia"));
        b.add(new Book("Jacinto Herrero Esteban", "La trampa del cazador Pról. J. J.  Lozano nº 314", "Rialp", "1974",
                "Dedicado", "Adonais_poesia"));
        b.add(new Book("Greta Engberg", "Poetas suecos contemporáneos CXC", "Rialp", "1961", "", "Adonais_poesia"));
        b.add(new Book("Apollinaire", "La canción del mal amado y otros poemas CLXXVII", "Rialp", "1960", "",
                "Adonais_poesia"));
        b.add(new Book("Clementina Arderiu", "Antología poética CXCIV-CXCV", "Rialp", "1961", "", "Adonais_poesia"));
        b.add(new Book("María Elvira Lacaci", "Sonido de Dios CCIV", "Rialp", "1962", "", "Adonais_poesia"));
    }
}
