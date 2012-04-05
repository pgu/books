package com.pgu.books.server.rpc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pgu.books.shared.Book;

public class BooksDB {

    public final static Map<String, List<Book>> DB = new HashMap<String, List<Book>>();
    static {
        DB.put("Biblioteca_el_sol", new ArrayList<Book>());
        fillElSol();
        DB.put("Budismagibrujocult", new ArrayList<Book>());
        fillBudis();
        DB.put("Errores_de_pegado", new ArrayList<Book>());
        fillErrores();
        DB.put("Filocont_2", new ArrayList<Book>());
        fillFilocont_2();
        DB.put("Filoespanola", new ArrayList<Book>());
        fillFiloespanola();
        DB.put("Filoextranjera", new ArrayList<Book>());
        fillFiloextranjera();
        DB.put("Fsillon", new ArrayList<Book>());
        fillFsillon();
        DB.put("Galicia_ling_miscelanea", new ArrayList<Book>());
        fillGalicia_ling_miscelanea(); // TODO
        DB.put("Libros_antiguos", new ArrayList<Book>());
        fillLibrosAntiguos();
        DB.put("Libros_austral", new ArrayList<Book>());
        fillLibrosAustral(); // TODO
        DB.put("Liternovela_ex_espanola", new ArrayList<Book>());
        fillLiternovela_ex_espanola();
        DB.put("Losada", new ArrayList<Book>());
        fillLosada();
        DB.put("Lpuerta", new ArrayList<Book>());
        fillLpuerta();
        DB.put("Lradio", new ArrayList<Book>());
        fillLradio();
        DB.put("Poesia_esp_y_extranjera", new ArrayList<Book>());
        fillPoesiaespyext(); // TODO
        DB.put("Psicologia_y_medicina", new ArrayList<Book>());
        fillPsicologiaymedicina();
        DB.put("Repes_frances_italoport", new ArrayList<Book>());
        fillRepes_frances_italoport();
        DB.put("Restos", new ArrayList<Book>());
        fillRestos();
        DB.put("Salvat_muy_interesante", new ArrayList<Book>());
        fillSalvat_muy_interesante();
        DB.put("Sexmujer", new ArrayList<Book>());
        fillSexmujer();
        DB.put("Teoreligion_2", new ArrayList<Book>());
        fillTeoreligion_2();
        DB.put("Vallad_castilla_leon", new ArrayList<Book>());
        fillVallad_castilla_leon();
    }

    private static void fillVallad_castilla_leon() {
        final List<Book> b = DB.get("Vallad_castilla_leon");
        b.add(new Book("Pedro García Martín", "El monasterio de S. Benito el Real de Sahagún", "Junta Cª y León",
                "1985", "", "Vallad_castilla_leon"));
        b.add(new Book("Ramón Carnicer", "Del Bierzo y su gente", "Junta Cª y León", "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("José Luis Martín Galindo", "Parlamento y actividad agraria tradicional en León",
                "Junta Cª y León", "1987", "Dedicado", "Vallad_castilla_leon"));
        b.add(new Book("José Luis Martín Galindo", "La ciudad de León", "Cristo Rey", "", "", "Vallad_castilla_leon"));
        b.add(new Book("Luis Alonso Luengo", "Los  maragatos", "Nebrija", "1980", "Dedicado", "Vallad_castilla_leon"));
        b.add(new Book("Manuel Sesma", "El nuevo espacio periférico de Segovia", "Sever-Cuesta", "1987", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Junta de Castilla y León", "Manual de Forestación", "Lizarra, S.A.", "1995", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Gonzalo Martínez Díez, S.I.", "Alava Medieval T. I y II", "Graf. Eset", "1974", "",
                "Vallad_castilla_leon"));
        b.add(new Book("J. R. Lueje", "Los Picos de Europa", "Everest, S.A.", "1994", "2ª ed.", "Vallad_castilla_leon"));
        b.add(new Book("J. García Mercadal", "Viajes de extranjeros por España y Portugal T I a VI", "Jª Cª y León",
                "1999", "", "Vallad_castilla_leon"));
        b.add(new Book("Juan Riera", "Carlos III y los Chuetas mallorquines", "Univ. Vallad.", "1975", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Pedro Retuerto Vaquero", "El Pisuerga", "Minerva", "1958", "", "Vallad_castilla_leon"));
        b.add(new Book("Amando Represa", "El pendón de Castilla (2 ejemplares)", "Ämbito", "", "Fotocopia",
                "Vallad_castilla_leon"));
        b.add(new Book("Agustin Rodríguez Fernández", "Los Carabeos", "Jean, S.A.", "1979", "", "Vallad_castilla_leon"));
        b.add(new Book("Domingo Rodríguez", "Tres momentos psicológicos", "", "1985", "Copia", "Vallad_castilla_leon"));
        b.add(new Book("José Ramón Gonzáles (Ed.)", "José Jiménez lozano", "Univ. Valladolid", "2003", "",
                "Vallad_castilla_leon"));
        b.add(new Book("José Delfin Val", "Cervantes en Valladolid", "El Mundo", "2005", "", "Vallad_castilla_leon"));
        b.add(new Book("Blas Pajarero/Felix Cuadrado Lomas", "Retazos de Torozos", "Relieve", "1968", "Dedicado",
                "Vallad_castilla_leon"));
        b.add(new Book("Ambito", "Anuario Castilla y León", "Ambito", "1989", "", "Vallad_castilla_leon"));
        b.add(new Book("Varios Autores", "La España de cada Provincia", "Public. Españolas", "1964", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Cátedra San Isidoro", "Legio VII GEMINA", "Dip. León", "1970", "", "Vallad_castilla_leon"));
        b.add(new Book("J. M. Parrilla", "Una provincia: Valladolid", "Dip. Provincial", "1974", "",
                "Vallad_castilla_leon"));
        b.add(new Book("A. Corral C. - Juan Palencia",
                "Villa por villa Viaje a los pueblos de Valladolid T I, II y III", "G. A. Martín", "1985", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Museos de Valladolid", "Ciudad y Provincia", "G. A. Martín", "1982", "", "Vallad_castilla_leon"));
        b.add(new Book("Diputación Provincial", "Valladolid y sus monumentos", "Dip. Valladolid", "1967", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Varios autores: C. Almunia. A. Allúe…", "Valladolid: Imágenes de ayer", "Gº Pinciano", "1985",
                "", "Vallad_castilla_leon"));
        b.add(new Book("Varios autores R. Chacel, Luis Calabia…", "Valladolid: vivencias y fotografías", "Gº Pinciano",
                "1985", "", "Vallad_castilla_leon"));
        b.add(new Book("Bartolomé Bennassar", "Valladolid en el siglo de oro", "G. A. Martín", "1983", "Fotocopia",
                "Vallad_castilla_leon"));
        b.add(new Book("Adeline Rucquoi", "Valladolid en la Edad Media V. I y II", "Junta Cª y León", "1987", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Rafael Serrano García", "El sexenio revolucionario en Valladolid 1868/1874", "Junta Cª y León",
                "1986", "Dedicado", "Vallad_castilla_leon"));
        b.add(new Book("J. J. Martín González", "Monumentos civiles de la ciudad de Valladolid", "I. C. Simancas",
                "1983", "", "Vallad_castilla_leon"));
        b.add(new Book("J. J. Martín González", "Monumentos religiosos de la ciudad de Valladolid", "I. C. Simancas",
                "1985", "", "Vallad_castilla_leon"));
        b.add(new Book("E. Gª Chico y A. Bustamante", "Partido judicial de Nava del Rey Catálogo", "Dip. Valladolid",
                "1972", "", "Vallad_castilla_leon"));
        b.add(new Book("Dip. Prov. Ayunt. Valladolid", "Valladolid en Castilla", "Seix Barral", "1969", "",
                "Vallad_castilla_leon"));
        b.add(new Book("El Mundo de Valladolid", "Valladolid siglo XX T. I y II", "El Mundo", "1996", "",
                "Vallad_castilla_leon"));
        b.add(new Book("El Mundo de Valladolid", "Los mejores de los nuestros", "El Mundo", "2005", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Junta de Castilla y León Cons. Educ.", "Castilla y León Geografía e Hª, Arte…", "Anaya",
                "1987", "", "Vallad_castilla_leon"));
        b.add(new Book("I Congreso de Historia de Cª y León", "El pasado histórico de Castilla y León Primer Congreso",
                "Junta Cª y León", "1984", "", "Vallad_castilla_leon"));
        b.add(new Book("Luis Díaz Viana (Coordinador)", "Etnología y folklore en Castilla y León", "Junta Cª y León",
                "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("Juan Pérez-Embid", "El Cister en Castilla y León", "Junta Cª y León", "1986", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Luis Miguel Villar García", "La Extremadura Castellano-Leonesa 711-1252", "Junta Cª y León",
                "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("Juan Carlos Martín Cea", "El campesinado castellano en la cuenca del Duero", "Junta Cª y León",
                "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("J. M. Alvarez se Eulate y Peñ.", "Historia económica del Condado de Castilla",
                "Junta Cª y León", "1994", "", "Vallad_castilla_leon"));
        b.add(new Book("Junta de Castilla y León", "Concurso de cuentos y poesía para la 3ª edad", "Junta Cª y León",
                "1997", "", "Vallad_castilla_leon"));
        b.add(new Book("Juan Manuel Calleja", "Exposición itinerante Castilla y León", "Junta Cª y León", "1985", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Junta Castilla y León 1987-1988", "A ua crag Itinerante", "Junta Cª y León", "1987", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Máximo Gómez Rascón", "Museos eclesiásticos de Castilla y León", "Junta Cª y León", "1986", "",
                "Vallad_castilla_leon"));
        b.add(new Book("J. Jiménez Lozano - Adolfo Calleja", "Monasterios de Valladolid", "Miñón", "1980", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Varios autores: De la Concha, Nora…", "Literatura contemporánea en Castilla y León",
                "Sever-Cuesta", "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("Varios autores: De la Concha, M Albar…", "El castellano actual en la CC bilingües de España",
                "Europa A. G.", "1986", "", "Vallad_castilla_leon"));
        b.add(new Book("Varios autores", "Libro de la gastronomía de Castilla y León", "Unigraf, S.A.", "1986", "",
                "Vallad_castilla_leon"));
        b.add(new Book("Las Edades del Hombre", "Vlaanderen en Castilla y León", "Andrés Martín", "1995", "",
                "Vallad_castilla_leon"));
        b.add(new Book("J. Sanz-Zuasti - Tomás Velasco", "Fauna vertebrada de Castilla y León T. I y II", "Náyade",
                "2005", "", "Vallad_castilla_leon"));
        b.add(new Book("Varios autores Julio Valdeón Director", "Burgos en la Edad Media", "Junta Cª y León", "1984",
                "", "Vallad_castilla_leon"));
    }

    private static void fillTeoreligion_2() {
        final List<Book> b = DB.get("Teoreligion_2");
        b.add(new Book("Hans Küng", "La Iglesia", "Herder", "1969", "", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "La reencarnación de Dios", "Herder", "1974", "", "Teoreligion_2"));
        b.add(new Book("K. Rahner - H. Vorgrimler", "Diccionario teológico", "Herder", "1966", "", "Teoreligion_2"));
        b.add(new Book("John Macquarrie", "El pensamiento religioso en el siglo XX", "Herder", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("Johannes B. Bauer", "Temas candentes para el cristiano De la A a la Z", "Herder", "1976", "",
                "Teoreligion_2"));
        b.add(new Book("René Fülöp Miller", "El poder y los secretos de los jesuítas", "B. Nueva", "1963", "2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Hans Küng", "Itinerario y obra", "Cristiandad", "1978", "", "Teoreligion_2"));
        b.add(new Book("Leonardo Boff", "Jesucristo y la liberación del hombre", "Cristiandad", "1981", "",
                "Teoreligion_2"));
        b.add(new Book("Robert Graves", "Rey Jesús", "Edhasa", "1984", "", "Teoreligion_2"));
        b.add(new Book("Carlos Díaz", "Preguntarse por Dios es razonable", "Eds. Encuentro", "1989", "",
                "Teoreligion_2"));
        b.add(new Book("Aurelio de Santos Otero", "Los evangelios apócrifos", "BAC", "1985", "5ª ed.", "Teoreligion_2"));
        b.add(new Book("Santa Teresa de Jesús", "Obras Completas", "BAC", "1979", "", "Teoreligion_2"));
        b.add(new Book("Bertrand de Margerie", "Cristo, vida del mundo", "BAC", "1974", "", "Teoreligion_2"));
        b.add(new Book("Antonio Orbe, S.I.", "Cristología gnóstica I y II", "BAC", "1976", "", "Teoreligion_2"));
        b.add(new Book("M. García Cordero", "Biblia y legado del Antiguo Oriente", "BAC", "1977", "", "Teoreligion_2"));
        b.add(new Book("John Henry Newman", "Apología \"pro vita sua\"", "BAC", "1977", "", "Teoreligion_2"));
        b.add(new Book("Hans Urs von Balthasar", "El complejo antirromano", "BAC", "1981", "", "Teoreligion_2"));
        b.add(new Book("Johannes B. Lotz", "La experiencia transcendental", "BAC", "1982", "", "Teoreligion_2"));
        b.add(new Book("Crisógono de Jesús", "Vida de San Juan de la Cruz", "BAC", "1982", "11ª ed.", "Teoreligion_2"));
        b.add(new Book("Daniel Acharuparambil", "Espiritualidad Hinduista", "BAC", "1982", "", "Teoreligion_2"));
        b.add(new Book("Heinrich Zimmermann", "Los métodos histórico-críticos en el Nuevo Test.", "BAC", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("Emily Vermeule", "La muerte en la poesía y en el arte de Grecia", "FCE", "1984", "",
                "Teoreligion_2"));
        b.add(new Book("James P. Carse", "Muerte y existencia", "FCE", "1987", "", "Teoreligion_2"));
        b.add(new Book("José C. Nieto", "En torno a San Juan de la Cruz", "FCE", "1982", "", "Teoreligion_2"));
        b.add(new Book("N. M. Luyten, K. Jaspers, K. Barth", "El hombre y la inmortalidad", "Troquel", "1964", "",
                "Teoreligion_2"));
        b.add(new Book("Jean Baudrillard", "El intercambio simbólico y la muerte", "Monte Avila", "1980", "",
                "Teoreligion_2"));
        b.add(new Book("Varios Autores Trad. L. A. Martín Baró", "Sociología de la muerte", "Sala", "1974", "",
                "Teoreligion_2"));
        b.add(new Book("Gabriel Vahanian", "La muerte de Dios", "Grijalbo", "1968", "", "Teoreligion_2"));
        b.add(new Book("J. Gol Gurina, A. Colodrón y otros", "Ensayo sobre la vida y la muerte", "Teide", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("René Basset, traductor", "Las enseñanzas de J. a sus discípulos. Apócrifo m. y c.", "Obelisco",
                "1987", "", "Teoreligion_2"));
        b.add(new Book("Joseph Klausner", "Jesús de Nazaret. Su vida, su época, sus enseñanzas", "Paidos", "1989", "",
                "Teoreligion_2"));
        b.add(new Book("August Bernhard Hasler", "Cómo llegó el Papa a ser infalible", "Planeta", "1979", "",
                "Teoreligion_2"));
        b.add(new Book("Henri de Lubac", "La posteridad espiritual de Joaquín de Fiore", "Ed. Encuentro", "1989", "",
                "Teoreligion_2"));
        b.add(new Book("Northrop Frye", "El gran código", "Gedisa", "1988", "", "Teoreligion_2"));
        b.add(new Book("S. Sabugal", "La conversión de San Pablo", "Herder", "1975", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Bultmann", "Creer y comprender Vol. I", "Studium", "1974", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Bultmann", "Creer y comprender Vol. II", "Studium", "1976", "", "Teoreligion_2"));
        b.add(new Book("Karl Kautsky", "Orígenes y fundamentos del cristianismo", "Sígueme", "1974", "",
                "Teoreligion_2"));
        b.add(new Book("Vittorio Messori", "Hipótesis sobre Jesús", "Mensajero", "1978", "", "Teoreligion_2"));
        b.add(new Book("R. Caporale A. Grumelli", "Cultura de la increencia", "Mensajero", "1974", "", "Teoreligion_2"));
        b.add(new Book("Colin Campbell", "Hacia una sociología de la Irreligión", "Tecnos", "1977", "", "Teoreligion_2"));
        b.add(new Book("Hugh J. Schonfield", "El complot de Pascua", "Mnez. Roca", "1987", "", "Teoreligion_2"));
        b.add(new Book("Enrique Rodríguez-Solis", "La santidad del pontificado", "El M. Universal", "1986", "",
                "Teoreligion_2"));
        b.add(new Book("Henri Verbist", "Las grandes controversias de la I. contemporánea", "Plaza Janés", "1973", "",
                "Teoreligion_2"));
        b.add(new Book("Karl Barth Francisco Cuervo-Arango", "Introducción al pensamiento de Karl Barth", "Nova Terra",
                "1970", "", "Teoreligion_2"));
        b.add(new Book("Richard P. McBrien", "La Iglesia en el pensamiento del Obispo Robinson", "Nova Terra", "1969",
                "", "Teoreligion_2"));
        b.add(new Book("Victoria Camps", "Los teólogos de la muerte de Dios", "Nova Terra", "1968", "", "Teoreligion_2"));
        b.add(new Book("Francisco Bravo", "Teilhard de Chardin Su concepción de la historia", "Nova Terra", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Hans Küng", "Estructuras de la Iglesia", "Estela", "1965", "", "Teoreligion_2"));
        b.add(new Book("Juan Pedro Morin Jaime Cobreros", "El camino iniciático de Santiago", "Ediciones 29", "1988",
                "3ª ed.", "Teoreligion_2"));
        b.add(new Book("Antonio Ramos-Oliveira", "Los orígenes del cristianismo y de la Iglesia", "Oasis, S.A.",
                "1972", "", "Teoreligion_2"));
        b.add(new Book("Salvador Freixedo", "Interpelación a Jesús de Nazaret", "Kaydeda", "1989", "", "Teoreligion_2"));
        b.add(new Book("Bernard Henri Levy", "El testamento de Dios", "El Cid Editor", "1979", "", "Teoreligion_2"));
        b.add(new Book("Alfred Loisy", "Los misterios paganos y el misterio cristiano", "Paidos", "1967", "",
                "Teoreligion_2"));
        b.add(new Book("Catecismo Holandés", "Nuevo Catecismo para adultos", "Herder", "1969", "", "Teoreligion_2"));
        b.add(new Book("Josef Dreissen", "Diagnóstico del catecismo holandés", "Herder", "1968", "", "Teoreligion_2"));
        b.add(new Book("Wolfgang Trilling", "Jesús y los problemas de su historicidad", "Herder", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Hans Küng", "Sinceridad y veracidad", "Herder", "1970", "", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "Para que el mundo crea", "Herder", "1965", "", "Teoreligion_2"));
        b.add(new Book("Herbert Vorgrimler", "Entender a Karl Rahner", "Herder", "1988", "", "Teoreligion_2"));
        b.add(new Book("Herbert Vorgrimler", "Doctrina teológica de Dios", "Herder", "1987", "", "Teoreligion_2"));
        b.add(new Book("Otto Muck", "Doctrina filosófica de Dios", "Herder", "1986", "", "Teoreligion_2"));
        b.add(new Book("F. Gaboriau", "El giro antropológico de la teología de hoy", "Herder", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Herbert Haag", "El diablo, un fantasma", "Herder", "1972", "", "Teoreligion_2"));
        b.add(new Book("Josef Pieper", "Muerte e inmortalidad", "Herder", "1970", "", "Teoreligion_2"));
        b.add(new Book("Helmut Thielicke", "Vivir con la muerte", "Herder", "1984", "", "Teoreligion_2"));
        b.add(new Book("Jean Guitton", "La mujer en la casa", "Herder", "1963", "", "Teoreligion_2"));
        b.add(new Book("Jean Lacroix", "El sentido del ateísmo moderno", "Herder", "1968", "", "Teoreligion_2"));
        b.add(new Book("Reyes Mate", "El ateísmo, un problema político", "Sígueme", "1973", "", "Teoreligion_2"));
        b.add(new Book("Jürgen Moltmann", "El hombre", "Sígueme", "1973", "", "Teoreligion_2"));
        b.add(new Book("Jürgen Moltmann", "Teología de la esperanza", "Sígueme", "1969", "", "Teoreligion_2"));
        b.add(new Book("Jürgen Moltmann", "El Dios crucificado", "Sígueme", "1975", "", "Teoreligion_2"));
        b.add(new Book("Wolfhart Pannenberg", "Cuestiones fundamentales de teología sistemática", "Sígueme", "1976",
                "", "Teoreligion_2"));
        b.add(new Book("Gerhard Von Rad", "Teología del Antiguo Testamento II", "Sígueme", "1972", "", "Teoreligion_2"));
        b.add(new Book("Luis Maldonado", "La violencia de lo sagrado", "Sígueme", "1974", "", "Teoreligion_2"));
        b.add(new Book("Manuel Alcalá", "El evangelio copto de Tomás", "Sígueme", "1989", "", "Teoreligion_2"));
        b.add(new Book("Dietrich Bonhoeffer", "Sociología de la Iglesia Santorum Communio", "Sígueme", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("E. Schillebeeckx", "Dios y el hombre", "Sígueme", "1968", "", "Teoreligion_2"));
        b.add(new Book("E. Schillebeeckx", "Revelación y teología", "Sígueme", "1968", "", "Teoreligion_2"));
        b.add(new Book("Johann Baptist Metz", "Teología del mundo", "Sígueme", "1970", "", "Teoreligion_2"));
        b.add(new Book("Johann Baptist Metz", "Antropocentrismo cristiano", "Sígueme", "1972", "", "Teoreligion_2"));
        b.add(new Book("John Macquarrie", "God-talk El análisis del lenguaje y la lógica de la Tª", "Sígueme", "1976",
                "", "Teoreligion_2"));
        b.add(new Book("Hans Jürgen Schultz", "Jesús y su tiempo", "Sígueme", "1968", "", "Teoreligion_2"));
        b.add(new Book("Joseph Ratzinger", "Teología e historia", "Sígueme", "1972", "", "Teoreligion_2"));
        b.add(new Book("Martin Hengel", "El hijo de Dios", "Sígueme", "1978", "", "Teoreligion_2"));
        b.add(new Book("Ernst Kásemann", "El testamento de Jesús", "Sígueme", "1983", "", "Teoreligion_2"));
        b.add(new Book("J. Bosc - M. Carrez - André Dumas", "Teólogos protestantes contemporáneos", "Sígueme", "1968",
                "", "Teoreligion_2"));
        b.add(new Book("Instituto Fe y Secularidad", "Fe y nueva sensibilidad histórica", "Sígueme", "1972", "",
                "Teoreligion_2"));
        b.add(new Book("José María Gironella", "Jerusalén de los evangelios", "Planeta", "1989", "", "Teoreligion_2"));
        b.add(new Book("Ahmed Osman", "Extranjero en el valle de los Reyes", "Planeta", "1988", "", "Teoreligion_2"));
        b.add(new Book("J. J. Benítez", "Caballo de Troya 1", "Planeta", "1995", "", "Teoreligion_2"));
        b.add(new Book("J. J. Benítez", "Los astronautas de Yavé", "Planeta", "1980", "", "Teoreligion_2"));
        b.add(new Book("José Luis L. Aranguren", "Contralectura del catolicismo", "Planeta", "1978", "",
                "Teoreligion_2"));
        b.add(new Book("Kempis", "La imitación de Cristo", "Ed. Regina, S.A.", "1956", "", "Teoreligion_2"));
        b.add(new Book("Jesús Infante", "La prodigiosa aventura del Opus Dei", "Ruedo Ibérico", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Ken Wilber", "Un Dios sociable", "Kairós", "1988", "", "Teoreligion_2"));
        b.add(new Book("Sten H. Stenson", "Sentido y no sentido de la religión", "Kairós", "1970", "", "Teoreligion_2"));
        b.add(new Book("Edgar Morin", "El hombre y la muerte", "Kairós", "1973", "", "Teoreligion_2"));
        b.add(new Book("Peter L. Berger", "Para una Teoría Sociológica de la Religión", "Kairós", "1971", "",
                "Teoreligion_2"));
        b.add(new Book("San Agustín", "La Ciudad de Dios", "Apost. Prensa", "1944", "", "Teoreligion_2"));
        b.add(new Book("Varios Autores", "Ensayos sobre la libertad religiosa", "Estela", "1967", "", "Teoreligion_2"));
        b.add(new Book("Gotthold Hasenhüttl", "Fe y existencia", "Estela", "1971", "", "Teoreligion_2"));
        b.add(new Book("Georges Crespy", "El pensamiento teológico de T. de Chardin", "Estela", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("D. Bonhoeffer", "Ética", "Estela", "1968", "", "Teoreligion_2"));
        b.add(new Book("Paul Tillich", "El coraje de existir", "Estela", "1968", "", "Teoreligion_2"));
        b.add(new Book("L. J. Lebret - Th. Suavet", "Examen de conciencia para nuestro tiempo", "Estela", "1963", "",
                "Teoreligion_2"));
        b.add(new Book("Manuel Ballestero", "Juan de la Cruz: De la angustia al olvido", "Península", "1977", "",
                "Teoreligion_2"));
        b.add(new Book("Harvey G. Cox", "No lo dejéis a la serpiente", "Península", "1969", "", "Teoreligion_2"));
        b.add(new Book("Harvey G. Cox", "La ciudad secular", "Península", "1968", "3ª ed.", "Teoreligion_2"));
        b.add(new Book("Paul Evdokimov", "Ortodoxia", "Península", "1968", "", "Teoreligion_2"));
        b.add(new Book("José Mª González Ruiz", "El cristianismo no es un humanismo", "Península", "1966", "",
                "Teoreligion_2"));
        b.add(new Book("Robert Saladrigas", "Las confesiones no católicas de España", "Península", "1971", "",
                "Teoreligion_2"));
        b.add(new Book("Textos seleccionados por Aldo Chiaruttini", "El dossier del catecismo holandés", "Península",
                "1969", "", "Teoreligion_2"));
        b.add(new Book("Romano Guardini", "El Señor Tomos I y II", "Rialp, S.A.", "1965", "6ª ed.", "Teoreligion_2"));
        b.add(new Book("Michael Schmaus", "Sobre la esencia del cristianismo", "Rialp, S.A.", "1952", "",
                "Teoreligion_2"));
        b.add(new Book("Josef Holzner", "El mundo de San Pablo", "Rialp, S.A.", "1951", "", "Teoreligion_2"));
        b.add(new Book("Manuela Corsini de Ordeig", "El sudario de Cristo", "Rialp, S.A.", "1982", "", "Teoreligion_2"));
        b.add(new Book("Henri-Irénée Marrou", "Teología de la Historia", "Rialp, S.A.", "1978", "", "Teoreligion_2"));
        b.add(new Book("Werner Jaeger", "Humanismo y teología", "Rialp, S.A.", "1964", "", "Teoreligion_2"));
        b.add(new Book("Pedro Suárez de Robles", "Danza del nacimiento", "Rialp, S.A.", "1976", "", "Teoreligion_2"));
        b.add(new Book("Arthur Michael Ramsey", "Dios y Cristo en un mundo secularizado", "Fax", "1971", "",
                "Teoreligion_2"));
        b.add(new Book("Georges Gargam", "El amor y la muerte", "Fax", "1964", "", "Teoreligion_2"));
        b.add(new Book("Jean Guitton", "El problema de Jesús", "Fax", "1960", "", "Teoreligion_2"));
        b.add(new Book("Jean Guitton", "Jesús", "Fax", "1958", "", "Teoreligion_2"));
        b.add(new Book("E. Schillebeeckx, O.P.", "La presencia de Cristo en la Eucaristía", "Fax", "1968", "",
                "Teoreligion_2"));
        b.add(new Book("E. Schillebeeckx, O.P.", "María madre de la redención", "Fax", "1969", "", "Teoreligion_2"));
        b.add(new Book("John A. T. Robinson", "El cuerpo Estudio de teología paulina", "Ariel, S.A.", "1968", "",
                "Teoreligion_2"));
        b.add(new Book("John A. T. Robinson", "Sincero para con Dios (Honest to god)", "Ariel, S.A.", "1967", "",
                "Teoreligion_2"));
        b.add(new Book("John A. T. Robinson", "¿La nueva reforma?", "Ariel, S.A.", "1971", "", "Teoreligion_2"));
        b.add(new Book("Joseph Fletcher", "Ética de situación", "Ariel, S.A.", "1970", "", "Teoreligion_2"));
        b.add(new Book("Dietrich Bonhoeffer", "Resitencia y sumisión", "Ariel, S.A.", "1969", "", "Teoreligion_2"));
        b.add(new Book("Robert Michaud", "La historia de José", "Verbo Divino", "1981", "", "Teoreligion_2"));
        b.add(new Book("Robert Michaud", "Los patriarcas", "Verbo Divino", "1976", "", "Teoreligion_2"));
        b.add(new Book("Henri Cazelles", "En busca de Moisés", "Verbo Divino", "1981", "", "Teoreligion_2"));
        b.add(new Book("Hugues Cousin", "Los textos evagélicos de la pasión", "Verbo Divino", "1981", "",
                "Teoreligion_2"));
        b.add(new Book("H. Zahrnt", "Jesús de Nazaret y Sigmund Freud", "Verbo Divino", "1974", "", "Teoreligion_2"));
        b.add(new Book("Gabriel Vahanian", "Esperar sin ídolos", "Marova", "1970", "", "Teoreligion_2"));
        b.add(new Book("Helmut Gollwitzer", "Crítica marxista de la religión", "Marova", "1971", "", "Teoreligion_2"));
        b.add(new Book("Harvey Cox", "El cristiano como rebelde", "Marova", "1969", "", "Teoreligion_2"));
        b.add(new Book("Karl Barth", "La revelación como abolición de la religión", "Marova", "1973", "",
                "Teoreligion_2"));
        b.add(new Book("José Alvilares", "¿Proceso a la Iglesia Gallega?", "Marova", "1969", "", "Teoreligion_2"));
        b.add(new Book("Michael Schmaus", "Permanencia y progreso en el cristianismo", "Taurus", "1962", "",
                "Teoreligion_2"));
        b.add(new Book("Condesa de Campo Alange, Presentación", "En torno a Teilhard", "Taurus", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("Karl Rahner", "Marginales sobre la pobreza y la obediencia", "Taurus", "1962", "",
                "Teoreligion_2"));
        b.add(new Book("Jeanson, Hamilton, Bultmann y otros", "Ateísmo", "Taurus", "1969", "", "Teoreligion_2"));
        b.add(new Book("Roger Mehl", "La teología protestante", "Taurus", "1969", "", "Teoreligion_2"));
        b.add(new Book("Cardenal Newman", "Escritos autobiográficos", "Taurus", "1962", "", "Teoreligion_2"));
        b.add(new Book("Claude Tresmontant", "La doctrina moral de los profetas de Israel", "Taurus", "1962", "",
                "Teoreligion_2"));
        b.add(new Book("S. Radhakrishnan", "La religión y el futuro del hombre", "Guadarrama", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("David Knowles", "El monacato cristiano", "Guadarrama", "1969", "", "Teoreligion_2"));
        b.add(new Book("Daniel Waley", "Las ciudades-república italianas", "Guadarrama", "1969", "", "Teoreligion_2"));
        b.add(new Book("Romano Guardini", "La aceptación de sí mismo", "Guadarrama", "1962", "", "Teoreligion_2"));
        b.add(new Book("José Mª González Ruiz", "Marxismo y cristianismo", "Guadarrama", "1962", "", "Teoreligion_2"));
        b.add(new Book("Andrés-Pedro Sánchez Pascual, traductor", "Teología actual", "Guadarrama", "1960", "",
                "Teoreligion_2"));
        b.add(new Book("J. M. Valverde y J. R. Díaz, traductores", "Los cuatro evangelios", "Guadarrama", "1960", "",
                "Teoreligion_2"));
        b.add(new Book("Juan Barceló Roldán", "Jesús y la estafa de Cachemira", "Plaza Janés", "1980", "",
                "Teoreligion_2"));
        b.add(new Book("Fulcanelli", "El misterio de las catedrales", "Plaza Janés", "1969", "", "Teoreligion_2"));
        b.add(new Book("Varios autores", "Evolución, marxismo y cristianismo T. de Chardin", "Plaza Janés", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("Karl Rahner, M. von Galli y O. Baumhauer", "La reforma que llega de Roma", "Plaza Janés",
                "1970", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Steiner", "El evangelio según San Mateo", "Kier", "1980", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Steiner", "El evangelio según San Lucas", "Kier", "1979", "", "Teoreligion_2"));
        b.add(new Book("Annie Besant", "Cristianismo esotérico", "Kier", "1978", "", "Teoreligion_2"));
        b.add(new Book("Luis Carandell", "Vida y milagros de M. Escrivá de Balaguer", "Laia", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("José M. Díez Alegría", "Teología frente a sociedad histórica", "Laia", "1972", "",
                "Teoreligion_2"));
        b.add(new Book("Gerald Brenan", "San Juan de la Cruz: Biografía", "Laia", "1973", "", "Teoreligion_2"));
        b.add(new Book("Cesare Marchi", "Grandes pecadores, grandes catedrales", "Seix Barral", "1988", "",
                "Teoreligion_2"));
        b.add(new Book("Georges Dumézil", "Los dioses de los indoeuropeos", "Seix Barral", "1970", "", "Teoreligion_2"));
        b.add(new Book("John Rock", "Control de natalidad", "Seix Barral", "1963", "", "Teoreligion_2"));
        b.add(new Book("Martin Hengel", "Propiedad y riqueza en el cristianismo primitivo", "D. de Brouwer", "1983",
                "", "Teoreligion_2"));
        b.add(new Book("José María Diez-Alegría", "La cara oculta del cristianismo", "D. de Brouwer", "1983", "",
                "Teoreligion_2"));
        b.add(new Book("Benoit A. Dumas", "Los milagros de Jesús", "D. de Brouwer", "1984", "", "Teoreligion_2"));
        b.add(new Book("José María Díez-Alegría", "El Credo que ha dado sentido a mi vida", "D. de Brouwer", "1972",
                "", "Teoreligion_2"));
        b.add(new Book("Javier de Goitia", "De aquella teología a ésta", "D. de Brouwer", "1982", "", "Teoreligion_2"));
        b.add(new Book("Bertrand Russell", "Por qué no soy cristiano", "Edhasa", "1987", "2ª reimp.", "Teoreligion_2"));
        b.add(new Book("Arnold Toynbee, Arthur Koestler y otros", "La vida después de la muerte", "Edhasa", "1977", "",
                "Teoreligion_2"));
        b.add(new Book("Anthny Burgess", "Jesucristo y el juego del amor", "Edhasa", "1978", "", "Teoreligion_2"));
        b.add(new Book("E. E. Evans Pritchard", "Las teorías de la religión primitiva", "Siglo XXI", "1973", "",
                "Teoreligion_2"));
        b.add(new Book("Gonzalo Puente Ojea", "Elogio del ateísmo Los espejos de una ilusión", "Siglo XXI", "1995", "",
                "Teoreligion_2"));
        b.add(new Book("Cº Católico de intelectuales franceses", "Mundo moderno y sentido de Dios", "Criterio", "1957",
                "", "Teoreligion_2"));
        b.add(new Book("Jacques Maritain", "Búsqueda de Dios", "Criterio", "1958", "", "Teoreligion_2"));
        b.add(new Book("Karl Barth, Georges Cottier y otros", "Comprender a Bultmann", "Studium", "1971", "",
                "Teoreligion_2"));
        b.add(new Book("Karl Bart", "Adviento", "Studium", "1970", "", "Teoreligion_2"));
        b.add(new Book("Raymond A. Moody, Jr.", "Vida despues de la vida", "Edaf", "1977", "", "Teoreligion_2"));
        b.add(new Book("F. R. de Châteaubriand", "El genio del cristianismo", "Edaf", "1968", "", "Teoreligion_2"));
        b.add(new Book("Ernesto Renán", "Vida de Jesús", "Edaf", "1968", "", "Teoreligion_2"));
        b.add(new Book("Michael Arnheim", "¿Es verdadero el cristianismo?", "Crítica", "1985", "", "Teoreligion_2"));
        b.add(new Book("Elaine Pagels", "Los evangelios gnósticos", "Crítica", "1982", "", "Teoreligion_2"));
        b.add(new Book("G. Ephraim Lessing", "Escritos filosóficos y teológicos", "Edra. Nacional", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("Ramón J. Sender", "Ensayos sobre el infringimiento cristiano", "Edra. Nacional", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("René Marle", "Dietrich Bonhoeffer", "Mensajero", "1968", "", "Teoreligion_2"));
        b.add(new Book("Luis M. Bermejo, S.J.", "Tras la muerte la luz", "Mensajero", "1988", "", "Teoreligion_2"));
        b.add(new Book("Rosa Rossi", "Teresa de Ávila Biografía de una escritora", "Icaria", "1984", "",
                "Teoreligion_2"));
        b.add(new Book("Michel de M'Uzan", "Del arte a la muerte Itinerario psicoanalítico", "Icaria", "1977", "",
                "Teoreligion_2"));
        b.add(new Book("Hans Einsle", "El misterio bíblico", "Mez. Roca", "1989", "", "Teoreligion_2"));
        b.add(new Book("Manfred Barthel", "Lo que dijo verdaderamente la Biblia", "Mnez. Roca", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("Hans Küng", "20 tesis sobre el cristiano", "Cristiandad", "1980", "", "Teoreligion_2"));
        b.add(new Book("Emilio Mitre", "Judaísmo y Cristianismo", "Istmo", "1980", "", "Teoreligion_2"));
        b.add(new Book("José García López", "La religión griega", "Istmo", "1975", "", "Teoreligion_2"));
        b.add(new Book("Philippe Ariés", "La muerte en Occidente", "Argos Vergara", "1982", "", "Teoreligion_2"));
        b.add(new Book("Henry Méchoular", "El honor de Dios", "Argos Vergara", "1981", "", "Teoreligion_2"));
        b.add(new Book("Albert Schweitzer", "El secreto histórico de la vida de Jesús", "Siglo Veinte", "1967", "",
                "Teoreligion_2"));
        b.add(new Book("Dr. Pierre Solignac", "La neurosis cristiana", "Bruguera, S.A.", "1976", "", "Teoreligion_2"));
        b.add(new Book("Wilhelm Reich", "El asesinato de Cristo", "Bruguera, S.A.", "1980", "", "Teoreligion_2"));
        b.add(new Book("Reyes Mate", "Modernidad, religión, razón", "Anthropos", "1986", "", "Teoreligion_2"));
        b.add(new Book("Eduardo Subirats", "El alma y la muerte", "Anthropos", "1983", "", "Teoreligion_2"));
        b.add(new Book("Simone Weil", "Pensamientos desordenados acerca del amor a Dios", "Sudamericana", "1964", "",
                "Teoreligion_2"));
        b.add(new Book("Diego Rubio Barrera", "La otra historia de la Virgen María", "Ate", "1981", "", "Teoreligion_2"));
        b.add(new Book("L. Utset", "El enigma de Moisés", "Ate", "1982", "", "Teoreligion_2"));
        b.add(new Book("Emmanuel Levinas", "Dios, la muerte y el tiempo", "Cátedra", "1993", "", "Teoreligion_2"));
        b.add(new Book("Tomás Spidlík", "Los grandes místicos rusos", "Ciudad Nueva", "1986", "", "Teoreligion_2"));
        b.add(new Book("Franz Altheim", "El Dios invicto", "Eudeba", "1966", "", "Teoreligion_2"));
        b.add(new Book("Miquel Juncadella", "Espiritualidad de la pobreza", "Nova Terra", "1965", "", "Teoreligion_2"));
        b.add(new Book("Karl Kerényi", "La religión antigua", "R. Occidente", "1972", "", "Teoreligion_2"));
        b.add(new Book("Jesus Aguirre", "Sermones en España", "Edicusa", "1971", "", "Teoreligion_2"));
        b.add(new Book("Alain Patin", "La aventura de Jesús de Nazaret", "Sal Terrae", "1991", "9ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Alfred Fabre-Luce", "Carta abierta a los cristianos", "Emecé", "1969", "", "Teoreligion_2"));
        b.add(new Book("Hans Joachim Krúger", "Teología e ilustración", "Alfa", "1976", "", "Teoreligion_2"));
        b.add(new Book("Jacques Nobecourt", "El Vicario y la Historia", "Vicens Vives", "1965", "", "Teoreligion_2"));
        b.add(new Book("María Cátedra Tomás", "La muerte y otros mundos", "Júcar Univ.", "1988", "", "Teoreligion_2"));
        b.add(new Book("Daniel Terán Fierro", "Prisciliano Mártir apócrifo", "Breogán", "1985", "", "Teoreligion_2"));
        b.add(new Book("R. H. de Ibarreta", "La religión al alcance de todos", "Daniel's", "1987", "", "Teoreligion_2"));
        b.add(new Book("Henryk Panas", "El evangelio según Judas", "Ultramar", "1978", "", "Teoreligion_2"));
        b.add(new Book("Jean Vimort", "Creo, pero no como antes", "Edimurtra", "1982", "", "Teoreligion_2"));
        b.add(new Book("Gilbert Murray", "La religión griega", "Nova", "1956", "", "Teoreligion_2"));
        b.add(new Book("Biblioteca esotérica", "El evangelio según Tomás Apócrifo-gnóstico", "Edit. 7/1/2", "1981", "",
                "Teoreligion_2"));
        b.add(new Book("P. L. Landsberg", "Experiencia de la muerte", "Cruz del Sur", "1962", "", "Teoreligion_2"));
        b.add(new Book("Luce López Baralt", "San Juan de la Cruz y el Islám", "Col. México", "1985", "",
                "Teoreligion_2"));
        b.add(new Book("Antonio López Carballeira", "Aryel Religión del porvenir ¿Cristo es un mito?", "Roel", "1936",
                "", "Teoreligion_2"));
        b.add(new Book("Alfredo Tamayo", "La muerte en el marxismo", "Felmar", "1979", "", "Teoreligion_2"));
        b.add(new Book("Erich Fromm", "El dogma de Cristo", "Paidos", "1964", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Bultmann Karl Jaspers", "Jesús. La desmitologización del Nuevo Testamento", "Sur",
                "1968", "", "Teoreligion_2"));
        b.add(new Book("Hans Urs von Balthasar Luigi Giussani", "El compromiso del cristiano en el mundo",
                "Eds. Encuentro", "1981", "", "Teoreligion_2"));
        b.add(new Book("Lefévre, Marrou y otros", "Satán. Estudios sobre el adversario de Dios", "Labor, S.A.", "1975",
                "", "Teoreligion_2"));
        b.add(new Book("Elie Wiesel", "Celebración Bíblica", "Muchnik", "1987", "", "Teoreligion_2"));
        b.add(new Book("Charles Moeller", "Humanismo y Santidad", "Juventud", "1960", "", "Teoreligion_2"));
        b.add(new Book("José Manuel Ribera", "Reflexiones sobre la propia muerte", "Mezquita", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("Kant", "Sobre Dios y la religión", "Zeus", "1972", "", "Teoreligion_2"));
        b.add(new Book("Lucien Henry", "Los orígenes de la religión", "Claridad", "1957", "2ª ed.", "Teoreligion_2"));
        b.add(new Book("Ludwig Feuerbach", "La esencia del cristianismo", "Claridad", "1963", "2ª ed.", "Teoreligion_2"));
        b.add(new Book("Dr. David Romano, traductor", "Antología del Talmud", "Plaza Janés", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("R. Cansinos-Assens, traductor", "Las bellezas del Talmud", "Edicomunic.", "1988", "",
                "Teoreligion_2"));
        b.add(new Book("San Juan de la Cruz", "Obras Completas", "El M. Carmelo", "1940", "3ª ed.", "Teoreligion_2"));
        b.add(new Book("San Juan de la Cruz", "Obras", "Apost. Prensa", "1966", "", "Teoreligion_2"));
        b.add(new Book("Karol Wojtyla", "La fe según San Juan de la Cruz", "BAC", "1979", "", "Teoreligion_2"));
        b.add(new Book("Karol Wojtyla", "Signo de contradicción", "BAC", "1977", "", "Teoreligion_2"));
        b.add(new Book("José Mª G. Gomez-Heras", "Teología protestante", "BAC", "1972", "", "Teoreligion_2"));
        b.add(new Book("Henri-Charles Puech, Dirección", "Historia de las Religiones Siglo XXI Vol. 1 al12",
                "Siglo XXI", "1977", "1982", "Teoreligion_2"));
        b.add(new Book("Juan B. Bergua", "Historia de las religiones Tomos I, II y III", "Bergua", "1964", "",
                "Teoreligion_2"));
        b.add(new Book("Juan B. Bergua", "Historia de la religiones El cristianismo T. I y II", "Bergua", "1977", "",
                "Teoreligion_2"));
        b.add(new Book("Salomón Reinach", "Orfeo Historia de las religiones", "Istmo", "1985", "2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Marcos Antonio Ramos", "Historia de las religiones", "Playor", "1989", "", "Teoreligion_2"));
        b.add(new Book("S. A. Tokarev", "Historia de las religiones", "Akal", "1979", "", "Teoreligion_2"));
        b.add(new Book("E. O. James", "Hª de las RR Los Dioses del mundo antiguo", "Guadarrama", "1962", "",
                "Teoreligion_2"));
        b.add(new Book("E. O. James", "Hª de las RR El Templo De la caverna a la catedral", "Guadarrama", "1966", "",
                "Teoreligion_2"));
        b.add(new Book("N. Zernov", "Hª de las RR Cristianismo oriental", "Guadarrama", "1962", "", "Teoreligion_2"));
        b.add(new Book("X. León-Dufour (ed.)", "Los milagros de Jesús", "Cristiandad", "1979", "", "Teoreligion_2"));
        b.add(new Book("Joachim Jeremias", "La última cena Palabras de Jesús", "Cristiandad", "1980", "",
                "Teoreligion_2"));
        b.add(new Book("Roland Barthes, Paul Beauchamp y otros", "Exégesis y hermenéutica", "Cristiandad", "1976", "",
                "Teoreligion_2"));
        b.add(new Book("José María Blázquez", "Imagen y mito Estudio sobre religiones medit….", "Cristiandad", "1977",
                "", "Teoreligion_2"));
        b.add(new Book("Geza Vermes", "Los manuscritos del Mar Muerto Qumran a distancia", "Muchnik", "1981", "",
                "Teoreligion_2"));
        b.add(new Book("Geza Vermes", "Jesús el Judío", "Muchnik", "1977", "", "Teoreligion_2"));
        b.add(new Book("Franz Brentano", "Sobre la existencia de Dios", "Rialp", "1979", "", "Teoreligion_2"));
        b.add(new Book("Fernando Belo", "Lectura materialista del evangelio de Marcos", "Verbo Divino", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("Rudolf Schnackenburg", "Cartas de San Juan", "Herder", "1980", "", "Teoreligion_2"));
        b.add(new Book("Karl Barth", "Ensayos teológicos", "Herder", "1978", "", "Teoreligion_2"));
        b.add(new Book("E.  González-Blanco, Traducción y notas", "Los Evangelios Apócrifos Vol. I, II y III",
                "Bergua", "1934", "", "Teoreligion_2"));
        b.add(new Book("Versión Ecuménica", "Nuevo testamento", "Herder", "1968", "2ª ed.", "Teoreligion_2"));
        b.add(new Book("Versión de Casiodoro de Reina", "La Santa Biblia (Impresa en Gran Bretaña)", "R. Clay", "1974",
                "", "Teoreligion_2"));
        b.add(new Book("Versión de Casiodoro de Reina", "Santa Biblia Revisión de 1960", "Ss. Bíblicas", "1960", "",
                "Teoreligion_2"));
        b.add(new Book("Eloíno Nacar y Alberto Colunga, O. P.", "Sagrada Biblia", "BAC", "1947", "2ª ed. Corr.",
                "Teoreligion_2"));
        b.add(new Book("Tomás Hemerken de Kempis", "Imitación de Cristo", "Regina, S.A.", "1974", "", "Teoreligion_2"));
        b.add(new Book("Kempis", "La imitación de Cristo", "Regina, S.A.", "1956", "", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "Vida eterna", "Cristiandad", "1983", "", "Teoreligion_2"));
        b.add(new Book("Antonio López Carballeira", "Religión del porvenir ¿Cristo es un mito?", "Roel", "1936", "",
                "Teoreligion_2"));
        b.add(new Book("Xavier León-Dufour", "Resurrección de Jesús y mensaje pascual", "Sígueme", "1974", "",
                "Teoreligion_2"));
        b.add(new Book("S. Sabugal", "¿Liberación y secularización?", "Herder", "1978", "", "Teoreligion_2"));
        b.add(new Book("E. R. Chamberlin", "Los malos papas", "C. Lectores", "1970", "", "Teoreligion_2"));
        b.add(new Book("Ulpiano Vázquez Miró", "El discurso sobre Dios en la obra de Levinas", "UPCM", "1982", "",
                "Teoreligion_2"));
        b.add(new Book("Victor M. Pérez Valera", "Dios y la renovación del hombre", "Alhambra", "1980", "2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("René Guénon", "Símbolos fundamentales de la ciencia sagrada", "EUDEBA", "1969", "",
                "Teoreligion_2"));
        b.add(new Book("Edelvives", "Devocionario de la niñez", "Luis Vives", "1956", "", "Teoreligion_2"));
        b.add(new Book("Gerhard von Rad", "El libro del Génesis", "Sígueme", "1977", "", "Teoreligion_2"));
        b.add(new Book("Karl Rahner", "La iglesia y los sacramentos", "Herder", "1967", "", "Teoreligion_2"));
        b.add(new Book("Henry de Lubac", "Paradojas y nuevas paradojas", "Península", "1966", "", "Teoreligion_2"));
        b.add(new Book("Henry de Lubac", "El drama del humanismo ateo", "Epesa", "1967", "", "Teoreligion_2"));
        b.add(new Book("Olegario González de Cardedal", "Meditación teológica desde España", "Sígueme", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Michael Chinigo", "La enseñanzas del Papa Juan", "Círculo  Lectores", "1965", "",
                "Teoreligion_2"));
        b.add(new Book("Urs Von Baltasar", "¿Quién es cristiano?", "Guadarrama", "1967", "", "Teoreligion_2"));
        b.add(new Book("Thomas J. Altizer W. Hamilton", "Teología radical y la muerte de Dios", "Grijalbo", "1967", "",
                "Teoreligion_2"));
        b.add(new Book("Suenens-Glez Ruiz-Díez Alegría", "Cristianismo sin Cristo", "E. Paulinas", "1970", "",
                "Teoreligion_2"));
        b.add(new Book("Concilio Vaticano II", "Constituciones Decretos Declaraciones", "BAC", "1965", "",
                "Teoreligion_2"));
        b.add(new Book("Julio Caro Baroja", "Las formas complejas de la vida religiosa S. XVI y XVIII", "Sarpe",
                "1985", "", "Teoreligion_2"));
        b.add(new Book("Luis Sanz Criado", "El ateísmo moderno", "Apos.  Prensa", "1967", "", "Teoreligion_2"));
        b.add(new Book("Francis Simons", "Infalibilidad y evidencia", "Libros del Nopal", "1970", "", "Teoreligion_2"));
        b.add(new Book("Herbert Haag", "El diablo un fantasma", "Herder", "1978", "", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "¿Ser cristiano?", "Cristiandad", "1977", "", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "¿Existe Dios?", "Cristiandad", "1979", "", "Teoreligion_2"));
        b.add(new Book("Richard Elliot Friedman", "¿Quién escribió la Biblia?", "Mnez. Roca", "1989", "2 ejemplares",
                "Teoreligion_2"));
        b.add(new Book("Georges Auzou", "De la servidumbre al servicio (El libro del éxodo)", "Fax", "1966", "",
                "Teoreligion_2"));
        b.add(new Book("Hans Walker Wolff", "Antropología del Antiguo Testamento", "Sígueme", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("Günther Bornkamm", "Jesús de Nazaret", "Sígueme", "1975", "", "Teoreligion_2"));
        b.add(new Book("Ernest Kásemann", "Ensayos exegéticos", "Sígueme", "1978", "", "Teoreligion_2"));
        b.add(new Book("Rudolf Bultmann", "Teología del Nuevo Testamento", "Sígueme", "1981", "", "Teoreligion_2"));
        b.add(new Book("Santa Teresa de Jesús", "El libro de su vida (C. Cisneros)", "Atlas", "1943", "Nº 1",
                "Teoreligion_2"));
        b.add(new Book("Agustín George", "El evangelio según San Lucas", "Verbo Divino", "1978", "Nº 3,  2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Pierre Grelot", "Hombre, ¿quién eres?", "Verbo Divino", "1976", "Nº 5,  2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Milan Machovec", "Jesús para ateos", "Sígueme", "1974", "", "Teoreligion_2"));
        b.add(new Book("Chistian Duquoc", "Cristología", "Sígueme", "1978", "", "Teoreligion_2"));
        b.add(new Book("Paul Tillich", "Teología sistemática V. I y II", "Sígueme", "1981", "", "Teoreligion_2"));
        b.add(new Book("Valerio Mannucci", "La Biblia como palabra de Dios", "D.  de Brouwer", "1988", "2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Enrique Miret Magdalena", "La revolución de lo religioso", "E. Paulinas", "1976", "",
                "Teoreligion_2"));
        b.add(new Book("Etienne Trocmé", "Jesús de Nazaret", "Herder", "1974", "", "Teoreligion_2"));
        b.add(new Book("Paul Tillich", "Teología sistemática V. III", "Sígueme", "1984", "2ª ed.", "Teoreligion_2"));
        b.add(new Book("Johann Baptist Metz", "La fe en la historia y la sociedad", "Cristiandad", "1979", "",
                "Teoreligion_2"));
        b.add(new Book("Equipo Cahiers Evangile", "Los milagros del evangelio", "Verbo Divino", "1978",
                "Nº 8,  2ª ed.", "Teoreligion_2"));
        b.add(new Book("Hans Küng", "24  tesis sobre el problema de Dios", "Cristiandad", "1981", "", "Teoreligion_2"));
        b.add(new Book("Albert Schweitzer", "El cristianismo y las religiones mundiales", "Siglo Veinte", "1964",
                "Intonso", "Teoreligion_2"));
        b.add(new Book("Instituto Patrístico Augustinianum",
                "Patrología III La edad de oro de la lit. patrística latina", "BAC", "1981", "", "Teoreligion_2"));
        b.add(new Book("Augusto Sabatier", "Las  religiones de autoridad y la religión del espíritu", "E. La Aurora",
                "1952", "", "Teoreligion_2"));
        b.add(new Book("Herbert Haag", "El diablo, su existencia como problema", "Herder", "1978", "", "Teoreligion_2"));
        b.add(new Book("Obispo de Canarias", "D. M. de Unamuno, hereje máximo y maestro de herejías", "Imp. Obispado",
                "", "Folleto", "Teoreligion_2"));
        b.add(new Book("Etienne Charpentier", "Para leer la Biblia", "Verbo Divino", "1978", "Nº 1,  2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Poitterin - Charpentier", "El evangelio según San Mateo", "Verbo Divino", "1978",
                "Nº 2,  2ª ed.", "Teoreligion_2"));
        b.add(new Book("Etienne Charpentier", "Cristo ha resucitado", "Verbo Divino", "1978", "Nº 4,  2ª ed.",
                "Teoreligion_2"));
        b.add(new Book("Equipo Cahiers Evangile", "Liberación humana y salvación en Jesucristo T. I y II",
                "Verbo Divino", "1978", "Nº 6 y 7,  2ª ed.", "Teoreligion_2"));
        b.add(new Book("Equipo Cahiers Evangile", "Iniciación en el análisis estructural 2 ej.", "Verbo Divino",
                "1978", "Nº 14,  2ª ed.", "Teoreligion_2"));
        b.add(new Book("John William Draper", "Historia de los conflictos entre la religión y la ciencia",
                "Alta Fulla", "1987", "", "Teoreligion_2"));
        b.add(new Book("Martin P. Nilsson", "Historia de la religiosidad griega", "Gredos", "1953", "", "Teoreligion_2"));
        b.add(new Book("Emmanuel Levinas", "De otro modo que  ser, o más allá de la esencia", "Sígueme", "1987", "",
                "Teoreligion_2"));
        b.add(new Book("María Angustias Moreno", "El Opus Dei. Anexo a una historia", "Planeta", "1976", "",
                "Teoreligion_2"));
        b.add(new Book("Gerhard von Rad", "Teología del Antiguo Testamento Volumen I", "Sígueme", "1975", "",
                "Teoreligion_2"));
        b.add(new Book("Gerhard von Rad", "Teología del Antiguo Testamento Volumen II", "Sígueme", "1976", "",
                "Teoreligion_2"));
        b.add(new Book("Gerhard von Rad", "Estudios sobre el Antiguo Testamento", "Sígueme", "1976", "",
                "Teoreligion_2"));
    }

    private static void fillSexmujer() {
        final List<Book> b = DB.get("Sexmujer");
        b.add(new Book("A. de Musset", "Ed. Selección", "", "", "Dos noches de placer", "Sexmujer"));
        b.add(new Book("SHERE HITE", "Plaza y Janés", "1981", "", "El informe Hite sobre la sexualidad masculina",
                "Sexmujer"));
        b.add(new Book("SHERE HITE", "Plaza y Janés", "1977", "", "El Informe Hite sobre la sexualidad femenina",
                "Sexmujer"));
        b.add(new Book("Dr. Enrique Salgado", "AHR", "1970", "", "Los ojos y la vida sexual", "Sexmujer"));
        b.add(new Book("R. E. L. Masters y Eduard Lea", "Picazo", "1970", "", "Sexualidad criminal en la historia",
                "Sexmujer"));
        b.add(new Book("Havelock Ellis", "Hijos de Reus", "1913", "", "Estudios de psicología sexual I - II",
                "Sexmujer"));
        b.add(new Book("Havelock Ellis", "Hijos de Reus", "1913", "", "Estudios de psicología sexual III-IV-V",
                "Sexmujer"));
        b.add(new Book("HORNSTEIN-FALLER-STRENG", "Maris Stella", "1953", "3ª ed.", "Vida sexual sana", "Sexmujer"));
        b.add(new Book("Dr. JONH E. EICHENLAUB", "Diana, S. A.", "1965", "", "El arte del matrimonio", "Sexmujer"));
        b.add(new Book("Frank S. Caprio", "Constancia", "1961", "4ª ed.", "El hombre sexualmente adecuado", "Sexmujer"));
        b.add(new Book("Frank S. Caprio", "Constancia", "1963", "4ª ed.", "La mujer sexualmente adecuada", "Sexmujer"));
        b.add(new Book("STENDHAL", "Hachete, S. A.", "1943", "", "Del amor", "Sexmujer"));
        b.add(new Book("Adolf Tüllmann", "Corona", "1967", "", "El amor en los pueblos civilizados", "Sexmujer"));
        b.add(new Book("Pierre Henri Cami", "Cia G.E.S.A.", "1951", "", "Cuentos inmorales", "Sexmujer"));
        b.add(new Book("Bronislaw Malinowski", "Morata, S. A.", "1971", "6ª reimp.", "La vida sexual de los salvajes",
                "Sexmujer"));
        b.add(new Book("William H. Masters", "Intermédica", "1979", "", "Homosexualidad en perspectiva", "Sexmujer"));
        b.add(new Book("Wilhelm Stekel", "Imán", "1955", "", "El matrimonio moderno", "Sexmujer"));
        b.add(new Book("Wilhelm Stekel", "Imán", "1956", "5ª ed.", "La mujer frígida", "Sexmujer"));
        b.add(new Book("Hermann Glaser", "L. de Caralt", "1972", "", "La sexualidad en la política", "Sexmujer"));
        b.add(new Book("E. S. Turner", "L. de Caralt", "1966", "", "Historia de la galantería", "Sexmujer"));
        b.add(new Book("Karl Menninger", "Nova", "1951", "", "Amor contra odio", "Sexmujer"));
        b.add(new Book("Theodor Reik", "Nova", "1955", "", "Psicología de las relaciones sexuales", "Sexmujer"));
        b.add(new Book("Dr. Osvaldo Quijada", "Andina", "1966", "", "Sexo y sufrimiento.  El hombre", "Sexmujer"));
        b.add(new Book("Omar W. Garrison", "Siglo veinte", "1966", "", "Yoga y sexo", "Sexmujer"));
        b.add(new Book("Lo Duca", "Siglo veinte", "1965", "", "Historia del erotismo", "Sexmujer"));
        b.add(new Book("P. y Eberhaard Kronhausen", "Siglo veinte", "1969", "", "Sensibilidad de la mujer", "Sexmujer"));
        b.add(new Book("Suzanne Lilar", "Sagitario, S. A.", "1967", "", "La pareja", "Sexmujer"));
        b.add(new Book("W. Bitter y otros", "Marfil, S. A.", "1964", "", "Crisis y futuro de la mujer", "Sexmujer"));
        b.add(new Book("A. Adler", "Apolo", "1936", "", "El problema del homosexualismo y otros e. s.", "Sexmujer"));
        b.add(new Book("Alex Comfort", "Americalee", "1962", "", "El comportamiento sexual en la sociedad", "Sexmujer"));
        b.add(new Book("Simon de Beauvoir", "E. del Tiempo", "1965", "", "Brigitte Bardot y el personaje de Lolita",
                "Sexmujer"));
        b.add(new Book("Mª Luisa Herreros M.L. Morales", "Planeta", "1973", "", "Lo femenino y la vida instintiva",
                "Sexmujer"));
        b.add(new Book("William C. Taylor", "Picazo", "1976", "", "El sexo intermedio", "Sexmujer"));
        b.add(new Book("Hans Giese", "Morata", "1962", "", "El homosexual y su ambiente", "Sexmujer"));
        b.add(new Book("Teodor Reik", "Peuser", "1962", "", "La creación de la mujer", "Sexmujer"));
        b.add(new Book("Magnus Hirschfeld", "Partenón", "1961", "", "El alma y el amor", "Sexmujer"));
        b.add(new Book("Dra. Lena Levim y David Loth", "Diana, S. A.", "1963", "", "La esposa frígida", "Sexmujer"));
        b.add(new Book("Donald Webster Cory", "C. G. de E. S. A.", "1952", "", "El homosexual en Norteamérica",
                "Sexmujer"));
        b.add(new Book("Norman O. Brown", "J. Mortiz", "1967", "", "Eros y tanatos", "Sexmujer"));
        b.add(new Book("Daniel Guerin", "Tiempo nuevo", "1961", "", "La revolución sexual", "Sexmujer"));
        b.add(new Book("Prof. Huldah von Wittmer", "Cía. Arg. de Edit.", "1961", "", "La selección en el amor sexual",
                "Sexmujer"));
        b.add(new Book("Lorenzo Gomis y otros", "Insula", "1965", "", "El amor y el erotismo", "Sexmujer"));
        b.add(new Book("Reimut Reiche", "Seix Barral", "1969", "", "La sexualidad y la lucha de clases", "Sexmujer"));
        b.add(new Book("Dr. Albert Ellis", "Grijalbo", "1965", "", "Arte y técnica del amor", "Sexmujer"));
        b.add(new Book("Ruth y Edward Brecher", "Grijalbo", "1969", "", "Análisis a \"respuesta sexual humana\"",
                "Sexmujer"));
        b.add(new Book("Vance Packard", "Sudamericana", "1969", "", "La jungla del sexo", "Sexmujer"));
        b.add(new Book("P.  Aulagnier - Spairani y otros", "Sudamericana", "1968", "", "El deseo y la perversión",
                "Sexmujer"));
        b.add(new Book("Emmet Murphy", "Temas de hoy", "1989", "", "Hª de los grandes burdeles del mundo", "Sexmujer"));
        b.add(new Book("Esther Harding", "Obelisco", "1987", "", "Los misterios de la mujer", "Sexmujer"));
        b.add(new Book("Robert Musil", "Seix Barral", "1982", "2ª ed.", "Tres mujeres", "Sexmujer"));
        b.add(new Book("Grupo Liones de Estudios Médicos", "Criterio", "1954", "", "Matrimonio y medicina", "Sexmujer"));
        b.add(new Book("Helmut Schelsky", "Nueva  visión", "1962", "", "Sociología de la sexualidad", "Sexmujer"));
        b.add(new Book("Bertrand Russell", "Leviatán", "1956", "", "Matrimonio y moral", "Sexmujer"));
        b.add(new Book("Gerge Weinberg", "Granica", "1977", "", "La homosexualidad sin prejuicios", "Sexmujer"));
        b.add(new Book("Nina Epton", "Plaza Janés", "1971", "", "El amor y los españoles", "Sexmujer"));
        b.add(new Book("Petrus Borel (El licántropo)", "Juárez Editor S.A.", "1969", "",
                "Champavert. Cuentos inmorales", "Sexmujer"));
        b.add(new Book("P. Evdorkimov", "Libros del Nopal", "1966", "", "Sacramento del amor", "Sexmujer"));
        b.add(new Book("Marcial", "Prometeo", "", "", "Epigramas eróticos", "Sexmujer"));
        b.add(new Book("La Fontaine", "Merlin", "1968", "", "El cornudo apaleado y contento y otros relatos",
                "Sexmujer"));
        b.add(new Book("Pauline Réage", "Edics. 1984 S.A.", "1984", "", "Historia de O", "Sexmujer"));
        b.add(new Book("Camilo José Cela", "Lumen", "1964", "", "Izas, rabizas y colipoterras", "Sexmujer"));
        b.add(new Book("André Berge", "Guadarrama", "1971", "", "La sexualidad hoy", "Sexmujer"));
        b.add(new Book("Arcipreste de Talavera", "Zeus", "1968", "", "Corvacho o la reprobación del amor mundano",
                "Sexmujer"));
        b.add(new Book("Desmond Morris", "Plaza Janés", "1972", "", "Comportamiento íntimo", "Sexmujer"));
        b.add(new Book("Karl Bednarik", "Plaza Janés", "1970", "", "La derrota del varón", "Sexmujer"));
        b.add(new Book("G. Abraham/W. Pasini", "Crítica", "1980", "", "Introducción a la sexología médica", "Sexmujer"));
        b.add(new Book("Lucy Mair", "Barral", "1974", "", "Matrimonio", "Sexmujer"));
        b.add(new Book("Dr. William Hartman M Fithian", "Mnez. Roca", "1986", "", "Las técnicas del placer", "Sexmujer"));
        b.add(new Book("Alex Comfort", "Blume", "1977", "", "El placer de amar", "Sexmujer"));
        b.add(new Book("Dr. Manuel Pérez Sánchez", "La Gaya Cª", "1977", "", "Qué es el orgasmo", "Sexmujer"));
        b.add(new Book("Guido Almansi", "Akal", "1977", "", "La estética de lo obsceno", "Sexmujer"));
        b.add(new Book("J. R. Saiz Viadero", "Ediciones 29", "1976", "", "Conversaciones con la May  Loly", "Sexmujer"));
        b.add(new Book("Varios Autores", "Merlin", "1969", "", "Homosexuario", "Sexmujer"));
        b.add(new Book("Varios Autores", "Merlin", "1969", "", "Manual de perversiones", "Sexmujer"));
        b.add(new Book("Ida Vitale, traductor", "Arca Galena", "1968", "", "Cartas de amor de la religiosa portuguesa",
                "Sexmujer"));
        b.add(new Book("Adolf Tüllmann", "Corona", "1963", "", "Vida amorosa de los pueblos naturales", "Sexmujer"));
        b.add(new Book("Herbert Lewandowski", "Corona", "1966", "", "Las costumbres y el amor en la antigua Roma",
                "Sexmujer"));
        b.add(new Book("Virginia E. Johnson", "Intermédica", "1972", "", "Incompatibilidad sexual humana", "Sexmujer"));
        b.add(new Book("W. H. Masters - V. E. Johnson", "Intermédica", "1967", "", "Respuesta sexual humana",
                "Sexmujer"));
        b.add(new Book("Richard Lewinsohn", "L. de Caralt", "1963", "", "Historia de la vida sexual", "Sexmujer"));
        b.add(new Book("Dr. A. Hesnard", "L. de Caralt", "1970", "", "Sexología normal y patológica", "Sexmujer"));
        b.add(new Book("Anne - Marie Carriere", "Grijalbo", "1964", "", "Diccionario de los hombres", "Sexmujer"));
        b.add(new Book("Maxime Davis", "Grijalbo", "1966", "", "Responsabilidad sexual en el matrimonio", "Sexmujer"));
        b.add(new Book("Helen Gurley Browon", "Grijalbo", "1964", "", "El sexo y la joven en Norteamérica", "Sexmujer"));
        b.add(new Book("Artur Koestler y otros", "Escuela", "1966", "", "La sexualidad", "Sexmujer"));
        b.add(new Book("Bertrand Russell y otros", "Escuela", "1966", "", "Fisiología  de la sexualidad", "Sexmujer"));
        b.add(new Book("Remy de Gourmont", "Claridad", "1962", "", "La física del amor", "Sexmujer"));
        b.add(new Book("F. Escardó", "Ateneo", "1960", "3ª ed.", "Anatomía de la familia", "Sexmujer"));
        b.add(new Book("Joaquín Latorre", "Ediciones 29", "1971", "", "Los españoles y el VI  mandamiento", "Sexmujer"));
        b.add(new Book("Marie Delcourt", "Seix barral", "1970", "", "Hermafrodita", "Sexmujer"));
        b.add(new Book("G. B. Leonard y M. Mc Luhan", "Extemporáneos SA", "1972", "Numerado",
                "La cuestión h. y  mujer y otras provocaciones", "Sexmujer"));
        b.add(new Book("Ricardo Majó Framis", "Reus", "1962", "", "Psicología y metafísica del amor", "Sexmujer"));
        b.add(new Book("Dr. C. Trimbos", "C. Lohlé", "1968", "", "Hombre y mujer", "Sexmujer"));
        b.add(new Book("Georg Scherer", "Sígueme", "1968", "", "Nueva comprensión de la sexualidad", "Sexmujer"));
        b.add(new Book("George Steiner y R. Boyers", "Alianza", "1985", "", "Homosexualidad: literatura y política",
                "Sexmujer"));
        b.add(new Book("Robert Grimm", "Troquel", "1962", "", "La sexualidad y el amor", "Sexmujer"));
        b.add(new Book("Informe Cº Británico de las Iglesias", "Mester", "1968", "", "Sexo y moralidad", "Sexmujer"));
        b.add(new Book("Pauline Réage", "Baal", "1962", "", "Historia de O", "Sexmujer"));
        b.add(new Book("Alvaro García Mesuguer", "Edicusa", "1977", "", "Lenguaje y discriminación sexual", "Sexmujer"));
        b.add(new Book("Walter J. Ong", "Aguilar", "1982", "", "La lucha por la vida", "Sexmujer"));
        b.add(new Book("Amaury de Riencourt", "Monte Avila", "1977", "", "La mujer y el poder en la historia",
                "Sexmujer"));
        b.add(new Book("Condesa de Campo Alange", "R. de Occidente", "1958", "3ª ed.",
                "La secreta guerra de los sexos", "Sexmujer"));
        b.add(new Book("Victoria San", "Ediciones 29", "1974", "", "Manifiesto para la liberación de la mujer",
                "Sexmujer"));
        b.add(new Book("Luigi de Marchi", "Horme", "1969", "", "Represión sexual y opresión sexual", "Sexmujer"));
        b.add(new Book("D. H. Lauwrence y H. Miller", "Nueva Visión", "1967", "", "Pornografía y obscenidad",
                "Sexmujer"));
        b.add(new Book("Robert Elliot Fitch", "La Isla", "1958", "", "Decadencia y caída del sexo", "Sexmujer"));
        b.add(new Book("J. Majanet y V. Morin", "Euramérica", "1964", "", "El erotismo", "Sexmujer"));
        b.add(new Book("Rafael Cansinos - Assens", "Jucar", "1973", "", "Etica y estética de los sexos", "Sexmujer"));
        b.add(new Book("Peter Kolosino", "Plaza-Janés", "1972", "", "Psicología del erotismo", "Sexmujer"));
        b.add(new Book("Edwin W.Hirsch", "Caymi", "1957", "", "El temor sexual", "Sexmujer"));
        b.add(new Book("Dr. Pierre Vachette", "Caymi", "1962", "", "La sensación sexual femenina", "Sexmujer"));
        b.add(new Book("R. E. Barker", "Goyanarte", "1959", "", "Tendencia a la corrupción", "Sexmujer"));
        b.add(new Book("Alan W. Wattas", "Fundamentos", "1958", "", "Naturaleza, hombre y mujer", "Sexmujer"));
        b.add(new Book("M. Volin Nancy Phelan", "Paidos", "1967", "", "Sexo y yoga", "Sexmujer"));
        b.add(new Book("Henry Miller", "Carlos Pérez", "1969", "", "Sexo y anarquía", "Sexmujer"));
        b.add(new Book("Lisa Mareau", "Diana", "1969", "", "La mujer de todos", "Sexmujer"));
        b.add(new Book("H. Marcusse, E. From y otros", "Carlos Pérez", "1969", "", "Sexualidad y represión", "Sexmujer"));
        b.add(new Book("José Botella Llusiá", "Espasa Calpe", "1975", "", "Esquema de la vida de la mujer", "Sexmujer"));
        b.add(new Book("William C. Taylor", "Picazo", "1973", "", "Historia de la sexualidad", "Sexmujer"));
        b.add(new Book("Francis King", "Felmar", "1977", "", "Sexo, magia y perversión", "Sexmujer"));
        b.add(new Book("Marqués de Sade", "Akal", "1980", "", "La filosofía en el tocador", "Sexmujer"));
        b.add(new Book("Eugenio Amezua", "Fontanella", "1974", "", "La erótica española en sus comienzos", "Sexmujer"));
        b.add(new Book("Noel Lamare", "Fontanella", "1965", "", "Conocimiento sexual de la mujer", "Sexmujer"));
        b.add(new Book("Paul Chanson", "Fontanella", "1968", "", "Unión conyugal T. II", "Sexmujer"));
        b.add(new Book("Evelyne Sullerot", "Argos Vergara", "1979", "", "El hecho femenino", "Sexmujer"));
        b.add(new Book("Eduardo Subirats", "Barral", "1975", "", "Sex-pol La revolución sexual", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "4ª ed.", "Los errores sexuales I", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "", "Los errores sexuales V", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1978", "", "Historia de la pornografía", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Avesta S. A.", "1982", "", "Satán y sus demonios", "Sexmujer"));
        b.add(new Book("Odette Thibault", "Guadarrama", "1972", "", "La pareja", "Sexmujer"));
        b.add(new Book("E. Bergler y otros", "Rodolfo Alonso", "1969", "", "La homosexualidad femenina", "Sexmujer"));
        b.add(new Book("Dr. Albert Ellis", "Diana, S.A.", "1965", "", "Sexo sin culpa", "Sexmujer"));
        b.add(new Book("Masoch", "Rodolfo Alonso", "1968", "", "La venus de las pieles", "Sexmujer"));
        b.add(new Book("Lawrence Lipton", "Rodolfo Alonso", "1970", "", "La revolución erótica", "Sexmujer"));
        b.add(new Book("Lawrence Lipton", "Rodolfo Alonso", "1970", "", "La revolución erótica de las artes",
                "Sexmujer"));
        b.add(new Book("Varios autores", "Rodolfo Alonso", "1970", "", "Erotismos&Variaciones", "Sexmujer"));
        b.add(new Book("Prof. Rinaldo Pelegrini", "Morata", "1956", "2ª ed.", "Sexuología", "Sexmujer"));
        b.add(new Book("López Ibor", "Danae", "1968", "", "El libro de la vida sexual", "Sexmujer"));
        b.add(new Book("Eugen Relgis", "Mex", "1961", "2ª ed.", "Historia sexual de la humanidad", "Sexmujer"));
        b.add(new Book("R. Signorelli Martí", "Dédalo", "1960", "", "La mujer en el mundo antiguo", "Sexmujer"));
        b.add(new Book("Daniel Guerin", "Leviatán", "1956", "", "Kinsey y la sexualidad", "Sexmujer"));
        b.add(new Book("Manuales Científicos", "M. Saiz", "1967", "", "Diccionario sexológico A - L", "Sexmujer"));
        b.add(new Book("Manuales Científicos", "M. Saiz", "1968", "", "Diccionario sexológico L - Z", "Sexmujer"));
        b.add(new Book("Jerome y Julia Rainer", "Central", "1963", "", "El placer sexual en el matrimonio", "Sexmujer"));
        b.add(new Book("Ibn Hazm de Córdoba", "Estudios y Publi.", "1967", "", "El collar de la paloma", "Sexmujer"));
        b.add(new Book("J. Money A Ehrhardt", "Morata", "1982", "", "Desarrollo de la sexualidad humana", "Sexmujer"));
        b.add(new Book("Julius Fast", "Kairos", "1971", "", "El lenguaje del cuerpo", "Sexmujer"));
        b.add(new Book("P. Reynes - Lyon", "Mundi", "1964", "", "Mitos, ritos y costumbres sexuales", "Sexmujer"));
        b.add(new Book("Margaret Mead", "Tiempo Nuevo", "1972", "", "Macho y hembra", "Sexmujer"));
        b.add(new Book("Juan Liscano", "Laia", "1988", "", "Los mitos de la sexualidad", "Sexmujer"));
        b.add(new Book("Lise Manniche", "Laia", "1988", "", "La esfinge erótica", "Sexmujer"));
        b.add(new Book("Wilhelm Reich", "Edasa", "1971", "", "La mujer sensual", "Sexmujer"));
        b.add(new Book("Bruno Bettelheim", "Barral", "1974", "", "Heridas simbólicas", "Sexmujer"));
        b.add(new Book("Hildegart", "Anagrama", "1977", "", "La rebeldía sexual de la juventud", "Sexmujer"));
        b.add(new Book("Vatsyayana Kalyana Malla", "E. de los Vedas", "1963", "", "Kama Sutra Ananga Ranga", "Sexmujer"));
        b.add(new Book("Félix Salten", "Rosicler", "1979", "", "Josefine Mutzenbacher", "Sexmujer"));
        b.add(new Book("Clara Coria", "Argot", "1987", "", "El sexo oculto del dinero", "Sexmujer"));
        b.add(new Book("Henri van Lier", "Marfil", "1970", "", "La intención sexual", "Sexmujer"));
        b.add(new Book("Efigenio Amezúa - Ortega", "Guadarrama", "1974", "", "Religiosidad y sexualidad", "Sexmujer"));
        b.add(new Book("Igor Caruso", "Siglo XXI", "1969", "", "La separación de los amantes", "Sexmujer"));
        b.add(new Book("Pierre Hanry", "A. T. E.", "1974", "", "El erotismo en Africa", "Sexmujer"));
        b.add(new Book("Emmanuelle Arsan", "A. T. E.", "1978", "", "La hipótesis de eros", "Sexmujer"));
        b.add(new Book("Dubois  Caballero", "A. T. E.", "1974", "", "La revolución sexual", "Sexmujer"));
        b.add(new Book("Dubois Caballero", "A. T. E.", "1974", "", "Nuevas técnicas sexuales", "Sexmujer"));
        b.add(new Book("Shulamith Firestone", "Kairos", "1976", "", "La dialéctica del sexo", "Sexmujer"));
        b.add(new Book("C. S. Lewis", "Eudeba", "1969", "", "La alegoría del amor", "Sexmujer"));
        b.add(new Book("Marcel Eck", "Herder", "1969", "", "Sodoma", "Sexmujer"));
        b.add(new Book("J. F. Lyotard", "Saltés", "1979", "", "Economía libidinal", "Sexmujer"));
        b.add(new Book("Nancy Friday", "Argos Vergara", "1981", "", "Sexo: varón", "Sexmujer"));
        b.add(new Book("Bernard Mulworf", "Roca", "1973", "", "Hacia la sociedad erótica", "Sexmujer"));
        b.add(new Book("José María Bravo", "Roca", "1969", "", "Enciclopedia de sexología", "Sexmujer"));
        b.add(new Book("Anders Nygren", "Sagitario", "1969", "", "Eros y ágape", "Sexmujer"));
        b.add(new Book("C. A. Tripp", "Edaf", "1978", "", "La cuestión homosexual", "Sexmujer"));
        b.add(new Book("J. López Barbadillo y M. Romero", "Akal", "1977", "", "Museo de Nápoles", "Sexmujer"));
        b.add(new Book("Bernard Nevins", "Manuales Cients.", "1968", "", "La mujer erótica", "Sexmujer"));
        b.add(new Book("Victor Margueritte", "Minerva", "1974", "", "La lesbiana", "Sexmujer"));
        b.add(new Book("Varios autores", "Espiral", "1979", "", "Erotismos", "Sexmujer"));
        b.add(new Book("Alfonso Martínez Rizo", "Orto", "1932", "", "El amor dentro de 200 años", "Sexmujer"));
        b.add(new Book("Jane Howard", "Kairos", "1973", "", "Tóqueme, por favor", "Sexmujer"));
        b.add(new Book("Xavier Domingo", "Ruedo Ibérico", "1972", "", "Erótica hispánica", "Sexmujer"));
        b.add(new Book("Prof. Novoa Santos", "Espasa Calpe", "1934", "", "Patología postural", "Sexmujer"));
        b.add(new Book("Ilse Ollendorf de Reich", "Granica", "1972", "", "Wilhelm Reich", "Sexmujer"));
        b.add(new Book("Ilse O. de Reich", "Gedisa", "1988", "1ª  reimpres.", "Wilhelm Reich", "Sexmujer"));
        b.add(new Book("Joaquin López Barbadillo", "J. L. Barbadillo", "1914", "",
                "Los diálogos del divino Pedro Aretino", "Sexmujer"));
        b.add(new Book("Proudhon", "Tor", "", "", "Filosofía del matrimonio", "Sexmujer"));
        b.add(new Book("Gina Lombroso", "Emecé", "1955", "5ª ed.", "El alma de la mujer", "Sexmujer"));
        b.add(new Book("Georges Bataille", "Tusquets", "1977", "", "Mi madre", "Sexmujer"));
        b.add(new Book("Dr. Eustace Chesser", "Latino-Americ.", "1963", "", "La mujer y el amor", "Sexmujer"));
        b.add(new Book("François Duyckaerts", "Guadarrama", "1966", "", "La formación del  vínculo sexual", "Sexmujer"));
        b.add(new Book("Dr. Osvaldo Quijada", "Andina", "1970", "", "Historia y sexualidad", "Sexmujer"));
        b.add(new Book("André Morali-Daninos", "Diana, S. A.", "1965", "", "Hª de las relaciones sexuales", "Sexmujer"));
        b.add(new Book("Jorge M. Isaac", "México D. F.", "1968", "", "El sexo me da risa", "Sexmujer"));
        b.add(new Book("Guillermo Apolinaire", "Icaria", "1977", "", "Las once mil vergas", "Sexmujer"));
        b.add(new Book("Varios Autores", "Merlin", "1967", "", "Prostibulario", "Sexmujer"));
        b.add(new Book("Anónimo", "Icaria", "1982", "", "Cuentos Lésbicos", "Sexmujer"));
        b.add(new Book("Th. H. Van de Velde", "Plenitud", "1959", "Intonso", "La erótica en el matrimonio", "Sexmujer"));
        b.add(new Book("Mercedes Ruibal", "Akal", "1978", "Dedic.",
                "Confesiones de volatinera con bragas de repuesto al dorso", "Sexmujer"));
        b.add(new Book("H. Von Sohel", "Felmar", "1964", "", "Biografía de la homosexualidad", "Sexmujer"));
        b.add(new Book("Dr. René Martial", "Publiciencia", "1965", "", "Los entretelones del placer", "Sexmujer"));
        b.add(new Book("Jeque Netzaqui", "La Fontana", "1975", "", "El jardín perfumado", "Sexmujer"));
        b.add(new Book("Enrique Mouchet", "Nova", "1953", "", "Tratado de las pasiones", "Sexmujer"));
        b.add(new Book("Sin autor", "México", "", "", "El jardín perfumado", "Sexmujer"));
        b.add(new Book("Eugen Relgis", "Cenit", "1964", "3ª ed.", "Historia sexual de la humanidad", "Sexmujer"));
        b.add(new Book("Varios Autores", "Editora Clásica", "", "", "Cuentos Clásicos eróticos 1ª serie", "Sexmujer"));
        b.add(new Book("Boris de Rachewiltz", "Sagitario, S.A.", "1966", "", "Eros negro", "Sexmujer"));
        b.add(new Book("Dr. H. Gesslers Thiele", "Publiciencia", "1965", "Intonso", "Afrodisíacos y anafrodisíacos",
                "Sexmujer"));
        b.add(new Book("Dr. J. Joaquín Díaz-González", "Bibliot. Clio", "1935", "", "EROS", "Sexmujer"));
        b.add(new Book("Gabriela Parca", "Siglo veinte", "1965", "", "Las italianas y el amor", "Sexmujer"));
        b.add(new Book("Lou Andreas-Salomé", "Calamus Scrip.", "1983", "", "El erotismo", "Sexmujer"));
        b.add(new Book("Dr. O. KARSTEN", "ZEUS", "1963", "", "Escuela del Amor y del Matrimonio", "Sexmujer"));
        b.add(new Book("C. M. Benjamin", "M. Castro", "1967", "", "Extrañas prácticas sexuales", "Sexmujer"));
        b.add(new Book("Homero Aridjis", "Argos Vergara", "1982", "", "Playa nudista El último Adán", "Sexmujer"));
        b.add(new Book("Centro de Estudios Laënec", "Morata", "1967", "", "Estudios sobre sexualidad humana",
                "Sexmujer"));
        b.add(new Book("Sigmund Freud y otros", "Siglo veinte", "1973", "", "La homosexualidad en la sociedad moderna",
                "Sexmujer"));
        b.add(new Book("Marciano Vidal", "Sígueme", "1971", "", "Moral del amor y la sexualidad", "Sexmujer"));
        b.add(new Book("Anaïs Nin", "Bruguera", "1979", "3ª ed.", "Delta de Venus", "Sexmujer"));
        b.add(new Book("Havelock Ellis", "Hijos de Reus", "1913", "", "Estudios de psicología sexual VI-VII",
                "Sexmujer"));
        b.add(new Book("Duque de Saint - Simon", "Tusquets", "1985", "", "Retratos de cortesanas de sus memorias",
                "Sexmujer"));
        b.add(new Book("Hildegart", "Anagrama", "1977", "", "La rebeldía sexual de la juventud", "Sexmujer"));
        b.add(new Book("H. Van der Velde", "J. Morata", "1932", "", "Fertilidad y esterilidad en el matrimonio",
                "Sexmujer"));
        b.add(new Book("Th. H. Van de Velde", "J. Morata", "1930", "", "El matrimonio perfecto", "Sexmujer"));
        b.add(new Book("Th. H. Van de Velde", "J. Morata", "1931", "", "Aversión y atracción en el matrimonio",
                "Sexmujer"));
        b.add(new Book("La Sonrisa vertical", "Tusquets", "1977", "",
                "La insólita y glor.  hazaña del cipote de Archidona", "Sexmujer"));
        b.add(new Book("Norman Lockridge", "Diana, S. A.", "1962", "", "Historias de pasión", "Sexmujer"));
        b.add(new Book("Dr. Harold Greenwald", "Siglo veinte", "1964", "",
                "La prostitución clandestina en Norteamérica", "Sexmujer"));
        b.add(new Book("Hans Licht", "Felmar", "1976", "", "Vida sexual de la antigua Grecia", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Maucci", "", "", "Los amores de los hombres T. I y II", "Sexmujer"));
        b.add(new Book("Rec. Dr. Isadore Rubin", "Manuales Cients.", "1966", "", "El tercer sexo", "Sexmujer"));
        b.add(new Book("Amalia Die-Jos Martín", "De la Torre", "1978", "", "Antología popular obscena", "Sexmujer"));
        b.add(new Book("Adolf Tüllmann", "C. Lectores", "1973", "", "Vida amorosa en el lejano Oriente", "Sexmujer"));
        b.add(new Book("Dr. E. Radetzky", "Caymi", "1962", "", "La emoción sexual de la mujer", "Sexmujer"));
        b.add(new Book("H. J. Cambell", "Guadarrama", "1976", "", "Las áreas del placer", "Sexmujer"));
        b.add(new Book("Camilo José Cela", "Sedmay", "1977", "", "Enciclopedia del erotismo T. I, II, III y IV",
                "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "3ª ed.", "Los errores sexuales II", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "2ª ed.", "Los errores sexuales III", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "3ª ed.", "Los errores sexuales IV", "Sexmujer"));
        b.add(new Book("A. Costler y A. Willy", "Claridad", "1960", "20ª ed.", "Enciclopedia del conocimiento sexual",
                "Sexmujer"));
        b.add(new Book("Dr. Augusto Forel", "Baylly-Baill.", "1931", "3ª ed.", "La cuestión sexual", "Sexmujer"));
        b.add(new Book("Frank S. Caprio", "Azteca", "1964", "", "El mundo del sexo", "Sexmujer"));
        b.add(new Book("Fritz Wittels", "S. Rueda", "1956", "", "Hábitos sexuales de la mujer", "Sexmujer"));
        b.add(new Book("Ramón Serrano Vicens", "Júcar", "1975", "3ª ed.", "La sexualidad femenina", "Sexmujer"));
        b.add(new Book("Carlos Feal Deibe", "Edhasa", "1973", "", "Eros y Lorca", "Sexmujer"));
        b.add(new Book("William McLeanc", "M. et larose", "1970", "", "Iconografie populaire de L'erotisme", "Sexmujer"));
        b.add(new Book("Ludwing Fineltain", "Herder", "1973", "", "Los traumas amorosos", "Sexmujer"));
        b.add(new Book("H. Montgomery Hyde", "La Pleyade", "1969", "", "Historia de la pornografía", "Sexmujer"));
        b.add(new Book("H. J. Eysenck", "Cátedra", "1982", "", "Sexo y personalidad", "Sexmujer"));
        b.add(new Book("Enrique Rojas", "Dossat Bolsillo", "1981", "", "Sexualidad y afectividad", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "Placeres sexuales", "Sexmujer"));
        b.add(new Book("José Luis Aranguren", "Ariel", "1973", "2ª ed.", "Erotismo y liberación de la mujer",
                "Sexmujer"));
        b.add(new Book("Marie Bonaparte", "Hormé", "1961", "", "La sexualidad de la mujer", "Sexmujer"));
        b.add(new Book("Prof. Flavio Ricciardetto", "Caymi", "1961", "", "Muñecas de placer", "Sexmujer"));
        b.add(new Book("R. Novoa Santos", "Biblioteca  Nueva", "1931", "",
                "La inmortalidad y los orígenes del sexo Dos ejemplares", "Sexmujer"));
        b.add(new Book("R. Novoa Santos", "Biblioteca Nueva", "1929", "",
                "La mujer, nuestro sexto sentido y otros esbozos", "Sexmujer"));
        b.add(new Book("Jhhn Ford", "Rodolfo Alonso", "1974", "2ª ed.", "Lástima que sea una p.", "Sexmujer"));
        b.add(new Book("Marianna Leibl", "Psique", "1955", "", "Psicología de la mujer", "Sexmujer"));
        b.add(new Book("Pierre de Bourleilles", "Rodolfo Alonso", "1973", "", "Las damas galantes", "Sexmujer"));
        b.add(new Book("Varios: Marcuse, O. Paz, ...", "Rodolfo Alonso", "1969", "", "El amor en cuestión", "Sexmujer"));
        b.add(new Book("Dr. W. Wasroche", "Claridad", "1952", "", "Amor sin peligros", "Sexmujer"));
        b.add(new Book("Naomi Weisstein y otras", "Kairos", "1972", "", "Hablan las women´s Lib", "Sexmujer"));
        b.add(new Book("Dr. Paul Balvet y otros", "Fontanella", "1965", "", "La sexualidad", "Sexmujer"));
        b.add(new Book("Jacques Chardonne", "Cristal", "", "2ª ed.", "El amor es mucho más que el amor", "Sexmujer"));
        b.add(new Book("Judith C. Brown", "Crítica", "1989", "", "Efectos vergonzosos de Sor Benedetta", "Sexmujer"));
        b.add(new Book("Harold & Ruth Greenwald", "Grijalbo", "1972", "", "Cartas de la vida sexual", "Sexmujer"));
        b.add(new Book("Versión de J. Mª Zainqui", "Grijalbo", "1964", "", "Diccionario de las mujeres", "Sexmujer"));
        b.add(new Book("Dr. J. Taresman", "Meyfe", "", "Intonso", "Educación de los placeres", "Sexmujer"));
        b.add(new Book("Carlos de Arce Robledo", "Picazo", "1971", "", "El insaciable eros", "Sexmujer"));
        b.add(new Book("George Bishoip", "Manuales Cients.", "1967", "", "Sexo y dolor. Fragelación", "Sexmujer"));
        b.add(new Book("Lujo Bassermann", "Grijalbo", "1969", "", "El oficio más antiguo", "Sexmujer"));
        b.add(new Book("Charles Waldemar", "Grijalbo", "1963", "", "La magia del sexo", "Sexmujer"));
        b.add(new Book("William H. Masters y V. E. Johnson", "Grijalbo", "1976", "", "El vínculo del placer",
                "Sexmujer"));
        b.add(new Book("Colin Wilson", "L. de Caralt", "1964", "", "Los orígenes del impulso sexual", "Sexmujer"));
        b.add(new Book("Danielle Jacquart - Claude Thomasset", "Labor Universit.", "1989", "",
                "Sexualidad y saber médico en la E. Media", "Sexmujer"));
        b.add(new Book("José María Pemán", "Prensa Española", "1969", "2ª ed.", "De doce cualidades de la mujer",
                "Sexmujer"));
        b.add(new Book("El País", "El País", "1991", "", "El libro de la sexualidad", "Sexmujer"));
        b.add(new Book("Riola Hernández A.", "Grijalbo", "1973", "", "Confidencias íntimas de mujeres", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Plaza Janés", "1977", "", "Incubos y sucubos. El diablo y el sexo",
                "Sexmujer"));
        b.add(new Book("Wilhelm Reich", "Ruedo Ibérico", "1970", "", "La revolución sexual", "Sexmujer"));
        b.add(new Book("Wilhelm Reich", "Paidos", "1962", "2ª ed.", "La función del orgasmo", "Sexmujer"));
        b.add(new Book("Wilhelm Reich", "Homo Sapiens", "1973", "", "La irrupción de la moral sexual", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "El sentimiento de la estimación", "Sexmujer"));
        b.add(new Book("Wilhelm Stekel", "Imán", "1956", "2ª ed.", "La impotencia en el hombre", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "Del sentimiento de la propiedad", "Sexmujer"));
        b.add(new Book("Aubrey Beardsley", "Arca Galerna", "1967", "", "Bajo el monte", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "De los placeres del sentimiento", "Sexmujer"));
        b.add(new Book("Denis de Rougemont", "Sur", "1959", "", "El amor y Occidente", "Sexmujer"));
        b.add(new Book("Peter Tompkins", "L. de Caralt", "1968", "", "El eunuco y la doncella", "Sexmujer"));
        b.add(new Book("Guillermo Apolinaire", "Calamus Scrip.", "1978", "2ª ed.", "Las azañas de un joven Don Juan",
                "Sexmujer"));
        b.add(new Book("Felicien Rops", "Calamus Scrip.", "1978", "", "Obras eróticas y sacrílegas", "Sexmujer"));
        b.add(new Book("Ramón Gómez de la Serna", "C. Lectores", "1972", "", "Senos", "Sexmujer"));
        b.add(new Book("Kenneth Walker", "Tiempo Nuevo", "1954", "2ª ed.", "Fisiología del sexo", "Sexmujer"));
        b.add(new Book("Dr. Martín de Lucenay", "México", "1950", "", "Los artificios del placer", "Sexmujer"));
        b.add(new Book("Dr. Osvaldo Quijada", "Andina", "1967", "", "Sexo y sufrimiento.  La mujer", "Sexmujer"));
        b.add(new Book(" Weisweiler", "Zeus", "1968", "", "Arabescos del amor", "Sexmujer"));
        b.add(new Book("KINSEY", "Méd.-Quirúrg.", "1954", "", "Conducta sexual de la mujer", "Sexmujer"));
        b.add(new Book("W. Carroll - A. Cunninghan", "Cristiandad", "1978", "", "La sexualidad humana", "Sexmujer"));
        b.add(new Book("Inst. Francés de Opinión Pública", "Siglo veinte", "1962", "", "La francesa y el amor",
                "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "De los placeres de la vista", "Sexmujer"));
        b.add(new Book("Mary Jane Sherfey", "Barral", "1974", "", "Naturaleza y evolución de la sexualidad femenina",
                "Sexmujer"));
        b.add(new Book("León Frobenius", "R. Occidente", "1950", "", "El Decamerón negro", "Sexmujer"));
        b.add(new Book("Michel Meignant", "Avance", "1976", "", "Je T'aime", "Sexmujer"));
        b.add(new Book("Dr. Frederik Koning", "Bruguera", "1975", "", "Los errores sexuales VI", "Sexmujer"));
        b.add(new Book("J. A. Valverde - Dr. Adolfo Abril", "Sedmay", "1975", "2ª ed", "Las españolas en secreto",
                "Sexmujer"));
        b.add(new Book("Georges Bataille", "Sur", "1964", "", "El erotismo", "Sexmujer"));
        b.add(new Book("Georges Bataille", "Edic. de Minuit", "1961", "En francés", "L'erotisme", "Sexmujer"));
        b.add(new Book("J. Chasseguet - Smirgel", "Laia", "1987", "", "Etica y estética de la perversión", "Sexmujer"));
        b.add(new Book("J. Chasseguet - Smirgel", "Laia", "1973", "", "La sexualidad femenina", "Sexmujer"));
        b.add(new Book("Margaret Mead", "Laia", "1973", "", "Sexo y temperamento en las sociedades primitivas",
                "Sexmujer"));
        b.add(new Book("Margaret Mead", "Laia", "1972", "", "Adolescencia, sexo y cultura en Samoa", "Sexmujer"));
        b.add(new Book("Frederick D. Wilhelmsen", "Rialp", "1964", "", "La metafísica del amor", "Sexmujer"));
        b.add(new Book("Frank A. Beach Clellan S. Ford", "Fontanella", "1969", "", "Conducta sexual", "Sexmujer"));
        b.add(new Book("Paul Chauchard", "Iberoamericanas", "1968", "", "Nuestros handicaps sexuales", "Sexmujer"));
        b.add(new Book("Margaret Wadw Labarge", "Nerea", "1988", "", "La mujer en la Edad Media", "Sexmujer"));
        b.add(new Book("Dr. Albert Ellis", "Siglo veinte", "1964", "", "La tragedia sexual norteamericana", "Sexmujer"));
        b.add(new Book("Vitold de Golish", "Euros", "1974", "", "La India impúdica de los Maharajas", "Sexmujer"));
        b.add(new Book("Jacquet Ruffié", "Espasa Calpe", "1988", "", "El sexo y la muerte", "Sexmujer"));
        b.add(new Book("Alberto García Valdés", "Akal", "1981", "", "Historia y presente de la homosexualidad",
                "Sexmujer"));
        b.add(new Book("Sigmund Freud y otros", "Siglo veinte", "1965", "", "La homosexualidad en la sociedad moderna",
                "Sexmujer"));
        b.add(new Book("Theodor Bovet", "El ateneo", "1959", "", "El matrimonio.  Manual para esposos y consejeros",
                "Sexmujer"));
        b.add(new Book("W. Schreader - Devxrient", "Escorial", "1966", "", "Memorias secretas de una cantante",
                "Sexmujer"));
        b.add(new Book("Charles Fourier", "Espiral", "1975", "", "Nuevo mundo amoroso", "Sexmujer"));
        b.add(new Book("Georges Bataille", "Signos", "1968", "", "Las lágrimas de eros", "Sexmujer"));
        b.add(new Book("Georges Bataille", "Tusquets", "1978", "", "Historia del ojo", "Sexmujer"));
        b.add(new Book("Witold Gombrowicz", "Tusquets", "1970", "", "La virginidad", "Sexmujer"));
        b.add(new Book("Charles Devereaux (Seudónimo)", "Tusquets", "1979", "", "Venus en  India", "Sexmujer"));
        b.add(new Book("Honorato de Balzac", "México, D. F.", "1956", "", "Cuentos picarescos", "Sexmujer"));
        b.add(new Book("Doctor Jaff", "J. Gil", "1935", "4ª ed. Revis.", "Arte de conservar el amor en el matriminio",
                "Sexmujer"));
        b.add(new Book("Oro de Ley", "Ortiz Barili", "1956", "", "Diez cuentos de amor famosos", "Sexmujer"));
        b.add(new Book("Alfred C. Kinsey y otros", "Escuela", "1967", "", "Desviaciones funcionales de la sexualidad",
                "Sexmujer"));
        b.add(new Book("H. Marcuse, E. Fromm y otros", "Escuela", "1968", "", "Sexualidad y represión", "Sexmujer"));
        b.add(new Book("Noel Lamare", "Fontanella", "1965", "", "Conocimiento sexual del hombre", "Sexmujer"));
        b.add(new Book("Paul Chanson", "Fontanella", "1966", "", "Unión conyugal T. I", "Sexmujer"));
        b.add(new Book("A. De Musset", "Ed. Selección", "", "", "Dos noches de placer", "Sexmujer"));
        b.add(new Book("Yohn Wilson", "Fontanella", "1968", "", "Lo absurdo de nuestra moral sexual", "Sexmujer"));
        b.add(new Book("Yousset el Masry", "Fontanella", "1963", "", "Drama sexual de la mujer árabe", "Sexmujer"));
        b.add(new Book("Marcel Sacotte", "Fontanella", "1964", "", "La prostitución", "Sexmujer"));
        b.add(new Book("Gustave Thibon", "Fontanella", "1962", "", "La crisis moderna del amor", "Sexmujer"));
        b.add(new Book("Michael Schofield", "Fontanella", "1972", "", "El comportamiento sexual de los jóvenes",
                "Sexmujer"));
        b.add(new Book("Carla Lonzi", "Anagrama", "1981", "2ª ed.", "Escupamos sobre Hegel", "Sexmujer"));
        b.add(new Book("Dr. A. Austregesilo", "Manuel Marín", "1929", "", "La neurastenia sexual y su tratamiento",
                "Sexmujer"));
        b.add(new Book("Jaime Torrubiano Ripoll", "J. Morata", "1926", "", "El divorcio vincular y el dogma católico",
                "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "De los placeres del olfato", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1964", "Intonso", "Placeres del tacto", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1965", "Intonso", "Historia natural del placer", "Sexmujer"));
        b.add(new Book("Pablo Mantegazza", "Caymi", "1965", "Intonso", "Placeres del entendimiento", "Sexmujer"));
        b.add(new Book(" D. de San Pedro", "Zeus", "1969", "", "Cárcel de amor", "Sexmujer"));
        b.add(new Book("Varios Autores", "Litofice", "1977", "", "Wilhem Reich: Orgasmo y orgón (2 ejemplares)",
                "Sexmujer"));
        b.add(new Book("Dr. Pierre Vachet", "Ed. Oriente", "1931", "", "El enigma de la mujer", "Sexmujer"));
        b.add(new Book("E. Laurent y P. Nagour", "Más allá", "1920", "", "La magia y el amor", "Sexmujer"));
        b.add(new Book("Pietro Aretino", "Bergua", "1933", "", "Los ragionamenti Diálogos putañescos", "Sexmujer"));
        b.add(new Book("Dr. Max Funke", "Bergua", "1932", "Sin cubierta", "El amor, la lujuria y el vicio", "Sexmujer"));
        b.add(new Book("L. Carat y otros", "Escuela", "1966", "", "Las relaciones sexuales", "Sexmujer"));
        b.add(new Book("Lorenzo Rodero", "Argis", "1931", "", "La risa del sexo", "Sexmujer"));
        b.add(new Book("Sheila Rowbotham J. Wessks", "Anagrama", "1978", "", "Dos pioneros de la liberación sexual",
                "Sexmujer"));
        b.add(new Book("Pascal Brucker y Alain F.", "Anagrama", "1979", "", "El nuevo desorden amoroso", "Sexmujer"));
        b.add(new Book("W. Schröeder - Devrient", "Tusquets", "1977", "", "Memorias de una cantante alemana",
                "Sexmujer"));
        b.add(new Book("Anónimo", "Tusquets", "1980", "", "Cruel Zelanda", "Sexmujer"));
        b.add(new Book("F. Escardó", "Ateneo", "1964", "3ª ed.", "Sexología de la familia", "Sexmujer"));
        b.add(new Book("Robert Street", "Hormé", "1973", "", "Técnicas sexuales modernas", "Sexmujer"));
    }

    private static void fillSalvat_muy_interesante() {
        final List<Book> b = DB.get("Salvat_muy_interesante");
        b.add(new Book("Martin Gardner", "Miscelánea  matemática", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "El Universo desbocado", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Dian Fossey", "Gorilas en la niebla", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Dieter E. Zimmer", "Dormir y soñar", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "Superfuerza", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("M. Hoagland", "Las raíces de la vida", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Stefan M. Gergely", "Microelectrónica", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Robert Jastrow", "El telar mágico", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("James S. Trefil", "De los átomos a los quarks", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Richard Dawkins", "El gen egoísta", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Nigel Calder", "¡Qué viene el cometa!", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Jean-Marie Pelt", "Las plantas", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "La frontera del infinito", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Alan Charig", "La verdadera historia de los dinosaurios", "Salvat", "1985", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Martin Gardner", "Izquierda y derecha en el cosmos", "Salvat", "1985", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Bernard Campbell", "Ecología humana", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Hazel Rossotti", "Introducción a la química", "Salvat", "1985", "", "Salvat_muy_interesante"));
        b.add(new Book("Erhard Keppler", "Sol, lunas y planetas", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Marvin Harris", "Caníbales y reyes", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Niko Tinbergen", "Naturalistas curiosos", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("John Gribbin", "En busca del gato de Schrödinger", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Anthony Smith", "La mente I", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Anthony Smith", "La mente II", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Jane Goodall", "En la senda del hombre", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("A. Einstein y L. Infeld", "La evolución de la física", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("John Boslough", "El universo de Stephen Hawking", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Rene Dubos", "Un dios interior", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Christipher Jargocki", "Rompecabezas y paradojas científicas", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "Otros mundos", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Michael Shallis", "El ídilo de silicio", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Eberhard Weismann", "Los rituales amorosos", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("James S.- Trefil", "El momento de la creación", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Peter Laurie", "Informática para todos", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Heribert Schmid", "Cómo se comunican los animales", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Rudolf Kippenhahn", "Cien millones de soles", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul de Kruif", "Cazadores de microbios", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "Dios y la nueva física", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Basil Booth y Frank Fitch", "La inestable Tierra", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Brian Leith", "El legado de Darwin", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("James S. Trefil", "El panorama inesperado", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Hermann Haken", "Fórmulas de éxito en la Naturaleza", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Martin Gardner", "El escarabajo sagrado I", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Martin Gardner", "El escarabajo sagrado II", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Wolfgang Schwoerbel", "Evolución", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Mariano Medina", "Iniciación a la meteorología", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Martin Gardner", "La explosión de la relatividad", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Dorothy Vitaliano", "Leyendas de la Tierra", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("François Jacob", "La lógica de lo viviente", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("John Gribbin", "Génesis", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("John Gribbin", "La Tierra en movimiento", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Arthur Koestler", "Los sonámbulos I", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Arthur Koestler", "Los sonámbulos II", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("John Gribbin", "En busca de la doble hélice", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("P. W. Atkins", "La creación", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Peter S. Stevens", "Patrones y pautas en la naturaleza", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "El Universo accidental", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Karl von Frisch", "Doce pequeños huéspedes", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("John Gribbin", "El clima futuro", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Jonathan Winson", "Cerebro y psique", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Gerald Feinberg", "Claves ciertas", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("David P. Barash", "El envejecimiento", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Hugo Steinhaus", "Instantáneas matemáticas", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("I. Eibl-Eibesfledt", "Amor y odio", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Roger Lewin", "Evolución humana", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Richard Morris", "Las flechas del tiempo", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Eric Chaisson", "El amanecer cósmico", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Steve Prentis", "Biotecnología", "Salvat", "1986", "", "Salvat_muy_interesante"));
        b.add(new Book("Alwyn Mckay", "La construcción de la era atómica", "Salvat", "1986", "",
                "Salvat_muy_interesante"));
        b.add(new Book("I. Eibl-Eibesfledt", "Guerra y paz", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("E. Kasner y J. Newman", "Matemáticas e imaginación I", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("E. Kasner y J. Newman", "Matemáticas e imaginación II", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Carsten Brech", "La vida, un estudio intermedio", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("George Gamow", "Biografía de la física", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("J. Hecht y D. Teresi", "El rayo láser", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Richard Alexander", "Darwinismo y asuntos humanos", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Rudi Rucker", "La cuarta dimensión", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("David Attenborough", "El planeta viviente", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Rudolf Kippenhahn", "Luz del confín del universo", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("O. M. S.", "Los alimentos y la salud", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("P. Radvanyi y M Bordry", "La radiactividad artificial", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("George Breuer", "El aire en peligro", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Robert Shafiro", "Orígenes", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Luis Daufí", "La enfermedad hoy", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Paul Davies", "En busca de las hondas de gravitación", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("James Watson", "La doble hélice", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Umberto Colombo", "El segundo planeta", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Gunther S. Stent", "Las paradojas del progreso", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("D. Coleman y J. Freedman", "Los secretos de la psicología", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Hans Hass", "Del pez al hombre", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Evry Schatzman", "Los niños de Urania", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Michael Ruse", "Tomándose a Darwin en serio", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("David P. Barash", "La liebre y la tortuga", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Francisco : Ayala", "La naturaleza inacabada", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("David Bodanis", "Los secretos de una casa", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Burrhus F. Skinner", "Mas allá de la libertad y la dignidad", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("Academia norteamericana de Ciencias", "Física nuclear", "Salvat", "1987", "",
                "Salvat_muy_interesante"));
        b.add(new Book("P. R. Ehrlich y A. H. Ehrlich", "Extinción I", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("P. R. Ehrlich y A. H. Ehrlich", "Extinción II", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Helen E. Fischer", "El contrato sexual", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Fred I. Dretske", "Conocimiento e información", "Salvat", "1987", "", "Salvat_muy_interesante"));
        b.add(new Book("Carl Sagan", "La conexión cósmica", "Eds. Orbis, S.A.", "1986", "Nº 1",
                "Salvat_muy_interesante"));
        b.add(new Book("Isaac Asimov", "Introd. a la ciencia I Ciencias Físicas", "Eds. Orbis, S.A.", "1986", "Nº 2",
                "Salvat_muy_interesante"));
        b.add(new Book("Kenneth Gatland  (Autor principal)", "Exploración del espacio Vol. I y II", "Eds. Orbis, S.A.",
                "1986", "Nº 3 y 27", "Salvat_muy_interesante"));
        b.add(new Book("Isaac Asimov", "Introd. a la ciencia II Ciencias Biológicas", "Eds. Orbis, S.A.", "1986",
                "Nº 4", "Salvat_muy_interesante"));
        b.add(new Book("Bertrand Russel", "ABC de la relatividad", "Eds. Orbis, S.A.", "1986", "Nº 5",
                "Salvat_muy_interesante"));
        b.add(new Book("C. Rayner", "La mente humana", "Eds. Orbis, S.A.", "1986", "Nº 7", "Salvat_muy_interesante"));
        b.add(new Book("Alvin Toffler", "La tercera ola Vol. I y II", "Eds. Orbis, S.A.", "1986", "Nº 9 y 10",
                "Salvat_muy_interesante"));
        b.add(new Book("Richard E. LeaKey", "La formación de la Humanidad Vol. I y II", "Eds. Orbis, S.A.", "1986",
                "Nº 11 y 15", "Salvat_muy_interesante"));
        b.add(new Book("Pierre P. Grassé", "El hombre, ese dios en miniatura", "Eds. Orbis, S.A.", "1986", "Nº 13",
                "Salvat_muy_interesante"));
        b.add(new Book("David Dickson", "Tecnología alternativa", "Eds. Orbis, S.A.", "1986", "Nº 14",
                "Salvat_muy_interesante"));
        b.add(new Book("Charles Sherrington", "Hombre versus naturaleza", "Eds. Orbis, S.A.", "1986", "Nº 26",
                "Salvat_muy_interesante"));
        b.add(new Book("Synney P. Clark", "La estructura de la tierra", "Eds. Orbis, S.A.", "1987", "Nº 41",
                "Salvat_muy_interesante"));
        b.add(new Book("R. Hardy/P. Wright y otros", "El libro del clima Vol. III", "Eds. Orbis, S.A.", "1986",
                "Nº 47", "Salvat_muy_interesante"));
        b.add(new Book("Pierre Rousseau", "Astronomía sin telescopio", "Eds. Orbis, S.A.", "1987", "Nº53",
                "Salvat_muy_interesante"));
        b.add(new Book("Félix Trombe", "Las aguas subterráneas", "Eds. Orbis, S.A.", "1987", "Nº 54",
                "Salvat_muy_interesante"));
        b.add(new Book("A. R. Luria", "El cerebro en acción Vol. I y II", "Eds. Orbis, S.A.", "1987", "Nº 56 y 57",
                "Salvat_muy_interesante"));
        b.add(new Book("Jean-Jacques Matras", "El sonido", "Eds. Orbis, S.A.", "1987", "Nº 62",
                "Salvat_muy_interesante"));
        b.add(new Book("Y. Perelman", "Matemáticas recreativas", "Eds. Orbis, S.A.", "1987", "Nº 69",
                "Salvat_muy_interesante"));
        b.add(new Book("Joseph Deken", "La casa electrónica", "Eds. Orbis, S.A.", "1987", "Nº 73",
                "Salvat_muy_interesante"));
        b.add(new Book("Isaac Asimov", "De los números y su historia", "Eds. Orbis, S.A.", "1987", "Nº 76",
                "Salvat_muy_interesante"));
        b.add(new Book("Fred Hoyle", "Iniciación a la astronomía Vol. I", "Eds. Orbis, S.A.", "1986", "Nº 79",
                "Salvat_muy_interesante"));
        b.add(new Book("Roland Prat", "La óptica", "Eds. Orbis, S.A.", "1988", "Nº 80", "Salvat_muy_interesante"));
        b.add(new Book("Stephen Jay Gould", "El pulgar del panda", "Eds. Orbis, S.A.", "1986", "Nº 16",
                "Salvat_muy_interesante"));
        b.add(new Book("Walter C. Patterson", "La energía nuclear", "Eds. Orbis, S.A.", "1986", "Nº 17",
                "Salvat_muy_interesante"));
        b.add(new Book("C. Rayner", "El cuerpo humano Vol. I y II", "Eds. Orbis, S.A.", "1986", "Nº 19 y 23",
                "Salvat_muy_interesante"));
        b.add(new Book("Stephan L. Chorover", "Del génesis al genocidio", "Eds. Orbis, S.A.", "1986", "Nº 21",
                "Salvat_muy_interesante"));
        b.add(new Book("J. E. Lovelock", "GAIA, una nueva visión de la vida sobre la tierra", "Eds. Orbis, S.A.",
                "1986", "Nº 22", "Salvat_muy_interesante"));
        b.add(new Book("Robert Fouet/Charles Pomerol", "Las montañas", "Eds. Orbis, S.A.", "1987", "Nº 28",
                "Salvat_muy_interesante"));
        b.add(new Book("Paul Colinvaux", "Por qué son escasas las fieras", "Eds. Orbis, S.A.", "1987", "Nº 29",
                "Salvat_muy_interesante"));
        b.add(new Book("Ediciones Orbis, S.A.", "Exploración del espacio Vol. III y IV", "Eds. Orbis, S.A.", "1985",
                "Nº 31 y 35", "Salvat_muy_interesante"));
        b.add(new Book("H. J. Eysenck", "Raza, inteligencia y educación", "Eds. Orbis, S.A.", "1987", "Nº 36",
                "Salvat_muy_interesante"));
        b.add(new Book("Fernand Moreau", "Alcaloides y plantas alcaloideas", "Eds. Orbis, S.A.", "1987", "Nº 37",
                "Salvat_muy_interesante"));
        b.add(new Book("R. Hardy/P. Wright y otros", "El libro del clima Vol. I y II", "Eds. Orbis, S.A.", "1985",
                "Nº 39 y 43", "Salvat_muy_interesante"));
        b.add(new Book("Recopil. de artículos de La Recherche", "Astrofísica", "Eds. Orbis, S.A.", "1987", "Nº 40",
                "Salvat_muy_interesante"));
        b.add(new Book("Recopil. de artículos de La Recherche", "Las nuevas energías", "Eds. Orbis, S.A.", "1987",
                "Nº 42", "Salvat_muy_interesante"));
        b.add(new Book("H. J. Eysenck", "Experimentos en terapia de la conducta Vol. I y II", "Eds. Orbis, S.A.",
                "1986", "Nº 44 y 45", "Salvat_muy_interesante"));
        b.add(new Book("H. J. Eysenck", "Experimentos en terapia de la conducta Vol. III", "Eds. Orbis, S.A.", "1986",
                "Nº 46", "Salvat_muy_interesante"));
        b.add(new Book("R. Hardy/P. Wright y otros", "El libro del clima Vol. III", "Eds. Orbis, S.A.", "1986",
                "Nº 47", "Salvat_muy_interesante"));
        b.add(new Book("Richard Feynman", "El carácter de la ley física", "Eds. Orbis, S.A.", "1987", "Nº 64",
                "Salvat_muy_interesante"));
        b.add(new Book("R. Hardy/P. Wright y otros", "El libro del clima Vol. III", "Eds. Orbis, S.A.", "1986",
                "Nº 47", "Salvat_muy_interesante"));
        b.add(new Book("H. Takeuchi/S.Uyeda/H. Kanamori", "¿Qué es la tierra?", "Eds. Orbis, S.A.", "1986", "Nº 50",
                "Salvat_muy_interesante"));
        b.add(new Book("Stephen Jay Gould", "La falsa medida del hombre", "Eds. Orbis, S.A.", "1986", "Nº 61",
                "Salvat_muy_interesante"));
        b.add(new Book("Michel Béguery", "La explotación de los océanos", "Eds. Orbis, S.A.", "1987", "Nº 65",
                "Salvat_muy_interesante"));
        b.add(new Book("J. L. Cloudsley - Thompson", "El hombre y la biología de zonas áridas", "Eds. Orbis, S.A.",
                "1986", "Nº 68", "Salvat_muy_interesante"));
        b.add(new Book("Lloyd Motz", "El universo (su principio y su fin)", "Eds. Orbis, S.A.", "1986", "Nº 72",
                "Salvat_muy_interesante"));
        b.add(new Book("M. Mead, T. Dobzhannsky y otros", "La ciencia y el concepto de raza", "Eds. Orbis, S.A.",
                "1986", "Nº 74", "Salvat_muy_interesante"));
        b.add(new Book("Alfred Tomatis", "El oído y el lenguaje", "Eds. Orbis, S.A.", "1986", "Nº 77",
                "Salvat_muy_interesante"));
    }

    private static void fillRestos() {
        final List<Book> b = DB.get("Restos");
        b.add(new Book("Jesús Guzmán y Martínez", "Método de lengua francesa", "Martosa", "1935", "10ª ed.", "Restos"));
        b.add(new Book("Jesús Guzmán y Martínez", "Lengua francesa", "Martosa", "1935", "9ª ed.", "Restos"));
        b.add(new Book("ASSIMIL", "El francés sin esfuerzo", "Assimil", "1957", "", "Restos"));
        b.add(new Book("César Silió Beleña", "Nociones de economía", "Cuesta", "1940", "5ª ed. Modif.", "Restos"));
        b.add(new Book("León Batardón", "La contabilidad al alcance de todos", "Labor", "1949", "3ª ed.", "Restos"));
        b.add(new Book("León Batardón", "Contabilidad de empresas", "Labor", "1943", "4ª reimp.", "Restos"));
        b.add(new Book("Dr. Ricardo Espejo de Hinojosa", "Economía política moderna", "Clarasó", "1940", "7ª ed.",
                "Restos"));
        b.add(new Book("Dr. Ricardo Espejo de Hinojosa", "Rudimentos de derecho", "Clarasó", "1940", "7ª ed.", "Restos"));
        b.add(new Book("Sixto Ríos - L. Thomas Ara", "Matemáticas 1º curso Plan de 1957", "Autores Edis.", "1957", "",
                "Restos"));
        b.add(new Book("José Dalmau Carles", "Resumen de las lecciones de Aritmética Gº Medio", "Dalmau Carless",
                "1925", "", "Restos"));
        b.add(new Book("José Dalmau Carles", "Aritmética razonada y lecciones de álgebra", "Dalmau Carles", "", "",
                "Restos"));
        b.add(new Book("Félix Correa", "Ampliación de Aritmética", "H. de Aragón", "1939", "", "Restos"));
        b.add(new Book("Sobrequés - Lloret", "Las tierras de España Geografía 1ª Curso", "Teide", "1958", "", "Restos"));
        b.add(new Book("Charles H. Fernald", "Formación práctica del agente de ventas", "Labor", "1949", "", "Restos"));
        b.add(new Book("Antonio Ibars Moreno", "Manual para gerentes de empresa", "Rialp", "1966", "2ª ed.", "Restos"));
        b.add(new Book("Federico Torres", "Viajes por España", "", "", "Manuscrito", "Restos"));
        b.add(new Book("Guía urbana de Barcelona", "Suplemento", "José Pamías", "1970", "", "Restos"));
        b.add(new Book("Casares", "Diccionario Ideologico de la lengua española", "G. Gili, S.A.", "1947",
                "1ª ed. 2ª tirada", "Restos"));
        b.add(new Book("Salvá", "Diccionario Esp. Francés - Fr. Español", "Garnier", "1951", "", "Restos"));
        b.add(new Book("P. Juan Mir y Noguera", "Diccionario de Frases", "J. Gil", "1942", "", "Restos"));
        b.add(new Book("Rafael Reyes", "Diccionario Fra. - Esp- y Esp. - Francés", "Caro Raggio", "1936", "10ª ed.",
                "Restos"));
        b.add(new Book("Manuel Seco", "Diccionario de dudas de la lengua española", "Aguilar", "1964", "", "Restos"));
        b.add(new Book("Samuel Gili Gaya", "Diccionario de sinónimos", "Spes, S.A.", "1961", "", "Restos"));
        b.add(new Book("J. Mª Viqueira Barreiro", "Dicc. Español-Portugués y Port.-Esp.", "Aguilar", "1961", "",
                "Restos"));
        b.add(new Book("Casa Editrice Bietti", "Novíssimo diccionario Italiano-Espagnolo", "Editrice Bietti", "1938",
                "", "Restos"));
        b.add(new Book("Varios autores", "Diccionario Xerais da lingua", "Xerais", "1987", "1ª reimp.", "Restos"));
        b.add(new Book("Giner", "Formulario de contratos y documentos escritos", "Eds. Giner", "1967", "10ª ed.",
                "Restos"));
        b.add(new Book("Prof. Lorenzo Velázquez", "Formulario y fundamentos de terapéutica clínica", "Graf. González",
                "1955", "10ª ed.", "Restos"));
        b.add(new Book("El Mundo", "Enciclopedia del S. XXI", "El Mundo", "1982", "", "Restos"));
        b.add(new Book("E. Bisbal Ortiz", "Formularios y práctica de correspondencia", "Gaisa", "1958", "", "Restos"));
        b.add(new Book("Instituto de Lengua Gallega", "Gallego 1", "Univ. S. Comp.", "1971", "", "Restos"));
        b.add(new Book("El Mundo", "El mundo de los grandes genios", "Eds. Orbis,S.A.", "1989", "Colecc.", "Restos"));
        b.add(new Book("Horta de impresiones y ediciones", "Dicc. de sinónimos, ideas afines y de la rima", "Horta",
                "", "", "Restos"));
        b.add(new Book("Grandes Obras El Sol", "Enciclopedia de las grandes civilizaciones", "Altair, S.A.", "1991",
                "Colecc.", "Restos"));
        b.add(new Book("El Norte de Castilla", "Testigo de la Historia", "El Norte de Cª", "1990", "", "Restos"));
        b.add(new Book("Jennifer Westwood, Coordinador", "Atlas de lugares misteriosos", "Debate", "1988", "", "Restos"));
        b.add(new Book("ABC", "Vida de Franco", "ABC", "", "Piel", "Restos"));
        b.add(new Book("Diego Hernández Mangas", "El Generalísimo Caudillo de España Canto Poético", "La moderna",
                "1968", "", "Restos"));
        b.add(new Book("Santiago Carrillo", "Después de Franco ¿Qué?", "", "", "116 pgas.", "Restos"));
        b.add(new Book("Prof. M. Hidalgo Huerta", "Cómo y porqué operé a Franco", "Garsi", "1976", "", "Restos"));
        b.add(new Book("A. Maciá Serrano", "Ciclo nacional de conferencias a la tropa", "Epesa", "1946", "", "Restos"));
        b.add(new Book("José Cordero Torres", "La misión africana de España", "Diana", "1941", "", "Restos"));
        b.add(new Book("Rodolgo Gil Benumeya", "Marruecos andaluz", "Diana", "1942", "", "Restos"));
        b.add(new Book("Agustin García Calvo", "Manifiesto Comuna antinacionalista zamorana", "Lucina", "1987",
                "5ª ed.", "Restos"));
        b.add(new Book("Nuestra Bandera", "Nº 44/45", "", "1965", "revista", "Restos"));
        b.add(new Book("Vicariato General Castrense", "Devocionario del soldado", "Serv. G. Ejercito", "1944", "",
                "Restos"));
        b.add(new Book("Dr. R. Rey Ardid", "Aperturas de ajedrez T. I La apertura española", "Lib. Gral. Zarag.",
                "1945", "", "Restos"));
        b.add(new Book("Dr. R. Rey Ardid", "Los principios del ajedrez", "Lib. Gral. Zarag.", "1939", "", "Restos"));
        b.add(new Book("Dr. R. Rey Ardid", "Cien nuevas partidas de ajedrez (1934/1940)", "Lib. Gral. Zarag.", "1940",
                "", "Restos"));
        b.add(new Book("Savielly G. Tartakower", "Sugestiones para la estrategia ajedrecista", "Sopena Arg. S.R.",
                "1941", "", "Restos"));
        b.add(new Book("Ing. M. Botwinnik", "Secretos de la estrategia magistral en ajedrez", "Grabo", "1942", "",
                "Restos"));
        b.add(new Book("Manuel de Agustin, Comentador", "Todas las partidas de ajedrez de Margate 1939", "Ambo",
                "1939", "", "Restos"));
        b.add(new Book("José Raul capablanca", "Fundamentos de ajedrez", "R. Aguilera", "1967", "", "Restos"));
        b.add(new Book("E. D. Bogoljubow", "La apertura moderma", "Grabo", "1943", "", "Restos"));
        b.add(new Book("Diario 16", "Crónica del siglo XX T. I y II", "Plaza Janés", "1986", "Colecc.", "Restos"));
        b.add(new Book("Federación Española de Ajedrez", "Ajedrez español Revista mensual  marzo 1946",
                "Fed. Esp. Ajedrez", "1946", "", "Restos"));
        b.add(new Book("Federación Española de Ajedrez", "Ajedrez español Revista mensual  mayo 1946",
                "Fed. Esp. Ajedrez", "1946", "", "Restos"));
        b.add(new Book("M. Colmayo", "Temas de ajedrez", "Dossat, S.A.", "", "", "Restos"));
        b.add(new Book("J. B. Sánchez Pérez", "Diccionario ilustrado de ajedrez", "Cleto Vallinas", "1934", "",
                "Restos"));
        b.add(new Book("José Palucie y Lucerna", "Manual de ajedrez Estrategia (Parte 2ª)", "Elzeviriana", "1924", "",
                "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Atlas de Navarra", "Diafora, S.A.", "1977", "", "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Itinerarios por Navarra 1 Zona Media y Ribera", "Salvat, S.A.",
                "1978", "", "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Itinerarios por Navarra 2 Montaña Pamplona", "Salvat, S.A.",
                "1979", "", "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Navarra", "Salvat, S.A.", "1975", "", "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Navarra Historia y Arte Tierras y gentes", "CAN", "1984", "",
                "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "Navarra Guía y Mapa", "CAN", "1986", "", "Restos"));
        b.add(new Book("Caja de Ahorros de Navarra", "50 Mujeres de nuestro tiempo", "CAN", "1975", "", "Restos"));
        b.add(new Book("El país", "Guía de la naturaleza española", "El país", "1990", "", "Restos"));
        b.add(new Book("Tiempo", "Tiempo de hoy 10º Aniversario 1982/1992", "Tiempo", "1992", "", "Restos"));
        b.add(new Book("El mundo", "Cinco años que cambiaron el mundo 1989/1994", "El mundo", "1994", "", "Restos"));
        b.add(new Book("El mundo", "Anuario 1994", "El mundo", "1994", "", "Restos"));
        b.add(new Book("El país", "El libro de la sexualidad", "El país", "1992", "", "Restos"));
        b.add(new Book("El país", "Guía de la naturaleza española", "El país", "1990", "", "Restos"));
        b.add(new Book("El país", "Un siglo revolucionario 1900/1999", "El país", "1990", "", "Restos"));
        b.add(new Book("El país", "Crónica de la revolución 1789/1989 23 F", "El país", "1989", "", "Restos"));
        b.add(new Book("Diario 16", "Crónica de América", "Plaza Janés", "1991", "Colecc.", "Restos"));
        b.add(new Book("Diario 16", "Crónica de la Humanidad", "Plaza Janés", "1987", "Colecc.", "Restos"));
        b.add(new Book("G. M. Bruño", "Lengua francesa", "E. Maestre", "", "6ª ed. Ilust.", "Restos"));
        b.add(new Book("El País", "Historia y sociedad", "El País", "", "Colecc.", "Restos"));
        b.add(new Book("El País", "Arte y pensamiento 1977/1979", "El País", "1977", "Colecc.", "Restos"));
        b.add(new Book("El País", "Los 100 protagonistas del siglo XX", "El País", "", "Colecc.", "Restos"));
        b.add(new Book("El País", "Europa - América", "El País", "", "Colecc.", "Restos"));
        b.add(new Book("El País", "Atlas de España T. I y II", "El País/Aguilar", "", "Colecc.", "Restos"));
        b.add(new Book("El País", "La guerra de España 1936/1939", "El País", "1986", "Colecc.", "Restos"));
        b.add(new Book("El País", "Atlas histórico universal", "El País", "1995", "Colecc.", "Restos"));
        b.add(new Book("El País", "El País 20 años", "El País", "1996", "", "Restos"));
        b.add(new Book("Leonardo Expo 92", "La era de los descubrimientos", "El País", "1992", "", "Restos"));
        b.add(new Book("ABC", "Sonetos de amor F. García Lorca", "ABC", "1984", "Colecc.", "Restos"));
        b.add(new Book("ABC", "La gran aventura del arte moderno", "ABC", "1977", "Colecc.", "Restos"));
        b.add(new Book("José Mª Rodríguez Devesa", "Dº Penal español Parte general", "G. Carasa", "1981", "8ª ed.",
                "Restos"));
        b.add(new Book("F. Franco Salgado-Araujo", "Mis conversaciones privadas con Franco", "Planeta", "1976", "",
                "Restos"));
        b.add(new Book("Alejandro Herrero y Rubio", "Dº Internacional Público I", "Andrés M. S.A.", "1974", "4ª ed.",
                "Restos"));
        b.add(new Book("Armando Torrent", "Conceptos fundamentales del O. J. Romano", "Europa", "1973", "", "Restos"));
        b.add(new Book("Hugh Thomas", "La guerra civil española 1º y 2º Tomo", "Diario 16", "1976", "", "Restos"));
        b.add(new Book("Herbert Rutledge Sonthworth", "El mito de la cruzada de Franco", "Ruedo Ibérico", "1976", "",
                "Restos"));
        b.add(new Book("Dr. R. Rey Ardid", "Aperturas de ajedrez T. II Aperturas abiertas ex. esp. Fas.",
                "Lib. Gral. Zarag.", "1945", "", "Restos"));
        b.add(new Book("Dr. R. Rey Ardid", "Aperturas de ajedrez T. II  Aperturas abiertas ex. esp. Fas.",
                "Lib. Gral. Zarag.", "1945", "", "Restos"));
        b.add(new Book("A. Nimzowtsch", "La práctica de mi sistema T. 1º y 2º", "Grabo", "1941", "", "Restos"));
        b.add(new Book("A. Nimzowtsch", "Mi sistema V. 1, 2, 3, 4 y 5", "Grabo", "1943", "", "Restos"));
        b.add(new Book("Armando Torrent", "Dº Público Romano y sistema de fuentes I", "G. Grossi", "1979", "", "Restos"));
        b.add(new Book("Grupo Santander", "España desde el cielo", "Litifinter", "1999", "", "Restos"));
        b.add(new Book("Giménez Caballero", "España y Franco", "Los combatientes", "1938", "Fascículo 1", "Restos"));
        b.add(new Book("Giménez Caballero", "Camisa azul y boina colorada", "Los combatientes", "1939", "Fascículo 2",
                "Restos"));
        b.add(new Book("Giménez Caballero", "Triunfo del dos de mayo", "Los combatientes", "1939", "Fascículo 3",
                "Restos"));
        b.add(new Book("Armando Torrent", "Dº Público Romano y sistema de fuentes II", "G. Grossi", "1980", "",
                "Restos"));
    }

    private static void fillRepes_frances_italoport() {
        final List<Book> b = DB.get("Repes_frances_italoport");
        b.add(new Book("E. M. Cioran", "Syllogismes de l'amertume", "Gallimard", "1976", "", "Repes_frances_italoport"));
        b.add(new Book("Alain", "Éléments de philosophie", "Gallimard", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Mircea Eliade", "Aspects du mythe", "Gallimard", "1966", "", "Repes_frances_italoport"));
        b.add(new Book("André Malraux", "Le musée imaginaire", "Gallimard", "1965", "", "Repes_frances_italoport"));
        b.add(new Book("Kenneth Clark", "LeNu", "Livre de Poche", "1969", "", "Repes_frances_italoport"));
        b.add(new Book("Charles Werner", "La philosophie grecque", "Petite B. Payot", "1962", "",
                "Repes_frances_italoport"));
        b.add(new Book("K. M. Sen", "L'hindouisme", "Petite B. Payot", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Roland Villeneuve", "Gilles de Rays", "Éds. Denoël", "1955", "", "Repes_frances_italoport"));
        b.add(new Book("Wilhelm Reich", "Le meurtre du Christ", "Champ  Libre", "1971", "", "Repes_frances_italoport"));
        b.add(new Book("Dan Sperber", "Le symbolisme en général", "Hermann", "1974", "", "Repes_frances_italoport"));
        b.add(new Book("W. Reich", "Le combat sexuel de la jeunesse", "Gît-le-Coeur", "1971", "",
                "Repes_frances_italoport"));
        b.add(new Book("Planéte 35", "Juillet-Aout 1967", "Planéte", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Jean-Pierre Cotten", "Heidegger", "Seuil", "1974", "", "Repes_frances_italoport"));
        b.add(new Book("Francis Jeanson", "Sartre", "Seuil", "1977", "", "Repes_frances_italoport"));
        b.add(new Book("Seminario Xavier Zubiri", "Realitas I Trabajos 1972-1973", "Soc. Est. y P.", "1974", "",
                "Repes_frances_italoport"));
        b.add(new Book("Thomas Moro Simpson, Copilador", "Semántica filosófica: problemas y discusiones", "Siglo XXI",
                "1973", "", "Repes_frances_italoport"));
        b.add(new Book("Bennett Simon", "Razón y locura en la antigua Grecia", "Akal", "1984", "",
                "Repes_frances_italoport"));
        b.add(new Book("Carlos Beorlegui", "Lecturas de antropología filosófica", "DDB", "1988", "",
                "Repes_frances_italoport"));
        b.add(new Book("Erich Fromm", "La revolución de la esperanza", "FCE", "1970", "", "Repes_frances_italoport"));
        b.add(new Book("Francois Aubral-Xavier Delcourt", "Contra la nueva filosofía", "Premia Edit.", "1978", "",
                "Repes_frances_italoport"));
        b.add(new Book("Catherine Backés-Clement", "Lévi-Strauss", "Anagrama", "1974", "", "Repes_frances_italoport"));
        b.add(new Book("Miguel Morey", "El orden de los acontecimientos", "Península", "1988", "",
                "Repes_frances_italoport"));
        b.add(new Book("Josep Ramoneda", "Apología del presente", "Península", "1989", "", "Repes_frances_italoport"));
        b.add(new Book("F. M. Cornford", "La filosofía no escrita", "Ariel", "1974", "", "Repes_frances_italoport"));
        b.add(new Book("Catecismo holandés", "Nuevo catecismo para adultos", "Herder", "1969", "",
                "Repes_frances_italoport"));
        b.add(new Book("Isaac Asimov", "El universo", "Alianza", "1982", "8ª ed.", "Repes_frances_italoport"));
        b.add(new Book("Leszek Kolakovski", "El hombre sin alternativa", "Alianza", "1970", "",
                "Repes_frances_italoport"));
        b.add(new Book("G. W. F. Hegel", "Diferencia entre el sistema de Fª Fichte y el de Schelling", "Alianza Univ.",
                "1989", "", "Repes_frances_italoport"));
        b.add(new Book("Mijail Bajtin", "La cultura popular en la E. Media y en el Renacimiento", "Alianza Univ.",
                "1989", "", "Repes_frances_italoport"));
        b.add(new Book("Jean Baudrillard", "El intercambio simbólico y la muerte", "Monte Avila", "1980", "",
                "Repes_frances_italoport"));
        b.add(new Book("Theodor W. Adorno", "Kierkegard", "Monte Avila", "1969", "", "Repes_frances_italoport"));
        b.add(new Book("Theodor W. Adorno", "Intervenciones Nueve modelos de crítica", "Monte Avila", "1969", "",
                "Repes_frances_italoport"));
        b.add(new Book("E. M. Cioran", "La caida en el tiempo", "Monte Avila", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Martin Heidegger", "Ser, verdad y fundamento", "Monte Avila", "1968", "",
                "Repes_frances_italoport"));
        b.add(new Book("Martin Heidegger", "Identidad y diferencia", "Anthropos", "1988", "", "Repes_frances_italoport"));
        b.add(new Book("Jesús Conill", "El crepúsculo de la metafísica", "Anthropos", "1988", "",
                "Repes_frances_italoport"));
        b.add(new Book("Eugenio Garin", "La filosofía y las ciencias en el siglo XX", "Icaria", "1983", "",
                "Repes_frances_italoport"));
        b.add(new Book("Georges Bataille", "La parte maldita", "Icaria", "1987", "", "Repes_frances_italoport"));
        b.add(new Book("J. L. Austin", "Cómo hacer cosas con palabras", "Paidos", "1988", "2ª reimp.",
                "Repes_frances_italoport"));
        b.add(new Book("Descartes y Leibniz", "Sobre los principios de la filosofía", "Gredos", "1989", "",
                "Repes_frances_italoport"));
        b.add(new Book("Roger Verneaux", "Lecciones sobre el ateísmo contemporáneo", "Gredos", "1971", "",
                "Repes_frances_italoport"));
        b.add(new Book("Hans Küing", "La Iglesia", "Herder", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Carl Friedrich Geyer", "Teoría crítica", "Alfa", "1985", "", "Repes_frances_italoport"));
        b.add(new Book("José Luis López Aranguren", "Contracultura del catolicismo", "Planeta", "1978", "2ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Mircea Eliade", "Lo sagrado y lo profano", "Guadarrama", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Jean Guitton", "Aprender a vivir y a pensar", "Criterio", "1960", "", "Repes_frances_italoport"));
        b.add(new Book("Gilbert Durand", "La imaginación simbólica", "Amorrortu", "1968", "", "Repes_frances_italoport"));
        b.add(new Book("Santa Teresa de Jesús", "Obras completas", "BAC", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Ernst Cassirer", "Mito y lenguaje", "Nueva Visión", "1973", "", "Repes_frances_italoport"));
        b.add(new Book("Roger Verneaux", "Crítica de la \"Crítica de la razón pura\"", "Rialp", "1978", "",
                "Repes_frances_italoport"));
        b.add(new Book("José Alcina Franch", "Arte y antropología", "Alianza F.", "1988", "", "Repes_frances_italoport"));
        b.add(new Book("Santiago Sebastián", "Contrarreforma y barroco", "Alianza F.", "1985", "2ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Marcel Durliat", "Introducción al arte medieval en Occidente", "Cátedra", "1988", "",
                "Repes_frances_italoport"));
        b.add(new Book("John Willet", "El rompecabezas expresionista", "Guadarrama", "1970", "",
                "Repes_frances_italoport"));
        b.add(new Book("Heinrich Wölfflin", "Reflexiones sobre la historia del arte", "Península", "1988", "",
                "Repes_frances_italoport"));
        b.add(new Book("Herbert Haag", "El diablo, un fantasma", "Herder", "1973", "", "Repes_frances_italoport"));
        b.add(new Book("Efigenio Amezúa", "La erótica española en sus comienzos", "Fontanella", "1974", "",
                "Repes_frances_italoport"));
        b.add(new Book("Wolfgang Trilling", "Jesús y los problemas de su historicidad", "Herder", "1985", "",
                "Repes_frances_italoport"));
        b.add(new Book("Richard Elliot Friedman", "¿Quién escribió la Biblia?", "Mnez. Roca", "1989", "",
                "Repes_frances_italoport"));
        b.add(new Book("Albert Schweitzer", "El cristianismo y las religiones mundiales", "Siglo Veinte", "1964", "",
                "Repes_frances_italoport"));
        b.add(new Book("Charles Guignebert", "El cristianismo medieval y moderno", "FCE", "1969", "1ª reimp.",
                "Repes_frances_italoport"));
        b.add(new Book("Charles Guignebert", "El cristianismo antiguo", "FCE", "1975", "2ª reimp.",
                "Repes_frances_italoport"));
        b.add(new Book("Enrique Bonete Perales", "Aranguren: La ética entre la religión y la política", "Tecnos",
                "1989", "", "Repes_frances_italoport"));
        b.add(new Book("José Mª G. Gómez-Heras", "Teología protestante Sistema e historia", "B. A. C.", "1972", "",
                "Repes_frances_italoport"));
        b.add(new Book("Émile Bréhier", "Études de philosophie moderne", "P. U. F.", "1965", "",
                "Repes_frances_italoport"));
        b.add(new Book("Noël Mouloud", "La peinture et l'espace", "P. U. F.", "1964", "", "Repes_frances_italoport"));
        b.add(new Book("Jean Nogué", "Le systéme de l'actualité", "P. U. F.", "1947", "", "Repes_frances_italoport"));
        b.add(new Book("Michel Henry", "Philosophie et phénoménologie du corps", "P. U. F.", "1965", "",
                "Repes_frances_italoport"));
        b.add(new Book("Gilbert Durand", "L'imagination symbolique", "P. U. F.", "1964", "", "Repes_frances_italoport"));
        b.add(new Book("Jean Brun", "Platon et l'académie", "P. U. F.", "1960", "", "Repes_frances_italoport"));
        b.add(new Book("Denis Huisman", "L'esthétique", "P. U. F.", "1961", "4ª ed.", "Repes_frances_italoport"));
        b.add(new Book("Jean Beaufret", "Dialogue avec Heidegger Philosophie grecque", "Ed. de Minuit", "1973", "",
                "Repes_frances_italoport"));
        b.add(new Book("Martin Heidegger", "Nietzsche I", "Gallimard", "1984", "", "Repes_frances_italoport"));
        b.add(new Book("David Loth", "Pornografia e censura", "Sugar Editore", "1961", "", "Repes_frances_italoport"));
        b.add(new Book("Vatsyayana", "Il Kama Sutra", "E. A. R.", "1964", "", "Repes_frances_italoport"));
        b.add(new Book("John G. Bourke", "Escrementi e civiltá", "Guaraldi Editore", "1971", "",
                "Repes_frances_italoport"));
        b.add(new Book("Portugal", "As cen Melhores poesias (Líricas)", "", "1914", "", "Repes_frances_italoport"));
        b.add(new Book("Joao Fontalva", "Anedotas e ditos de espirito de toda a gente", "Simoes Lopes", "", "",
                "Repes_frances_italoport"));
        b.add(new Book("Joao Castro Nunes", "Algunos aspectos  o problemas da moderna lírica port.",
                "Inst. Est. Port.", "1947", "", "Repes_frances_italoport"));
        b.add(new Book("Luis de Camôes", "Os Lusiadas", "A. M. Pereira", "1971", "Piel", "Repes_frances_italoport"));
        b.add(new Book("NIKITA  KHRUCHTCHEV", "Estalina o Tirano 20º Congreso Partido  Comunista", "J. Cardoso",
                "1956", "", "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "A cruz de Pan Poemas", "Gráf. Sintrense", "1965", "Dedicado",
                "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "A historia duna noite Poemas", "Gráf. Sintrense", "1963", "Dedicado",
                "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "Fe pagá Poemas", "Gráf. Sintrense", "1961", "", "Repes_frances_italoport"));
        b.add(new Book("Plexus", "La revue qui décomplexe", "Planéte", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("J. C. Lannoy", "Nietzsche", "D. de Brouwer", "1952", "", "Repes_frances_italoport"));
        b.add(new Book("Marta Harnecker", "Los conceptos fundamentales del mat.  Histórico", "Siglo XXI", "1976", "",
                "Repes_frances_italoport"));
        b.add(new Book("Luis de Camôes", "               L  I  B  R  O  S    E  N     P  O  R  T  U  G  U  É  S",
                "A. M. Pereira", "1971", "Piel", "Repes_frances_italoport"));
        b.add(new Book("José Mª Alvarez de Eulate y P.", "Historia económica del Condado de castilla", "Junta Cª y L.",
                "1986", "", "Repes_frances_italoport"));
        b.add(new Book("Marianus Miller", "Angustia y esperanza", "Herder", "1956", "", "Repes_frances_italoport"));
        b.add(new Book("José Mª González Ruiz", "El cristianismo no es un humanismo", "Península", "1966", "",
                "Repes_frances_italoport"));
        b.add(new Book("VV AA", "Evolución, marxismo y cristianismo", "Plaza Janés", "1978", "",
                "Repes_frances_italoport"));
        b.add(new Book("Gianfranco Dalmaso", "El lugar de la ideología", "Zero Zyx", "1978", "",
                "Repes_frances_italoport"));
        b.add(new Book("EugenioTrias", "El último de los episodios nacionales", "FCE", "1989", "",
                "Repes_frances_italoport"));
        b.add(new Book("José Ferrater Mora", "El ser y la muerte", "Alianza", "1979", "", "Repes_frances_italoport"));
        b.add(new Book("José Ferrater Mora", "Fundamentos de Filosofía", "Alianza", "1987", "",
                "Repes_frances_italoport"));
        b.add(new Book("Marqués de Sade", "Cartas", "Rodolfo Alonso", "1969", "", "Repes_frances_italoport"));
        b.add(new Book("Ernesto de Martino", "Magia y civilización", "El Ateneo", "1965", "", "Repes_frances_italoport"));
        b.add(new Book("Sigmund Feud/E. T. Hoffmann", "Lo siniestro El hombre de la arena", "López Crespo", "1978", "",
                "Repes_frances_italoport"));
        b.add(new Book("C. G. Jung", "Recuerdos, sueños, pensamientos", "Seix Barral", "1981", "3ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Jules Lagneau", "Célébres leçons et fragments", "P. U. F.", "1964", "2ª ed. Rev.",
                "Repes_frances_italoport"));
        b.add(new Book("Victor Goldschmidt", "Les dialogues de Platon", "P. U. F.", "1963", "2ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Gaston Bachelard", "La poétique de l'espace", "P. U. F.", "1961", "3ª ed",
                "Repes_frances_italoport"));
        b.add(new Book("Léon Robin", "La théorie platonicienne de l'amour", "P. U. F.", "1964", "9ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Georges Mourélos", "L'épistémologie positive et la critique meyersonienne", "P. U. F.", "1962",
                "", "Repes_frances_italoport"));
        b.add(new Book("Jacques Jalabert", "L'un et le multiple De la critique á l'ontologie", "P. U. F.", "1955", "",
                "Repes_frances_italoport"));
        b.add(new Book("Beda Allemann", "Hölderlin et Heidegger", "P. U. F.", "1959", "", "Repes_frances_italoport"));
        b.add(new Book("Clément Rosset", "La philosophie tragique", "P. U. F.", "1960", "", "Repes_frances_italoport"));
        b.add(new Book("Alain Guy", "Ortega y Gasset, critique d'Aristote", "P. U. F.", "1963", "",
                "Repes_frances_italoport"));
        b.add(new Book("Léon Brunschvicg", "La philosophie de l'esprit", "P. U. F.", "1949", "",
                "Repes_frances_italoport"));
        b.add(new Book("Marie Delcourt", "Hermaphrodite Mythes et rites de la Bisexualité…", "P. U. F.", "1958", "",
                "Repes_frances_italoport"));
        b.add(new Book("Jean Piaget", "Sagesse et illusions de la philosophie", "P. U. F.", "1965", "",
                "Repes_frances_italoport"));
        b.add(new Book("Camille Schuwer", "Les deux sens de l'art", "P. U. F.", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("François Grégoire", "Grands problémes métaphysiques", "P. U. F.", "1960", "3ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Georges Mounin", "Poésie et Societé", "P. U. F.", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Paul Foulquié", "L'existentialisme", "P. U. F.", "1961", "11ª ed.", "Repes_frances_italoport"));
        b.add(new Book("Kostas Axelos", "Marx penseur de la technique", "Ed. de Minuit", "1961", "",
                "Repes_frances_italoport"));
        b.add(new Book("Kostas Axelos", "Vers La pensée planétaire", "Ed. de Minuit", "1964", "",
                "Repes_frances_italoport"));
        b.add(new Book("Kostas Axelos", "Héraclite et la philosophie", "Ed. de Minuit", "1962", "",
                "Repes_frances_italoport"));
        b.add(new Book("Jean Beaufret", "Dialogue avec Heidegger Philosophie moderne", "Ed. de Minuit", "1973", "",
                "Repes_frances_italoport"));
        b.add(new Book("Jean Beaufret", "Dialogue avec Heidegger Approche de Heidegger", "Ed. de Minuit", "1974", "",
                "Repes_frances_italoport"));
        b.add(new Book("Jean Beaufret", "Dialogue avec Heidegger Le chemin de Heidegger", "Ed. de Minuit", "1985", "",
                "Repes_frances_italoport"));
        b.add(new Book("Martin Heidegger", "Nietzsche II", "Gallimard", "1985", "", "Repes_frances_italoport"));
        b.add(new Book("Édouard Gaéde", "Nietzsche et Valéry", "Gallimard", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Lucien Goldmann", "Le dieu caché", "Gallimard", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Claude Lévi-Strauss", "Textes", "Gallimard", "1979", "", "Repes_frances_italoport"));
        b.add(new Book("Max-Pol Fouchet", "L'art amoureux des indes", "Gallimard", "1967", "",
                "Repes_frances_italoport"));
        b.add(new Book("Martin Heidegger", "Approche de Hölderlin", "Gallimard", "1962", "", "Repes_frances_italoport"));
        b.add(new Book("Bruno Walter", "Gustav Mahler", "Livre de Poche", "1969", "", "Repes_frances_italoport"));
        b.add(new Book("Choderlos Laclos", "Les liaisons dangereuses Texte integral", "Livre de Poche", "1952", "",
                "Repes_frances_italoport"));
        b.add(new Book("Baudelaire", "Les Fleurs du Mal Texte integral", "Livre de Poche", "1961", "",
                "Repes_frances_italoport"));
        b.add(new Book("Guillaume Apollinaire", "Poémes", "Livre de Poche", "1956", "", "Repes_frances_italoport"));
        b.add(new Book("Cahier de L'herne", "Heidegger", "Livre de Poche", "1983", "", "Repes_frances_italoport"));
        b.add(new Book("Anna-Teresa Tymieniecka", "Essence et existence", "Aubier", "1957", "",
                "Repes_frances_italoport"));
        b.add(new Book("Réjean Robidoux", "Roger Martin du Gard et la religion", "Aubier", "1964", "",
                "Repes_frances_italoport"));
        b.add(new Book("Jacques Lavigne", "L'inquiétude humaine", "Aubier", "1953", "", "Repes_frances_italoport"));
        b.add(new Book("Champs Flammarion", "Etats généraux de la philosophie (16/17-6-1979)", "Flammarion", "1979",
                "", "Repes_frances_italoport"));
        b.add(new Book("René Huyghe", "Les puissances de l'image", "Flammarion", "1965", "", "Repes_frances_italoport"));
        b.add(new Book("Ernest Renan", "Souvenirs d'enfance et de jeunesse", "Flammarion", "1973", "",
                "Repes_frances_italoport"));
        b.add(new Book("D. A. F. de Sade", "Les crimes de l'amour Tome I, II et III", "J. J. Pauvert", "1961", "",
                "Repes_frances_italoport"));
        b.add(new Book("D. A. F. de Sade", "La philosophie dans le boudoir (1795)", "J. J. Pauvert", "1954", "",
                "Repes_frances_italoport"));
        b.add(new Book("Albert Béguin", "Pascal par lui-même", "Ed. du Seuil", "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Jean-Marie Paupert, traduction", "Contrôle des naissances et theologie", "Ed. du Seuil",
                "1967", "", "Repes_frances_italoport"));
        b.add(new Book("Nelly Viallaneix", "Écoute, Kierkegaard Tome I y II", "Ed. du Cerf", "1979", "",
                "Repes_frances_italoport"));
        b.add(new Book("Vatsyayana Notes de Gilles Delfos", "Kama-Soutra Précédé dún texte du M. de Sade", "PIC",
                "1952", "", "Repes_frances_italoport"));
        b.add(new Book("Georges Mongrédien, édition par", "Mémoires de L'abbé de Choisy", "Mercure de F.", "1979", "",
                "Repes_frances_italoport"));
        b.add(new Book("Châtelet-Derrida-Foucault-Lyotard-Serres", "Politiques de la philosophie", "B. Grasset",
                "1976", "", "Repes_frances_italoport"));
        b.add(new Book("Léon Robin", "La pensée grecque et les origines de l'esprit sc.", "Albin Michel", "1963", "",
                "Repes_frances_italoport"));
        b.add(new Book("Direction d'Anne Henry", "Schopenhauer et la creation litteraire en Europe", "Méridiens K.",
                "1989", "", "Repes_frances_italoport"));
        b.add(new Book("Georges Matoré", "L'espace humain", "A. G. Nizet", "1976", "", "Repes_frances_italoport"));
        b.add(new Book("René Pavans", "Essai pour une théorie de la mort", "L'arche", "1952", "",
                "Repes_frances_italoport"));
        b.add(new Book("Raymond de Becker", "La vie tragique de Freud", "Planéte", "1967", "",
                "Repes_frances_italoport"));
        b.add(new Book("Morvan Lebesque", "Camus", "Seuil", "1977", "", "Repes_frances_italoport"));
        b.add(new Book("Marguerite Grimault", "Kierkegaard par lui-même", "Seuil", "1962", "",
                "Repes_frances_italoport"));
        b.add(new Book("Revue Mensuelle Dtor. J. P. Sartre", "Les Temps Modernes Nº spec. M. Merleau-Ponty", "T M",
                "1961", "", "Repes_frances_italoport"));
        b.add(new Book("G. De Champeaux - S. Sterchx", "Le monde des Symboles", "Zodiaque", "1972", "2ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Francesco Saba Sardi", "Sesso e mito", "Sugar Editore", "1962", "3ª ed.",
                "Repes_frances_italoport"));
        b.add(new Book("Pietro Aretino", "I capricciosi ragionamenti", "E. A. R.", "1961", "",
                "Repes_frances_italoport"));
        b.add(new Book("Albin Lesky", "Storia della Letteratura Greca Volume I, II e III", "Il Saggiatore", "1962", "",
                "Repes_frances_italoport"));
        b.add(new Book("James Cleugh", "La vita sessuale nel medioevo", "Sugar Editore", "1963", "",
                "Repes_frances_italoport"));
        b.add(new Book("H. T. F. Rhodes", "La messa nera", "Sugar Editore", "1962", "2ª ed.", "Repes_frances_italoport"));
        b.add(new Book("Joao Fontalva", "Anedotas e ditos de espirito de toda a gente", "Simoes Lopes", "", "",
                "Repes_frances_italoport"));
        b.add(new Book("NIKITA  KHRUCHTCHEV", "Estalina o Tirano 20º Congreso Partido  Comunista", "J. Cardoso",
                "1956", "", "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "A cruz de Pan Poemas", "Gráf. Sintrense", "1965", "Dedicado",
                "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "A historia duna noite Poemas", "Gráf. Sintrense", "1963", "Dedicado",
                "Repes_frances_italoport"));
        b.add(new Book("Manuela Amaral", "Fe pagá Poemas", "Gráf. Sintrense", "1961", "", "Repes_frances_italoport"));
        b.add(new Book("Joao Castro Nunes", "Algunos aspectos  o problemas da moderna lírica port.",
                "Inst. Est. Port.", "1947", "", "Repes_frances_italoport"));
        b.add(new Book("Luis de Camôes", "Os Lusiadas", "A. M. Pereira", "1971", "Piel", "Repes_frances_italoport"));
        b.add(new Book("Portugal", "As cen Melhores poesias (Líricas)", "", "1914", "", "Repes_frances_italoport"));
    }

    private static void fillPsicologiaymedicina() {
        final List<Book> b = DB.get("Psicologiaymedicina");
        b.add(new Book("Olegario Ortiz Manchado", "Gnóstica de la fiebre", "Sever-Cuesta", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Oliveros F. Otero", "Educación y manipulación", "Eunsa", "1981", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Bruno Bettelheim", "Educación y vida moderna", "Crítica", "1989", "", "Psicologiaymedicina"));
        b.add(new Book("", "", "", "", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Pedro Alvarez-Quiñones", "Amiloidosis cutáneas primitivas", "Sever-Cuesta", "1977", "",
                "Psicologiaymedicina"));
        b.add(new Book("Davide López", "Análisis del carácter y emancipación", "A. Corazón", "1971", "",
                "Psicologiaymedicina"));
        b.add(new Book("A. S. Neill", "Summerhil (La educación de los niños)", "FCE", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("E. Noguera y Luis Huerta", "Genética, eugenesia y pedagogía sexual T. I", "Morata", "1934", "",
                "Psicologiaymedicina"));
        b.add(new Book("VV AA", "El libro de los tests", "Quorum", "1986", "", "Psicologiaymedicina"));
        b.add(new Book("Francisco Muñoz Martín", "Estructura de la personalidad", "Quorum", "1986", "",
                "Psicologiaymedicina"));
        b.add(new Book("Sigmund Freud", "Toten y Tabú", "Alianza", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Actas Luso-españs. de Neur. y  Psiq.", "Simposio sobre tratamiento farmac. de la angustia",
                "Paz Montalvo", "1961", "2 ejemplares", "Psicologiaymedicina"));
        b.add(new Book("Annie Reich", "Si tu hijo te pregunta", "Anagrama", "1976", "", "Psicologiaymedicina"));
        b.add(new Book("Director Dr. Juan Rof Carballo", "Formulario Clínico \"Labor\"", "Labor, S.A.", "1958",
                "4ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Teofrasto", "Los caracteres morales", "Inst. Es. Polit.", "1956", " .", "Psicologiaymedicina"));
        b.add(new Book("Caleb Gattegno", "Introducción a la psicología de la afectividad", "Espasa Calpe", "1962", "",
                "Psicologiaymedicina"));
        b.add(new Book("Eliane Amado Levy-Valensi", "El diálogo psicoanalítico", "F. C. E.", "1965", "",
                "Psicologiaymedicina"));
        b.add(new Book("Igor A. Caruso", "El psicoanálisis lenguaje ambiguo", "F. C. E.", "1966", "",
                "Psicologiaymedicina"));
        b.add(new Book("Rollo May", "Amor y voluntad", "Gedisa", "1984", "", "Psicologiaymedicina"));
        b.add(new Book("Dra.J. Jacobi", "La psicología de C. G. Jung", "Espasa Calpe", "1947", "",
                "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Arquetipos y sentido", "Univ Deusto", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "La psique y sus problemas actuales", "Poblet", "1935", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Tipos psicológicos", "Sur", "1936", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Conflictos del alma infantil", "Paidos", "1945", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Psicología y alquimia", "S. Rueda", "1957", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Simbología del espíritu", "F. C. E.", "1962", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Realidad del alma", "Losada, S. A.", "1946", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "El yo y el inconsciente", "L. Miracle", "1964", "4ª ed.", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Paracélsica", "Sur", "1966", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Presente y futuro", "Sur", "1963", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Sobre  cosas que se ven en el cielo", "Sur", "1961", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Teoría del psicoanálisis", "Apolo", "1937", "2 ed.", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung - R. Wilhelm", "El secreto de la flor de oro", "Paidos", "1955", "",
                "Psicologiaymedicina"));
        b.add(new Book("W. J. M. Spiegelman-M. Miyuki", "Budismo y psicología junguiana", "Indigo", "1988", "",
                "Psicologiaymedicina"));
        b.add(new Book("Richard Evans", "Conversaciones con Jung", "Guadarrama", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Alan Watts", "Psicoterapia del este, psicoterapia  del oeste", "Kairos", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("R. Merle y R. de Saussre", "Psicoanálisis de Hitler", "La Pleyade", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Friederich Hacker", "Agresión", "Grijalbo", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Viktor E. Frankl", "La psicoterapia al alcance de todos", "Herder", "1983", "",
                "Psicologiaymedicina"));
        b.add(new Book("E. Fuller Torrey", "La muerte de la psiquiatría", "Mnez. Roca", "1980", "",
                "Psicologiaymedicina"));
        b.add(new Book("Viktor E. Frankl", "La idea psicológica del hombre", "Rialp", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Peter Reich", "Libro de ensueños", "Laertes", "1979", "", "Psicologiaymedicina"));
        b.add(new Book("Cristian Delacampagne", "Antipsiquiatría", "Madrágora", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Celestin Freinet", "Ensayo de psicología sensitiva", "Villalar", "1977", "",
                "Psicologiaymedicina"));
        b.add(new Book("H. Heyward y M. Varigas", "Antipsiquiatría", "Fundamentos", "1973", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("John Macmurray", "Personas en relación", "Barral", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Anne Claucier", "Psicoanálisis Literatura crítica", "Cátedra", "1976", "",
                "Psicologiaymedicina"));
        b.add(new Book("David Cohen", "El lenguaje secreto de la mente", "C. Lectores", "1996", "",
                "Psicologiaymedicina"));
        b.add(new Book("Victor E. Von Gebsattel", "Imago hominis", "Gredos", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("E. Kretschmer", "Constitución y carácter", "Labor, S. A.", "1947", "", "Psicologiaymedicina"));
        b.add(new Book("Alfredo Adler", "La psicología individual y la escuela", "Revista Pedag.", "1930", "",
                "Psicologiaymedicina"));
        b.add(new Book("H. F. Hoffmann", "Teoría de los estratos psíquicos", "Morata", "1946", "",
                "Psicologiaymedicina"));
        b.add(new Book("Stanley W. Jackson", "Hª de la melancolía y la depresión", "Turner", "1989", "",
                "Psicologiaymedicina"));
        b.add(new Book("Erik H. Erikson", "La adultez", "F. C. E.", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("León Grinberg", "Culpa y depresión", "Alianza edit.", "1988", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Paul Guillaume", "Manual de Psicología", "Paidos", "1959", "", "Psicologiaymedicina"));
        b.add(new Book("Oscar Massotta", "Introducción a la lectura de J. Lacan", "Proteo", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("Anika Rifflet-Lemaire", "Lacan (La gaya ciencia)", "Edhasa", "1979", "", "Psicologiaymedicina"));
        b.add(new Book("El seminario de J. Lacan", "¿Ornicar? Clínica psicoanalítica y psiquiátrica", "Petrel, S. A.",
                "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Jorge L. Tozón", "Introd. a la epist. de la psicopatología y la psiquiatría", "Ariel", "1969",
                "", "Psicologiaymedicina"));
        b.add(new Book("Rudolf Brun", "Teoría general de la neurosis", "Siglo XXI", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("E. López Rupérez", "Freud, Darwin, Einstein…", "Mar. Car. S. A.", "1983", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jaime Motlis", "El dado de la vejez y sus seis caras", "Altalena", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book(" Georges Minois", "Historia de la vejez", "Nerea", "1989", "", "Psicologiaymedicina"));
        b.add(new Book("Charles Bandouin", "La fuerza en nosotros", "Victoria", "1946", "", "Psicologiaymedicina"));
        b.add(new Book("Fritz Kunkel", "Introducción a la caracterología", "Victoria", "1945", "",
                "Psicologiaymedicina"));
        b.add(new Book("M. Bunge y R. Ardila", "Filosofía de la psicología", "Ariel", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Ken Wilber", "El proyecto Atman", "Kairos", "1989", "", "Psicologiaymedicina"));
        b.add(new Book("Agnes Heller", "Teoría de los sentimientos", "Fontamara", "1985", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Rodrigo Gutiérrez Córcoles", "La persona sentimental", "Dip. Albacete", "1988", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Rafael de Vega y Fdez. Crespo", "Perfil moral del cirujano", "Sever-Cuesta", "1973",
                "Dedicado", "Psicologiaymedicina"));
        b.add(new Book("Salomón  Resnik", "Persona y psicosis", "Paidos", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Formaciones de lo  inconsciente", "Paidos", "1982", "1ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("James O. Whittaker", "Psicología", "Interamericana", "1977", "3ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Prof. Dr. Kurt Schneider", "Conferencias psiquiátricas para médicos generales", "Madrid", "",
                "2ª impres.", "Psicologiaymedicina"));
        b.add(new Book("F. Schneider", "La educación de si mismo", "Herder", "1962", "", "Psicologiaymedicina"));
        b.add(new Book("Alfred Adler", "Práctica y teoría de la psicología del individuo", "Paidos", "1958", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Ralph Piddington", "Psicología de la risa", "La pleyade", "1961", "Intonso",
                "Psicologiaymedicina"));
        b.add(new Book("Academia de Alumnos Internos", "Lecciones de bioética", "Univ. Vallad.", "1987", "Dedicado",
                "Psicologiaymedicina"));
        b.add(new Book("Facultad de Medicina de Valladolid", "Clínica.  Homenaje al Dr. Bañuelos", "Fac. Med. Va.",
                "1980", "Dedicado", "Psicologiaymedicina"));
        b.add(new Book("Olegario Ortiz Manchado", "La medicina de nuestro tiempo", "Sever-Cuesta", "1975", "Dedicado",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. VI", "E. Cient. Méd.", "1948", "",
                "Psicologiaymedicina"));
        b.add(new Book("José Bergua", "Psicología del pueblo español", "Bergua", "1934", "Intonso",
                "Psicologiaymedicina"));
        b.add(new Book("C. Castilla del Pino", "Un estudio sobre la depresión", "Península", "1981", "8ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Alfred M. Freedman y otros", "Tratado de Psiquiatría T.  II", "Salvat", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("E. Noguera y Luis Huerta", "Genética, eugenesia y pedagogía sexual T.  II", "Morata", "1934",
                "", "Psicologiaymedicina"));
        b.add(new Book("Bruno Bettelheim", "Psicoanálisis de los cuentos de hadas", "Crítica", "1980", "4ª ed",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Violencia y ternura", "Espasa Calpe", "1987", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Recuerdos, sueños, pensamientos", "Seix Barral", "1966", "2 ejemplares",
                "Psicologiaymedicina"));
        b.add(new Book("S. Freud E. T. A. Hoffmann", "Lo siniestro El hombre de la arena", "Calamus Scri.", "1979",
                "2 ejemplares", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "La revolución de la esperanza", "F. C. E.", "1982", "2 ejemplares",
                "Psicologiaymedicina"));
        b.add(new Book("Bruno Bettelheim", "Psicoanálisis de los cuentos de hadas", "Grijalbo", "1977", "2 ejemplares",
                "Psicologiaymedicina"));
        b.add(new Book("Hans Selye", "La tensión en la vida (El estress)", "Fabril, S. A.", "1960", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jerome Bruner", "Realidad mental y mundos posibles", "Edisa", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Gilbert Ryle", "El concepto de lo mental", "Paidos", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Aida Aisenson Kogan", "El yo y el si-mismo", "Amorrortu", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Ernst Aeppli", "Personalidad", "L.Miracle", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Didier Anzieu  y otros", "Psicoanálisis y lenguaje", "Kapelusz", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jacques Van Rillaer", "Las ilusiones del psicoanálisis", "Ariel", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book("G. R. Heyer", "El campo de fuerzas del alma", "Labor, S. A.", "1961", "", "Psicologiaymedicina"));
        b.add(new Book("Luis Cencillo", "El inconsciente", "Marova", "1971", "", "Psicologiaymedicina"));
        b.add(new Book("Michael Schnaider", "Neurosis y lucha de clases", "Siglo XXI", "1979", "",
                "Psicologiaymedicina"));
        b.add(new Book("Gustav Hans Graber", "Psicología del hombre", "Aguilar", "1962", "", "Psicologiaymedicina"));
        b.add(new Book("Karen Horney", "Psicología femenina", "Psique", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Oscar Masott", "Lecciones de introducción al Psicoanálisis Vol. I", "Granica", "1977", "",
                "Psicologiaymedicina"));
        b.add(new Book("Walderedo I. de Oliveira", "El matricidio en la fantasía", "Nova", "1957", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jonathan Miller", "Freud", "Destino", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("Ronald W. Clark", "Freud El hombre y su causa", "Planeta", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("Catherine Millot", "Freud antipedagogo", "Paidos", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Roger Dadoun", "Freud", "Argos Vergara", "1984", "", "Psicologiaymedicina"));
        b.add(new Book("J. J. López Ibor", "Freud y sus ocultos dioses", "Planeta", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("T. W. Adorno y W. Dirks", "Freud en la actualidad", "Barral", "1971", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Paul Sartre", "Freud Un guión", "Alianza", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("Paul A. Robinson", "La izquierda freudiana", "Granica", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Laplanche y otros", "El insconsciente freudiano y el psicoa. francés contemp.",
                "Nueva visión", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. S. Nacht", "Curar con Freud", "Fundamentos", "1972", "", "Psicologiaymedicina"));
        b.add(new Book("Lou Andreas Salomé", "Aprendiendo con Freud", "Laertes", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("J B. Fages", "Hª del psicoanálisis después de Freud", "Mnez. Roca", "1979", "",
                "Psicologiaymedicina"));
        b.add(new Book("Marthe Robert", "Acerca de Kafka Acerca de Freud", "Anagrama", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("Debray-Ritzen", "La escolástica freudiana", "Guadarrama", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("S. Freud", "El delirio y los sueños de Gradva de W. Jensen", "Grijalbo", "1977", "",
                "Psicologiaymedicina"));
        b.add(new Book("Albert Plé", "Freud y la religión", "BAC", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("Paul Ricoeur", "Freud: una interpretación de la cultura", "Siglo XXI", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "Anatomía de la destructividad humana", "Siglo XXI", "1982", "8ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "Psicoanálisis de la sociedad contemporánea", "F. C. E.", "1960", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm y otros", "Humanismo socialista", "Paidos", "1968", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "Psicoanálisis y religión", "Psique", "1963", "", "Psicologiaymedicina"));
        b.add(new Book("Marcusse, Fromm y otros", "Psicoanálisis e historia", "Papiro", "1971", "",
                "Psicologiaymedicina"));
        b.add(new Book("R. G. Mandolino Guardo", "De Freud a Fromm", "Ciordia", "1969", "3ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault y otro", "Theatrum Philosofhicum", "Anagrama", "1972", "",
                "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "La arqueología del saber", "Siglo XXI", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "El pensamiento del afuera", "Pre-textos", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Saber y verdad", "La piqueta", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Enfermedad mental y personalidad (dos versiones)", "Paidos", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Un diálogo sobre el poder", "Alianza", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Miguel Morey (Edi.)", "Sexo, poder, verdad. Conversaciones con M. Foucault", "Materiales",
                "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Maite Larrauri", "Conocer Foucault y su obra", "Dopesa", "1980", "", "Psicologiaymedicina"));
        b.add(new Book("Varios", "Análisis de M.  Foucault", "T. Contempor.", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Mauricio Jalóm", "El laboratorio de Foucault", "Anthropos", "1994", "", "Psicologiaymedicina"));
        b.add(new Book("David Macey", "Las vidas de Michel  Foucault", "Cátedra", "1995", "", "Psicologiaymedicina"));
        b.add(new Book("A. Serrano González", "Mochel Foucault", "Univ. Zaragoza", "1987", "", "Psicologiaymedicina"));
        b.add(new Book("Marc Richelle y Remy Droz", "Manual de Psicología", "Herder", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Sandor Ferenczi", "Psicoanálisis I, II y III", "Espasa-Calpe", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Marc Oraison", "El azar y la vida", "Espasa-Calpe", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("José M. Gondra", "La psicología moderna", "DDB", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("John D. Krumboetz y C. Thorensen", "Métodos de consejo psicológico", "DDB", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Albert Ellis y R. Grieger", "Manual de terapia racional-emotiva", "DDB", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("José Basabe Barcala", "Cuestiones de psiquiatría I", "DDB", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Teoría y práctica psicosomática", "DDB", "1984", "", "Psicologiaymedicina"));
        b.add(new Book("Rof Carballo y otros", "El cansancio de la vida", "Karpos, S. A.", "1975", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "El hombre a prueba", "Paz Montalvo", "1951", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Gustav R. Heyer", "Psicoterapia y práctica", "Joaquin Gil", "1937", "   ",
                "Psicologiaymedicina"));
        b.add(new Book("K. Schneider", "Las personalidades psicopáticas", "Morata", "1961", "9ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Charles Odier", "La angustia y el pensamiento mágico", "F.C.E.", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Alfred Adler", "El carácter neurótico", "Paidos", "1959", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Paul Matussek", "Fundamentos doctrinales de la psicoterapia", "Paz Montalvo", "1953", "",
                "Psicologiaymedicina"));
        b.add(new Book("Químicos Unidos, S. A.", "Las fronteras psíquicas de lo patológico", "Fargraf", "1975", "",
                "Psicologiaymedicina"));
        b.add(new Book("Alan Moorehead", "Darwin La expedición en el beagle", "Serbal", "1980", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dieter WYSS", "Las escuelas de psicología profunda", "Gredos", "1975", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Stephen Krauss", "Enciclopedia de psicología médica", "El Ateneo", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("J. Laplanche J. B. Pontalis", "Diccionario de psicoanálisis", "Labor, S. A.", "1971", "",
                "Psicologiaymedicina"));
        b.add(new Book("Norman Cameron", "Desarrollo y psicopatología de la personalidad", "Trillas", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Francisco Arasa", "¿A dónde va el hombre?", "Dossat, S. A.", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Philipp Lersch", "La estructura de la personalidad T I", "Scientia", "1958", "",
                "Psicologiaymedicina"));
        b.add(new Book("Paul Helwig", "Caracterología", "Herder", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("A. Jores", "El individuo enfermo", "Scientia", "1961", "", "Psicologiaymedicina"));
        b.add(new Book("Igor A. Caruso", "Análisis psíquico y síntesis existencial", "Herder", "1958", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Theo Herrmann y otros", "Conceptos fundamentales de psicología", "Herder", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Carls R. Rogers", "El proceso de convertirse en persona", "Paidos", "1982", "3ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("Karl Jaspers", "Escritos psicopatológicos", "Gredos", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Victor Von Weizsäcker", "El hombre enfermo", "L. Miracle", "1956", "", "Psicologiaymedicina"));
        b.add(new Book("Willis Helepach", "Geopsique", "Espasa-Calpe", "1940", "", "Psicologiaymedicina"));
        b.add(new Book("Alfred Adler", "Conocimiento del hombre", "Espasa-Calpe", "1940", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("David Kayz", "Psicología de la forma", "Espasa-Calpe", "1945", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Smith Ely Jelliffe", "Técnica del psicoanálisis", "B. Nueva", "1929", "",
                "Psicologiaymedicina"));
        b.add(new Book("Bruno Cassinelli", "Historia de la locura", "J. Gil", "1942", "", "Psicologiaymedicina"));
        b.add(new Book("Jaime Erasmo", "La locura y la lógica", "Lauro", "1951", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Oswald Bumke", "El psicoanálisis y sus satélites", "Aymá", "1944", "",
                "Psicologiaymedicina"));
        b.add(new Book("Kurt Goldstein", "La naturaleza humana a la luz  de la psicopatología", "Paidos", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Luis Martín Santos", "Libertad, temporalidad … en el psicoanálisis ex.", "Seix Barral", "1964",
                "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Guy Delpierre", "La depresión nerviosa", "Fax", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Remo Cantoni", "El hombre etnocéntrico", "Guadarrama", "1972", "", "Psicologiaymedicina"));
        b.add(new Book("J. J. López Ibor y J.J. L. I. Aliño", "El cuerpo y la corporeidad", "Gredos", "1974", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Auguste Marie", "La crisis del psicoanálisis", "Argis", "1930", "", "Psicologiaymedicina"));
        b.add(new Book("Willim S. Sahakian", "Historia y sistemas de la psicología", "Tecnos", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Alfred M. Freedman y otros", "Tratado de Psiquiatría T. I", "Salvat", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan A. Portuondo", "El rorschach psicoanalítico", "B. Nueva", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Henry Ey y otros", "Tratado de psiquiatría", "Toray-Masson", "1965", "1ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("Benjamin B. Wolman", "Teorías y sistemas contemp. en psicología", "Mnez. Roca", "1979", "",
                "Psicologiaymedicina"));
        b.add(new Book("V. E. Freiherr Von G.", "Antropología médica", "Rialp, S. A.", "1966", "",
                "Psicologiaymedicina"));
        b.add(new Book("Franz Büchner", "Cuerpo y espíritu en la medicina actual", "Rialp, S. A.", "1969", "",
                "Psicologiaymedicina"));
        b.add(new Book("J. Crouch y R. McClintic", "Anatomía humana", "Limusa", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Varios autores", "Patología General T. I y II", "Toray, S. A.", "1970", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("R. D. Adams y M. Victor", "Principios de neurología", "Reverté, S. A.", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Prof. Feer_Kleinschmidt", "Tratado de enfermedades de los niños", "Manuel Marín", "1952", "",
                "Psicologiaymedicina"));
        b.add(new Book("M. Usandizaga", "Hª de la obstetricia y de la ginecología en España", "Aldus, S. A.", "1944",
                "", "Psicologiaymedicina"));
        b.add(new Book("Victor Heiser", "La odisea de un médico", "J. Gil", "1941", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Bernard", "Grandeza y tentaciones de la medicina", "Noguer", "1974", "",
                "Psicologiaymedicina"));
        b.add(new Book("A. Balcells", "La clínica y el laboratorio", "Marín, S. A.", "1973", "9ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("A. Balcells", "La clínica y el laboratorio", "Marín, S. A.", "1981", "12ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Círculo de Lectores", "Medicina y salud De la A a la Z", "C. Lectores", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book("A. Faran y H. Schaffer", "La psicol. profunda desde sus oríg. a nuestros días", "Espasa Calpe",
                "1963", "", "Psicologiaymedicina"));
        b.add(new Book("Henry Bremond", "NEWMAN", "DDB", "1947", "", "Psicologiaymedicina"));
        b.add(new Book("Octave Mannoni", "Un comienzo que no termina", "Paidos", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("José Mª López Sánchez", "Resúmenes de Patología Psicosomática", "C. E. P.", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book("Paul Tabori", "El arte de la locura", "L. de Caralt", "1964", "", "Psicologiaymedicina"));
        b.add(new Book("Varios autores", "Psicología, sociología y psiquiatría", "Teide", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Samuel J. Warner", "Autorealización y autodestrucción", "Kairos", "1968", "",
                "Psicologiaymedicina"));
        b.add(new Book("Pedro F. Villamarzo", "Psicoanálisis de la exp. ético-religiosa", "Marova", "1978", "",
                "Psicologiaymedicina"));
        b.add(new Book("Victor Gómez Pin", "El reino de las leyes. Orden Freudiano", "Siglo XXI", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Antoine Vergote", "Psicología religiosa", "Taurus", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Salvador Mascarrell (Coord.)", "Aproximación a la histeria", "E M", "1980", "",
                "Psicologiaymedicina"));
        b.add(new Book("Hubert Tellenbach", "Perturbaciones psíquicas", "FCE", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("Ernest Hartmann", "La pesadilla", "Granica", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("George Politzer", "Crítica de los fundamentos de la psicología", "Dávalos", "1964", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Héctor O. Fontanarrossa", "Introducción a la psicoterapia", "Celcius", "1967", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jan Ehreuwald", "Telepatía y relaciones interpersonales", "Paidos", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Varios autores", "Marxismo, psicoanálisis y sexpol I y II", "Granica", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Guillermo Rendueles Olmedo", "El manuscrito encontrado en Ciempozuelos", "Endymión", "1989",
                "", "Psicologiaymedicina"));
        b.add(new Book("David Ingleby, ed.", "Psiquiatría crítica", "Crítica", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Paul Tournier", "Técnica psicoanalítica y fe religiosa", "La aurora", "1969", "",
                "Psicologiaymedicina"));
        b.add(new Book("H. Rohracher", "Introducción a la caracterología", "Losada, S A.", "1945", "",
                "Psicologiaymedicina"));
        b.add(new Book("Ginette Raimbault", "El psicoanálisis y las fronteras  de la medicina", "Ariel", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book("Varios autores", "Psicoanálisis y semiótica", "Gedisa", "1980", "", "Psicologiaymedicina"));
        b.add(new Book("Hendrik M. Ruitehbeer", "Psicoanálisis y filosofía existencial", "Gredos", "1972", "",
                "Psicologiaymedicina"));
        b.add(new Book("L. Cencillo", "Libido, terapia y ética", "Verbo Divino", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Enrique Salgado", "Biografía del miedo", "Plaza Janés", "1964", "", "Psicologiaymedicina"));
        b.add(new Book("Roger Bastide", "Sociología de las enfermedades mentales", "Siglo XXI", "1967", "",
                "Psicologiaymedicina"));
        b.add(new Book("Igor A. Caruso", "Psicoanálisis para la persona", "Seix Barral", "1965", "",
                "Psicologiaymedicina"));
        b.add(new Book("A. Palaino Lorente", "La metapsicología freudiana", "Dossat", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("M. Oraison", "Psicología y sentido del pecado", "Marova", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Serge Leclaire", "Psicoanalizar", "Siglo XXI", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("H. J. Eysenck", "Psicología: hechos y palabrería", "Alianza", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("J. J. López Ibor", "La agonía del psicoanálisis", "Austral", "1961", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Ann Faraday", "El poder de los sueños", "Guadarrama", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("W. Grossouwa y otros", "Estudios sobre la angustia", "Rialp", "1962", "", "Psicologiaymedicina"));
        b.add(new Book("Paulo Freire y otros", "Educación liberadora", "Zero", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("F. L. Mueller", "La psicología contemporánea", "FC E", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Hugo Acevedo (Traductor)", "Cuadernos de Psicología (Revista)", "Caudex", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Walter Braütigam", "Reacciones Neurosis Psicopatías", "Labor, S. A.", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Ignace Lepp", "Psicoanálisis de la muerte", "C. Lohlé", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("O. Rank", "El trauma del nacimiento", "Paidos", "1981", "1ª reimp.", "Psicologiaymedicina"));
        b.add(new Book("Moustafa Safouan", "El ser y el placer", "Petrel", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Leo Navratil", "Esquizofrenia y arte", "Seix Barral", "1972", "", "Psicologiaymedicina"));
        b.add(new Book("M. Richard", "Los dominios de la psicología V. 1 y 2", "Istmo", "1971", "",
                "Psicologiaymedicina"));
        b.add(new Book("Charles Fisher", "Biología de los sueños y psicoanálisis", "Siglo XXI", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Peter Hays", "Nuevos orizontes de la psiquiatría", "Guadarrama", "1975", "",
                "Psicologiaymedicina"));
        b.add(new Book("Lawrence J. Friedman", "Usos y abusos del psicoanálisis", "Plaza Janés", "1972", "",
                "Psicologiaymedicina"));
        b.add(new Book("Lou-Andreas Salomé", "El narcisismo como doble dirección", "Tusquets", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jean Piaget", "Psicología y epistemología", "Ariel", "1971", "", "Psicologiaymedicina"));
        b.add(new Book("Karen Horney", "La personalidad neurótica de nuestro tiempo", "Paidos", "1979", "",
                "Psicologiaymedicina"));
        b.add(new Book("Joseff Rattner", "Psicología y psicopatología de la vida amorosa", "Siglo XXI", "1966", "",
                "Psicologiaymedicina"));
        b.add(new Book("Victor Gómez Pin", "El Psicoanálisis", "Montesinos", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Hans Selye", "Tensión sin angustia", "Guadarrama", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("Herbert Marcuse", "Psicoanálisis y política", "Península", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("Lu Hsun", "Diario de un loco", "Tusquets", "1971", "", "Psicologiaymedicina"));
        b.add(new Book("Albert Painchand", "Normales inadaptados", "Marfil", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("Marcos Victoria", "Variaciones sobre lo sentimental", "Sudamericana", "1944", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jesús Palacios", "La cuestión escolar", "Laia", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Gerard de Nerval", "Al dictado de la locura", "La Fontana L.", "1972", "",
                "Psicologiaymedicina"));
        b.add(new Book(" Peter Demsey", "Freud, psicoanálisis, catolicismo", "Herder", "1962", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jean Paul Sartre", "Esbozo de una teoría de las emociones", "Univ. Córdoba", "1959", "",
                "Psicologiaymedicina"));
        b.add(new Book("Karl von Frisch", "Tú y la vida", "Plaza Janés", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Karl Jaspers", "Esencia y crítica de la psicoterapia", "Fabril", "1959", "",
                "Psicologiaymedicina"));
        b.add(new Book("Charles Baudouin", "Psicoanálisis del arte", "Psique", "1955", "", "Psicologiaymedicina"));
        b.add(new Book("Wilhem Stekel", "Los sueños de los poetas", "Citerea", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Martin Buber", "Yo y tu", "Nueva visión", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Alasdair Maclntyre", "El concepto de inconciente", "Amorrortu", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Roland Jaccard", "El exilio interior", "Materiales", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Oliver Sachs", "Despertares", "Muchnik", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Varios autores", "Mente y cuerpo", "Mensajero", "1986", "", "Psicologiaymedicina"));
        b.add(new Book("Ernest Jones", "Hamlet y Edipo", "Man drágora", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("La mettrie Ed. J. L. Pérez Calvo", "El hombre máquina", "Alhambra", "1987", "",
                "Psicologiaymedicina"));
        b.add(new Book("Giles Delenze / Claire Parnet", "Diálogos", "Pre-textos", "1980", "", "Psicologiaymedicina"));
        b.add(new Book("Prof. M. Soagrand", "Rostro y carácter", "Cuad. Cultura", "", "", "Psicologiaymedicina"));
        b.add(new Book("Marc Oraison", "Frente a la ilusión y la angustia", "C. E. P.", "1968", "",
                "Psicologiaymedicina"));
        b.add(new Book("Mand Mannoni", "Un saber que no sabe", "Gedisa", "1986", "", "Psicologiaymedicina"));
        b.add(new Book("Robert Serpell", "Influencia de la cultura en el comportamiento", "Ceac", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Josef Rudin", "El fanatismo", "Razón y Fe", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Brendan Maher", "Introducción a la investigación patológica", "Taller de E.", "1974", "",
                "Psicologiaymedicina"));
        b.add(new Book("Georg Groddeck", "El libro del ello", "Sudamericana", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Viktor E. Frankl", "La idea psicológica del hombre", "Rialp", "1986", "", "Psicologiaymedicina"));
        b.add(new Book("Norman Cousins", "Anatomía de una enfermedad", "Kairos", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Jacques Lacan", "Escritos I", "Siglo XXI", "1971", "", "Psicologiaymedicina"));
        b.add(new Book("Albert Demaret", "Etología y psiquiatría", "Herder", "1983", "", "Psicologiaymedicina"));
        b.add(new Book("Wolfgang Klages", "La persona sensible", "Herder", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Edgar Wilson", "La mental como físico", "F. C. E.", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("Howard C. Warren, Editor", "Diccionario de Psicología", "F. C. E.", "1960", "3ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("Juliette Alvin", "Musicoterapia", "Paidos", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Prof. Dr. José Morros Sardá", "Elementos de fisiología", "Cient. Médica", "1946", "4ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Karl Jaspers", "Psicopatología general", "Beta", "1963", "", "Psicologiaymedicina"));
        b.add(new Book("J. Rof Carballo", "Patología Psicosomática", "Paz Montalvo", "1955", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("L. Szymonowicz - R. Krause", "Tratado de histología y anatomía microscópica", "Labor, S. A.",
                "1943", "3ª ed. Revis", "Psicologiaymedicina"));
        b.add(new Book("Samson Wright", "Fisiología aplicada", "M. Marín", "1955", "5ª ed. Esp.", "Psicologiaymedicina"));
        b.add(new Book("Osvald Bumke", "Nuevo tratado de enfermedades mentales", "F. Seix", "1946", "",
                "Psicologiaymedicina"));
        b.add(new Book("José María Izquierdo Rojo", "Historia de la neurología clínica española", "Univ. Complut.",
                "1978", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Arquetipos e inconsciente colectivo", "Paidos", "1970", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. R. V. Krafft-Ebing", "Psicopatía sexual", "El ateneo", "1955", "", "Psicologiaymedicina"));
        b.add(new Book("A. Novo C. y R. Villavino U.", "Farmacología exp. y terapéutica", "S. de Gali", "1949", "",
                "Psicologiaymedicina"));
        b.add(new Book("Salvat Editores, S. A.", "Diccionario terminológico de CC. MM.", "Salvat", "1972",
                "10ª ed. reimp.", "Psicologiaymedicina"));
        b.add(new Book("Jean Bernard", "Grandeza y tentaciones de la medicina", "Noguer", "1974", "",
                "Psicologiaymedicina"));
        b.add(new Book("Prof. Dr. A. L. De Letona", "Patología general y clínica propedéutica", "Sever-Cuesta", "1955",
                "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("G. Marañón", "Manual de diagnóstico etiológico", "Espasa-Calpe", "1946", "3ª ed. Revis.",
                "Psicologiaymedicina"));
        b.add(new Book("Prof. Dr. Med. R. Novoa Santos", "Manual de patología general T I y II", "Suc. Rivaden.",
                "1948", "8ª ed. Revis.", "Psicologiaymedicina"));
        b.add(new Book("Dirección de Oswald Schwarz", "Psicogénesis y Psicoterapia de los sintomas corporales",
                "Labor, S. A.", "1932", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. I", "E. Cient. Méd.", "1940", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. II", "E. Cient. Méd.", "1940",
                "3ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. III", "E. Cient. Méd.", "1941",
                "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. IV", "E. Cient. Méd.", "1940", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. V", "E. Cient. Méd.", "1947", "",
                "Psicologiaymedicina"));
        b.add(new Book("Pedro Laín Entralgo", "Medicina e historia", "Escorial", "1941", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Lhermitte", "Los sueños", "Surco", "1945", "", "Psicologiaymedicina"));
        b.add(new Book("Norman Mackenzie", "Los sueños", "Luis de Caralt", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Sally P. Springer Georg Deutsch", "Cerebro izquierdo, cerebro derecho", "Alianza", "1988", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Cardona Pescador", "Los miedos del hombre", "Rialp, S.A.", "1988", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jeffrey Moussaieff Masson", "El asalto a la verdad", "Seix Barral", "1985", "",
                "Psicologiaymedicina"));
        b.add(new Book("Leonard A. Stevens", "Exploradores del cerebro", "Barral", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("L. Testut - A. Latarjet", "Compendio de anatomía descriptiva", "Salvat", "1959", "",
                "Psicologiaymedicina"));
        b.add(new Book("Pierre Naville", "La psicología del comportamiento", "Guadarrama", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("John Hinton", "Experiencias sobre el morir", "Ariel", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Francisco Cienfuegos", "Emoción en la enfermedad y otros ensayos", "Stella", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Stephan L. Chorover", "Del Génesis al genocidio", "H. Blume", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Eugéne Minkowski", "El tiempo vivido", "F.C.E.", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Raymond de Becker", "Las maquinaciones de la noche", "Sudamericana", "1966", "",
                "Psicologiaymedicina"));
        b.add(new Book("Gordon Raffray Taylor", "El cerebro y la mente", "Planeta", "1979", "", "Psicologiaymedicina"));
        b.add(new Book("Karl R. Popper y John C. Eccles", "El yo y su cerebro", "Labor Univ.", "1977", "",
                "Psicologiaymedicina"));
        b.add(new Book("Darío Antiseri", "Análisis epist. del marxismo y del psicoanálisis", "Sígueme", "1978", "",
                "Psicologiaymedicina"));
        b.add(new Book("Marie-Louise Von Franz", "C. G. Jung. Su mito en nuestro tiempo", "F. C. E.", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Louis Corman", "Narcisismo y frustración de amor", "Herder", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("Leopoldo Cortejoso", "De paso por la vida", "G. A. Martín", "1976", "", "Psicologiaymedicina"));
        b.add(new Book("Wolfgang Hochheimer", "La psicoterapia de C. G. Jung", "Herder", "1969", "",
                "Psicologiaymedicina"));
        b.add(new Book("Lucy Freeman", "La lucha contra el miedo", "S. Rueda", "1955", "", "Psicologiaymedicina"));
        b.add(new Book("Ludwig Binswanger", "Artículos y conferencias escogidas T. I", "Gredos", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan José López Ibor", "Estilos de vivir y modos de enfermar", "Ateneo", "1954", "",
                "Psicologiaymedicina"));
        b.add(new Book("Honorio Delgado", "El médico, la medicina y el alma", "Cª Médica", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Gregory Stefan", "Diario de un esquizofrénico", "Emecé", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("G. Stephens Spinks", "Introducción a la psicología de la religión", "Paidos", "1965", "",
                "Psicologiaymedicina"));
        b.add(new Book("Michael Titze", "Fundamentos del teleoanálisis adleriano", "Herder", "1983", "",
                "Psicologiaymedicina"));
        b.add(new Book("Rudolf Attemann", "Experiencias de un psicoterapeuta", "Herder", "1983", "",
                "Psicologiaymedicina"));
        b.add(new Book("Aida Aisenson Kogan", "Cuerpo y persona", "F. C. E.", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Luis Cencillo", "Terapia, lenguaje y sueño", "Marova", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Shirl Solomon", "Escriptos El juego que revela la personalidad", "Lidiun", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Problemas psíquicos del mundo actual", "Monte Avila", "1976", "",
                "Psicologiaymedicina"));
        b.add(new Book("David Cooper", "El lenguaje de la locura", "Ariel", "1979", "", "Psicologiaymedicina"));
        b.add(new Book("David Cooper", "La muerte de la familia", "Ariel", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("Joao de Sousa Ferraz", "Psicología humana", "Americalee", "1966", "8ª ed. Revis.",
                "Psicologiaymedicina"));
        b.add(new Book("Leon Dujorne", "Psicología y filosofía de la persona", "El ateneo", "1946", "",
                "Psicologiaymedicina"));
        b.add(new Book("Robert Coles", "Erik H. Erikson", "F. C.E.", "1975", "", "Psicologiaymedicina"));
        b.add(new Book("David Cooper", "La gramática de la vida", "Ariel", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm y otros", "La soledad del hombre", "Monte Avila", "1976", "5ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Biología y psicoanálisis", "DDB", "1972", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "El hombre como encuentro", "Alfaguara", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Edmund Bergler", "Psicoanálisis del escritor", "Psique", "1954", "Intonso",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Entre el silencio y la palabra", "Aguilar", "1960", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Violencia y ternura", "Prensa Españ.", "1966", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Quirón, el centauro sobre Atarasia", "YBIS (Ibys)", "1957", "",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Urdimbre afectiva y enfermedad", "Labor, S. A.", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("Adolfo Lafuente y P. de los Cobos", "Guía médica de urgencia", "T. Moderna", "1949",
                "Numerado", "Psicologiaymedicina"));
        b.add(new Book("Enrico Giupponi", "Hospital Mi vida de cirujano", "Joaquín Gil", "1941", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jaime Vicens Carrio", "Conózcase a sí mismo", "Bruguera", "1956", "", "Psicologiaymedicina"));
        b.add(new Book("Rollo May", "La psicología y el dilema del hombre", "Gedisa", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("Prof. E. von Aster", "Introducción a la psicología", "Labor", "1935", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("César E. Figuerido", "Existencia y neurosis", "E.C. E.", "1943", "", "Psicologiaymedicina"));
        b.add(new Book("José M. Sacristán", "Figura y carácter Los biotipos de Kretschmer", "La lectura", "1926", "",
                "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "La psicología de la transferencia", "Paidos", "1954", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Riera", "Cirugía españ. ilustrada y su comunicación con Europa", "Univ. Vallad.", "1976",
                "2 ejemplares", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "AION", "Paidos", "1986", "", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Psicología y religión", "Paidos", "1967", "4ª ed.", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Símbolos de transformación", "Paidos", "1962", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("C. G. Jung", "Respuesta a Job", "F. C. E.", "1964", "", "Psicologiaymedicina"));
        b.add(new Book("Thomas S. Szasz", "La fabricación de la locura", "Kairos", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Francesc Tosquelles", "Estructura y reeducación terapéutica", "Fundamentos", "1972", "",
                "Psicologiaymedicina"));
        b.add(new Book("Varios", "Laing: Antipsiquiatría y contracultura", "Fundamentos", "1982", "4ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("R. Brain y otros", "Lenguaje y psiquiatría", "Fundamentos", "1982", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Jean Francois Lyotard", "Dispositivos pulsionales", "Fundamentos", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Julia Kristeva", "Loca verdad", "Fundamentos", "1985", "", "Psicologiaymedicina"));
        b.add(new Book("John Macmurray", "El yo como agente", "Barral", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. A. Vallejo Nájera", "Propedéutica clínica  psiquiátrica", "Labor, S. A.", "1936", "",
                "Psicologiaymedicina"));
        b.add(new Book("E. Bleuler", "Afectividad, Sugestividad, Paranoia", "Morata", "1942", "", "Psicologiaymedicina"));
        b.add(new Book("G. E. Störring", "Carácter y significación del síntoma…", "Morata", "1944", "",
                "Psicologiaymedicina"));
        b.add(new Book("Prof. Dr. M. Bañuelos", "Personalidad y carácter", "Morata", "1942", "", "Psicologiaymedicina"));
        b.add(new Book("Howar Gardner", "La nueva ciencia de la mente", "Paidos", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Alfred Adler", "La psicología del individuo", "Paidos", "1958", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Erich Jaensch", "Eidética y exploración tipológica", "Paidos", "1957", "",
                "Psicologiaymedicina"));
        b.add(new Book("El seminario de J. Lacan", "La ética del psicoanálisis", "Paidos", "1988", "1ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("Jean Piaget", "Biología y conocimiento", "Siglo XXI", "1969", "", "Psicologiaymedicina"));
        b.add(new Book("Karen Horney", "Neurosis y madurez", "Psique", "1973", "Intonso", "Psicologiaymedicina"));
        b.add(new Book("Amalia Prieto Cantero", "Bachilleres médicos vallisoletanos", "Univ. Vallad.", "1974",
                "2 ejemplares", "Psicologiaymedicina"));
        b.add(new Book("Michael Argyle", "Psicología social del trabajo", "Deusto", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Riera", "Planos de Hospitales españoles del s.  XVIII", "Univ. Vallad.", "1975", "",
                "Psicologiaymedicina"));
        b.add(new Book("Arnull Rüssel", "Psicología del trabajo", "Morata", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("José Fröbes, S.I.", "Compendio de psicología experimental", "Razón y Fe", "1961", "",
                "Psicologiaymedicina"));
        b.add(new Book("J. Guillaumin", "Los sueños y el yo", "Paidos", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Ludwig Klages", "Los fundamentos de la caracteriología", "Paidos", "1953", "",
                "Psicologiaymedicina"));
        b.add(new Book("Mauricio Abadi", "El psicoanálisis y la otra realidad", "Amorrortu", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("W. Baranger y otros", "Aportaciones al concepto de objeto en psicoanálisis", "Amorrortu",
                "1980", "", "Psicologiaymedicina"));
        b.add(new Book("Eugénie Lemoine-Luccioni", "La partición de las mujeres", "Amorrortu", "1982", "",
                "Psicologiaymedicina"));
        b.add(new Book("Thomas Szasz", "El mito de la enfermedad mental", "Amorrortu", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Gerhard Pfahler", "El hombre y su pasado", "Labor, S. A.", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Arthur Jores", "El hombre y su enfermedad", "Labor, S. A.", "1961", "", "Psicologiaymedicina"));
        b.add(new Book("Carlos Gurméndez", "Teoría de los sentimientos", "F. C.E.", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Gustav Hans Graber", "Psicología profunda de la mujer", "Aguilar", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("M. Schur", "Sigmund Freud  1 y 2", "Paidos", "1980", "", "Psicologiaymedicina"));
        b.add(new Book("Ernest Jones", "Vida y obra de S. Freud T. I, II y III", "Anagrama", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("Richard Wollheim", "Freud", "Grijalbo", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Lou Andreas-Salomé", "Freud Correspondencia", "Siglo XXI", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "Grandeza y limitaciones del pensamiento de Freud", "Siglo XXI", "1980", "",
                "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "La misión de Sigmund Freud", "F. C. E.", "1960", "", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "Tener o ser", "F. C. E.", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Florentino Moreno", "Hombre y sociedad en el pensamiento de Fromm", "F. C. E.", "1981", "",
                "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "El miedo a la libertad", "Paidos", "1981", "4ª reimp.", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "La crisis del psicoanálisis", "Paidos", "1976", "", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "El dogma de Cristo", "Paidos", "1976", "", "Psicologiaymedicina"));
        b.add(new Book("Erich Fromm", "La condición humana actual", "Paidos", "1977", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Esto no es una pipa", "Anagrama", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Historia de la sexualidad V. I", "Siglo XXI", "1978", "",
                "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Historia de la sexualidad V. II y III", "Siglo XXI", "1987", "",
                "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Las palabras y las cosas", "Siglo XXI", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Vigilar y castigar", "Siglo XXI", "1978", "3ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Raymond Roussel", "M. Foucault", "Siglo XXI", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Tal y como yo lo imagino", "Pre-textos", "1988", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Baudrillard", "Olvidar a Foucault", "Pre-textos", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("Michel Foucault", "Microfísica del poder", "La piqueta", "1978", "", "Psicologiaymedicina"));
        b.add(new Book("G. Deleuze", "Foucault", "Paidos", "1987", "", "Psicologiaymedicina"));
        b.add(new Book("Ph. Aries, M. Foucault y otros", "Sexualidades occidentales", "Paidos", "1987", "",
                "Psicologiaymedicina"));
        b.add(new Book("Irvin D. Yalom", "Psicoterapia existencial", "Herder", "1984", "", "Psicologiaymedicina"));
        b.add(new Book("Juan Rof Carballo", "Fronteras vivas del psicoanálisis", "Karpos, S. A.", "1975", "",
                "Psicologiaymedicina"));
        b.add(new Book("E. Kretschmer", "Hombres geniales", "Labor, S. A.", "1954", "", "Psicologiaymedicina"));
        b.add(new Book("G. Benedetti", "El paciente psíquico y su mundo", "Morata", "1966", "", "Psicologiaymedicina"));
        b.add(new Book("Joseph Campbell", "El héroe de las mil caras", "F.C.E.", "1959", "", "Psicologiaymedicina"));
        b.add(new Book("H. Baruk", "Psiquiatría moral experimental", "F.C.E.", "1960", "", "Psicologiaymedicina"));
        b.add(new Book("Gustav Bally", "El juego como expresión de libertad", "F.C.E.", "1958", "",
                "Psicologiaymedicina"));
        b.add(new Book("Paul Diel", "El miedo y la angustia", "F.C.E.", "1966", "", "Psicologiaymedicina"));
        b.add(new Book("Paul Diel", "Psicoanálisis de la divinidad", "F.C.E.", "1959", "", "Psicologiaymedicina"));
        b.add(new Book("D. T. Suzuki y Erich Fromm", "Budismo Zen y psicoanálisis", "F.C.E.", "1964", "",
                "Psicologiaymedicina"));
        b.add(new Book("Rollo May Ernest Angel", "Existencia", "Gredos", "1977", "1ª reimp.", "Psicologiaymedicina"));
        b.add(new Book("Dr. Philipp Lersch", "La estructura de la personalidad T. II", "Scientia", "1959", "",
                "Psicologiaymedicina"));
        b.add(new Book("James Page", "Manual de psicopatología", "Paidos", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("A. De Waelhens", "La psicosis", "Morata", "1973", "", "Psicologiaymedicina"));
        b.add(new Book("B. Llopis", "Introducción dialéctica a la psicopatología", "Morata", "1970", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Alfred Adler", "El sentido de la vida", "L. Miracle", "1941", "3ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Fritz Künkel", "Del yo al nosotros", "L. Miracle", "1940", "", "Psicologiaymedicina"));
        b.add(new Book("Dr. Ernest Aeppli", "El lenguaje de los sueños", "L. Miracle", "1946", "",
                "Psicologiaymedicina"));
        b.add(new Book("W. Huber H. Pirón A. Vergote", "El conocimiento del hombre por el psicoanálisis", "Guadarrama",
                "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Anne Roe", "Psicologia de las profesiones", "Marova", "1972", "", "Psicologiaymedicina"));
        b.add(new Book("Ludwig Binswanger", "Artículos y conferencias escogidas T. II", "Gredos", "1973", "",
                "Psicologiaymedicina"));
        b.add(new Book("Jürg Zutt", "Psiquiatría antropológica", "Gredos", "1974", "", "Psicologiaymedicina"));
        b.add(new Book("Wilhel Reich", "Materialismo dialéctico y psicoanálisis", "Siglo XXI", "1974", "4ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Bautista Torello", "Psicoanálisis y confesión", "Rialp", "1963", "", "Psicologiaymedicina"));
        b.add(new Book("F. Künkel y R. E. Dickerson", "La formación del carácter", "Paidos", "1982", "1ª reimp.",
                "Psicologiaymedicina"));
        b.add(new Book("Joice McDougall", "Alegato por cierta anormalidad", "Petrel", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Sami Ali", "De la proyección", "Petrel", "1982", "", "Psicologiaymedicina"));
        b.add(new Book("Adrian Stokes", "La pintura y el mundo interior", "Hormé", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Richard Sterba y Marie Langer", "Teoría psicoanalítica de la libido", "Hormé", "1966", "",
                "Psicologiaymedicina"));
        b.add(new Book("M. Mead y otros", "El problema de la mujer", "Hormé", "1968", "", "Psicologiaymedicina"));
        b.add(new Book("Teodor Reik", "Aventuras en la invertigación psicoanalítica", "Paidos", "1967", "",
                "Psicologiaymedicina"));
        b.add(new Book("Teodor Reik", "Psicoanálisis aplicado", "Hormé", "1967", "", "Psicologiaymedicina"));
        b.add(new Book("Deutsch y otros", "Psicoanálisis y desviaciones sexuales", "Hormé", "1967", "",
                "Psicologiaymedicina"));
        b.add(new Book("Harry F. Tashman", "Psicopatología sexual del matrimonio", "Hormé", "1964", "",
                "Psicologiaymedicina"));
        b.add(new Book("R. Amadou", "La parapsicología", "Paidos", "1964", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Robert Street", "Técnicas sexuales modernas", "Paidos", "1964", "", "Psicologiaymedicina"));
        b.add(new Book("Luzving Eilderberg", "Psicología de la violación", "Paidos", "1965", "", "Psicologiaymedicina"));
        b.add(new Book("Maryse Choisy", "Psicoanálisis de la prostitución", "Hormé", "1964", "", "Psicologiaymedicina"));
        b.add(new Book("Rollo May y otros", "La angustia normal y patológica", "Paidos", "1968", "",
                "Psicologiaymedicina"));
        b.add(new Book("W. Stern y otros", "El conocimiento de sí mismo y de los demás", "Paidos", "1968", "",
                "Psicologiaymedicina"));
        b.add(new Book("Alfred Adler", "Guiando al niño", "Paidos", "1957", "", "Psicologiaymedicina"));
        b.add(new Book("Guy Palmade", "La caracterología", "Paidos", "1959", "", "Psicologiaymedicina"));
        b.add(new Book("Jean Delay", "La psicofisiología humana", "Paidos", "1959", "", "Psicologiaymedicina"));
        b.add(new Book("Paul Chauchard", "La muerte", "Paidos", "1960", "", "Psicologiaymedicina"));
        b.add(new Book("Yvonne Castellan", "La metapsíquica", "Paidos", "1955", "", "Psicologiaymedicina"));
        b.add(new Book("H. Delacroix y otros", "Psicología del lenguaje", "Paidos", "1960", "", "Psicologiaymedicina"));
        b.add(new Book("Wilhem Reich", "Análisis del carácter", "Paidos", "1965", "2ª ed.", "Psicologiaymedicina"));
        b.add(new Book("Jean-Luc Nancy y P. Lacoue-Labarthe", "El título de la letra (Una lectura de Lacan)",
                "EBA, S.A.", "1981", "", "Psicologiaymedicina"));
        b.add(new Book("Erich R. Jaensch", "Eidética y exploración tipológica", "Paidos", "1957", "",
                "Psicologiaymedicina"));
        b.add(new Book("Dr. Rafael de Vega y F. Crespo", "El otoño del arte clínico", "Univ. Vallad.", "1980",
                "Dedicado", "Psicologiaymedicina"));
        b.add(new Book("A. Fischel", "Compendio de embriología humana", "Labor, S. A.", "1943", "2ª ed.",
                "Psicologiaymedicina"));
        b.add(new Book("Juan Manuel Jiménez Muñoz", "Médicos y cirujanos en \"Quitaciones de Cortes\"",
                "Univ. Vallad.", "1977", "Dedicado", "Psicologiaymedicina"));
    }

    // TODO
    private static void fillPoesiaespyext() {
        DB.get("Poesiaespyext");

    }

    private static void fillLradio() {
        final List<Book> b = DB.get("Lradio");
        b.add(new Book("LA TORRE Rta. Univ. Puerto Rico", "Homenaje a O. y Gasset Julio-Dic. 1956", "Univ. Pº Rico",
                "1956", "", "Lradio"));
        b.add(new Book("LA TORRE Rta. Univ. Puerto Rico", "Homenaje a M. de Unamuno Julio-Dic. 1961", "Univ. Pº Rico",
                "1961", "", "Lradio"));
        b.add(new Book("Acta Salmanticensia", "Strenae Dedicado al Prof. M. Gª Blanco", "Raycar, S.A.", "1962", "",
                "Lradio"));
        b.add(new Book("Pedro Laín Entralgo", "Estudios de Hª de la Medicina y de la antrop. Médica", "Escorial",
                "1943", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "El mundo histórico", "F. C. E.", "1944", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Teoría de la concepción del mundo", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Hegel y el idealismo", "F. C. E.", "1944", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Vida y poesía", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "De Leibniz a Goethe", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Hombre y mundo en los siglos XVI y XVII", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Psicología y teoría del conocimiento VI", "F. C. E.", "1951", "2ª ed.",
                "Lradio"));
        b.add(new Book("Wilhelm Dilthey", "Literatura y fantasía IX", "F. C. E.", "1963", "", "Lradio"));
        b.add(new Book("Jacob Burckhardt", "Del paganismo al cristianismo", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Teodoro Mommsen", "El mundo de los césares", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Johannes Bühler", "Vida y cultura en la Edad Media", "F. C. E.", "1946", "", "Lradio"));
        b.add(new Book("Alfred Weber", "Historia de la cultura", "F. C. E.", "1960", "6ª ed.", "Lradio"));
        b.add(new Book("Erwin Rohde", "Psique La idea del alma y la inmortalidad entre…", "F. C. E.", "1948", "",
                "Lradio"));
        b.add(new Book("Julián Marías", "El tema del hombre", "R. Occidente", "1943", "", "Lradio"));
        b.add(new Book("M. de Iriarte, S. I.", "El Dr. Huarte de San Juan y su examen de…", "Cº Sup. Inv. C.", "1948",
                "3ª ed. correg.", "Lradio"));
        b.add(new Book("Arthur March", "Naturaleza y conocimiento", "Ins. Est. Polít.", "1954", "", "Lradio"));
        b.add(new Book("Albert Schweitzer", "J. S. Bach El músico poeta", "Ricordi", "1955", "", "Lradio"));
        b.add(new Book("Charles Guignebert", "Manual de Hª antigua del cristianismo", "Albatros", "1945", "", "Lradio"));
        b.add(new Book("H. Höffding", "Filósofos contemporáneos", "Daniel Jorro", "1909", "", "Lradio"));
        b.add(new Book("H. Höffding", "Filosofía de la religión", "Daniel Jorro", "1909", "", "Lradio"));
        b.add(new Book("Hegel", "Filosofía del espíritu T. I y II", "Daniel Jorro", "1907", "", "Lradio"));
        b.add(new Book("Rudolf Eucken", "Las grandes corrientes del pensamiento contemporáneo", "Daniel Jorro", "1912",
                "", "Lradio"));
        b.add(new Book("Rudolf Eucken", "El contenido de verdad en religión", "Daniel Jorro", "1925", "", "Lradio"));
        b.add(new Book("Guillermo Wundt", "Fundamentos de metafísica T. I y II", "Daniel Jorro", "1913", "", "Lradio"));
        b.add(new Book("Hugo Riemann", "Elementos de estética musical", "Daniel Jorro", "1914", "", "Lradio"));
        b.add(new Book("Teodoro Lipps", "Los fundamentos de la estética", "Daniel Jorro", "1923", "", "Lradio"));
        b.add(new Book("Henri Bergson", "La energía espiritual", "Daniel Jorro", "1928", "", "Lradio"));
        b.add(new Book("Enrique Lichtenberger", "La filosofía de Nietzsche", "Daniel Jorro", "1910", "", "Lradio"));
        b.add(new Book("Guyau", "Los problemas de la estética contemporánea", "Daniel Jorro", "1920", "", "Lradio"));
        b.add(new Book("G. Strafforello", "Después de la muerte", "La Esp. Moderna", "", "", "Lradio"));
        b.add(new Book("Dr. Carlos Lemcke", "Estética al alcance de todo el mundo nº 319", "La Esp. Moderna", "", "",
                "Lradio"));
        b.add(new Book("J. Ruskin", "Obras escogidas 1ª y 2ª parte nº 439 y 446", "La Esp. Moderna", "", "", "Lradio"));
        b.add(new Book("A. Fouillée", "La filosofía de Platón T. I y II nº 451 y 452", "La Esp. Moderna", "", "",
                "Lradio"));
        b.add(new Book("Alfredo Fouillée", "Compendios de los grandes filósofos T. I y II nº 554 y 555",
                "La Esp. Moderna", "", "", "Lradio"));
        b.add(new Book("Arturo Schopenhauer", "Estudios de Historia filosófica nº 458", "La Esp. Moderna", "", "",
                "Lradio"));
        b.add(new Book("Herbert Spencer", "Principios de Psicología T. I a IV nº 586, 587, 593 y 594",
                "La Esp. Moderna", "1917", "", "Lradio"));
        b.add(new Book("Emilio Faguet", "Leyendo a Nietzsche nº 590", "La Esp. Moderna", "1900", "", "Lradio"));
        b.add(new Book("Conde de Keyserling", "Meditaciones suramericanas", "E. Calpe, S.A.", "1933", "", "Lradio"));
        b.add(new Book("Padre A. Gratry", "El conocimiento de Dios", "Pegaso", "1941", "", "Lradio"));
        b.add(new Book("W. S. Jevons", "Lógica", "Pegaso", "1941", "", "Lradio"));
        b.add(new Book("Eduardo Nicol", "Historicismo y existencialismo", "El Coleg. de Méx.", "1950", "", "Lradio"));
        b.add(new Book("Eduardo Nicol", "La vocación humana", "El Coleg. de Méx.", "1953", "", "Lradio"));
        b.add(new Book("Carlos Blanco Aguinaga", "El Unamuno contemplativo", "El Coleg. de Méx.", "1959", "", "Lradio"));
        b.add(new Book("Fernando Salmerón", "Las mocedades de Ortega y Gasset", "El Coleg. de Méx.", "1959", "",
                "Lradio"));
        b.add(new Book("Eugenio Imaz", "El pensamiento de Dilthey", "El Coleg. de Méx.", "1946", "", "Lradio"));
        b.add(new Book("Luis Abad Carretero", "Una filosofía del instante", "El Coleg. de Méx.", "1954", "", "Lradio"));
        b.add(new Book("Joaquín Xirau", "Amor y mundo", "El Coleg. de Méx.", "1940", "", "Lradio"));
        b.add(new Book("Olga Victoria Quiroz-Martínez", "La introducción de la Fª moderna en España",
                "El Coleg. de Méx.", "1949", "", "Lradio"));
        b.add(new Book("Platón Obras Completas", "Hipias Mayor Fedro", "Univ.Aut. México", "1945", "", "Lradio"));
        b.add(new Book("Platón Obras Completas", "Banquete Ion", "Univ.Aut. México", "1944", "", "Lradio"));
        b.add(new Book("Platón Obras Completas", "Eutifron Apología Critón", "Univ.Aut. México", "1944", "", "Lradio"));
        b.add(new Book("Jenofonte Obras Completas", "Recuerdos de Sócrates Banquete Apología", "Univ.Aut. México",
                "1946", "", "Lradio"));
        b.add(new Book("Ovidio Obras Completas", "Heroidas", "Univ.Aut. México", "1950", "", "Lradio"));
        b.add(new Book("J. G. Fichte", "El destino del hombre y el destino del sabio", "V. Suárez", "1913", "",
                "Lradio"));
        b.add(new Book("M. Kant", "Crítica de la razón práctica", "V. Suárez", "1913", "", "Lradio"));
        b.add(new Book("M. Kant", "Crítica del juicio 1ª y 2ª parte", "V. Suárez", "1914", "", "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Enciclopedia de las ciencias filosóficas T. I y II", "V. Suárez", "1917", "",
                "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Enciclopedia de las ciencias filosóficas T. III", "V. Suárez", "1918", "",
                "Lradio"));
        b.add(new Book("Hegel", "Fenomenología del espíritu", "R. Occidente", "1935", "", "Lradio"));
        b.add(new Book("Francisco Suárez", "Sobre el concepto del ente", "R. Occidente", "1935", "", "Lradio"));
        b.add(new Book("C. G. Yung", "Lo insconsciente", "R. Occidente", "1927", "", "Lradio"));
        b.add(new Book("A. Pfänder", "Fenomenología de la voluntad", "R. Occidente", "1931", "", "Lradio"));
        b.add(new Book("J. von Uexküll", "Meditaciones biológicas", "R. Occidente", "1942", "", "Lradio"));
        b.add(new Book("Max Scheler", "De lo eterno en el hombre", "R. Occidente", "1940", "", "Lradio"));
        b.add(new Book("Max Scheler", "Muerte y supervivencia Ordo amoris", "R. Occidente", "1934", "", "Lradio"));
        b.add(new Book("Max Scheler", "El puesto del hombre en el cosmos", "R. Occidente", "1936", "", "Lradio"));
        b.add(new Book("Fichte", "Introducción a la teoría de la ciencia", "R. Occidente", "1934", "", "Lradio"));
        b.add(new Book("Julián Marías", "Ortega y tres antípodas", "R. Occidente", "1950", "", "Lradio"));
        b.add(new Book("Julián Marías", "San Anselmo y el insensato", "R. Occidente", "1944", "", "Lradio"));
        b.add(new Book("Pablo Luis Landsberg", "La academia platónica", "R. Occidente", "1926", "", "Lradio"));
        b.add(new Book("Francisco Brentano", "El porvenir de la filosofía", "R. Occidente", "1936", "", "Lradio"));
        b.add(new Book("Francisco Brentano", "Psicología", "R. Occidente", "1935", "2ª ed.", "Lradio"));
        b.add(new Book("Francisco Brentano", "El orígen del conocimiento moral", "R. Occidente", "1941", "2ª ed.",
                "Lradio"));
        b.add(new Book("Balduin Schwartz", "La psicología del llanto", "R. Occidente", "1930", "", "Lradio"));
        b.add(new Book("W. Brand y M. Deutschbein", "Introducción a la filosofía matemática", "R. Occidente", "1930",
                "", "Lradio"));
        b.add(new Book("Emmanuel Mounier", "Introducción a los existencialismos", "R. Occidente", "1949", "", "Lradio"));
        b.add(new Book("Jorge Simmel", "Problemas fundamentales de la filosofía", "R. Occidente", "1946", "", "Lradio"));
        b.add(new Book("Schopenhauer", "Sobre la libertad humana", "R. Occidente", "1934", "", "Lradio"));
        b.add(new Book("Charles David Ley", "Shakespeare para españoles", "R. Occidente", "1951", "", "Lradio"));
        b.add(new Book("Augusto Comte", "Discurso sobre el espíritu positivo", "R. Occidente", "1934", "", "Lradio"));
        b.add(new Book("Sören Kierkegaard", "El concepto de la angustia", "R. Occidente", "1930", "", "Lradio"));
        b.add(new Book("Pedro Laín Entralgo", "La curación por la palabra", "R. Occidente", "1958", "", "Lradio"));
        b.add(new Book("Henri Bercson", "La evolución creadora", "R. Occidente", "1947", "", "Lradio"));
        b.add(new Book("Hedwig Conrad-Matius", "El tiempo", "R. Occidente", "1958", "", "Lradio"));
        b.add(new Book("Hans Reiner", "Vieja y nueva ética", "R. Occidente", "1964", "", "Lradio"));
        b.add(new Book("Kitaro Nishida", "Ensayo sobre el bien", "R. Occidente", "1963", "", "Lradio"));
        b.add(new Book("Varios Autores", "¿Dónde estamos hoy?", "R. Occidente", "1962", "", "Lradio"));
        b.add(new Book("Luis María Ansón", "La negritud", "R. Occidente", "1971", "", "Lradio"));
        b.add(new Book("Luis María Ansón", "El grito de Oriente", "R. Occidente", "1965", "", "Lradio"));
        b.add(new Book("Manuel Granell", "Cartas filosóficas a una mujer", "R. Occidente", "1946", "", "Lradio"));
        b.add(new Book("Manuel Granell", "El hombre, un falsificador", "R. Occidente", "1968", "", "Lradio"));
        b.add(new Book("Manuel Granell", "Ortega y su filosofía", "R. Occidente", "1960", "", "Lradio"));
        b.add(new Book("D. García-Sabell", "Tres síntomas de Europa Joyce-Vangogh-Sartre", "R. Occidente", "1968", "",
                "Lradio"));
        b.add(new Book("J. H. Walgrave, O. P.", "La filosofía de Ortega y Gasset", "R. Occidente", "1965", "", "Lradio"));
        b.add(new Book("Edmundo Husserl", "Investigaciones lógicas T. I y II", "R. Occidente", "1967", "2ª ed.",
                "Lradio"));
        b.add(new Book("Teilhard de Chardin", "El fenómeno humano", "R. Occidente", "1958", "", "Lradio"));
        b.add(new Book("Roger Godel", "Ensayos sobre la experiencia liberadora", "Hachette", "1955", "", "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Ciencia de la lógica T. I y II", "Hachette", "1956", "", "Lradio"));
        b.add(new Book("León Brunschvicg", "Las edades de la inteligencia", "Hachette", "1955", "", "Lradio"));
        b.add(new Book("Voltaire", "Ensayo sobre las costs. y el espíritu de las naciones", "Hachette", "1959", "",
                "Lradio"));
        b.add(new Book("Charles Renouvier", "Historia y solución de los problemas metafísicos", "Hachette", "1950", "",
                "Lradio"));
        b.add(new Book("Rodolfo Mondolfo", "En los orígenes de la filosofía de la cultura", "Hachette", "1960", "",
                "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada I Anita y Silvia", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada II El verano", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada III Madre e hijo 1", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada IV Madre e hijo 2", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada V La anunciadora", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada VI La gestación", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "El alma encantada VII Mayo Florentino", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal I El alba", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal II La mañana", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal III El adolescente", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal IV La revelión", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal V La feria en la plaza", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal VI Antonieta", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal VII En la casa", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal VIII Las amigas", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal IX La zarza en llamas", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("Romain Rolland", "Juan Cristobal X El nuevo día", "Hachette", "1952", "", "Lradio"));
        b.add(new Book("A. Delp", "Existencia trágica", "Razón y Fe S.A.", "1942", "", "Lradio"));
        b.add(new Book("Wilhelm Windelband", "Preludios filosóficos", "S. Rueda", "1949", "", "Lradio"));
        b.add(new Book("A. Cuvillier", "Filosofía general", "Alfa", "1962", "", "Lradio"));
        b.add(new Book("Jacques Maritain", "Siete lecciones sobre el ser", "Desclée de B.", "1950", "3ª ed.", "Lradio"));
        b.add(new Book("Jacques Maritain", "Los grados del saber T. I y II", "Desclée de B.", "1947", "", "Lradio"));
        b.add(new Book("Sigfrido Huber", "Los Santos Padres T. I y II", "Desclée de B.", "1946", "", "Lradio"));
        b.add(new Book("Hubert Colleye", "El alma de León Bloy", "Desclée de B.", "1950", "2ª ed.", "Lradio"));
        b.add(new Book("Rodolfo Mondolfo", "Moralistas griegos", "Imán", "1941", "", "Lradio"));
        b.add(new Book("Richard M. Lonsbach", "Nietzsche y los judíos", "Imán", "1944", "", "Lradio"));
        b.add(new Book("Charles Moeller", "Literatura del s. XX y cristianismo T. I y II", "Gredos", "1955", "",
                "Lradio"));
        b.add(new Book("Charles Moeller", "Literatura del s. XX y cristianismo T. III", "Gredos", "1957", "", "Lradio"));
        b.add(new Book("Charles Moeller", "Literatura del s. XX y cristianismo T. IV", "Gredos", "1960", "", "Lradio"));
        b.add(new Book("Charles Moeller", "Literatura del s. XX y cristianismo T. V", "Gredos", "1975", "", "Lradio"));
        b.add(new Book("Davy, M.", "Un filósofo itinerante Gabriel Marcel", "Gredos", "1963", "", "Lradio"));
        b.add(new Book("Victor White", "Dios y el inconsciente", "Gredos", "1955", "", "Lradio"));
        b.add(new Book("Leo Pollmann", "Sartre y Camus Literatura de la existencia", "Gredos", "1973", "", "Lradio"));
        b.add(new Book("Dr. Alfredo Stern", "La filosofía de los valores", "Minerva", "1944", "", "Lradio"));
        b.add(new Book("Christopher Dawson", "La religión y el origen de la cultura occidental", "Sudamericana",
                "1953", "", "Lradio"));
        b.add(new Book("Leon Chestov", "Kierkegard y la filosofía existencial", "Sudamericana", "1947", "", "Lradio"));
        b.add(new Book("Gottfried Martin", "Kant Ontología y epistemología", "Univ. Córdoba", "1961", "", "Lradio"));
        b.add(new Book("Eugenio Imaz", "Topia y utopía", "Tezontle", "1946", "", "Lradio"));
        b.add(new Book("René Guénon", "El teosofismo", "Haz", "1954", "", "Lradio"));
        b.add(new Book("André Cresson", "Los sistemas filosóficos", "Tridente", "1945", "", "Lradio"));
        b.add(new Book("Oswaldo Spengler", "Heráclito", "Esp. Calpe, S.A.", "1947", "", "Lradio"));
        b.add(new Book("Pedro Guirao", "Escritos pitagóricos", "Glem", "1944", "", "Lradio"));
        b.add(new Book("Arnold Hauser", "Historia social de la literatura y el arte T. I, II y III", "Guadarrama",
                "1957", "", "Lradio"));
        b.add(new Book("Arnold Hauser", "Introducción a la Historia del arte", "Guadarrama", "1961", "", "Lradio"));
        b.add(new Book("J. B. Priestley", "Literatura y hombre occidental", "Guadarrama", "1960", "", "Lradio"));
        b.add(new Book("Gustav Rene Hocke", "El mundo como laberinto. I El manierismo en el arte", "Guadarrama",
                "1961", "", "Lradio"));
        b.add(new Book("H. de Lubac-Ives Congar-J. Huby", "Dios, el hombre y el cosmos", "Guadarrama", "1959", "",
                "Lradio"));
        b.add(new Book("Georges Uscatescu", "Utopía y plenitud histórica", "Guadarrama", "1963", "", "Lradio"));
        b.add(new Book("Georges Uscatescu", "Escatología e historia", "Guadarrama", "1959", "", "Lradio"));
        b.add(new Book("José Antonio Maravall", "Velázquez y el espíritu de la modernidad", "Guadarrama", "1960", "",
                "Lradio"));
        b.add(new Book("Antonio Sánchez Barbudo", "Estudios sobre Unamuno y Machado", "Guadarrama", "1959", "",
                "Lradio"));
        b.add(new Book("Luis S. Granjel", "Retrato de Unamuno", "Guadarrama", "1957", "", "Lradio"));
        b.add(new Book("Bart-Maydieu-Jaspers", "Hacia un nuevo humanismo", "Guadarrama", "1957", "", "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles I Ejercitación del cristianismo", "Guadarrama", "1961", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles II Dos diál. sobre el amor y el matrim.", "Guadarrama",
                "1961", "", "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles III Los lirios del campo y las aves del c.", "Guadarrama",
                "1963", "", "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles IV Las obras del amor 1ª parte", "Guadarrama", "1965", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles V Las obras del amor 2ª parte", "Guadarrama", "1965", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles VI El concepto de la angustia", "Guadarrama", "1965", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles VII La enfermedad mortal", "Guadarrama", "1969", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles VIII Estudios estéticos I", "Guadarrama", "1969", "",
                "Lradio"));
        b.add(new Book("Soren Kierkegard", "Obras y papeles IX Estudios estéticos II", "Guadarrama", "1969", "",
                "Lradio"));
        b.add(new Book("Jean Paul Borel", "Introducción a Ortega y Gasset", "Guadarrama", "1969", "", "Lradio"));
        b.add(new Book("Baruk-Nanielou-Ortega y Gasset", "Hombre y cultura en el siglo XX", "Guadarrama", "1957", "",
                "Lradio"));
        b.add(new Book("Walter Falk", "Impresionismo y expresionismo", "Guadarrama", "1963", "", "Lradio"));
        b.add(new Book("Luis Gil", "Therapeia La medicina popular en el mundo clásico", "Guadarrama", "1969", "",
                "Lradio"));
        b.add(new Book("Robert S. Hartman", "El conocimiento del bien", "F. C. E.", "1965", "", "Lradio"));
        b.add(new Book("Robert S. Hartman", "La estructura del valor", "F. C. E.", "1959", "", "Lradio"));
        b.add(new Book("Gilbert Highet", "La tradición clásica T. I y II", "F. C. E.", "1954", "", "Lradio"));
        b.add(new Book("Marcel Raymond", "De Baudelaire al surrealismo", "F. C. E.", "1960", "", "Lradio"));
        b.add(new Book("Erich Auerbach", "Mimesis: la realidad de la literatura", "F. C. E.", "1950", "", "Lradio"));
        b.add(new Book("A. Petrie", "Introducción al estudio de Grecia", "F. C. E.", "1946", "", "Lradio"));
        b.add(new Book("R. G. Collingwood", "Los principios del arte", "F. C. E.", "1960", "", "Lradio"));
        b.add(new Book("R. G. Collingwood", "Autobiografía", "F. C. E.", "1953", "", "Lradio"));
        b.add(new Book("Emilio Sosa López", "El hombre interior", "F. C. E.", "1962", "", "Lradio"));
        b.add(new Book("Antonio Gómez Robledo", "Ensayo sobre las virtudes intelectuales", "F. C. E.", "1957", "",
                "Lradio"));
        b.add(new Book("Walter Schulz", "El Dios de la metafísica moderna", "F. C. E.", "1961", "", "Lradio"));
        b.add(new Book("Miguel Bueno", "Las grandes direcciones de la filosofía", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("José Ortega y Gasset", "Origen y epílogo de la filosofía", "F. C. E.", "1960", "", "Lradio"));
        b.add(new Book("Samuel Ramos", "Hacia un nuevo humanismo", "F. C. E.", "1962", "2ª ed.", "Lradio"));
        b.add(new Book("Juan David García Bacca", "Metafísica", "F. C. E.", "1963", "", "Lradio"));
        b.add(new Book("Luis Villoro", "La idea y el ente en la filosofía de Descartes", "F. C. E.", "1965", "",
                "Lradio"));
        b.add(new Book("Jean Wahl", "Tratado de metafísica", "F. C. E.", "1960", "", "Lradio"));
        b.add(new Book("Friedrich Kainz", "Estética", "F. C. E.", "1952", "", "Lradio"));
        b.add(new Book("Ernst Bloch", "El pensamiento de Hegel", "F. C. E.", "1949", "", "Lradio"));
        b.add(new Book("Nicolai Hartmann", "Ontología I Fundamentos", "F. C. E.", "1954", "", "Lradio"));
        b.add(new Book("Nicolay Hartmann", "Ontología II Posibilidad y efectividad", "F. C. E.", "1956", "", "Lradio"));
        b.add(new Book("Nicolay Hartmann", "Ontología III La fábrica del mundo real", "F. C. E.", "1959", "", "Lradio"));
        b.add(new Book("Nicolay Hartmann", "Ontología IV Filosofía de la naturaleza 1", "F. C. E.", "1960", "",
                "Lradio"));
        b.add(new Book("Nicolay Hartmann", "Ontología V Filosofía de la naturaleza 2", "F. C. E.", "1964", "", "Lradio"));
        b.add(new Book("Erich Rothacker", "Problemas de antropología cultural", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("Hans Barth", "Verdad e ideología", "F. C. E.", "1951", "", "Lradio"));
        b.add(new Book("Luis Quintanilla", "Bergsonismo y política", "F. C. E.", "1953", "", "Lradio"));
        b.add(new Book("John Locke", "Ensayo sobre el entendimiento humano", "F. C. E.", "1956", "", "Lradio"));
        b.add(new Book("Baruch de Spinoza", "Etica demostrada según el orden geométrico", "F. C. E.", "1958", "",
                "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Fenomenología del espíritu (repetido)", "F. C. E.", "1966", "", "Lradio"));
        b.add(new Book("Rodolfo Mondolfo", "Marx y Marxismo", "F. C. E.", "1960", "", "Lradio"));
        b.add(new Book("Rodolfo Mondolfo", "El humanismo de Marx", "F. C. E.", "1964", "", "Lradio"));
        b.add(new Book("Paul Schrecker", "La estructura de la civilización", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("Nicola Abbagnano", "Filosofía de lo posible", "F. C. E.", "1959", "", "Lradio"));
        b.add(new Book("Juan López Morillas", "El krausismo español", "F. C. E.", "1956", "", "Lradio"));
        b.add(new Book("M. Merleau-Ponty", "Fenomenología de la percepción", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("J. Ferrater Mora y Hugues Leblanc", "Lógica matemática", "F. C. E.", "1955", "", "Lradio"));
        b.add(new Book("Martin Heidegger", "El ser y el tiempo", "F. C. E.", "1951", "", "Lradio"));
        b.add(new Book("Martin Heidegger", "Kant y el problema de la metafísica", "F. C. E.", "1954", "", "Lradio"));
        b.add(new Book("Martin Heidegger", "Arte y poesía", "F. C. E.", "1958", "", "Lradio"));
        b.add(new Book("Edmund Husserl", "Ideas relativas a una fenomenología pura y…", "F. C. E.", "1949", "",
                "Lradio"));
        b.add(new Book("Hans Reichenbach", "La filosofía científica", "F. C. E.", "1953", "", "Lradio"));
        b.add(new Book("Eduardo Nicol", "Metafísica de la expresión", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("Eduardo Nicol", "Psicología de las situaciones vitales", "F. C. E.", "1963", "2ª ed. Correg.",
                "Lradio"));
        b.add(new Book("Eduardo Nicol", "El problema de la filosofía hispánica", "Tecnos", "1961", "", "Lradio"));
        b.add(new Book("Dr. Manuel Sacristán Luzón", "Las ideas gnoseológicas de Heidegger", "Marina, S.A.", "1960",
                "", "Lradio"));
        b.add(new Book("Juan David García Bacca", "Existencialismo", "U. Veracruzana", "1962", "", "Lradio"));
        b.add(new Book("Carlos Blanco Aguinaga", "Unamuno, teórico del lenguaje", "Coleg. de México", "1954", "",
                "Lradio"));
        b.add(new Book("Eugenio Imaz (Jornadas)", "Asedio a Dilthey", "Coleg. de México", "1945", "", "Lradio"));
        b.add(new Book("Josué de Castro", "Fisiología de los tabús", "Coleg. de México", "1945", "", "Lradio"));
        b.add(new Book("Carlos Gurméndez", "Ser para no ser", "Tecnos", "1962", "", "Lradio"));
        b.add(new Book("Gilbert Murray", "Grecia clásica y mundo moderno", "Norte y Sur", "1962", "", "Lradio"));
        b.add(new Book("Etienne Gilson", "El ser y la esencia", "Desclée de B.", "1951", "", "Lradio"));
        b.add(new Book("Henry Bremond", "Newman Ensayo de biografía psicológica", "Desclée de B.", "1947", "", "Lradio"));
        b.add(new Book("Bertand Russell", "Fundamentos de filosofía", "José Janés", "1956", "", "Lradio"));
        b.add(new Book("Bertand Russell", "Misticismo y lógica y otros ensayos", "Paidós", "1949", "", "Lradio"));
        b.add(new Book("Guido de Ruggiero", "El retorno a la razón", "Paidós", "1949", "", "Lradio"));
        b.add(new Book("J. Gómez Caffarena Juan M. Velasco", "Filosofía de la religión", "R. Occidente", "1973", "",
                "Lradio"));
        b.add(new Book("M. M. Rosental", "Principios de lógica dialéctica", "Pueblos Unidos", "1965", "", "Lradio"));
        b.add(new Book("Juan D. García Bacca", "Fragmentos filosóficos de los presocráticos", "Un. Venezolana", "", "",
                "Lradio"));
        b.add(new Book("Juan A. Nuño Montes", "La dialéctica platoniana", "Un. Venezolana", "1962", "", "Lradio"));
        b.add(new Book("Universidad Nacional A. de México", "Homenaje a Bergson", "I. Universitaria", "1941", "",
                "Lradio"));
        b.add(new Book("A. de Waehlens", "La filosofía de Mantin Heidegger", "Inst. Luis Vives", "1945", "", "Lradio"));
        b.add(new Book("J. González Martínez", "Existencialismo, dinero y ética", "Morata", "1952", "", "Lradio"));
        b.add(new Book("R. E. Brennan, O.P. y Colaboradores", "Ensayos sobre el tomismo", "Morata", "1962", "",
                "Lradio"));
        b.add(new Book("Michele F. Sciacca", "Platón", "Troquel", "1959", "", "Lradio"));
        b.add(new Book("Michele F. Sciacca", "Acto y ser", "Luis Miracle", "1961", "", "Lradio"));
        b.add(new Book("Michele F. Sciacca", "El silencio y la palabra", "Luis Miracle", "1961", "", "Lradio"));
        b.add(new Book("Michele F. Sciacca", "La filosofía hoy", "Luis Miracle", "1947", "", "Lradio"));
        b.add(new Book("Michele F. Sciacca", "La libertad y el tiempo", "Luis Miracle", "1967", "", "Lradio"));
        b.add(new Book("Michele F. Sciacca", "El hombre, este desequilibrado", "Luis Miracle", "1958", "", "Lradio"));
        b.add(new Book("José Gaos", "Discurso de filosofía", "Uni. Veracruzana", "1959", "", "Lradio"));
        b.add(new Book("José Gaos", "Orígenes de la filosofía y su historia", "Uni. Veracruzana", "1960", "", "Lradio"));
        b.add(new Book("José Gaos", "Filosofía contemporánea", "Uni. Venezuela", "1962", "", "Lradio"));
        b.add(new Book("José Gaos", "Introducción a el ser y el tiempo de M. Heidegger", "F. C. E.", "1951", "",
                "Lradio"));
        b.add(new Book("José Gaos", "De la filosofía", "F. C. E.", "1962", "", "Lradio"));
        b.add(new Book("José Gaos", "Antología filosófica La filosofía griega", "F. C. E.", "1940", "", "Lradio"));
        b.add(new Book("José Gaos", "Hstoria de nuestra idea del mundo", "F. C. E.", "1979", "1ª reimp.", "Lradio"));
        b.add(new Book("Ernst Cassirer", "El problema del conocimiento T. I", "F. C. E.", "1953", "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "El problema del conocimiento T. II", "F. C. E.", "1956", "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "El problema del conocimiento T. III", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "El problema del conoc. De la muerte de Hegel a n. días", "F. C. E.", "1948",
                "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "Antropología filosófica", "F. C. E.", "1945", "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "Filosofía de la ilustración", "F. C. E.", "1950", "2ª ed.", "Lradio"));
        b.add(new Book("Ernst Cassirer", "Kant Vida y doctrina", "F. C. E.", "1948", "", "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Filosofía real", "F. C. E.", "1984", "", "Lradio"));
        b.add(new Book("G. W. F. Hegel", "Lecciones sobre Historia de la filosofía I, II y III", "F. C. E.", "1955",
                "", "Lradio"));
        b.add(new Book("Voltaire", "El siglo de Luis XIV", "F. C. E.", "1954", "", "Lradio"));
        b.add(new Book("J. A. Symonds", "El renacimiento en Italia I y II", "F. C. E.", "1957", "", "Lradio"));
        b.add(new Book("Nicolay Berdiaer", "Autobiografía espiritual", "Luis Miracle", "1957", "", "Lradio"));
        b.add(new Book("Werner Jaeger", "Aristóteles", "F. C. E.", "1946", "", "Lradio"));
        b.add(new Book("Werner Jaeger", "La teología de los primeros filósofos griegos", "F. C. E.", "1952", "",
                "Lradio"));
        b.add(new Book("Erich Kahler", "Historia universal del hombre", "F. C. E.", "1960", "3ª ed.", "Lradio"));
        b.add(new Book("G. Van Der Leeuw", "Fenomenología de la religión", "F. C. E.", "1964", "", "Lradio"));
        b.add(new Book("E. Paolo Lamanna", "Hª de la Filosofía I El pensamiento antiguo", "Hachette", "1957", "",
                "Lradio"));
        b.add(new Book("E. Paolo Lamanna", "Hª de la Filosofía II El pens. en la E. Media y el renac.", "Hachette",
                "1960", "", "Lradio"));
        b.add(new Book("E. Paolo Lamanna", "Hª de la Filosofía III De Descartes a Kant", "Hachette", "1964", "",
                "Lradio"));
        b.add(new Book("Arturo Gaete", "El sistema maduro de Ortega", "Cía. G. Fabril", "1962", "", "Lradio"));
        b.add(new Book("Hernán Larrain Acuña", "La génesis del pensamiento de Ortega", "Cía. G. Fabril", "1962", "",
                "Lradio"));
        b.add(new Book("Julio Bayón", "Razón vital y dialéctica de Ortega", "R. Occidente", "1972", "", "Lradio"));
        b.add(new Book("José Ortega y Gasset", "Pasado y porvenir para el hombre actual", "R. Occidente", "1962", "",
                "Lradio"));
        b.add(new Book("José Ortega y Gasset", "Meditación del pueblo joven", "R. Occidente", "1958", "", "Lradio"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. I, II y  III", "R. Occidente", "1946", "", "Lradio"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. IV, V y VI", "R. Occidente", "1947", "", "Lradio"));
        b.add(new Book("Ciriaco Morón Arroyo", "El sistema de Ortega y Gasset", "Alcalá", "1947", "", "Lradio"));
        b.add(new Book("Carlos Valverde", "El materialismo dialéctico", "Esp. Calpe S.A.", "1979", "", "Lradio"));
        b.add(new Book("Conde de Keyserling", "Norteamérica libertada", "Esp. Calpe S.A.", "1931", "", "Lradio"));
        b.add(new Book("Giovanni Reale y Darío Antiseri", "Hª del pensamiento filosófico y científico I, II y III",
                "Herder", "1988", "", "Lradio"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. 1", "Alianza Dic.", "1979", "", "Lradio"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. 2", "Alianza Dic.", "1979", "", "Lradio"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. 3", "Alianza Dic.", "1979", "", "Lradio"));
        b.add(new Book("Dirigida por Karl Rahner, S.I.", "Enciclopedia Teológica Sacramentum Mundi T. I", "Herder",
                "1972", "", "Lradio"));
        b.add(new Book("W. K. C. Guthrie", "Historia de la filosofía griega I y II", "Gredos", "1984", "", "Lradio"));
        b.add(new Book("W. K. C. Guthrie", "Historia de la filosofía griega III", "Gredos", "1988", "", "Lradio"));
        b.add(new Book("Etienne Gilson", "El espíritu de la filosofía medieval", "Emecé", "1952", "", "Lradio"));
        b.add(new Book("Etienne Gilson", "Dios y la filosofía", "Emecé", "1945", "", "Lradio"));
        b.add(new Book("Ernst Cassirer", "Individuo y cosmos en la Fª del renacimiento", "Emecé", "1951", "", "Lradio"));
        b.add(new Book("Ernst Von Aster", "La filosofía del presente", "Univ. México", "1964", "", "Lradio"));
        b.add(new Book("Edmund Husserl", "Lógica formal y lógica trascendental", "Univ. México", "1962", "", "Lradio"));
        b.add(new Book("Morris R. Cohen", "Razón y naturaleza", "Paidos", "1956", "", "Lradio"));
        b.add(new Book("Biblioteca de Autores Españoles", "Curiosidades bibliográficas", "Atlas", "1950", "", "Lradio"));
        b.add(new Book("Jean Seznec", "Los dioses de la antigüedad", "Taurus", "1983", "", "Lradio"));
        b.add(new Book("Antonio Millán Puelles", "La estructura de la subjetividad", "Rialp", "1967", "", "Lradio"));
        b.add(new Book("Varios Autores", "La filosofía De Hegel a Foucault…", "Mensajero", "1974", "", "Lradio"));
        b.add(new Book("Dr. Franz Völgyesi", "El alma lo es todo", "Luis de Caralt", "1956", "", "Lradio"));
        b.add(new Book("Gaëtan Picon", "Panorama de las ideas contemporáneas", "Guadarrama", "1958", "", "Lradio"));
        b.add(new Book("Joaquín Arnau é Ibáñez", "Curso de metafísica", "Manuel Alufre", "1889", "", "Lradio"));
        b.add(new Book("J. Zeleny", "La estructura lógica de \"El capital\" de Marx", "Grijalbo", "1974", "", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía I Antigüedad hasta s. XIX", "Grijalbo",
                "1968", "", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía II Revolución burguesa", "Grijalbo", "1965",
                "2ª ed.", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía III Nacimiento marxismo", "Grijalbo", "1967",
                "", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía IV Segunda mitad s. XIX", "Grijalbo", "1962",
                "", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía V S. XIX a 1917", "Grijalbo", "1969",
                "2ª ed.", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía VI Desde 1917 hasta nuestros días",
                "Grijalbo", "1966", "", "Lradio"));
        b.add(new Book("M. A. Dynnik y otros", "Historia de la filosofía VII Desde 1917 hasta nuestros días",
                "Grijalbo", "1966", "", "Lradio"));
        b.add(new Book("Friedrich Nietzsche", "Obras Completas V. I, II, III, IV y V", "Prestigio", "1970", "",
                "Lradio"));
        b.add(new Book("Giuseppe Toffanin", "Historia del humanismo", "Nova", "1953", "", "Lradio"));
        b.add(new Book("François Mauriac", "Obras completas", "Plaza Janés", "1961", "2ª ed. Piel", "Lradio"));
        b.add(new Book("Emile Bréhier", "Historia de la Filosofía T. I y II", "Sudamericana", "1944", "", "Lradio"));
        b.add(new Book("Georges Duby", "Adolescencia del cristianismo occidental 980-1140", "Skira", "1967", "",
                "Lradio"));
        b.add(new Book("Georges Duby", "La Europa de las catedrales 1140-1280", "Skira", "1967", "", "Lradio"));
        b.add(new Book("Georges Duby", "Fundamentos de un nuevo humanismo 1280-1440", "Skira", "1966", "", "Lradio"));
        b.add(new Book("André Chastel", "La crisis del renacimiento 1520-1600", "Skira", "1968", "", "Lradio"));
        b.add(new Book("Giulio Carlo Argan", "La Europa de las capitales 1600-1700", "Skira", "1964", "", "Lradio"));
        b.add(new Book("Jean Starobinski", "La invención de la liberad 1700-1789", "Skira", "1964", "", "Lradio"));
        b.add(new Book("Eugenie de Keyser", "El Occidente romántico 1789-1850", "Skira", "1965", "", "Lradio"));
        b.add(new Book("Nello Ponente", "Estructuras del mundo moderno 1850-1900", "Skira", "1965", "", "Lradio"));
        b.add(new Book("Robert L. Delevoy", "Dimensiones del siglo XX", "Skira", "1965", "", "Lradio"));
        b.add(new Book("Pedro Mnez. Montarez-C. Ruiz Bravo. V", "Europa Islámica", "Anaya", "1991", "", "Lradio"));
        b.add(new Book("Román Gubern", "Historia del cine 1 y 2", "Danae, S.A.", "1973", "3ª ed.", "Lradio"));
        b.add(new Book("Director P. Grimal", "Mitologías Del Mediterraneo al Ganges", "Planeta", "1970", "", "Lradio"));
        b.add(new Book("Director P. Grimal", "Mitologías De las estepas, de los bosques y de las islas", "Planeta",
                "1970", "", "Lradio"));
        b.add(new Book("Desmond Morris", "El hombre al desnudo", "Cantábrica", "1980", "", "Lradio"));
        b.add(new Book("Dagobert D. Runes", "Historia ilustrada de a filosofía", "Grijalbo, S.A.", "1967", "", "Lradio"));
        b.add(new Book("Bertrand Russell", "La sabiduría de Occidente", "Aguilar", "1971", "2ª reimp.", "Lradio"));
        b.add(new Book("Carl G. Jung y otros", "El hombre y sus símbolos", "Aguilar", "1966", "", "Lradio"));
        b.add(new Book("Miguel de Cervantes Saavedra", "El ingenioso hidalgo D. Quijote de la mancha", "Aguilar, S.A.",
                "1949", "Piel", "Lradio"));
        b.add(new Book("Wenceslao Fernández Flórez", "Obras completas T. I, II, III, IV y V", "M. Aguilar", "1945",
                "Piel", "Lradio"));
        b.add(new Book("Miguel de Unamuno", "Ensayos T. I y II", "M. Aguilar", "1945", "Piel", "Lradio"));
        b.add(new Book("Virgilio / Horacio", "Obras completas", "M. Aguilar", "1945", "Piel", "Lradio"));
        b.add(new Book("Cayo Cornelio Tácito", "Obras completas", "Aguilar", "1957", "2ª ed. Piel", "Lradio"));
        b.add(new Book("Walt Whitman", "Obras escogidas", "Aguilar", "1955", "2ª ed. Piel", "Lradio"));
        b.add(new Book("Traduct. y Pról. R. Cansinos Assens", "El Koran Versión literal e íntegra", "Aguilar", "1981",
                "6ª ed.", "Lradio"));
        b.add(new Book("Ricardo Palma", "Tradiciones peruanas completas", "Aguilar", "1964", "", "Lradio"));
        b.add(new Book("Luis de Camôes", "Os Lusiadas", "A. M. Pereira", "1971", "Portugués", "Lradio"));
        b.add(new Book("Séneca", "El libro de oro", "I. Cabrerizo", "1831", "2ª impresión", "Lradio"));
        b.add(new Book("Don Jaime Balmes", "El criterio", "Garnier Hnos.", "1893", "5ª ed.", "Lradio"));
        b.add(new Book("Nietzsche", "Obras inmortales", "Edaf", "1984", "", "Lradio"));
        b.add(new Book("Voltaire", "Cuentos escogidos II (Amigos de la Historia)", "Bruguera", "1970", "", "Lradio"));
        b.add(new Book("André Chastel", "El mito del renacimiento 1420-1520", "Skira", "1969", "", "Lradio"));
        b.add(new Book("Angel Ganivet", "Obras completas T. Primero y Segundo", "M. Aguilar", "1943", "Piel", "Lradio"));
        b.add(new Book("Platón", "La república", "Aguilar", "1968", "3ª ed.", "Lradio"));
        b.add(new Book("Alfredo Weber", "Historia de la filosofía europea", "Daniel Jorro", "1914", "error pág.",
                "Lradio"));
        b.add(new Book("Dirigida por François Châtelet", "Historia de la filosofía T. 2", "Esp. Calpe S.A.", "1976",
                "", "Lradio"));
        b.add(new Book("Dirigida por François Châtelet", "Historia de la filosofía T. 3", "Esp. Calpe S.A.", "1976",
                "", "Lradio"));
        b.add(new Book("Dirigida por François Châtelet", "Historia de la filosofía T. 4", "Esp. Calpe S.A.", "1976",
                "", "Lradio"));
        b.add(new Book("Ralph Linton", "Estudio del hombre", "F. C. E.", "1959", "4ª ed. Intonso", "Lradio"));
        b.add(new Book("Rodolfo Eucken", "Los grandes pensadores. Su teoría de la vida", "Daniel Jorro", "1914", "",
                "Lradio"));
        b.add(new Book("Gonzalo Sobejano", "Nietzsche en España", "Gredos", "1967", "", "Lradio"));
        b.add(new Book("E. Correa Calderón", "Teoría de la Atlántida y otras historias fabulosas", "R. Occidente",
                "1959", "", "Lradio"));
        b.add(new Book("Juan Jacobo Rousseau", "Julia ó la nueva Eloísa", "De Oliva", "1836", "", "Lradio"));
        b.add(new Book("Harald  Höffding", "Rousseau", "R. Occidente", "1931", "", "Lradio"));
        b.add(new Book("Ernesto Mayz Vallenilla", "El problema de la nada  en Kant", "R. Occidente", "1965", "",
                "Lradio"));
        b.add(new Book("Ernesto Mayz  Vallenilla", "Ontología del conocimiento", "Univ. Venezuela", "1960", "",
                "Lradio"));
        b.add(new Book("V. Mellusi", "Del amor al delito T. I y II", "Góngora", "1914", "", "Lradio"));
        b.add(new Book("Maurice Merlaeau-Ponty", "La estructura del comportamiento", "Hachette", "1957", "", "Lradio"));
        b.add(new Book("Pedro Cerezo Galán", "Arte, verdad y ser en Heidegger", "Raycar, S.A.", "1963", "", "Lradio"));
        b.add(new Book("Manuel Gª Morente y J. Zaragüeta B.", "Fundamentos de fª e hª de los sistemas filosóficos",
                "Esp. Calpe S.A.", "1954", "4ª ed.", "Lradio"));
        b.add(new Book("Vicente Fatone", "La existencia humana y sus filósofos", "Raigal", "1953", "", "Lradio"));
        b.add(new Book("Moralistas Griegos", "Pensamientos", "Nueva B. Fca.", "1935", "", "Lradio"));
        b.add(new Book("Juan Wahl", "Estudio sobre el \"Parménides de Platón\"", "Nueva B. Fca.", "1929", "", "Lradio"));
        b.add(new Book("Pitágoras", "Los versos de oro (Hierócles)", "Nueva B. Fca.", "1929", "", "Lradio"));
        b.add(new Book("Julio Barbey  D'aurevilly", "Las diabólicas", "Lorenzana", "1965", "", "Lradio"));
        b.add(new Book("Gabriel Marcel", "Los hombres contra lo humano", "Hachette", "1955", "Intonso", "Lradio"));
        b.add(new Book("Conde de Keyserling", "Diario de viaje de un filósofo I", "Esp. Calpe S.A.", "1928", "",
                "Lradio"));
        b.add(new Book("Else Hoppe (editor)", "El hombre en la literatura de la mujer", "Gredos", "1964", "Intonso",
                "Lradio"));
        b.add(new Book("Guillermo Araya", "Claves filosóficas para la comprensión de Ortega", "Gredos", "1971",
                "Intonso", "Lradio"));
        b.add(new Book("Jacques Maritain", "Introducción general a la filosofía", "Club de Lectores", "1950", "",
                "Lradio"));
        b.add(new Book("Fernand van Steenberghen", "Epistemología", "B. H. F.", "1956", "", "Lradio"));
        b.add(new Book("HectorD.  Mandrioni", "Introducción a la filosofía", "Troquel", "1954", "", "Lradio"));
        b.add(new Book("José Gaos", "Del hombre", "F. C. E.", "1970", "Intonso", "Lradio"));
        b.add(new Book("Angel González Alvarez", "Introducción a la metafísica", "U. Nac. de Cuyo", "1951", "Intonso",
                "Lradio"));
        b.add(new Book("Conde de Keyserling", "Europa Análisis espectral de un continente", "Esp. Calpe S.A.", "1929",
                "2ª ed. correg.", "Lradio"));
        b.add(new Book("Valentin García Yebra", "Metafísica de Aristóteles", "Gredos", "1982", "Trilingüe 2ª ed.",
                "Lradio"));
        b.add(new Book("Luis M. de Cádiz", "Historia de la literatura  patrística", "Nova", "1954", "", "Lradio"));
        b.add(new Book("Etienne Gilson", "La filosofía de San Buenaventura", "Desclée de B.", "1948", "Intonso",
                "Lradio"));
        b.add(new Book("George H. Mead", "Espíritu, persona y sociedad", "Paidós", "1953", "Intonso", "Lradio"));
        b.add(new Book("Valentin García Yebra", "Poética de Aristóteles", "Gredos", "1974", "Trilingüe", "Lradio"));
        b.add(new Book("Selecciones del Reader's Digest", "Historia del hombre", "Printer", "1974", "", "Lradio"));
        b.add(new Book("Selecciones del Reader's Digest", "Hacia lo desconocido", "A. G. Toledo", "1982", "", "Lradio"));
        b.add(new Book("Harald Höffding", "Kierkegaard (Sören)", "R. Occidente", "1949", "2ª ed.", "Lradio"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. 4", "Alianza Dic.", "1979", "", "Lradio"));
        b.add(new Book("Conde de Keyserling", "Diario de viaje de un filósofo  II", "Esp. Calpe S.A.", "1928", "",
                "Lradio"));
        b.add(new Book("Guillermo Dilthey", "Introducción a las ciencias del espíritu I", "Esp. Calpe S.A.", "1948",
                "", "Lradio"));
        b.add(new Book("Guillermo Dilthey", "Introducción a las ciencias del espíritu II", "Esp. Calpe S.A.", "1948",
                "", "Lradio"));
        b.add(new Book("Dirigida por François Châtelet", "Historia de la filosofía T. 1", "Esp. Calpe S.A.", "1976",
                "", "Lradio"));
    }

    private static void fillLpuerta() {
        final List<Book> b = DB.get("Lpuerta");
        b.add(new Book("Aldous Huxley", "Nueva visita a un mundo feliz", "Sudamericana", "1962", "2ª ed.", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Cefalú", "Sudamericana", "1950", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Justine El cuarteto de Alejandría", "Sudamericana", "1961", "4ª ed.",
                "Lpuerta"));
        b.add(new Book("Conde de Keyserling", "Viaje a través del tiempo T. II", "Sudamericana", "1951", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "La gravedad y la gracia", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "La fuente griega", "Sudamericana", "1961", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "Opresión y libertad", "Sudamericana", "1957", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "Espera de Dios", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("Antonio Caso", "El acto ideatorio y la filosofía de Husserl", "Porrúa, S. A.", "1946",
                "Intonso", "Lpuerta"));
        b.add(new Book("William Faulkner", "Requiem para  una mujer", "Emecé", "1952", "Intonso", "Lpuerta"));
        b.add(new Book("Béatriz  Beck", "León Morin,  sacerdote", "Emecé", "1954", "2ª impres.", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Prolegómenos para una metafísica de la esperanza", "Nova", "1954", "",
                "Lpuerta"));
        b.add(new Book("José Rubio Carracedo", "Levi-Strauss: estructuralismo y ciencias humanas", "Istmo", "1976", "",
                "Lpuerta"));
        b.add(new Book("Ferecaz Koermendi", "Los pecadores", "Sudamericana", "1950", "", "Lpuerta"));
        b.add(new Book("Johannes Hessen", "Tratado de filosofía T. II", "Sudamericana", "1959", "", "Lpuerta"));
        b.add(new Book("Johannes Hessen", "Tratado de filosofía T. III", "Sudamericana", "1962", "", "Lpuerta"));
        b.add(new Book("José Ferrater Mora", "El sentido de la muerte", "Sudamericana", "1947", "", "Lpuerta"));
        b.add(new Book("Julien Green", "Moira", "Emecé", "1954", "3ª reimp.", "Lpuerta"));
        b.add(new Book("Julien Green", "Tierra lejana", "Emecé", "1967", "", "Lpuerta"));
        b.add(new Book("William Faulkner", "Gambito de caballo", "Emecé", "1951", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "La tierra santa", "Emecé", "1965", "", "Lpuerta"));
        b.add(new Book("Franz Kaffka", "La muralla china", "Emecé", "1953", "", "Lpuerta"));
        b.add(new Book("Franz Kaffka", "El castillo", "Emecé", "1955", "4ª impres.", "Lpuerta"));
        b.add(new Book("Franz Kaffka", "América", "Emecé", "1952", "3ª ed.", "Lpuerta"));
        b.add(new Book("Franz Kaffka", "La condena", "Emecé", "1952", "2ª ed.", "Lpuerta"));
        b.add(new Book("Carlo Cóccioli", "El cielo y la tierra", "Emecé", "1955", "3ª impres.", "Lpuerta"));
        b.add(new Book("Georges Bernanos", "Diálogo de sombras", "Emecé", "1956", "", "Lpuerta"));
        b.add(new Book("Edgar Alan Poe", "Eureka Marginalia, La Fª de la composición", "Emecé", "1944", "", "Lpuerta"));
        b.add(new Book("Charles Péguy", "Nota conjunta sobre Descartes y la Fª cartesiana", "Emecé", "1946", "",
                "Lpuerta"));
        b.add(new Book("Charles Du bos", "Extractos de un diario", "Emecé", "1947", "", "Lpuerta"));
        b.add(new Book("León Chestov", "La filosofía de la tragedia", "Emecé", "1949", "", "Lpuerta"));
        b.add(new Book("T. S. Eliot", "Notas para la definición de la cultura", "Emecé", "1952", "2ª ed.", "Lpuerta"));
        b.add(new Book("Benedetto Croce", "La poesía", "Emecé", "1954", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Biografía de la filosofía", "Emecé", "1956", "2ª ed.", "Lpuerta"));
        b.add(new Book("Romano Guardini", "Pascal o el drama de la conciencia cristiana", "Emecé", "1955", "",
                "Lpuerta"));
        b.add(new Book("Romano Guardini", "El universo religioso de Dostoyevski", "Emecé", "1954", "", "Lpuerta"));
        b.add(new Book("Johan Huizinga", "Homo ludens", "Emecé", "1957", "", "Lpuerta"));
        b.add(new Book("François Mauriac", "De Pascal a Graham Green", "Emecé", "1655", "2ª impres.", "Lpuerta"));
        b.add(new Book("Alain", "Veinte lecciones sobre las bellas artes", "Emecé", "1955", "2ª impres.", "Lpuerta"));
        b.add(new Book("Arnold Toynbee", "El cristianismo entre las religiones del mundo", "Emecé", "1960", "",
                "Lpuerta"));
        b.add(new Book("Arnold Toynbee", "La civilización puesta a prueba", "Emecé", "1954", "3ª ed.", "Lpuerta"));
        b.add(new Book("James Joyce", "Esteban el héroe", "Sur", "1960", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Mountolive  El cuarteto de Alejandría", "Sudamericana", "1961", "",
                "Lpuerta"));
        b.add(new Book("Lanza del Basto", "Principios y preceptos del retorno a la evidencia", "Sur", "1958", "",
                "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "III El buen tiempo", "Losada", "1945", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "I El 6 de octubre", "Losada", "1954", "2ª ed.", "Lpuerta"));
        b.add(new Book("Jules Romains", "II El crimen de Quinette", "Losada", "1944", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "III Los amores infantiles", "Losada", "1945", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "IV Eros de París", "Losada", "1945", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "V Los soberbios", "Losada", "1946", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "VI Los humildes", "Losada", "1947", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "IX Marea de peligros", "Losada", "1947", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "X Los poderes", "Losada", "1950", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XI Apelación al abismo", "Losada", "1950", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XII Los creadores", "Losada", "1951", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XIII Misión en Roma", "Losada", "1951", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XIV La bandera negra", "Losada", "1951", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XV Preludio de Verdun", "Losada", "1952", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XVI Verdun", "Losada", "1952", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XVII Vorge contra Quinette", "Losada", "1953", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XVIII La dulzura de la vida", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XIX Ese gran resplandor al este", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XX El mundo es tu aventura", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXI Jornadas en la montaña", "Losada", "1958", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXII Los trabajos y los placeres", "Losada", "1958", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXIII Nacimiento de la banda", "Losada", "1958", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXIV Comparecencias", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXV La alfombra mágica", "Losada", "1959", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXVI Francisca", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Jules Romains", "XXVII El 7 de octubre", "Losada", "1961", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Balthazar El cuarteto de Alejandría", "Sudamericana", "1961", "3ª ed.",
                "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Clea El cuarteto de Alejandría", "Sudamericana", "1962", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("William Barret", "El hombre irracional", "Siglo veinte", "1967", "", "Lpuerta"));
        b.add(new Book("Raymon Aron", "Introducción a la filosofía de la historia 1 y 2", "Siglo veinte", "1983", "",
                "Lpuerta"));
        b.add(new Book("Eduard Zeller", "Fundamentos de la filosofía griega", "Siglo veinte", "1961", "", "Lpuerta"));
        b.add(new Book("Georg Simmel", "Problemas de filosofía de la historia", "Nova", "1950", "", "Lpuerta"));
        b.add(new Book("Georg Simmel", "Goethe", "Nova", "1949", "", "Lpuerta"));
        b.add(new Book("Georg Simmel", "Intuición de la vida", "Nova", "1950", "", "Lpuerta"));
        b.add(new Book("Edmundo Husserl", "Fenomenología de la conciencia del tiempo inmanente", "Nova", "1959", "",
                "Lpuerta"));
        b.add(new Book("Edmundo Husserl", "La filosofía como ciencia estricta", "Nova", "1962", "", "Lpuerta"));
        b.add(new Book("Max Scheler", "El santo, el genio, el héroe", "Nova", "1961", "", "Lpuerta"));
        b.add(new Book("Max Scheler", "Metafísica de la libertad", "Nova", "1960", "", "Lpuerta"));
        b.add(new Book("Max Scheler", "Idealismo Realismo", "Nova", "1962", "", "Lpuerta"));
        b.add(new Book("Eduard Zeller", "Sócrates y los sofistas", "Nova", "1955", "", "Lpuerta"));
        b.add(new Book("Heinrich Rickert", "Introducción a los problemas de la Fª de la Hª", "Nova", "1961", "",
                "Lpuerta"));
        b.add(new Book("Alfred North Whitenead", "El devenir de la religión", "Nova", "1961", "", "Lpuerta"));
        b.add(new Book("Georges Gusdort", "Mito y metafísica", "Nova", "1960", "", "Lpuerta"));
        b.add(new Book("Federico Schiller", "Poesía ingenua y poesía sentimental", "Nova", "1963", "", "Lpuerta"));
        b.add(new Book("Federico Schiller", "De la gracia y la dignidad", "Nova", "1962", "", "Lpuerta"));
        b.add(new Book("J. M. Verweyen", "Historia de la filosofía medieval", "Nova", "1957", "", "Lpuerta"));
        b.add(new Book("Sören Kierkegaard", "Estética y ética", "Nova", "1955", "", "Lpuerta"));
        b.add(new Book("Wolfgang Stegmüller", "Corrientes fundamentales de la Fª actual", "Nova", "1967", "", "Lpuerta"));
        b.add(new Book("Ezequiel Mnez. Estrada", "Heraldos de la verdad Montaigne, Balzac, Nietzsche", "Nova", "1957",
                "", "Lpuerta"));
        b.add(new Book("Carlos M. Rama", "Teoría de la historia", "Nova", "1959", "", "Lpuerta"));
        b.add(new Book("Varios autores", "1 Introducción al estructuralismo", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "2 Estructuralismo y estética", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "4 Estructuralismo y lingüística", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "5 Estructuralismo y filosofía", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "6 Estructuralismo e historia", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "7 Estructuralismo y sociología", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Varios autores", "8 Estructuralismo y psicoanálisis", "Nueva Visión", "1970", "", "Lpuerta"));
        b.add(new Book("Varios autores", "9 Estructuralismo y literatura", "Nueva Visión", "1970", "", "Lpuerta"));
        b.add(new Book("Varios autores", "10 Estructuralismo y epistemología", "Nueva Visión", "1970", "", "Lpuerta"));
        b.add(new Book("Varios autores", "11 Estructuralismo, mito y totemismo", "Nueva Visión", "1970", "", "Lpuerta"));
        b.add(new Book("Varios autores", "12 Estructuralismo y psicología", "Nueva Visión", "1970", "", "Lpuerta"));
        b.add(new Book("Giuseppe Marotta", "San Jenaro nunca dice no", "Goyanarte", "1954", "", "Lpuerta"));
        b.add(new Book("Lanza del Vasto", "Judas", "Goyanarte", "1954", "3ª ed.", "Lpuerta"));
        b.add(new Book("Joyelyn Brooke", "El chivo emisario", "Goyanarte", "1954", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El ser y la nada T. I, II y III", "Ibero-Americ.", "1961", "3ª ed.",
                "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Crítica de la razón dialéctica T. I y II", "Losada, S. A.", "1963", "",
                "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Lo imaginario", "Losada, S. A.", "1964", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El hombre y las cosas", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "La república del silencio", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Las palabras", "Losada", "1964", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Baudelaire", "Losada", "1957", "2ª ed.", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Problemas del marxismo", "Losada", "1966", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Autoretrato a los sesenta años", "Losada", "1977", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Qué es la literatura", "Losada", "1950", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Teatro 1 Las moscas. A puerta cerrada...", "Losada", "1958", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Teatro 2 El diablo y Dios", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Teatro 4 Los secuestrados de Altona", "Losada", "1961", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Cuadernos de guerra", "Edhasa", "1987", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Historia de una amistad", "Nagelkop", "1965", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "La imaginación", "Sudamericana", "1967", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "La trascendencia del ego", "Calden", "1968", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El existencialismo es un humanismo", "Sur", "1980", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Reflexiones sobre la cuestión judía", "Sur", "1960", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "Materialismo y revolución", "Deucalión", "1954", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El fantasma de Stalin", "S. Rueda", "1957", "", "Lpuerta"));
        b.add(new Book("Ignacio Sotelo", "Sartre y la razón dialéctica", "Tecnos", "1967", "", "Lpuerta"));
        b.add(new Book("Varios autores", "Sartre,  el último metafísico", "Paidos", "1968", "", "Lpuerta"));
        b.add(new Book("Varios autores", "Sartre y el estructuralismo", "Quintaria", "1968", "", "Lpuerta"));
        b.add(new Book("Roger Garaudy", "Preguntas a J. P. Sartre", "Procyon", "1964", "", "Lpuerta"));
        b.add(new Book("Francis Jeanson", "J. P. Sartre en su vida", "Barral", "1975", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "Raices del existir", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("Francis Jeanson", "El problema moral y el pensamiento de Sartre", "Siglo veinte", "1968", "",
                "Lpuerta"));
        b.add(new Book("Iris Murdoch", "Sartre", "Sur", "1956", "", "Lpuerta"));
        b.add(new Book("Leo Pollmann", "Sartre y Camus", "Gredos", "1973", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "Carnets Mayo 1935 Febrero 1942", "Losada", "1963", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "El mito de Sísifo El hombre rebelde", "Losada", "1953", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "Problemas de nuestra época Crónica argelina", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "El revés y el derecho Discurso de Suecia", "Losada", "1958", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "Bodas", "Sur", "1957", "2ª ed.", "Lpuerta"));
        b.add(new Book("Albert Camus", "La peste", "Sur", "1955", "4ªed.", "Lpuerta"));
        b.add(new Book("Albert Camus", "El extranjero", "Emecé", "1955", "5ª impres.", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "Para qué la acción", "Siglo veinte", "1965", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "El existencialismo y la sabiduría popular", "Siglo veinte", "1965", "",
                "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "J. P. Sartre versus Merleau-Ponty", "Siglo veinte", "1963", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "Memorias de una joven formal", "Sudamericana", "1959", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "Los mandarines", "Sudamericana", "1958", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "La plenitud de la vida", "Sudamericana", "1962", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "La vejez", "Sudamericana", "1970", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "La invitada", "Emecé", "1955", "2ª impres.", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "El marqués de Sade", "Leviatán", "1956", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "La sangre de otros", "Schapire", "1955", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "El segundo sexo  II", "Psique", "1954", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "Todos los hombres son mortales", "Edhasa", "1956", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "Un domingo después de la guerra", "Rueda", "1965", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "La crucifisión rosada Sexus", "Rueda", "1968", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "Pesadilla de aire acondicionado", "Siglo veinte", "1963", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "El ojo cosmológico", "Siglo veinte", "1965", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "Los libros de mi vida", "Siglo veinte", "1963", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "La sabiduria del corazón", "Sur", "1966", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "El mundo del sexo", "Sur", "1963", "", "Lpuerta"));
        b.add(new Book("Henry Miller", "El tiempo de los asesinos", "Sur", "1965", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "Qué es eso de la filosofía", "Sur", "1960", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "La pregunta por la cosa", "Sur", "1964", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "¿Qué significa pensar?", "Nova", "1958", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "Introducción a la metafísica", "Nova", "1956", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "Sendas perdidas", "Losada, S. A.", "1960", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "Qué es metafísica", "Alpe", "1955", "", "Lpuerta"));
        b.add(new Book("Richard Wisser", "Martin Heidegger al habla", "Studium", "1971", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "El misterio del ser", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Decadencia de la sabiduría", "Emecé", "1955", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Diario metafísico", "Losada, S.A.", "1957", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "La razón y sus enemigos en nuestro tiempo", "Sudamericana", "1953", "",
                "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Razón y existencia", "Nova", "1959", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Leonardo como filósofo", "Sur", "1956", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Los grandes filósofos I Sócrates, Buda, Confucio", "Sur", "1966", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Los grandes filósofos II Platón, Agustín, Kant...", "Sur", "1968", "",
                "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Autobiografía filosófica", "Sur", "1964", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "La filosofía de la existencia", "Aguilar", "1958", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Genio y locura", "Aguilar", "1955", "", "Lpuerta"));
        b.add(new Book("Jean Guitton", "El trabajo intelectual", "Criterio", "1955", "", "Lpuerta"));
        b.add(new Book("Jacques Maritain", "El sueño de Descartes", "Bib. Nueva", "1956", "", "Lpuerta"));
        b.add(new Book("Benedectto Croce", "El carácter de la filosofía moderna", "Imán", "1959", "", "Lpuerta"));
        b.add(new Book("Alfred Stern", "La Fª de Sartre y el psicoanálisis axistencialista", "Imán", "1951", "",
                "Lpuerta"));
        b.add(new Book("Emilio Lledó Iñigo", "El concepto \"poiesis\" en la Fª griega", "C. Bermejo", "1961", "",
                "Lpuerta"));
        b.add(new Book("Sören Kierkegaard", "Diario de un seductor", "Destino", "1988", "", "Lpuerta"));
        b.add(new Book("Inmanuel Kant", "La \"dissertatio\" de 1770", "CSIC", "1961", "Bilingüe", "Lpuerta"));
        b.add(new Book("Kant", "Filosofía de la historia", "Col. México", "1941", "", "Lpuerta"));
        b.add(new Book("Trad. y Pró. David Gª Bacca", "Los presocráticos I", "Col. México", "1943", "", "Lpuerta"));
        b.add(new Book("Trad. y Pró. David Gª Bacca", "Los presocráticos II", "Col. México", "1944", "", "Lpuerta"));
        b.add(new Book("Aldous Hussley", "La filosofía perenne", "Sudamericana", "1967", "", "Lpuerta"));
        b.add(new Book("Tristán Tzara", "El surrealismo de hoy", "Alpe", "1955", "", "Lpuerta"));
        b.add(new Book("José Antonio Míguez", "En torno al romanticismo alemán", "A. Aguado", "1949", "", "Lpuerta"));
        b.add(new Book("Rodolfo Mondolfo", "Rousseau y la conciencia moderna", "Eudeba", "1962", "", "Lpuerta"));
        b.add(new Book("George Santayana", "La idea de Cristo en los evangelios", "Sudamericana", "1947", "", "Lpuerta"));
        b.add(new Book("George Santayana", "Los reinos del ser", "F. C. E.", "1959", "", "Lpuerta"));
        b.add(new Book("George Santayana", "La vida de la razón", "Nova", "1958", "", "Lpuerta"));
        b.add(new Book("Richard Butler", "La vida y el mundo de Jorge  Santayana", "Gredos", "1961", "", "Lpuerta"));
        b.add(new Book("Pedro Sondereguer", "Límites y contenido de la metafísica", "Americalee", "1956", "", "Lpuerta"));
        b.add(new Book("Stanislas Fumet", "Misión de León Bloy", "Desclee B.", "1962", "", "Lpuerta"));
        b.add(new Book("Jean Wahl", "Historia del existencialismo", "Dédalo", "1960", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Idea de la metafísica", "Columba", "1954", "", "Lpuerta"));
        b.add(new Book("Louis Lavelle", "La presencia total", "Troquel", "1961", "", "Lpuerta"));
        b.add(new Book("Luzwig Marcuse", "Pesimismo un estado de la madurez", "Leviatán", "1956", "", "Lpuerta"));
        b.add(new Book("Gastón Bachelard", "La intuición del  instante", "Siglo veinte", "1973", "", "Lpuerta"));
        b.add(new Book("William Faulkner", "Mosquitos", "Siglo veinte", "1956", "", "Lpuerta"));
        b.add(new Book("Georges Bernanos", "Los grandes cementerios bajo la luna", "Siglo veinte", "1964", "",
                "Lpuerta"));
        b.add(new Book("André Guide", "Las cuevas del Vaticano", "Tirso", "1956", "", "Lpuerta"));
        b.add(new Book("Paul Gauguin", "Diario íntimo", "Del Pórtico", "1958", "", "Lpuerta"));
        b.add(new Book("Conde de Lautreamont", "Obras completas", "Boa", "1964", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "La vida de las máscaras", "Siglo XXI", "1981", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "El hombre desnudo", "Siglo XXI", "1976", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Antropología estructural", "Siglo XXI", "1979", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Mitológicas. El orígen de las maneras de mesa", "Siglo XXI", "1970", "",
                "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Mitológicas. Lo crudo y lo cocido", "F. C. E.", "1968", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Mitológicas. De la miel a las cenizas", "F. C. E.", "1972", "",
                "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "La mirada distante", "Argos Vergara", "1984", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Antropología estructural", "Eudeba", "1969", "2ª ed.", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Tristes trópicos", "Eudeba", "1970", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "La palabra dada", "Espasa-Calpe", "1984", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Elogio de la antropología", "Pasado y Pre.", "1968", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "La alfarera celosa", "Paidos", "1986", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss y otros", "Sentidos y usos del térm. estruct. en las CC del hombre",
                "Paidos", "1968", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Presencia de Rousseau", "Nueva visión", "1972", "", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss y otros", "El proceso ideológico", "Tiempo Cont.", "1976", "3ª ed.",
                "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss Seminario", "La identidad", "Petrel", "1981", "", "Lpuerta"));
        b.add(new Book("F. Remotti", "Estructura e Hª La antropología de L-S", "A. Redondo", "1972", "", "Lpuerta"));
        b.add(new Book("Trad. José Martín Arancibia", "Polémica C. Levi-Strauss Vladimir Propp", "Fundamentos", "1972",
                "", "Lpuerta"));
        b.add(new Book("Claude Levi-Strauss", " Estructuralismo y dialéctica", "Paidos", "1968", "", "Lpuerta"));
        b.add(new Book("Catherine Backes-Clement", "Levi-Strauss", "Anagrama", "1974", "", "Lpuerta"));
        b.add(new Book("Pietro Scaduelli", "Levi-Strauss y el tercer mundo", "Villalar", "1977", "", "Lpuerta"));
        b.add(new Book("Yvan Simonis", "C. Levi-Strauss o la \"pasión del incesto\"", "Cultura Popular", "1969", "",
                "Lpuerta"));
        b.add(new Book("Pedro Gómez García", "La antropología estructural de C. Levi-Strauss", "Tecnos", "1981", "",
                "Lpuerta"));
        b.add(new Book("Marcel Proust", "Crónicas", "S. Rueda", "1947", "", "Lpuerta"));
        b.add(new Book("Marcel Proust", "Los salones y la vida de Paris", "Suramerica", "1945", "", "Lpuerta"));
        b.add(new Book("Marcel Proust", "Ensayos literarios I y II", "Edhasa", "1971", "", "Lpuerta"));
        b.add(new Book("George D. Painter", "Marcel Proust Biografía V. 1 y 2", "Lumen", "1967", "", "Lpuerta"));
        b.add(new Book("Trad. Julio Martínez Mesanza", "Album Proust", "Mondadori", "1988", "2ª ed.", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Los 120 días de Sodoma", "Baal", "1960", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Justine o las desventuras de la virtud", "Baal", "1961", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Antología", "Nagelkop", "1966", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Los crímenes del amor I y II", "Al-borak", "1971", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Historia de Sainville y Leonore", "Espiral", "1974", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Correspondencia", "Anagrama", "1975", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "La folosofía en el tocador", "Nov. Filosóf.", "1969", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Cartas", "Rodolfo Alon.", "1969", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "El presidente burlado", "Rodolfo Alon.", "1968", "", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "La marquesa de Gange", "Rodolfo Alon.", "1969", "", "Lpuerta"));
        b.add(new Book("Maurice Blanchot", "Sade y Lautreamont", "Mediodía", "1967", "", "Lpuerta"));
        b.add(new Book("P. Sánchez Paredes", "El marqués de Sade", "Guadarrama", "1974", "", "Lpuerta"));
        b.add(new Book("Varios autores", "El pensamiento de Sade", "Paidós", "1969", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse", "El hombre unidimensional", "J. Mortiz", "1968", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse", "Eros y civilización", "J. Mortiz", "1965", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse", "Cultura y sociedad", "Sur", "1968", "2ª ed.", "Lpuerta"));
        b.add(new Book("Herbert Marcuse", "La sociedad opresora", "Tiempo Nuevo", "1970", "", "Lpuerta"));
        b.add(new Book("Luzwig  Marcuse", "Filosofía americana", "Guadarrama", "1969", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse", "Ensayos sobre política y cultura", "Ariel", "1969", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse y otros", "A la búsqueda del sentido", "Sígueme", "1976", "", "Lpuerta"));
        b.add(new Book("Herbert Marcuse y otros", "La nueva imagen del hombre", "Rodolfo Alon.", "1971", "", "Lpuerta"));
        b.add(new Book("Tito Perlini", "Marcuse", "Doncel", "1976", "", "Lpuerta"));
        b.add(new Book("J. M. Castellet", "Lectura de Marcuse", "Seix Barral", "1969", "", "Lpuerta"));
        b.add(new Book("Paul Mattick", "Crítica de Marcuse", "Grijalbo", "1974", "", "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "I El cuaderno gris II El correccional", "Losada", "1944",
                "", "Lpuerta"));
        b.add(new Book("J. M. Palmier", "En torno a Marcuse", "Guadiana de P.", "1969", "", "Lpuerta"));
        b.add(new Book("Erick Fromm y otros", "Marcuse polémico", "Jorge Alvarez", "1968", "", "Lpuerta"));
        b.add(new Book("Georges Bataille", "Las lágrimas de Eros", "Tusquest", "1981", "", "Lpuerta"));
        b.add(new Book("Georges Bataille", "El verdadero Barba - azul", "Tusquest", "1972", "", "Lpuerta"));
        b.add(new Book("Georges Bataille", "La parte maldita", "Edhasa", "1974", "", "Lpuerta"));
        b.add(new Book("Varios autores", "Bataille", "Madrágora", "1976", "", "Lpuerta"));
        b.add(new Book("Paul Valery", "Los principios de anarquía pura y aplicada", "Tusquest", "1987", "", "Lpuerta"));
        b.add(new Book("Paul Valery", "El cementerio marino", "Escelicer", "1960", "", "Lpuerta"));
        b.add(new Book("Paul Valery", "Monsieur Teste", "Montesinos", "1980", "", "Lpuerta"));
        b.add(new Book("Paul Valery", "Las quintaesencias", "José Janés", "1941", "", "Lpuerta"));
        b.add(new Book("Edmee de la Rochefoucauld", "Paul Valery", "Columba", "1961", "", "Lpuerta"));
        b.add(new Book("Jacques Derrida", "La diseminación", "Espiral", "1975", "", "Lpuerta"));
        b.add(new Book("Jacques Derrida", "Memorias de Paul de Man", "Gedisa", "1989", "", "Lpuerta"));
        b.add(new Book("Jacques Derrida", "Desconstrucción en las fronteras de la Fª", "Paidós", "1989", "", "Lpuerta"));
        b.add(new Book("Restif", "Sara o la última aventura de un hombre de 45 a.", "Rodolfo Alon.", "1969", "",
                "Lpuerta"));
        b.add(new Book("Xavier Zubiri", "Naturaleza, Historia, Dios", "Edit. Nacional", "1944", "", "Lpuerta"));
        b.add(new Book("Xavier Zubiri", "Sobre la esencia", "So.  Est. y Public.", "1962", "", "Lpuerta"));
        b.add(new Book("J. Huizinga", "El otoño de la Edad Media", "R. Occid. Arg.", "1947", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "La idea de principio en Leibniz", "Emecé", "1958", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Vives-Goethe", "R. Occidente", "1961", "", "Lpuerta"));
        b.add(new Book("José Gómez Caffarena", "Metafísica trascendental", "R. Occidente", "1970", "Intonso", "Lpuerta"));
        b.add(new Book("Jules Romains", "VII En busca de una iglesia", "Losada", "1947", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Antropología metafísica", "R. Occidente", "1970", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Ortega I Circunstancia y vocación", "R. Occidente", "1960", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Introducción a la folosofía", "R. Occidente", "1947", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Ortega y la idea de la razón", "A. Zúñiga", "1948", "2ª ed.", "Lpuerta"));
        b.add(new Book("Julián Marías", "La escolástica en su mundo y el nuestro", "Huguín", "1951", "", "Lpuerta"));
        b.add(new Book("Luzwig Schajowicz", "Mito y existencia", "De la Torre", "1962", "", "Lpuerta"));
        b.add(new Book("D. Riazamol", "Marx y Engels", "Claridad", "1962", "4ª ed.", "Lpuerta"));
        b.add(new Book("Jules Romains", "VIII Provincia", "Losada", "1947", "", "Lpuerta"));
        b.add(new Book("Henri-Fredéric Amiel", "Diario íntimo", "Losada", "1949", "", "Lpuerta"));
        b.add(new Book("Robert Waelder", "El pensamiento vivo de Freud", "Losada, S. A.", "1943", "", "Lpuerta"));
        b.add(new Book("Irving Stone", "Las pasiones de la mente", "Plaza Janés", "1972", "", "Lpuerta"));
        b.add(new Book("William Graham Sumner", "Los pueblos y sus  costumbres", "G. Kraft", "1948", "Numerado",
                "Lpuerta"));
        b.add(new Book("Thomas Merton", "Semillas de contemplación", "Sudamericana", "1958", "3ª ed.", "Lpuerta"));
        b.add(new Book("James Marschall Campbell", "Los padres griegos", "Nova", "1948", "", "Lpuerta"));
        b.add(new Book("Alfred Edward Taylor", "El platonismo y su influencia", "Nova", "1946", "", "Lpuerta"));
        b.add(new Book("Herbert Wendt", "Tras las huellas de Adán", "Noguer", "1962", "4ª ed.", "Lpuerta"));
        b.add(new Book("Juan Zaragüeta", "Vocabulario filosófico", "Espasa-Calpe", "1955", "", "Lpuerta"));
        b.add(new Book("Marcel Bataillon", "Erasmo y España", "F. C. E.", "1966", "2ª ed.C. y  aum.", "Lpuerta"));
        b.add(new Book("Albert Rivaud", "Historia de la Filosofía  T. 1, 2 y 3", "Kapelusz", "1962", "", "Lpuerta"));
        b.add(new Book("Emile Benveniste", "Vocabulario de las instituciones indoeuropeas", "Taurus", "1983", "",
                "Lpuerta"));
        b.add(new Book("Centro de Est. Filos. Gallarate", "Diccionario de filósofos", "Rioduero", "1986", "", "Lpuerta"));
        b.add(new Book("SARPE", "Historia del pensamiento 1, 2, 3, 4, 5 y 6", "SARPE", "1988", "", "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones Oriente y Grecia 1", "Destino", "1958", "",
                "Lpuerta"));
        b.add(new Book("Lacques Le Goff", "La civilización del occidente medieval", "Juventud", "1969", "", "Lpuerta"));
        b.add(new Book("Alfredo Fouillee", "Bosquejo psicológico de los pueblos europeos", "Americalee", "1943", "",
                "Lpuerta"));
        b.add(new Book("Manuel Azaña", "Obras completas 1", "Oasis", "1966", "", "Lpuerta"));
        b.add(new Book("Aloys Müller", "Introducción a la filosofía", "R. Occidente", "1931", "Pasta suelta", "Lpuerta"));
        b.add(new Book("Charles Renouvier", "Bosquejo de una clasif. sist. de las doct. filos. T. I y II",
                "Losada, S. A.", "1948", "", "Lpuerta"));
        b.add(new Book("Wladimir Weidlé", "Ensayo sobre el destino actual de las letras y las artes", "Emecé", "1951",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("Jean Guitton", "Aprender a vivir y a pensar", "Criterio", "1960", "", "Lpuerta"));
        b.add(new Book("Varios autores", "3 Estructuralismo y antropología", "Nueva Visión", "1969", "", "Lpuerta"));
        b.add(new Book("Erskine Caldwell", "Gretta", "Goyanarte", "1956", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El ser y la nada", "Losada", "1972", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "San Genet comediante y mártir", "Losada", "1967", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "Carnest 2 enero 1942 marzo 1951", "Losada", "1966", "", "Lpuerta"));
        b.add(new Book("Albert Camus", "Ni víctimas ni verdugos", "Reconstruir", "1960", "2ª ed. Ampli.", "Lpuerta"));
        b.add(new Book("Albert Camus", "La sangre de la libertad", "Americalee", "1958", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "Sobre la cuestión del ser", "R. Occidente", "1958", "", "Lpuerta"));
        b.add(new Book("Jean Guitton y otros", "El infierno", "Criterio", "1955", "", "Lpuerta"));
        b.add(new Book("Jean Wahl", "La lógica de Hegel como fenomenología", "La Pleyade", "1973", "", "Lpuerta"));
        b.add(new Book("Raul Echauri", "Heidegger y la metafísica tomista", "Eudeba", "1971", "", "Lpuerta"));
        b.add(new Book("Octavio N. Derisi", "El último Heidegger", "Eudeba", "1969", "", "Lpuerta"));
        b.add(new Book("Priscilla N. Cohn", "Heidegger Su filosofía a través de la nada", "Guadarrama", "1975", "",
                "Lpuerta"));
        b.add(new Book("Edmund Leach", "Levi- Strauss Antropología y Fª El oso y el barbero", "Anagrama", "1970", "",
                "Lpuerta"));
        b.add(new Book("M. Merleau-Ponty", "La fenomenología y las ciencias del hombre", "Nova", "1964", "", "Lpuerta"));
        b.add(new Book("Georg Simmel", "Rembrandt Ensayo de filosofía del arte", "Nova", "1950", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Dos discursos y un prólogo autobiográfico", "Herder", "1967", "", "Lpuerta"));
        b.add(new Book("Jean Guitton", "Lo que yo creo", "Acervo", "1973", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Aproximación al misterio del ser", "Encuentro S.A.1987", "1958", "",
                "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "El hombre problemático", "Sudamericana", "1956", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Descartes y la filosofía", "Leviatán", "1958", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Esencia y formas de lo trágico", "Sur", "1960", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Entre el destino y la voluntad", "Guadarrama", "1969", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Iniciación al método filosófico", "Espasa-Calpe", "1977", "", "Lpuerta"));
        b.add(new Book("Alfred Stern", "La Fª de Sartre y el psicoanálisis existencialista", "Fabril", "1962", "",
                "Lpuerta"));
        b.add(new Book("Eduardo Bello", "De Sartre a Merleau-Ponty", "Univ. Murcia", "1979", "", "Lpuerta"));
        b.add(new Book("David Hume", "Diálogos sobre religión natural", "Col. México", "1942", "", "Lpuerta"));
        b.add(new Book("George Santayana", "El sentido de la belleza", "Losada, S. A.", "1969", "", "Lpuerta"));
        b.add(new Book("José R. Llobera", "El futuro de los estudios del parentesco", "Anagrama", "1973", "", "Lpuerta"));
        b.add(new Book("Giovanni Papini", "El diablo", "Emecé", "1954", "3ª  impres.", "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Las estructuras elementales del parentesco", "Paidos", "1969", "",
                "Lpuerta"));
        b.add(new Book("Claude Lévi-Strauss", "Elogio de la antropología", "Calden  22", "1970", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Meditación de Europa", "R. Occidente", "1960", "", "Lpuerta"));
        b.add(new Book("Theodor W. Adorno", "Kierkegaard", "Monte Avila", "1969", "", "Lpuerta"));
        b.add(new Book("Teodoro Haecker", "La joroba de Kierkegaard", "Rialp", "1948", "", "Lpuerta"));
        b.add(new Book("León Pierre-Quint", "Marcel Proust (juventud-obra-tiempo)", "S. Rueda", "1944", "", "Lpuerta"));
        b.add(new Book("Marcel Proust", "En busca del tiempo perdido", "S. Rueda", "1947", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Idea del teatro", "R. Occidente", "1958", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Una interpretación de la Hª universal", "R. Occidente", "1960", "",
                "Lpuerta"));
        b.add(new Book("Andre Maurois", "En busca de Marcel Proust", "Espasa Calpe", "1958", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Qué es filosofía", "R. Occidente", "1958", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "Papeles sobre Velázquez y Goya", "R. Occidente", "1950", "", "Lpuerta"));
        b.add(new Book("José Luis Pinillos", "Grandeza y servidumbre de la metafísica", "Ateneo", "1954", "", "Lpuerta"));
        b.add(new Book("Pedro Laín Entralgo", "Teoría del otro yo T. I y II", "R. Occidente", "1961", "", "Lpuerta"));
        b.add(new Book("David E. Hunter y P. Whitten", "Enciclopedia de antropología", "Bellaterra", "1981", "",
                "Lpuerta"));
        b.add(new Book("José Gaos", "Confesiones profesionales", "Tezontle", "1958", "", "Lpuerta"));
        b.add(new Book("Sören Kierkegaard", "Fragmentos filosóficos", "La aurora", "1956", "", "Lpuerta"));
        b.add(new Book("Georges Bataille", "Obras escogidas", "Barral", "1974", "", "Lpuerta"));
        b.add(new Book("Nicola Abbagnano", "Diccionario de Filosofía", "F. C. E.", "1963", "", "Lpuerta"));
        b.add(new Book("Karl Barth", "Bosquejo de dogmática (Dedicado a Lozano)", "La aurora", "1954", "Dedicado",
                "Lpuerta"));
        b.add(new Book("Julián Marías", "Ataraxía y alcionismo", "Inst. Ybys", "1957", "Ed. No venal", "Lpuerta"));
        b.add(new Book("Will Duránt", "Filosofía cultura y vida", "Sudamericana", "1951", "2ª ed. Intonso", "Lpuerta"));
        b.add(new Book("Henry Miller", "Recordar para recordar", "Losada", "1966", "", "Lpuerta"));
        b.add(new Book("Simone de Beauvoir", "El segundo sexo I", "Psique", "1954", "", "Lpuerta"));
        b.add(new Book("Arthur Koester/ Albert Camus", "La pena de muerte", "Emecé", "1960", "", "Lpuerta"));
        b.add(new Book("Revista Universitaria de Buenos Aires", "El humanismo contemp. y las ciencias del hombre",
                "Eudeba", "1961", "", "Lpuerta"));
        b.add(new Book("Selección de Juan José Sebreli", "Sartre por Sartre", "J. Alvarez", "1968", "", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El idiota de la familia 2", "Tiempo cont.", "1975", "2ª ed.", "Lpuerta"));
        b.add(new Book("Jean-Paul Sartre", "El idiota de la familia 1", "Tiempo cont.", "1975", "2ª ed.", "Lpuerta"));
        b.add(new Book("Luis Farré", "Filosofía de la religión", "Losada", "1969", "", "Lpuerta"));
        b.add(new Book("Alain Guy", "Los filósofos españoles de ayer y hoy", "Losada", "1966", "", "Lpuerta"));
        b.add(new Book("Augusto Pescador", "Ontología", "Losada", "1966", "", "Lpuerta"));
        b.add(new Book("D'Alembert", "Discurso preliminar a la enciclopedia", "Losada", "1954", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "Barrabás", "Emecé", "1954", "9ª reimp.", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "Muerte de  Ahasverus", "Emecé", "1963", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "Peregrino en el mar", "Emecé", "1964", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "La sibila", "Emecé", "1957", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "El enano", "Emecé", "1955", "4ª reimp.", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "El paraíso", "Emecé", "1959", "", "Lpuerta"));
        b.add(new Book("Pär Lagerkvist", "El verdugo", "Emecé", "1954", "2ª impres.", "Lpuerta"));
        b.add(new Book("Carlo Cóccioli", "El juego", "Emecé", "1953", "", "Lpuerta"));
        b.add(new Book("Luis Araquistain", "El pensamiento español contemporáneo", "Losada", "1962", "", "Lpuerta"));
        b.add(new Book("C. E. M. Joad", "Guía de la filosofía", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Guillermo de La Torre", "La metamorfósis de Proteo", "Losada", "1956", "", "Lpuerta"));
        b.add(new Book("Kant", "Crítica de la razón pura I", "Losada", "1957", "3ª ed.", "Lpuerta"));
        b.add(new Book("Kant", "Crítica de la razón pura II", "Losada", "1960", "", "Lpuerta"));
        b.add(new Book("Kant", "Crítica de la razón práctica", "Losada", "1961", "", "Lpuerta"));
        b.add(new Book("Martin Heidegger", "La época de la imagen del mundo", "A. U. Chile", "1958", "", "Lpuerta"));
        b.add(new Book("Aldous Huxley", "Mono y esencia", "Sudamericana", "1953", "3ª ed.", "Lpuerta"));
        b.add(new Book("Marqués de Sade", "Historia secreta de Isabel de Baviera", "Taber", "1969", "", "Lpuerta"));
        b.add(new Book("Aldous Huxley", "Temas y variaciones", "Sudamericana", "1962", "", "Lpuerta"));
        b.add(new Book("Halldor Laxness", "Gente independiente", "Sudamericana", "1956", "", "Lpuerta"));
        b.add(new Book("Halldor Laxness", "Salka Valka", "Sudamericana", "1957", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "Una venus marina", "Sudamericana", "1963", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell - Henry Miller", "Correspondencia privada", "Sudamericana", "1964", "",
                "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "Los dos amores", "Sudamericana", "1957", "", "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "El exilado de Capri", "Sudamericana", "1960", "", "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "Las embajadas", "Sudamericana", "1957", "4ª ed.", "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "El fin de las embajadas", "Sudamericana", "1957", "2ª ed.", "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "La naturaleza del príncipe", "Sudamericana", "1964", "", "Lpuerta"));
        b.add(new Book("Roger Peyrefitte", "Las llaves de San Pedro", "Sudamericana", "1955", "", "Lpuerta"));
        b.add(new Book("Susan Yorke", "La viuda", "Sudamericana", "1951", "2ª ed.", "Lpuerta"));
        b.add(new Book("Yohn Steinbeck", "La luna se ha puesto", "Sudamericana", "1952", "5ª ed.", "Lpuerta"));
        b.add(new Book("André Malraux", "La condición humana", "Sudamericana", "1952", "4ª ed.", "Lpuerta"));
        b.add(new Book("Robert Graves", "La hija de Homero", "Sudamericana", "1964", "", "Lpuerta"));
        b.add(new Book("Richard Wright", "De la inocencia a la pesadilla", "Sudamericana", "1956", "", "Lpuerta"));
        b.add(new Book("William Faulkner", "Las palmeras salvajes", "Sudamericana", "1951", "4ª ed.", "Lpuerta"));
        b.add(new Book("Julien Green", "Adriana Mesurat", "Sudamericana", "1952", "2ª ed.", "Lpuerta"));
        b.add(new Book("Thomas Mann", "Las cabezas trocadas", "Sudamericana", "1957", "5ª ed.", "Lpuerta"));
        b.add(new Book("Ramiro de Maeztu", "La crisis del humanismo", "Sudamericana", "1947", "", "Lpuerta"));
        b.add(new Book("Christopher Dawson", "Religión y cultura", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Conde de Keyserling", "Del sufrimiento a la plenitud", "Sudamericana", "1947", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Conde de Keyserling", "Viaje a través del tiempo T. I", "Sudamericana", "1949", "", "Lpuerta"));
        b.add(new Book("Simone Weil", "Carta a un religioso", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("Eugen Fink", "Todo y nada", "Sudamericana", "1964", "", "Lpuerta"));
        b.add(new Book("Hans Urs von Balthasar", "La esencia de la verdad", "Sudamericana", "1955", "", "Lpuerta"));
        b.add(new Book("Jean Danielou", "Orígenes", "Sudamericana", "1958", "", "Lpuerta"));
        b.add(new Book("Alan W. Watts", "La suprema identidad", "Sudamericana", "1961", "", "Lpuerta"));
        b.add(new Book("Nicolai  Hartmann", "La filosofía del idealismo alemán T. I y II", "Sudamericana", "1960", "",
                "Lpuerta"));
        b.add(new Book("Nicolai  Hartmann", "La nueva ontología", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("Emile Brehier", "La filosofía de Plotino", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Louis Lavelle", "Las potencias del yo", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("Giuseppe Faggin", "Mister Eckahart", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Helmut Kuhn", "Encuentro con la nada", "Sudamericana", "1953", "", "Lpuerta"));
        b.add(new Book("Edwin Arthur Burtt", "Los fundamentos metaf.  de la ciencia moderna", "Sudamericana", "1960",
                "", "Lpuerta"));
        b.add(new Book("Jean Guitton", "La existencia temporal", "Sudamericana", "1956", "", "Lpuerta"));
        b.add(new Book("Jean Guitton", "Ensayos sobre el amor humano", "Sudamericana", "1957", "", "Lpuerta"));
        b.add(new Book("Johannes Hessen", "Tratado de filosofía T. I", "Sudamericana", "1957", "", "Lpuerta"));
        b.add(new Book("José Ferrater Mora", "El hombre en la encrucijada", "Sudamericana", "1952", "", "Lpuerta"));
        b.add(new Book("Thomas Merton", "Pensamientos de soledad", "Sudamericana", "1960", "", "Lpuerta"));
        b.add(new Book("Henri Bergson", "Las dos fuentes de la moral y la religión", "Sudamericana", "1946", "",
                "Lpuerta"));
        b.add(new Book("Wladimir Nabokov", "Lolita", "Sur", "1959", "", "Lpuerta"));
        b.add(new Book("Julien Green", "Medianoche", "Sur", "1954", "", "Lpuerta"));
        b.add(new Book("Edmund Wilson", "Literatura y sociedad", "Sur", "1957", "", "Lpuerta"));
        b.add(new Book("Olivia", "Olivia", "Sur", "1958", "", "Lpuerta"));
        b.add(new Book("Lawrence Durrell", "El cuaderno negro", "Sur", "1962", "", "Lpuerta"));
        b.add(new Book("James Joyce", "Desterrados", "Sur", "1957", "", "Lpuerta"));
        b.add(new Book("Albert Schweitzer", "El camino hacia tí mismo", "Sur", "1958", "", "Lpuerta"));
        b.add(new Book("Lanza del Basto", "Peregrinación a las fuentes", "Sur", "1955", "2ª ed.", "Lpuerta"));
        b.add(new Book("Dylan Thomas", "Bajo el bosque de leche", "Sur", "1959", "", "Lpuerta"));
        b.add(new Book("William Faulkner", "Luz de agosto", "Sur", "1952", "", "Lpuerta"));
        b.add(new Book("Max Scheller", "Amor y conocimiento", "Sur", "1960", "", "Lpuerta"));
        b.add(new Book("Isaiah  Berlin", "Karl Marx", "Sur", "1964", "", "Lpuerta"));
        b.add(new Book("Max Muller", "Crisis de la metafísica", "Sur", "1961", "", "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "IV La consulta V La sorellina", "Losada", "1945", "",
                "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "VI La muerte del padre", "Losada", "1946", "", "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "VII El verano de 1914 I", "Losada", "1952", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "VIII El verano de 1914 II", "Losada", "1947", "",
                "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "IX El verano de 1914 III", "Losada", "1952", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "X Epílogo", "Losada", "1947", "", "Lpuerta"));
        b.add(new Book("     JULES  ROMAINS", "    LOS HOMBRES DE BUENA VOLUNTAD  (27 tomos)", "", "", "", "Lpuerta"));
        b.add(new Book("Kant", "Crítica del juicio", "Losada", "1961", "", "Lpuerta"));
        b.add(new Book("Kant", "El conflicto de las facultades", "Losada", "1963", "", "Lpuerta"));
        b.add(new Book("Francisco Romero", "Teoría del hombre", "Losada", "1958", "2ª ed.", "Lpuerta"));
        b.add(new Book("Nicolai Hartmann", "Metafísica del conocimiento I y II", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Artur Ardao", "La folosofía polémica de Feijóo", "Losada", "1962", "", "Lpuerta"));
        b.add(new Book("Rodolfo Mondolfo", "Guía bibliográfica de la fílosofía antigua", "Losada", "1959", "",
                "Lpuerta"));
        b.add(new Book("Carlos Vaz Ferreira", "Tres filósofos de la vida: Nietzche, James, Unamuno", "Losada", "1965",
                "", "Lpuerta"));
        b.add(new Book("Schelling", "Bruno", "Losada", "1957", "", "Lpuerta"));
        b.add(new Book("Francis Bacon", "Novum organum", "Losada", "1961", "2ª ed.", "Lpuerta"));
        b.add(new Book("Charles Morris", "Signos, lenguaje y conducta", "Losada", "1962", "", "Lpuerta"));
        b.add(new Book("John Dewey", "Una fe común", "Losada", "1964", "", "Lpuerta"));
        b.add(new Book("Alfred N. Whitehead", "Proceso y realidad", "Losada, S. A.", "1956", "", "Lpuerta"));
        b.add(new Book("Alfred N. Whitehead", "Modos de pensamiento", "Losada, S. A.", "1944", "", "Lpuerta"));
        b.add(new Book("Victor Brochard", "Los escépticos griegos", "Losada, S. A.", "1945", "", "Lpuerta"));
        b.add(new Book("Victor Brochard", "Estudios sobre Sócrates y Platón", "Losada, S. A.", "1945", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Francisco Romero", "Papeles para una filosofía", "Losada, S. A.", "1945", "", "Lpuerta"));
        b.add(new Book("Francisco Romero", "Estudio de Historia de las ideas", "Losada, S. A.", "1953", "", "Lpuerta"));
        b.add(new Book("Rodolfo Mondolfo", "El pensamiento antiguo T. I y II", "Losada, S. A.", "1945", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Rodolfo Mondolfo", "Figuras e ideas de la Fª del renacimiento", "Losada, S. A.", "1954", "",
                "Lpuerta"));
        b.add(new Book("Bernard Groethuysen", "Antropología filosófica", "Losada, S. A.", "1951", "", "Lpuerta"));
        b.add(new Book("Leibniz", "Correspondencia con Arnauld", "Losada, S. A.", "1946", "", "Lpuerta"));
        b.add(new Book("Leibniz", "Tratados fundamentales 1ª serie Tª de metafísica", "Losada, S. A.", "1946",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("Emilio Oribe", "Teoría del Nous", "Losada, S. A.", "1944", "", "Lpuerta"));
        b.add(new Book("René Guénon", "Introduc. gral. al estudio de las doctrinas hindúes", "Losada, S. A.", "1945",
                "", "Lpuerta"));
        b.add(new Book("Ugo Spirito", "El pragmatismo en la Fª contemporánea", "Losada, S. A.", "1945", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "La fe filosófica", "Losada, S. A.", "1953", "", "Lpuerta"));
        b.add(new Book("Sören Kierkegaard", "Temor y temblor", "Losada, S. A.", "1947", "", "Lpuerta"));
        b.add(new Book("Octave Hamelin", "El sistema de Descartes", "Losada, S. A.", "1949", "", "Lpuerta"));
        b.add(new Book("Juan David García Bacca", "Introducción general a las Enéadas", "Losada, S. A.", "1948", "",
                "Lpuerta"));
        b.add(new Book("Otto Weininger", "Sexo y carácter", "Losada, S. A.", "1945", "2ª ed.", "Lpuerta"));
        b.add(new Book("Theodore Jouffroy", "Sobre la organización de las ciencias filosóficas", "Losada, S. A.",
                "1952", "", "Lpuerta"));
        b.add(new Book("Max Scheler", "Esencia y formas de la simpatía", "Losada, S. A.", "1950", "2ª ed.", "Lpuerta"));
        b.add(new Book("Miriam Weyland", "Una nueva imagen del hombre", "Losada, S. A.", "1953", "", "Lpuerta"));
        b.add(new Book("Bertrand Russell", "Investigación sobre el significado y la verdad", "Losada, S. A.", "1946",
                "", "Lpuerta"));
        b.add(new Book("Guillermo Dilthey", "La esencia de la filosofía", "Losada, S. A.", "1944", "", "Lpuerta"));
        b.add(new Book("Wilhem Dilthey", "Poética", "Losada, S. A.", "1945", "", "Lpuerta"));
        b.add(new Book("Charles Renouvier", "Los dilemas de la metafísica pura", "Losada, S. A.", "1944", "", "Lpuerta"));
        b.add(new Book("Richard Avenarius", "La folosofía como el pensar del mundo...", "Losada, S. A.", "1947", "",
                "Lpuerta"));
        b.add(new Book("Plotino", "Enéadas (Enéada I)", "Losada, S. A.", "1948", "", "Lpuerta"));
        b.add(new Book("Karl Vossler", "Filosofía del lenguaje Ensayos", "Losada, S. A.", "1947", "2ª ed.", "Lpuerta"));
        b.add(new Book("Francisco Ayala", "Razón del mundo", "Losada, S. A.", "1944", "", "Lpuerta"));
        b.add(new Book("Carlos Vaz Ferreira", "Lógica viva", "Losada, S. A.", "1945", "", "Lpuerta"));
        b.add(new Book("Manuel García Morente", "Lecciones preliminares de filosofía", "Losada, S. A.", "1952",
                "5ª ed.", "Lpuerta"));
        b.add(new Book("Walter Blumenfeld", "Sentido y sinsentido", "Losada, S. A.", "1949", "", "Lpuerta"));
        b.add(new Book("Alberto Wagner de Reyna", "La ontología fundamental de Heidegger", "Losada, S. A.", "1945",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("Eduard Spranger", "Las ciencias del espíritu y la escuela", "Losada, S. A.", "1942", "",
                "Lpuerta"));
        b.add(new Book("Max Scheler", "La esencia de la filosofía", "Nova", "1962", "", "Lpuerta"));
        b.add(new Book("Nicola Abbagnano", "Filosofía, religión, ciencia", "Nova", "1961", "", "Lpuerta"));
        b.add(new Book("A. Koyeve", "La dialéctica del amo y del esclavo en Hegel", "La Pleyade", "1971", "", "Lpuerta"));
        b.add(new Book("Roman Rolland", "Gandhi", "La Pleyade", "1972", "", "Lpuerta"));
        b.add(new Book("Blaise Cendrars", "Antología negra Traducida por M. Azaña", "La Pleyade", "1971", "", "Lpuerta"));
        b.add(new Book("Lucien Levi-Bruhl", "La mentalidad primitiva", "La Pleyade", "1972", "", "Lpuerta"));
        b.add(new Book("H. Lefebvre", "Contribución a la estética", "La Pleyade", "1971", "", "Lpuerta"));
        b.add(new Book("Geoffrey Gorer", "Vida e ideas del Marqués de Sade", "La Pleyade", "1969", "", "Lpuerta"));
        b.add(new Book("Sartre - Camus", "Polémica", "G. Dávalos", "1964", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Nietzsche", "Sudamericana", "1963", "", "Lpuerta"));
        b.add(new Book("Jean Marx", "Las literaturas célticas", "Eudeba", "1964", "", "Lpuerta"));
        b.add(new Book("A. J. Ayer", "El problema del conocimiento", "Eudeba", "1962", "", "Lpuerta"));
        b.add(new Book("Edouard Jeauneau", "La filosofía medieval", "Eudeba", "1965", "", "Lpuerta"));
        b.add(new Book("Rene Serreau", "Hegel y el hegelianismo", "Eudeba", "1964", "", "Lpuerta"));
        b.add(new Book("George Santayana", "Escepticismo y fe animal", "Losada, S. A.", "1952", "", "Lpuerta"));
        b.add(new Book("George Santayana", "Tres poetas filósofos: Lucrecio, Dante, Goethe", "Losada, S. A.", "1952",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("George Santayana", "Dominaciones y potestades", "Sudamericana", "1954", "", "Lpuerta"));
        b.add(new Book("George Santayana", "Mi anfitrión  el mundo", "Sudamericana", "1955", "", "Lpuerta"));
        b.add(new Book("George Santayana", "El último puritano T. I y II", "Sudamericana", "1951", "3ª ed.", "Lpuerta"));
        b.add(new Book("Jacques Maritain", "Acerca de la existencia y lo existente", "Desclee B.", "1949", "",
                "Lpuerta"));
        b.add(new Book("Carlos Astrada", "Humanismo y dialéctica de la libertad", "Dédalo", "1960", "", "Lpuerta"));
        b.add(new Book("Henry Lefebvre", "Qué es la dialéctica", "Dédalo", "1964", "", "Lpuerta"));
        b.add(new Book("Eduardo Spranger", "Formas de vida", "R. Occid. Arg.", "1946", "", "Lpuerta"));
        b.add(new Book("Eduardo Spranger", "Psicología de la edad juvenil", "R. Occid. Arg.", "1946", "", "Lpuerta"));
        b.add(new Book("Karl Jasrpers", "Filosofía I", "R. Occid. Arg.", "1958", "", "Lpuerta"));
        b.add(new Book("Karl Jasrpers", "Filosofía II", "R. Occid. Arg.", "1959", "", "Lpuerta"));
        b.add(new Book("Erih  Przywara S. I.", "San Agustín", "R. Occid. Arg.", "1949", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "Historia de la filosofía", "R. Occid. Arg.", "1946", "", "Lpuerta"));
        b.add(new Book("Hegel", "Lecciones sobre la Fª de la Hª universal I y II", "R. Occid. Arg.", "1946", "",
                "Lpuerta"));
        b.add(new Book("Max Scheler", "Etica I y II", "R. Occid. Arg.", "1948", "", "Lpuerta"));
        b.add(new Book("Max Scheler", "Sociología del saber", "R. Occid. Arg.", "1947", "", "Lpuerta"));
        b.add(new Book("José Ortega y Gasset", "El hombre y la gente", "R. Occidente", "1957", "", "Lpuerta"));
        b.add(new Book("W. Moog", "Hegel y la escuela hegeliana", "R. Occidente", "1931", "", "Lpuerta"));
        b.add(new Book("Revista de Occidente", "Omenaje a Aranguren", "R. Occidente", "1972", "", "Lpuerta"));
        b.add(new Book("José Gómez Caffarena", "Metafísica fundamental", "R. Occidente", "1969", "", "Lpuerta"));
        b.add(new Book("Manuel Granell", "La vecindad humana", "R. Occidente", "1969", "", "Lpuerta"));
        b.add(new Book("Rodríguez Adrados", "Ilustración y política en la Grecia clásica", "R. Occidente", "1966", "",
                "Lpuerta"));
        b.add(new Book("Pedro Laín Entralgo", "La espera y la esperanza", "R. Occidente", "1958", "2ª ed.", "Lpuerta"));
        b.add(new Book("Antonio Rodríguez Huescar", "Perspectiva y verdad (Ortega)", "R. Occidente", "1966", "",
                "Lpuerta"));
        b.add(new Book("E. R. Dodds", "Los griegos y lo irracional", "R. Occidente", "1960", "", "Lpuerta"));
        b.add(new Book("Jorge Simmel", "Cultura femenina Filosofía de la moda", "R. Occidente", "1934", "", "Lpuerta"));
        b.add(new Book("Alois Dempf", "Filosofía de la cultura", "R. Occidente", "1933", "", "Lpuerta"));
        b.add(new Book("José Luis L. Aranguren", "Catolicismo y protestantismo", "R. Occidente", "1957", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Luis Bonilla", "El amor y su alcance histórico", "R. Occidente", "1964", "", "Lpuerta"));
        b.add(new Book("David Katz", "El mundo de las sensaciones táctiles", "R. Occidente", "1930", "", "Lpuerta"));
        b.add(new Book("F. J. J. Buytendijk", "La mujer naturaleza-apariencia-existencia", "R. Occidente", "1955", "",
                "Lpuerta"));
        b.add(new Book("Denis de Rougemont", "Tres milenios de Europa", "R. Occidente", "1963", "", "Lpuerta"));
        b.add(new Book("Stephen E. Toulmin", "El puesto de la razón de la ética", "R. Occidente", "1964", "", "Lpuerta"));
        b.add(new Book("Antonio Tovar", "Vida de Sócrates", "R. Occidente", "1947", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Balance y perspectiva", "R. Occidente", "1953", "", "Lpuerta"));
        b.add(new Book("Karl Jaspers", "Origen y meta de la historia", "R. Occidente", "1950", "", "Lpuerta"));
        b.add(new Book("Otto F. Bollnow", "Filosofía de la existencia", "R. Occidente", "1954", "", "Lpuerta"));
        b.add(new Book("H. Heimsoeth", "La metafísica moderna", "R. Occidente", "1932", "", "Lpuerta"));
        b.add(new Book("Julio Stenzel", "Filosofía del lenguaje", "R. Occidente", "1935", "", "Lpuerta"));
        b.add(new Book("A. Pfänder", "Lógica", "R. Occidente", "1933", "", "Lpuerta"));
        b.add(new Book("Kant", "Antropología", "R. Occidente", "1935", "", "Lpuerta"));
        b.add(new Book("Manuel Olasagasti", "Introducción a Heidegger", "R. Occidente", "1967", "", "Lpuerta"));
        b.add(new Book("Gabriel Marcel", "Filosofía concreta", "R. Occidente", "1959", "", "Lpuerta"));
        b.add(new Book("Juan Rof Carballo", "Medicina y actividad creadora", "R. Occidente", "1964", "", "Lpuerta"));
        b.add(new Book("Fritz Heinemann", "¿Está viva o muerta la Fª existencial?", "R. Occidente", "1956", "",
                "Lpuerta"));
        b.add(new Book("Miguel Cruz Hernández", "La filosofía árabe", "R. Occidente", "1963", "", "Lpuerta"));
        b.add(new Book("Manuel Granell", "Lógica", "R. Occidente", "1949", "", "Lpuerta"));
        b.add(new Book("Manuel G. Morente", "Ensayos", "R. Occidente", "1945", "", "Lpuerta"));
        b.add(new Book("Carmen Castro", "Marcel Proust o el vivir escribiendo", "R. Occidente", "1952", "", "Lpuerta"));
        b.add(new Book("Ludwing Wittgenstein", "Tractatus Lógico-Philosophicus", "R. Occidente", "1957", "", "Lpuerta"));
        b.add(new Book("Pablo Krische", "El enigma del matriarcado", "R. Occidente", "1930", "", "Lpuerta"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega I", "R. Occidente", "1935", "", "Lpuerta"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega II", "R. Occidente", "1936", "", "Lpuerta"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega III", "R. Occidente", "1946", "", "Lpuerta"));
        b.add(new Book("Bertrand  Russell", "El conocimiento humano", "R. Occidente", "1950", "", "Lpuerta"));
        b.add(new Book("Teodoro Celms", "El idealismo fenomenológico de Husserl", "R. Occidente", "1931", "", "Lpuerta"));
        b.add(new Book("Heinz Heimsoeth", "Los seis grandes temas de la metaf. Occidental", "R. Occidente", "1946", "",
                "Lpuerta"));
        b.add(new Book("F. Müller-Lyer", "La familia", "R. Occidente", "1930", "", "Lpuerta"));
        b.add(new Book("Julián Marías", "El método histórico de las generaciones", "R. Occidente", "1949", "",
                "Lpuerta"));
        b.add(new Book("A. Thalheimer", "Introducción al materialismo dialéctico", "Claridad", "1962", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("Federico Engels", "Origen de la familia", "Claridad", "1964", "7ª ed.", "Lpuerta"));
        b.add(new Book("Armando Rigobello", "Camus", "Columba", "1961", "", "Lpuerta"));
        b.add(new Book("Ezequiel de Olaso", "Los nombres de Unamuno", "Sudamericana", "1963", "", "Lpuerta"));
        b.add(new Book("Edouard Schure", "Los grandes iniciados", "El Ateneo", "1953", "", "Lpuerta"));
        b.add(new Book("Thomas Mann", "El pensamiento vivo de Schopenhauer", "Losada, S. A.", "1946", "", "Lpuerta"));
        b.add(new Book("Trad. y notas de León Dujovne", "David Hume", "Sudamericana", "1939", "", "Lpuerta"));
        b.add(new Book("E. Royston Pike", "Diccionario de religiones", "F. C. E.", "1960", "", "Lpuerta"));
        b.add(new Book("Ralph Turner", "Las grandes culturas de la humanidad", "F. C. E.", "1948", "", "Lpuerta"));
        b.add(new Book("Leszek Kolakoski", "Cristianos sin iglesia", "Taurus", "1982", "", "Lpuerta"));
        b.add(new Book("Philippe Aries", "El hombre ante la muerte", "Taurus", "1983", "", "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones Roma y su imperio 2", "Destino", "1960", "",
                "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones Edad Media 3", "Destino", "1967", "",
                "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones Los siglos XVI y XVII 4", "Destino", "1964",
                "", "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones El siglo XVIII 5", "Destino", "1963", "",
                "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones El siglo XIX 6", "Destino", "1960", "",
                "Lpuerta"));
        b.add(new Book("Dtor. Maurice Crouzet", "Hª Gral. Civilizaciones La época contemporánea 7", "Destino", "1961",
                "", "Lpuerta"));
        b.add(new Book("Manuel Azaña", "Obras completas 3", "Oasis", "1967", "", "Lpuerta"));
        b.add(new Book("Manuel Azaña", "Obras completas 4", "Oasis", "1968", "", "Lpuerta"));
        b.add(new Book("Erskine Caldwell", "El camino del tabaco", "Sudamericana", "1951", "5ª ed.", "Lpuerta"));
        b.add(new Book("Francisco Romero", "Fª contemporánea Estudios y notas 1ª serie", "Losada, S. A.", "1944",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("Paul Valery", "El alma y la danza Eupalinos o el arquitecto", "Losada, S. A.", "1944",
                "2ª ed.", "Lpuerta"));
        b.add(new Book("Santo Tomás de Aquino", "Del ente y de la esencia", "Losada, S. A.", "1945", "2ª ed.",
                "Lpuerta"));
        b.add(new Book("O. F. Bollnow", "Esencia y cambio de las virtudes", "R. Occidente", "1960", "", "Lpuerta"));
    }

    private static void fillLosada() {
        final List<Book> b = DB.get("Losada");
        b.add(new Book("Gabriela Mistral", "Tala, Poemas ***", "Losada, S. A.", "1953", "2ª ed.", "Losada"));
        b.add(new Book("Pablo Neruda", "20 Poemas de amor y una canción desesp. ***", "Losada, S. A.", "1954",
                "5ª ed.", "Losada"));
        b.add(new Book("H. R. Lenormand", "Los fracasados. La loca del cielo. La inocente", "Losada, S. A.", "1949",
                "2ª ed.", "Losada"));
        b.add(new Book("Henri Bergson", "La risa", "Losada, S. A.", "1947", "", "Losada"));
        b.add(new Book("José Ferrater Mora", "Unamuno. Bosquejo de una filosofía", "Losada, S. A.", "1944", "",
                "Losada"));
        b.add(new Book("Francisco Romero", "Filosofía de la persona", "Losada, S. A.", "1944", "", "Losada"));
        b.add(new Book("Aldous Huxley", "El joven Arquímedes", "Losada, S. A.", "1960", "", "Losada"));
        b.add(new Book("Thomas Mann", "Cervantes, Goethe, Freud", "Losada, S. A.", "1961", "", "Losada"));
        b.add(new Book("Georges Duhamel", "Diario de un aspirante a santo", "Losada, S. A.", "1945", "", "Losada"));
        b.add(new Book("Angel Vassallo", "¿Qué es filosofía?", "Losada, S. A.", "1945", "", "Losada"));
        b.add(new Book("José María Monner Sans", "Pirandello, su vida y su teatro", "Losada, S. A.", "1947", "",
                "Losada"));
        b.add(new Book("Francisco Romero", "Filósofos y problemas", "Losada, S. A.", "1947", "", "Losada"));
        b.add(new Book("Guillermo de Torre", "La aventura y el orden", "Losada, S. A.", "1948", "", "Losada"));
        b.add(new Book("Guillermo de Torre", "Tríptico del sacrificio", "Losada, S. A.", "1948", "", "Losada"));
        b.add(new Book("Fran Kafka", "La metamorfósis", "Losada, S. A.", "1958", "3ª ed.", "Losada"));
        b.add(new Book("C.  Sánchez Albornoz", "Españoles ante la historia", "Losada, S. A.", "1958", "", "Losada"));
        b.add(new Book("Marcos Victoria", "Ensayo prelimirar sobre lo cómico", "Losada, S. A.", "1958", "", "Losada"));
        b.add(new Book("José Bergamin", "La corteza de la letra", "Losada, S. A.", "1957", "", "Losada"));
        b.add(new Book("Arturo Barea", "Lorca, el poeta y su pueblo", "Losada, S. A.", "1956", "", "Losada"));
        b.add(new Book("Romain Rolland", "Vida de Beethoven", "Losada, S. A.", "1958", "3ª ed.", "Losada"));
        b.add(new Book("Miguel de Unamuno", "Mi vida y otros recuerdos personales T. I", "Losada, S. A.", "1959", "",
                "Losada"));
        b.add(new Book("Miguel de Unamuno", "Mi vida y otros recuerdos personales T. II", "Losada, S. A.", "1959", "",
                "Losada"));
        b.add(new Book("George Santayana", "Diálogos en el limbo", "Losada, S. A.", "1960", "", "Losada"));
        b.add(new Book("Rafael Alberti", "El adefesio (Fábula del amor y las viejas)", "Losada, S. A.", "1944", "",
                "Losada"));
        b.add(new Book("León Felipe", "Antología rota", "Losada, S. A.", "1957", "", "Losada"));
        b.add(new Book("Antonio Machado", "Poesías ***", "Losada, S. A.", "1962", "5ª ed.", "Losada"));
        b.add(new Book("Miguel Angel Asturias", "Leyendas de Guatemala", "Losada, S. A.", "1957", "", "Losada"));
        b.add(new Book("Federico García Lorca", "Romancero Gitano ***", "Losada, S. A.", "1949", "4ª ed.", "Losada"));
        b.add(new Book("José María de Heredia", "Los trofeos", "Losada, S. A.", "1954", "", "Losada"));
        b.add(new Book("César Vallejo", "Los heraldos negros", "Losada, S. A.", "1961", "", "Losada"));
        b.add(new Book("César Vallejo", "TRILCE", "Losada, S. A.", "1961", "", "Losada"));
        b.add(new Book("César Vallejo", "Poemas humanos. España, aparta de mí este cáliz", "Losada, S. A.", "1961", "",
                "Losada"));
        b.add(new Book("Charles Bandelaire", "Las flores del mal", "Losada, S. A.", "1953", "2ª ed.", "Losada"));
        b.add(new Book("Pedro Salinas", "La voz a tí debida ***", "Losada, S. A.", "1954", "2ª ed.", "Losada"));
        b.add(new Book("Pedro Salinas", "Razón de amor ***", "Losada, S. A.", "1952", "", "Losada"));
        b.add(new Book("Anónimo", "Los versos del Capitán ***", "Losada, S. A.", "1958", "2\" ed.", "Losada"));
        b.add(new Book("Vicente Aleixandre", "La destrucción o el amor ***", "Losada, S. A.", "1954", "", "Losada"));
        b.add(new Book("Vicente Aleixandre", "Poemas amorosos. Antología ***", "Losada, S. A.", "1960", "", "Losada"));
        b.add(new Book("Blas de Otero", "Angel fieramente humano.Redoble de conciencia", "Losada, S. A.", "1960", "",
                "Losada"));
        b.add(new Book("Emilio Prados", "Jardín cerrado ***", "Losada, S. A.", "1960", "", "Losada"));
    }

    private static void fillLiternovela_ex_espanola() {
        final List<Book> b = DB.get("Liternovela_ex_espanola");
        b.add(new Book("Pablo Neruda", "Obras Completas", "Losada, S.A.", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Luis Borges", "El Aleph", "Emecé", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jacques Gergier", "Los libros condenados", "Plaza Janés", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marc  Beigbeder", "André Gide", "La mandrágora", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Mario Vargas Llosa", "Conversación en la catedral", "C. Lectores", "1972", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("María Casares", "Residente privilegiada", "Argos Vergara", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Isabel Allende", "La casa de los espíritus", "Plaza Janés", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Fuentes", "Cambio de piel", "Seix Barral", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Fuentes", "Cuerpos y ofrendas", "Alianza", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Corpus Bargas", "Los pasos contados I, II, III y IV", "Bruguera", "1985", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Manuel Múgica Láinez", "Bomarzo", "Planeta", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Henry Miller", "El libro de mis amigos", "Grijalbo", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Henry Miller", "El coloso de Marusi", "Seix Barral", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "José y sus hermanos 2 El joven José", "Guadarrama", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Georges Bernanos", "Bajo el sol de Satán", "Escelicer, S.A.", "1955", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("E. M. Forster", "Maurice", "Planeta", "1978", "", "Liternovela_ex_espanola"));
        b.add(new Book("E. M. Forster", "Un viaje a la India", "Alianza", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Malraux", "Antimemorias", "Sur", "1968", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("André Malraux", "El tiempo del desprecio", "Cauce", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vladimir Nabokov", "El engaño", "F.I.C.S.A.", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Johannes V. Jensen", "Periplo escandinavo", "José Janés", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("William Faulkner", "En la ciudad", "Plaza Janés", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Guy de Massillon", "El goce y la crueldad", "E. Selectas", "1966", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Patrick White", "El carro de los elegidos", "Luis de Caralt", "1966", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ira Levin", "Los niños de Brasil", "C. Lectores", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Giovanni Papini", "Vida de Miguel Angel", "Aguilar", "1956", "3ª ed", "Liternovela_ex_espanola"));
        b.add(new Book("Giovanni Papini", "Juicio universal", "Planeta", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ronald Hayman", "Kafka Biografía", "Argos Vergara", "1983", "", "Liternovela_ex_espanola"));
        b.add(new Book("Franz Kafka", "Conversaciones acerca del pecado, el dolor…", "Laia", "1983", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Evan Hunter", "Fue dicho: no desearás la mujer de tu prójimo", "Luis de Caralt", "1962", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Paulo Coelho", "El alquimista", "C. Lectores", "1996", "", "Liternovela_ex_espanola"));
        b.add(new Book("Oscar Lewis", "Los hijos de Sánchez", "Mortiz", "1966", "6ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Michel Ende", "La historia inerminable", "Alfaguara", "1982", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Vivane Forrester", "Van Gogh o el entierro en los trigales", "Argos Vergara", "1985", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Erica Jong", "Miedo a volar", "Noguer, S.A.", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Joe Orton", "Diario", "Grijalbo", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rolf Hochhuth", "El vicario", "Norte", "1964", "", "Liternovela_ex_espanola"));
        b.add(new Book("Oskar Kokoschka", "Mi vida Memorias", "Tusquets", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vitold Gombrowicz", "Cosmos", "Seix Barral", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alan Watts", "Memorias", "Kairós", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Yasunari Kawabata", "La casa de las bellas durmientes", "Luis de Caralt", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Graves", "La comida de los centauros y otros ensayos", "Alianza Tres", "1994", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("John Irving", "El hotel New Hampshire", "Argos Vergara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alma Mahler-Werfel", "Mi vida amorosa", "Sudamericana", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Maurice Druon", "El fin de los hombres I, II y III", "Hachete", "1954", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Gerhart Hauptmann", "La prodigiosa isla de las damas", "Rueda", "1966", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Harry M. Campbell y R. E. Foster", "William Faulkner", "Schapire", "1954", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Charles Baudelaire", "Delacroix", "Anaquel", "1946", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "El inmoralista", "Argos", "1954", "3ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Rainer María Rilke", "Diario florentino", "Paideia", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rainer María Rilke", "Los cuadernos de Malte Laurids Brigge", "Dintel", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Aldous Huxley", "Literatura y ciencia", "Edhasa", "1964", "", "Liternovela_ex_espanola"));
        b.add(new Book("Aldous Huxley", "La isla", "Edhasa", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Aldous Huxley", "Un mundo feliz", "José Janés", "1947", "", "Liternovela_ex_espanola"));
        b.add(new Book("Morris West", "Hija del silencio", "Nuevo Extremo", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Bernard Shaw", "Diez y seis esbozos de mí mismo", "Sudamericana", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Leonardo Sciascia", "El archivo de Egipto", "Seix Barral", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Italo Calvino", "El barón rampante", "Seix Barral", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Boccaccio-Aretino", "El decamerón Coloquio de damas", "E.d.a.f.", "1961", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Roger Peyrefitte", "Del Vesubio al Etna", "Tirso", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Roger Peyrefitte", "Presas jóvenes", "Pegaso", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Graham Greene", "¿Puede prestarnos a su marido?", "Sur", "1967", "", "Liternovela_ex_espanola"));
        b.add(new Book("Stuart Gilbert", "El \"Ulises\" de James Joyce", "Siglo XXI", "1971", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("James Joice", "Cartas escogidas V. I y II", "Lumen", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("James Joice", "Gente de Dublin", "Fabril", "1961", "", "Liternovela_ex_espanola"));
        b.add(new Book("Zoé Oldenbourg", "La piedra angular", "Destino", "1970", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Wu Ch'eng-En", "Mono", "Cervantes", "1945", "", "Liternovela_ex_espanola"));
        b.add(new Book("Paul Verlaine", "Obras completas", "Claridad", "1944", "", "Liternovela_ex_espanola"));
        b.add(new Book("Kathleen Winsor", "Por siempre ámbar", "Planeta", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Herbert R. Lottman", "Albert Camus", "Taurus", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("J. J. Rosseau", "Las confesiones", "Edics. Selectas", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Dora y Erwin Panodtsky", "La caja de Pandora", "Barral", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Eleni N. Kazantzaki", "Kazantzaki el disidente", "Planeta", "1974", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Genevieve Laorte", "El amor secreto de Picasso", "Euros, S.A.", "1974", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carl Friedrich von Weizsäcker", "El hombre en su historia", "C. Lectores", "1993", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Isak Dinesen", "Siete cuentos góticos", "Luis de Caralt", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Louis Bromfield", "Un héroe moderno", "Goliat", "1953", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jean Cocteau", "Infancia terrible", "Nardín", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anne Delbée", "Camille Claudel", "Circe", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rauda Jamis", "Frida Kahlo", "Circe", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Maxence Van der Meersch", "Leed en mi corazón", "José Janés", "1952", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pablo Neruda", "Confieso que he vivido Memorias", "Seix Barral", "1974", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Saul Bellow", "El legado de Humboldt", "Plaza Janés", "1977", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Günter Grass", "El rodaballo", "Alfaguara", "1980", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Charles Robert Maturin", "Melmoth el errabundo", "Alfaguara", "1976", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Merton", "Ishi", "Pomaire", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Irving Stone", "Anhelo de vivir", "Continente", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vicki Baum", "Tenía que suceder", "Mateu", "1940", "", "Liternovela_ex_espanola"));
        b.add(new Book("John Erskine", "Galahad", "José Janés", "1950", "", "Liternovela_ex_espanola"));
        b.add(new Book("William Saroyan", "Otro verano", "José Janés", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Charles Mergendahl", "…Después del amor", "Azteca, S.A.", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Italo Svero", "La conciencia de Zeno", "Seix Barral", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Tommaso Landolfi", "La piedra lunar", "Seix Barral", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Kalidasa", "Rtusamhara o curso de las estaciones", "Aguilar", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ovidio", "Arte de amar", "Aguilar", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Grahan Greeene", "El factor humano", "Argos Vergara", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("H. F. Peters", "Mi hermana, mi esposa", "Plaza Janés", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Napoleón Bonaparte", "El amor y la felicidad humana", "Tor", "1955", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Erskine Caldwell", "La chacrita de Dios", "Mariel", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Boris Pasternak", "Relato", "Gadarrama", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alain Robbe-Grillet", "La celosía", "Seix Barral", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("León Felipe", "Obras Completas", "Losada, S.A.", "1963", "Piel C. dorado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Warren A. Silver", "La rosa verde", "Pomaire", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Mary Barnes y J. Berke", "Viaje a través de la locura", "Mnez. Roca", "1974", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Franz Werfel", "La novela de la ópera", "Luis de Caralt", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jack-Alain Legér", "Monsignore", "C. Lectores", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("E.-M. Laperrousaz", "Los manuscritos del mar muerto", "Eudeba", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Doctor Cabanés", "El legendario Barba Azul", "Nuestra Raza", "", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Dostoievski", "José Janés", "1950", "", "Liternovela_ex_espanola"));
        b.add(new Book("Groff Conklin, Selección de", "Extravagancias", "Magist. Esp.", "1968", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("William Beckford of Fonthill", "Vathek Cuento árabe", "Seix Barral", "1969", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Isaac Bashevis Singer", "El Spinosa de la calle Market", "Plaza Janés", "1979", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Arthur Schnitzler", "La profecía y otros relatos", "Noguer", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Bacón", "Nueva Atlántida", "Mondadori", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("François Mauriac", "Memorias interiores Nuevas memorias interiores", "Plaza Janés", "1969", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Hermann Hesse", "Desde la India", "Planeta", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "Las tribulaciones del estudiante Törles", "Seix Barral", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("J. K. Huysmans", "Contra natura", "Tusquets", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Antonin Artaud", "Carta a la vidente", "Tusquets", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Michel Cattier", "Vida y obra  de Wilhelm Reich", "Tiempo nuevo", "1971", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Primo Levi", "El sistema periódico", "Alianza Tres", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Primo Levi", "Si esto es un hombre", "Muchnik Eds.", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("M. Oraison", "Reconciliación Memorias", "Sígueme", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Pierre Gascar", "Rimbaud y la comuna", "A, G. Benzal", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alfred Perles", "Mi amigo Henry Miller", "Nostromo", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Blaise Cendrars", "El hombre fulminado", "Nostromo", "1974", "", "Liternovela_ex_espanola"));
        b.add(new Book("Artur Lundkvist", "Textos del ocaso", "Montesinos", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Amado", "Doña Flor y sus dos maridos", "Alianza", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Madame du Châtelet", "Discurso sobre la felicidad", "Cátedra", "1996", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Susan Sontag", "La enfermedad y sus metáforas", "Muchnik", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jean Canavaggio", "Cervantes", "Espasa Calpe", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miuel Angel Buonarroti", "Obras escogidas", "Felmar", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("William Butler Yeats", "Ideas sobre el bien y el mal", "Felmar", "1975", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Luis Borges", "Obras completas 1923-1972", "Ultramar", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Golo Mann", "Una juventud alemana Memorias", "Plaza Janés", "1989", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Richard Garnett", "El crepúsculo de los dioses", "Siruela", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Patrick White", "Las esferas del Mandala", "Barral", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Pierre La Mure", "La vida privada de Mona Lisa", "C. Lectores", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("R. L. Stevenson", "Virginibus Puerisque", "Taurus", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Malcom  Lowry", "Ultramarina", "Monte Avila", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Les Daniels", "Sangre para un vampiro", "El Cid Editor", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Samuel Beckett", "El innombrable", "Lumen", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ernst W. Heine", "La pulga de Lutero", "Circe", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Penélope Ashe", "Desnuda llegó la desconocida", "Diana", "1970", "2ª impre.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Peter Handke", "Desgracia indeseada", "Barral", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ijara Saikaku", "Hombre lascivo y sin linaje", "Hiperión", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Liddell", "Kavafis Una biografía crítica", "Ultramar", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Esther Vilar", "El varón domado", "Grijalbo, S.A.", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gaston Bachelard", "La llama de una vela", "Laia M. A.", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rachel y Jean-Pierre Cartier", "Un sabio en la selva negra", "Luciérnaga", "1989", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pierre Missac", "Walter Benjamin", "Gedisa", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("León Bloy", "Cartas a Maritain y Van der Meer", "Mundo moderno", "1953", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Mika Valtari", "El aventurero", "Éxito, S.A.", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("P.A.F. Choderlos de Lachos", "Las amistades peligrosas", "Schapire", "1960", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lautreamont", "Obra completa", "Akal", "1988", "Bilingüe", "Liternovela_ex_espanola"));
        b.add(new Book("León Chestov", "La noche de Getsemaní", "Sur", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Fryda Schultz de Mantovani", "Fábula del niño en el hombre", "Sudamericana", "1951", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Luis Borges y Otros", "Antología de la literatura fantástica", "Sudamericana", "1965",
                "", "Liternovela_ex_espanola"));
        b.add(new Book("Otto F. Bollnow", "Rilke", "Taurus", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Max Brod", "Kafka", "Emece", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Pamela Moore", "Chocolates for Breakfast", "Goyanarte", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Kathleen Winsor", "Los amantes", "Eds. Hermes", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ercole Patti", "Un amor en Roma", "C. G. Fabril", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Roger Martin Du Gard", "Confidencia africana", "Tirso", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ryunosuke Akutagawa", "Rashomon", "López Negri", "1954", "", "Liternovela_ex_espanola"));
        b.add(new Book("Diderot", "La religiosa", "Grijalbo", "1967", "", "Liternovela_ex_espanola"));
        b.add(new Book("Diderot", "Paradoja acerca del comediante", "Aguilar", "1964", "", "Liternovela_ex_espanola"));
        b.add(new Book("Nicolás Berdiaeff", "El credo de Dostoievsky", "Apolo", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("León Tolstoi", "La sonata de Kreutzer", "Ramos", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("J. K. Huymans", "Allá lejos", "E. del Beleño", "1958", "Numerado", "Liternovela_ex_espanola"));
        b.add(new Book("Conde de Listowel", "Historia crítica de la estética moderna", "Losada", "1954", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Boris L. Pasternak", "El doctor Jivago", "Noguer", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vicki Baum", "Shangai hotel", "Lara", "1950", "", "Liternovela_ex_espanola"));
        b.add(new Book("Dr. Thigpey y Dr. Cleckley", "Las tres caras de eva", "Juventud", "1958", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Daniel Rops", "La leyenda dorada", "Ayma", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Enrique Sienkievicz", "Quo vadis", "Fama", "1956", "", "Liternovela_ex_espanola"));
        b.add(new Book("Charles Darwin", "Viaje de un natulalista alrededor del mundo", "El ateneo", "1951", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Gerard Brenan", "Al sur de Granada", "Siglo XXI", "1987", "11ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Frank Kermode", "D. H. Lawrence Biografía literaria", "Gedisa", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas de Quincey", "Las confesiones y otros textos", "Barral", "1975", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Giovanni Papini", "El libro negro", "C. Lectores", "1965", "", "Liternovela_ex_espanola"));
        b.add(new Book("Heinrich Böll (U. Eince y R. Lorenzo)", "Y no dijo una sola palabra", "Bitácora", "1972",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Fustel Coulanges", "La ciudad antigua", "Edaf", "1968", "", "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "Uniones", "Seix Barral", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Raïssa Maritain", "Las grandes amistades", "Desclée de B.", "1954", "Intonso",
                "Liternovela_ex_espanola"));
        b.add(new Book("Henry Miller", "Cartas a Anais Nin", "Bruguera", "1983", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alfred Jarry", "Todo Ubú", "Bruguera", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Homero", "Iliada", "M. Aguilar", "1945", "", "Liternovela_ex_espanola"));
        b.add(new Book("Paul Verlaine", "Obras poéticas", "M. Aguilar", "1947", "", "Liternovela_ex_espanola"));
        b.add(new Book("Giacomo Leopardi", "Obras", "M. Aguilar", "1945", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rubén Darío", "Cabezas", "Aguilar", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vital Aza", "Comedias escogidas", "M. Aguilar", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Martín  Alonso", "Diccionario ortográfico", "Aguilar", "1965", "", "Liternovela_ex_espanola"));
        b.add(new Book("Pepe-illo", "La tauromaquia", "Aguilar", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Tovar", "Ancha es Castilla", "Ámbito", "1983", "", "Liternovela_ex_espanola"));
        b.add(new Book("Baltasar Gracián", "Agudeza y arte de ingenio I y II", "Castalia", "1969", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alfonso Martínez de Toledo", "Arcipreste de Talavera o Corbacho", "Castalia", "1970", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Max Aub", "Imposible Sinai", "Seix Barral", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Max Aub", "Jusep Torres Campalans", "Alianza", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "Concierto Barroco", "Siglo XXI", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carmen Conde", "Cobre", "El grifón", "1954", "", "Liternovela_ex_espanola"));
        b.add(new Book("Augusto Casas", "La tierra del alma y otros cuentos", "A. Núñez", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Arturo Serrano Plaja", "La cacatúa atmosférica", "J. Mortiz", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Diego Torres de Villarroel", "Sueños morales y Barca de Aqueronte", "P. Españolas", "1960", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis A. Bejar S./ J. Ignacio Carnero", "El día que mataron a Carlota (P. Jauja 75)",
                "A. Martín", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("M. A. Galguera Fdez./ A. Caballero", "Nosotros el hombre", "Lafalpoo", "1981", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Santiago Rguez. Santervás", "Jorobita (Premio Jauja)", "Gerper", "1960", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Máximo Regidor", "No tenemos sitio para caminar (P. Jauja)", "Gesper", "1967", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Máximo Regidor", "El pan muerto", "Biz", "1962", "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José María Balcells", "Quevedo en  \"La cuna y la sepultura\"", "S.G.E.L.S.A.", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Francisco de Quevedo", "Sueños y discursos Edición facsimilar", "C.E.G.A.L.", "1980",
                "Ed. No venal", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Mihura", "Mis memorias", "Mascarón", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Manuel Silvela Sangro", "Diario de mi vida breve", "Prensa Esp.", "1967", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Almudena Grandes", "Las edades de Lulú", "Tusquets", "1989", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Sáinz de Robles", "El monje, el tiempo y la serpiente", "Aguilar", "1959", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("M. Bañuelos", "La bella Loni y otros cuentos", "Magerit, S.A.", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pero Rodríguez de Lena", "Libro del Passo Honroso", "Espasa Calpe", "1970", "Ed. No venal",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ramón Gómez de la Serna", "La nardo", "Bruguera", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marqués de Tamarón", "El guirigay nacional", "Miñon, S.A.", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Antonio de Villena", "Para los dioses turcos", "Laertes, S.A,", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Antonio de Villena", "Ante el espejo", "Argos Vergara", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Antonio de Villena", "Dados: amor y clérigos", "Cupsa", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Martín Santos", "Encuentro en Sils-María", "Akal", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Luis Martín Santos", "La muerte de Dionisos", "Akal", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Joan Sales", "Incierta gloria I y II", "Planeta", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rosa Rossi", "Escuchar a Cervantes", "Ámbito", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan Gil-Albert", "Los arcángeles Parábola", "Laia", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Ayala", "El as de bastos", "Sur", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Darío Fernández-Flórez", "Lola espejo oscuro", "Plenitud", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ramón del Valle Inclán", "Sonata de primavera", "Salvat", "1970", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anónimo", "Amadís de Gaula", "Ebro, S.L.", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Sebastián Juan Arbó", "Cervantes", "José Janés", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Margarita de Valois Reina de Navarra", "El Heptamerón", "Marte", "1966", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Guía espiritual de Castilla", "Ambito", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Sobre judíos, moriscos y conversos", "Ambito", "1982", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Un cristiano en rebeldía", "Sígueme", "1963", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Retratos y soledades", "Eds. Paulinas", "1977", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Los cementerios civiles", "Taurus", "1978", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Juan XXIII Biografía ilustrada", "Destino", "1974", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Historie Jeduoho Podzimu (Polaco)", "Destino", "1977", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "La consagración de la primavera", "Siglo XXI", "1978", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Meditación esp. sobre la libertad religiosa", "Destino", "1966",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Avila", "Destino", "1988", "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "La ronquera de Fray Luis y otras inquisiciones", "Destino", "1973", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "El sambenito", "Destino", "1972", "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Historia de un otoño", "Destino", "1971", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "El santo de mayo", "Destino", "1976", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "La salamandra", "Destino", "1973", "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Palabras y circunloquios del Rabi I. B. Y.", "Anthropos", "1985",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "El grano de maiz rojo", "Anthropos", "1988", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Sara de ur", "Anthropos", "1989", "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("José Jiménez Lozano", "Duelo en la casa grande", "Anthropos", "1982", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "Hacia un saber sobre el alma", "Losada, S.A.", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "Delirio y destino", "Mondadori", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "La agonía de Europa", "Mondadori", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "La confesión: género literario", "Mondadori", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "Obras reunidas", "Aguilar", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "De la aurora", "Turner", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "El sueño creador", "Turner", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "España sueño y verdad", "Edhasa", "1982", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("María Zambrano", "Filosofía y poesía", "F. C. E.", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Delibes", "El hereje", "C. Lectores", "1998", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Delibes", "Las ratas", "Destino", "1962", "Dedic. Lozano", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Umbral", "Diario político y sentimental", "C. Lectores", "1999", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Umbral", "Los helechos arborescentes", "Argos Vergara", "1980", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Ritos y mitos equívocos", "Istmo", "1974", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Loa pueblos de España I y II", "Istmo", "1985", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Los Baroja (Memorias familiares)", "Taurus", "1972", "Reimpresión",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "La estación de amor", "Taurus", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "El carnaval", "Taurus", "1979", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Toledo", "Destino", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Estudios sobre la vida tradicional española", "Península", "1988",
                "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Palabra, sombra equívoca", "Tusquets", "1989", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Del viejo folklore castellano", "Ámbito", "1988", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "La cara espejo del alma", "C. Lectores", "1987", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ramón J. Sender", "La mirada inmóvil", "Argos Vergara", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Cipriano de Rivas Cherif", "Retrato de un desconocido Vida de M. Azaña", "Grijalbo, S.A.",
                "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Baltasar Gracián", "El criticón", "Cátedra", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ed. de Fernando G. Salinero", "Viaje de Turquía", "Cátedra", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Fray Luis de León", "De los nombres de Cristo", "Cátedra", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Cristóbal de Villalón", "El crotalón", "Cátedra", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Fuentes", "La región más trasparente", "Cátedra", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ana María Matute", "En esta tierra", "Éxito, S.A.", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Luis Martín Descalzo", "La frontera de Dios", "Destino", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Romero", "La noria", "Destino", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "El recurso del método", "Siglo XXI", "1974", "6ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Ferrater Mora", "Claudia, mi Claudia", "Alianza Tres", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Selección de Jesús García Gallego", "Surrealismo El ojo soluble", "Litoral", "1987", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ionesco", "Diario", "Guadarrama", "1968", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan José Gil-Albert", "Memorabilia", "Tusquets", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Mercedes Saenz Alonso", "Don Juan y el Donjuanismo", "Guadarrama", "1969", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Josep Plá", "El cuaderno gris", "Millenium", "1999", "", "Liternovela_ex_espanola"));
        b.add(new Book("Bartolomé Bennassar", "Los españoles", "Swan", "1985", "", "Liternovela_ex_espanola"));
        b.add(new Book("José C. Nieto", "S. Juan de la Cruz Poeta del amor profano", "Swan", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Antonio Vallejo-Nájera", "Locos egregios", "Dossat, S.A.", "1977", "Reimpresión",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carmen Gómez Ojea", "Cantiga de agüero", "Destino", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julio Valdeón", "Alfonso X el Sabio  Col. Villalar nº 1", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Luis Martín", "Claudio Sánchez-Albornoz  Col. Villalar nº 2", "Junta Cª y León", "1986",
                "", "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Piedra", "Jorge Guillén  Col. Villalar nº 3", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Emilio Salcedo", "Miguel Delibes  Col. Villalar nº 4", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Victor García de la Concha", "León Felipe  Col. Villalar nº 5", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Manuel Santamaría", "Emiliano Barral  Col. Villalar nº 6", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Recopilación", "María Teresa León  Col. Villalar nº 7", "Junta Cª y León", "1987", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Elena Santiago", "Relato con lluvia y otros cuentos", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Fernando Giménez Molina", "De lo imaginario", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Pino", "En no importa qué idioma", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Ortega Bayón", "Cruciare Semetipsum", "Junta Cª y León", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Selección de Moisés Mori", "Rebañaduras.  Artículos de Rosa Chacel", "Junta Cª y León", "1986",
                "", "Liternovela_ex_espanola"));
        b.add(new Book("Elisa Gutiérrez", "\"El peditorio\"", "Junta Cª y León", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gustavo Martín Garzo", "Luz no usada", "Junta Cª y León", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("José María Gironella", "Yo, Mahoma", "Planeta", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carmen Barberá", "Yo, Lucrecia de Borgia", "Planeta", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Nestor Luján", "La vida cotidiana en el siglo de oro español", "Planeta", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Leopoldo Azancot", "La novia judía", "Planeta", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan Antonio Vallejo-Nájera", "Mishima o el placer de morir", "Planeta", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Antonio Vallejo-Nájera", "Perfiles Humanos", "Planeta", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Pujol", "Voltaire", "Planeta", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Angel Zúñiga", "Palabras del tiempo", "Barna", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rosa Chacel", "Saturnal", "Seix Barral", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Felicidad Blanc", "Espejo de sombras", "Argos Vergara", "1978", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ramón Ayerra", "Los ratones colorados", "Peralta", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "Guerra del tiempo y otros cuentos", "Alfaguara", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Guerrero Zamora", "Uno de vosotros", "Juan Flors", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Albert Camus", "Teatro", "Losada", "1955", "3ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Jean Genet", "Teatro", "Losada", "1964", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jules Romains", "Teatro", "Losada", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "El reino de este mundo", "Edhasa", "1978", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "Ecue-Yamba-o", "Bruguera", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "El alquimista", "Plaza Janés", "1970", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Con los ojos abiertos", "Gedisa-Emecé", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Opus Nigrum", "Alfaguara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "La muerte en Venecia", "Planeta", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Doctor Faustus", "José Janés", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Los orígenes del Doctor Faustus", "Alianza", "1976", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "La montaña mágica V. I y II", "C. Lectores", "1969", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Fuegos", "Alfaguara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Como el agua que fluye", "Alfaguara", "1983", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Recordatorios", "Alfaguara", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Cuentos orientales", "Alfaguara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marguerite Yourcenar", "Memorias de Adriano", "Edhasa", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "La engañada", "Edhasa", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "El elegido", "Edhasa", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Las tablas de la ley", "Siglo veinte", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julien Green", "Juventud", "Plaza Janés", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Los diez mandamientos de Moisés", "Siglo veinte", "1959", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Tristán, Mario y el mago", "Edic. G. P.", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julien Green", "Suite Inglesa", "Taurus", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Diarios 1918-1936", "Plaza-Janés", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Diarios 1937-1939", "Plaza-Janés", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miquel Barnet", "Biografía de un cimarrón", "Ariel", "1968", "", "Liternovela_ex_espanola"));
        b.add(new Book("Julien Green", "Leviatán", "Planeta", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Georges Bernanos", "La alegría", "Escelicer, S.A.", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Georges Bernanos", "Diario de un cura rural", "Luis de Caralt", "1951", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Georges Bernanos", "Un mal sueño", "Luis de Caralt", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vladimir Nabokov", "Ada o el ardor", "Argos Vergara", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vladimir Nabokov", "Cámara obscura", "Luis de Caralt", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Lawrence Durrell", "Carrusel siciliano", "Noguer", "1978", "", "Liternovela_ex_espanola"));
        b.add(new Book("Lawrence Durrell", "Livia o enterrado en vida", "Noguer", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Lawrence Durrell", "La celda de Próspero", "Sudamericana", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lawrence Durrell", "Monsieur el príncipe de las tinieblas", "Pomaire", "1975", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Umberto Eco", "Tratado de semiótica general", "Lumen", "1981", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Umberto Eco", "La estructura ausente", "Lumen", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Umberto Eco", "El nombre de la rosa", "Lumen", "1983", "2ª ed", "Liternovela_ex_espanola"));
        b.add(new Book("Umberto Eco", "Lector in fábula", "Lumen", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Umberto Eco", "Signo", "Labor", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "El hombre sin atributos I", "Seix Barral", "1981", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "El hombre sin atributos II", "Seix Barral", "1980", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "El hombre sin atributos III", "Seix Barral", "1973", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Musil", "El hombre sin atributos IV", "Seix Barral", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "Ritual en la oscuridad", "Luis de Caralt", "1963", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "A la deriva en el Soho", "Luis de Caralt", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "El caso Lingard", "Luis de Caralt", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "El Dios del laberinto", "Luis de Caralt", "1978", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "Duda necesaria", "Luis de Caralt", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "Carl G. Yung Señor del mundo subterráneo", "Urano, S.A.", "1986", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "A la búsqueda de Wilhelm Reich", "Argos Vergara", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Vitold Gombrowicz", "La seducción", "Seix Barral", "1967", "", "Liternovela_ex_espanola"));
        b.add(new Book("Dominique Fernández", "Porporino o los misterios de Nápoles", "Plaza Janés", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Violette Leduc", "La bastarda", "Sudamericana", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gerald Durrell", "Mi familia y otros animales", "Alianza Tres", "1981", "5ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Gerald Durrell", "Bichos y demás parientes", "Alianza Tres", "1982", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Gerald Durrell", "El jardín de los dioses", "Alianza Tres", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Graves", "Los dos nacimientos de Dionisio", "Seix Barral", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert Graves", "Adiós a todo eso", "Seix Barral", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colin Wilson", "La jaula de cristal", "Luis de Caralt", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Louis Ferdinand Céline", "Viaje al fin de la noche", "Fabril Edit.", "1960", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Louis Ferdinand Céline", "Mea culpa", "Sur", "1937", "", "Liternovela_ex_espanola"));
        b.add(new Book("Louis Ferdinand Céline", "De un castillo a otro", "Lumen", "1972", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "La sinfonía pastoral", "Poseidón", "1951", "6ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "La puerta estrecha", "Poseidón", "1952", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Así sea o la suerte está echada", "Sudamericana", "1963", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Paludes y Teseo", "Sudamericana", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Françoise Sagan", "Bonjour tristesse", "José Janés", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Françoise Sagan", "Una cierta sonrisa", "Themis", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Françoise Sagan", "Un mes de un año", "Condor", "", "", "Liternovela_ex_espanola"));
        b.add(new Book("Françoise Sagan", "Aimez-vous Brahms…", "Mapocho", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Aldous Huxley", "Cielo e infierno", "Sudamericana", "1953", "", "Liternovela_ex_espanola"));
        b.add(new Book("René-Mariel Albérés", "La rebelión de los escritores de hoy", "Emecé", "1953", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pedro Calderón de la Barca", "La humildad coronada", "Espasa Calpe", "1980",
                "Ed. No venal Int.", "Liternovela_ex_espanola"));
        b.add(new Book("Lord Byron", "Morir de pie", "Felmar", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Georges Simenon", "Novelas de Maigret T. IV", "Aguilar", "1961", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("A. Pieyre de Mandiargues", "La muchacha debajo del león", "Sur", "1959", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Zoé Oldenbourg", "Barro y cenizas", "Destino", "1968", "", "Liternovela_ex_espanola"));
        b.add(new Book("Stanislaus Joyce", "Mi hermano James Joyce", "Fabril", "1961", "", "Liternovela_ex_espanola"));
        b.add(new Book("Joseph Frank", "Dostoievski Las semillas de la rebelión 1821-1849", "F. C. E.", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Robert de Luppe", "Albert Camus", "La mandrágora", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "Masa y poder", "Muchnik", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "La lengua absuelta", "Muchnik", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "La antorcha al oído", "Muchnik", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "Auto de fe", "Muchnik", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "El otro proceso de Kafka", "Muchnik", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "El juego de hojos", "Muchnik", "1985", "", "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "Apuntes 1973-1984", "C. Lectores", "2000", "", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1963", "G. Andrés Martin", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "Las voces de Marrakesh", "Pre-textos", "1981", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Elias Canetti", "La conciencia de las palabras nº 218", "F. C. E.", "1982", "1º reimp.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Cecil Saint-Laurent", "El hijo de Carolina querida Juan", "Luis de Caralt", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Cecil Saint-Laurent", "El hijo de Carolina querida Pilar", "Luis de Caralt", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Rabindranath Tagore", "Sadhana o la vía espiritual", "A. Aguado", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Irving Shulman Peggi Bristol", "Furia profunda", "Luis de Caralt", "1965", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Conde de Volney", "Las ruinas de Palmira", "Edaf", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("León Bloy", "El peregrino de lo absoluto", "Mundo moder.", "1948", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("León Bloy", "Cartas a su novia", "Mundo moder.", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("León Bloy", "En el umbral del apocalípsis", "Mundo moder.", "1949", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Conde de Volney", "Las ruinas de Palmira", "Sopena", "1955", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Colette", "Claudina en la escuela", "Sudamericana", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colette", "Claudina en Paris", "Sudamericana", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("Colette", "Claudina en su casa", "Sudamericana", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan Larrea", "Angulos de visión", "Tusquets", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ramón Gómez de la Serna", "Caprichos", "Argos Vergara", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Luis Goytisolo", "Las afueras", "Argos Vergara", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ernesto Sábato", "Sobre héroes y tumbas", "Sudamericana", "1965", "", "Liternovela_ex_espanola"));
        b.add(new Book("Fr. Pedro Malon de Chaide", "Libro de la Conversión de la Magdalena", "M. Aguilar", "1946", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Amado Nervo", "Plenitud", "Aguilar", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Guillermo de Torre", "Problemática de la literatura", "Losada", "1958", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("", "", "", "", "", "Liternovela_ex_espanola"));
        b.add(new Book("Garcilaso de la Vega y Juan Boscán", "Obras completas", "M. Aguilar", "1944", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "Consideraciones de un apolítico", "Grijalbo", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("William Saroyan", "La comedia humana", "José Janés", "1953", "", "Liternovela_ex_espanola"));
        b.add(new Book("Guillermo Diaz-Plaja", "Ensayos escogidos", "M. Aguilar", "1964", "", "Liternovela_ex_espanola"));
        b.add(new Book("Reinaldo Arenas", "El mundo alucinante", "Montesinos", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("August Strindberg", "El hijo de la sierva", "Montesinos", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "José y sus hermanos 1 Las historias de Jacob", "Guadarrama", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "José y sus hermanos 3 José en Egipto", "Guadarrama", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Mann", "José y sus hermanos 4 José el proveedor", "Guadarrama", "1977", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Oscar Wilde", "El retrato de Dorian Gray", "Alianza", "1999", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alejo Carpentier", "Ese músico que llevo dentro", "Alianza", "1987", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alberto Moravia", "La vida interior", "Plaza Janés", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Klaus Mann", "Mefisto", "Salvat", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jean Giruadoux", "Ondina", "Alfil", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carlo M. Cipolla", "¿Quién rompió las rejas de Monte Lupo?", "Muchnik", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Abel Posse", "Los perros del paraíso", "A. Vergara", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Blaise Cendrars", "Llévame al fin del mundo", "Argos Vergara", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jan Kerouac", "Una chica en la carretera", "A. Vergara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jack Kerouac", "En el camino", "Bruguera", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Malcom Lowry", "Oscuro como la tumba donde yace mi amigo", "Bruguera", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ford Madox Ford", "El Buen soldado", "Bruguera", "1983", "", "Liternovela_ex_espanola"));
        b.add(new Book("Edward Morgan Forser", "La vida futura", "Alianza Tres", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Herman Broch", "La muerte de Virgilio", "Alianza Tres", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Alonso del Castillo Solórzano", "La niña de los embustes", "Aguilar", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Bernhard", "Corrección", "Alianza Tres", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Leonardo Sciascia", "El archivo de Egipto", "Bruguera", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Torcuato Tasso", "La Jerusalén libertada", "M. Aguilar", "1946", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Bernhard", "Un niño", "Anagrama", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Bernhard", "El sobrino de Wittgenstein", "Anagrama", "1988", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Bernhard", "Sí", "Anagrama", "1985", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Thomas Bernhard", "El orígen", "Anagrama", "1987", "3ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Bukowski", "Escritos de un viejo indecente", "Anagrama", "1981", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Bukowski", "Ordinaria locura", "Anagrama", "1982", "3ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("J. Rodolfo Wilcock", "La sinagoga de los iconoclastas", "Anagrama", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("John Kennedy Toole", "La conjura de los necios", "Anagrama", "1982", "3ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Joseph Roth", "A diestra y siniestra", "Anagrama", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Joseph Roth", "Hotel Savoy", "Seix Barral", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Peter Weiss", "La sombra del cuerpo del cochero", "Seix Barral", "1968", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("A. J. A. Symons", "En busca del varón Corvo", "Seix Barral", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lou Andreas Salomé", "Mirada retrospectiva", "Alianza Tres", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lou Andreas Salomé", "Fenitschka Una divagación", "Icaria", "1988", "1ª reimp.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Natalie C. Barney", "De trazos a retratos", "Icaria", "1988", "", "Liternovela_ex_espanola"));
        b.add(new Book("Constitución", "De la monarquía española (1812)", "Aguilar", "1976", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Marcel Brion", "La Alemania Romántica II", "Barral", "1973", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vincent Van Gogh", "Cartas a Theo", "Barral", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Martin Buber", "Cuentos Jasídicos Los maestros cont. I y II", "Paidos", "1983", "1ª reimp.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Martin Buber", "Cuentos Jasídicos Los primeros maestros II", "Paidos", "1980", "1ª reimp.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Rulfo", "Pedro Páramo y El llano en llamas", "Planeta", "1972", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Walter Benjamin", "El Berlin demónico", "Icaria", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Walter Benjamin", "Angelus Novus", "Edhasa", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Agustina Bessa Luís", "La sibila", "Alfaguara", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Robert Walser", "El ayudante", "Alfaguara", "1982", "", "Liternovela_ex_espanola"));
        b.add(new Book("Walter Benjamin", "Infancia en Berlin Hacia 1900", "Alfaguara", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jan Morris", "Presencia de España", "Turner", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Pierre Benoit", "Los  placeres del viaje", "S.G.E. Libros", "1951", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Guy de Maupassant", "Bel Ami", "G. Kraft", "1952", "Numerado", "Liternovela_ex_espanola"));
        b.add(new Book("Gilbert Cesbron", "Don Juan en otoño", "Plaza Janés", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jean Potocki", "Manuscrito encontrado en Zaragoza", "Minotauro", "1967", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pedro Retuerto Vaquero", "Mi encantadora Margaret (novela corta)", "I. Americana", "", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("John Erskine", "El marido de Penélope", "Diana", "1957", "Revista Liter.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Aldous Huxley", "Las puertas de la percepción", "Sudamericana", "1956", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("J. T. Angelloz", "Rilke", "Sur", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Petronio/Apuleyo La novela romana", "El Satiricón La metamorfósis", "J. B. Bergua", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("C. Castelló Blanco", "La Mayorazgo Romáriz y el Comendador", "Diana", "1959", "Revista Liter.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Norman Lockridge", "Historias de pasión", "Diana", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gustav Janouch", "Conversaciones con Kafka", "Puerta del Sol", "1956", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jules Romains", "Una mujer singular", "Edics. Cid", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jules Romains", "La necesidad de ver claro", "Cid", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Roberto Genoveva", "Malinca", "1954", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Los monederos falsos", "Malinca", "1954", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Luis Varela", "El mundo de lo grotesco en Valle Inclán", "Vda. de C. Bermejo", "1967",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Sholojov", "Sobre el Don apacible", "Quetzal", "1959", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Zorrilla", "Mi última brega", "A. Martín", "1993", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Mª Badía", "Las tentaciones", "La novela deliciosa", "1932", "", "Liternovela_ex_espanola"));
        b.add(new Book("Giovanni Boccaccio", "El decamerón", "C. Lectores", "1965", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miklos Batori", "Los vagabundos de Dios", "Luis de Caralt", "1975", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Bernard -Enri Lévy", "Los últimos días de Charles Baudelaire", "Ediciones B", "1989", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Malcom Lowry", "Bajo el volcán", "Bruguera", "1981", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("León Bloy", "La puerta de los humildes", "Mundo moderno", "1950", "", "Liternovela_ex_espanola"));
        b.add(new Book("Giuseppe Tomasi de Lampedusa", "El gatopardo", "Noguer", "1961", "8ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Giuseppe Tomasi de Lampedusa", "El profesor y la sirena y otros relatos", "Noguer", "1961", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lewis Carroll", "Alicia en el país de las maravillas", "Alianza", "1970", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jean Genet", "Milagro de la rosa", "Debate", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Luis Borges", "El Libro de los seres imaginarios", "Kier", "1967", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Frederic V. Grunfeld", "El mundo trágico de Freud, Mahler, Einstein y Kafka", "Planeta",
                "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Frank G. Slaghler", "Tempestad de pasiones", "Planeta", "1960", "", "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Ponz J. Valdeón", "Castilla y León en el siglo XVIII", "Ámbito", "1983", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alfonso Martínez de Toledo", "Corbacho o reprobación del amor mundano", "Caracas", "1970", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ignacio Aldecoa", "El fulgor y la sangre", "C. Lectores", "1962", "", "Liternovela_ex_espanola"));
        b.add(new Book("Homero", "Odisea", "M. Aguilar", "1945", "", "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Machado", "Juan de Mairena", "Castalia", "1985", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Diario 1931-1934 I", "RM", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Diario 1934-1939 II", "RM", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Diario 1939-1944 III", "RM", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("R. Majó Francis", "Los Pinzones", "Diana", "1958", "Revista Liter.", "Liternovela_ex_espanola"));
        b.add(new Book("Quevedo", "Prosa festiva y satírica", "Aguilar", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Diario 1944-1947 IV", "RM", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Diario 1947-1955 V", "RM", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Anais Nin", "Henry y June Diario inédito", "Plaza Janés", "1987", "", "Liternovela_ex_espanola"));
        b.add(new Book("Vélez de Guevara", "El diablo cojuelo", "Aguilar", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Torres Villarroel", "Vida (2 ejemplares)", "Aguilar", "1970", "", "Liternovela_ex_espanola"));
        b.add(new Book("Mariano José de Larra", "En este país y otros artículos", "Alianza", "1967", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Pío Baroja", "La sensualidad pervertida", "Bruguera", "1983", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Diego de San pedro", "Obras completas II Cárcel de amor", "Castalia", "1972", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Miguel de Cervantes", "Don Quijote de la Mancha P. I y II", "Millenium", "1999", "El Mundo",
                "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Sánchez Barbudo", "Ensayos y recuerdos", "Laia", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan Marsé", "La oscura historia de la prima Montse", "Argos Vergara", "1979", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Raul Ruiz", "El tirano de Taormina", "Peralta", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Juan Rodríguez del Padrón", "Obras completas", "E. Nacional", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Antonio Pereira", "País de los Losadas", "Plaza Janés", "1978", "", "Liternovela_ex_espanola"));
        b.add(new Book("Mariano José de Larra", "Artículos", "Aguilar", "1967", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rafael Sánchez Ferlosio", "Las semanas del jardín", "Alianza", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Leopoldo Alas Clarín", "La regenta", "Sarpe", "1984", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rafael Sánchez Ferlosio", "Industrias y andanzas de Alfanhui", "Cies", "1951", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Lawrence Durrell", "Una sonrisa en el ojo de la mente", "Edhasa", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Iglesia de Castilla y León", "Las edades del hombre", "C. A. Salamanca", "", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Versión de Félix E. Etchegoyen", "El jardín de las rosas", "G. Kraft", "1952", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Versión de Charles Devillers", "Los Gazales de Hafiz", "G. Kraft", "1953", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Versión de Angel J. Battistessa", "La flauta de jade", "G. Kraft", "1951", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Rafael Sánchez Ferlosio", "El Jarama", "Destino", "1980", "4ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Gabriel García Márquez", "Cien años de soledad", "C. Lectores", "1967", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Heberto Padilla", "En mi jardín pastan  los héroes", "Argos Vergara", "1981", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Umbral", "Amar en Madrid", "Planeta", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Luis Chamizo", "El miajón de los castuos", "Aguilar", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Serafín y Joaquín Alvarez Quintero", "El patio", "Aguilar", "1973", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Valle  Inclán", "Jardin Umbrío", "Aguilar", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Arniches", "Sainetes", "Aguilar", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Carlos Arniches", "Sainetes", "Aguilar", "1966", "", "Liternovela_ex_espanola"));
        b.add(new Book("Don Juan Manuel", "El Conde Lucanor", "C.E.G.A.L.", "1982", "Ed. No venal",
                "Liternovela_ex_espanola"));
        b.add(new Book("Versión de Franz Toussaint", "Sakuntala de Kalidasa", "G. Kraft", "1955", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Versión de E. Steinilber-Oberlin", "Calidasa Ronda de las estaciones", "G. Kraft", "1954",
                "Numerado", "Liternovela_ex_espanola"));
        b.add(new Book("Versión de Enrique Fdez. Latour", "La guirnalda de Afrodita", "G. Kraft", "1955", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Oliver Sacks", "El hombre que confundió a  su mujer con un sombrero", "Muchnik", "1987", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Ramón Jiménez", "Platero y yo", "C. del Libro", "1973", "Ed. no venal",
                "Liternovela_ex_espanola"));
        b.add(new Book("Luis Rosales", "Teoría de la libertad", "Castilla, S.A.", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("J. M. Vargas Vila", "Los ojos de Astrea", "Bauzá", "1889", "Estampilla",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "El laberinto vasco", "sarpe", "1986", "", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Delicado", "La lozana andaluza", "Castalia", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("André Malraux", "La via real", "Argos Vergara", "1977", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ionesco", "Rinoceronte Primer Acto Nº 18", "P. Acto Diciemb.", "1957", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Henrik Ibsen", "Teatro completo", "Aguilar", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Franz Kafka", "El proceso", "Emecé", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Bertolt Brecht", "Poemas y canciones", "Horizonte", "1965", "", "Liternovela_ex_espanola"));
        b.add(new Book("Andrés Réversz", "La vida patética de Eleonora Duse", "Diana", "1958", "Revista Liter.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carlo Coccioli", "Fabricio Lupo", "C. G. Ediciones", "1957", "", "Liternovela_ex_espanola"));
        b.add(new Book("Sófocles", "Ayax-Antígona Edipo Rey", "Salvat", "1970", "Libro TV", "Liternovela_ex_espanola"));
        b.add(new Book("José Luis Mediavilla", "La oveja negra", "La vanguardia", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Luis Mediavilla", "Relatos desde el manicomio", "Yatros", "1966", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Mario Vargas Llosa", "La casa verde", "Argos Vergara", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Massimo Bontempelli", "Vida y muerte de Adriá y de sus hijos", "Diana", "1958",
                "Revista Liter.", "Liternovela_ex_espanola"));
        b.add(new Book("Alfredo Gómez Jaime", "Bajo la máscara", "La nueva prensa", "1929", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Juan Carlos Onetti", "La vida breve", "Argos vergara", "1979", "", "Liternovela_ex_espanola"));
        b.add(new Book("Hermann Hesse", "El lobo estepario", "Alianza", "1984", "10ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Grahan Greene", "El poder y la gloria", "C. Lectores", "1961", "", "Liternovela_ex_espanola"));
        b.add(new Book("Grahan Greene", "El fin de la aventura", "Sur", "1979", "8ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Grahan Greeene", "En busca de un personaje", "Bruguera", "1983", "2ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Italo Calvino", "La nube de smoc", "Bruguera", "1981", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gustavo Lanson de la Sorbona", "Voltaire", "C. G. Ediciones", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Boccaccio", "El decamerón", "C. G. Ediciones", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Conde de Lautreamont (Isidore  Ducasse)", "Obras completas", "Boa", "1964", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Nadiezhda Mandelstam", "Contra toda esperanza", "Alianza Edit.", "1984", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("André Gide", "Diario (1889-1949)", "Losada, S.A.", "1963", "Piel", "Liternovela_ex_espanola"));
        b.add(new Book("Joseph Frank", "Dostoievski Los años de prueba 1850-1859", "F. C. E.", "1986", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("William E. Walsh", "Familia numerosa", "Rialp", "1954", "", "Liternovela_ex_espanola"));
        b.add(new Book("Rabindranath Tagore", "Meditaciones", "Escelicer, S.A.", "1961", "", "Liternovela_ex_espanola"));
        b.add(new Book("D. H. Lawrence", "Paseos etruscos", "Fabril", "1961", "", "Liternovela_ex_espanola"));
        b.add(new Book("John Erskine", "La vida privada de Helena de Troya", "José Janés", "1955", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alfonso Sastre", "Flores rojas para M. Servet", "Argos Vergara", "1982", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alberto Moravia", "La mascarada", "José Janés", "1952", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ernle  Bradford", "En busca de Ulises", "Muchnik", "1989", "", "Liternovela_ex_espanola"));
        b.add(new Book("Philip Roth", "El lamento de Portnoy", "Bruguera", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Idries Shah", "Cuentos de los derviches", "Paidos", "1989", "3ª  reimp.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Joseph Roth", "La marcha de Radeztky", "L.A.R.A.", "1950", "", "Liternovela_ex_espanola"));
        b.add(new Book("Franz Kafka", "Cartas a Milena", "Emece", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("Franz Kafka", "Carta a mi padre y otros escritos", "Emece", "1955", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Franz Kafka", "Diarios 1910-1923", "Emece", "1953", "Intonso", "Liternovela_ex_espanola"));
        b.add(new Book("Manuel Cabaleiro Goas", "Werner, Mischkin y J. Monegro visto por un  psiquiatra", "Apolo",
                "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Sheila Cousins", "Una mujer de  la calle", "Troquel", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Sholojov", "Fuego en el Don", "Quetzal", "1959", "Intonso", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Sholojov", "El don arrasado", "Quetzal", "1959", "Intonso", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Sholojov", "Se desbordó el Don", "Quetzal", "1959", "Intonso", "Liternovela_ex_espanola"));
        b.add(new Book("Uwe Johnson (U. Eince y R. Lorenzo)", "Conjeturas sobre Jakob", "Narcea Edes.", "1973",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Max Aub", "Del amor", "Finisterre", "1972", "Numerado", "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Espinosa", "Escuela de mandarines", "Los Libros de la F.", "1974", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Miguel Espinosa", "La tribada falsaria", "Los Libros de la F.", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Julio Caro Baroja", "Las formas complejas de la vida religiosa", "Akal", "1978", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Salvador de Madariaga", "Sauco Panco", "Latino-Americ.", "1964", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alvaro de la Iglesia", "Todos los ombligos son redondos", "Planeta", "1961", "6ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Carmen Kurz", "Duermen  bajo las aguas", "Planeta", "1955", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Emilio Pacheco", "Morirás lejos", "Montesinos", "1980", "", "Liternovela_ex_espanola"));
        b.add(new Book("Gustave Doré y el Barón Ch.  Davillier", "Viaje por España V. I y II", "Anjana Eds.", "1982",
                "Numerados", "Liternovela_ex_espanola"));
        b.add(new Book("John Knittel", "EL HAKIN 1ª ed. Club Lectores", "José Janés", "1955", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Marcel Schwob", "La cruzada de los niños", "Tusquets", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Laszlo Passuth", "Madrigal", "Luis de Caralt", "1976", "", "Liternovela_ex_espanola"));
        b.add(new Book("Hans Fallada", "Una vez tuvimos un hijo", "José Janés", "1951", "", "Liternovela_ex_espanola"));
        b.add(new Book("Lajos Zilahy", "Algo flota sobre el agua", "José Janés", "1951", "6ª ed.",
                "Liternovela_ex_espanola"));
        b.add(new Book("Doris Lessing", "Un casamiento convencional", "Argos Vergara", "1979", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Goirgio Bassani", "Los anteojos de oro", "Barral", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("Niko Kazantzakis", "Carta al Greco", "Carlos Lohle", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Louis-Ferdinand Celine", "Rigodon", "Barral", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marcel Brion", "La Alemania Romántica I", "Barral", "1971", "", "Liternovela_ex_espanola"));
        b.add(new Book("Jorge Ibargüengoitia", "Las muertas", "Argos Vergara", "1983", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ramón Ayerra", "Crónica de un suceso lamantable", "Laertes, S.A.", "1980", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Jean de la Bruyere", "Los caracteres o las costumbres de este siglo", "M. Aguilar", "1944", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Ralf  Waldo Emerson", "Ensayos", "M. Aguilar", "1947", "", "Liternovela_ex_espanola"));
        b.add(new Book("Joaquín Pedro de Oliveira Martins", "Historia de la civilización ibérica", "M. Aguilar",
                "1946", "", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Salignac de la Mothe (Fenelón)", "Las aventuras de Telémaco, Hijo de Ulises",
                "M. Aguilar", "1944", "", "Liternovela_ex_espanola"));
        b.add(new Book("John Milton", "El paraíso perdido", "M. Aguilar", "1946", "", "Liternovela_ex_espanola"));
        b.add(new Book("Diógenes Laercio", "Vidas de los filósofos más ilustres", "M. Aguilar", "1946", "",
                "Liternovela_ex_espanola"));
        b.add(new Book(" Manuel Aguilar", "Una experiencia editorial", "Aguilar", "1972", "", "Liternovela_ex_espanola"));
        b.add(new Book("José Martí", "Versos sencillos. Ismaelillo", "Aguilar", "1969", "", "Liternovela_ex_espanola"));
        b.add(new Book("Aljoxani", "Historia de los jueces de Córdoba", "Aguilar", "1965", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Bolívar", "Páginas selectas", "Aguilar", "1975", "", "Liternovela_ex_espanola"));
        b.add(new Book("Ricardo Palma", "Las mejores tradiciones peruanas", "Aguilar", "1970", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Günter Grass", "El tambor de hojalata", "RBA", "1993", "", "Liternovela_ex_espanola"));
        b.add(new Book("Azorín", "El artista y el estilo", "M. Aguilar", "1946", "", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1977 año XX", "G. Andrés Martin", "1978",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1978 año XXI", "G. Andrés Martin", "1980",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1979 año XXII", "G. Andrés Martin", "1980",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1980 año XXIII", "G. Andrés Martin", "1981",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1981 año XXIV", "G. Andrés Martin", "1982",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1982 año XXV", "G. Andrés Martin", "1983",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1983 año XXVI", "G. Andrés Martin", "1984",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1984 año XXVII", "G. Andrés Martin", "1985",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("Francisco Alvaro", "El teatro en España en 1985 año XXVIII", "G. Andrés Martin", "1986",
                "Dedicado", "Liternovela_ex_espanola"));
        b.add(new Book("BECKETT", "Esperando a Godot PRIMER  ACTO    Nº  1", "P. Acto Abril", "1957", "Nº 1",
                "Liternovela_ex_espanola"));
        b.add(new Book("Peter Weiss", "Persecución y asesinato de J. P. Marat", "Grijalbo", "1965", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Fernando de Rojas", "La Celestina", "J. Bergua", "", "2ª ed.", "Liternovela_ex_espanola"));
        b.add(new Book("Salvador de Madariaga", "Don Juan y la Don Juan", "Sudamericana", "1950", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Ruibal", "La máquina de pedir. El asno...", "Siglo XXI", "1973", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("D. Rodríguez y E. Bariego", "En el viejo camino olvidado", "Ceres", "1958", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("E. Bariego y D. Rodríguez", "La vida no tiene argumento", "Ceres", "1959", "Numerado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Fritz Hochwälder", "Así en la tierra como en el cielo", "Emecé", "1956", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José María Castroviejo", "Don Quijote 1947", "M. Roel", "1947", "", "Liternovela_ex_espanola"));
        b.add(new Book("Marqués de Sade", "Oxtiem  o las desdichas del libertinaje. El filósofo...", "Edicusa", "1970",
                "", "Liternovela_ex_espanola"));
        b.add(new Book("José Luis López Cid", "Edipo abandonado Dos ejemplares", "Tanco", "1954", "Dedicados",
                "Liternovela_ex_espanola"));
        b.add(new Book("José A. Jiménez-Arnau", "La cárcel sin puertas", "Alfil", "1958", "", "Liternovela_ex_espanola"));
        b.add(new Book("Luis Maté", "Ecos escandalosos de sociedad", "Alfil", "1957", "Dedicado",
                "Liternovela_ex_espanola"));
        b.add(new Book("Alfonso Paso", "La corbata", "Alfil", "1963", "", "Liternovela_ex_espanola"));
        b.add(new Book("Lope de Vega", "Fuente Ovejuna El caballero de Olmedo", "Salvat", "1970", "Libro TV",
                "Liternovela_ex_espanola"));
        b.add(new Book("Fernando Díaz Plaja", "Teatro Español de Hoy Antología 1938-1966", "Alfil", "1958", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("Biblioteca Parisien", "Un empresario afortunado Volumen 2", "La novela Galante", "", "",
                "Liternovela_ex_espanola"));
        b.add(new Book("José Mª Badía", "Las tentaciones", "La novela deliciosa", "1932", "", "Liternovela_ex_espanola"));
    }

    // TODO
    private static void fillLibrosAustral() {
        DB.get("LibrosAustral");
    }

    private static void fillLibrosAntiguos() {
        final List<Book> b = DB.get("LibrosAntiguos");
        b.add(new Book("Alfredo Fouillee", "Bosquejo psicológico de los pueblos europeos", "Americalee", "1943", "",
                "LibrosAntiguos"));
        b.add(new Book("", "", "", "0", "", "LibrosAntiguos"));
        b.add(new Book("", "Lradio***", "", "0", "", "LibrosAntiguos"));
        b.add(new Book("Sin autor", "Poetas Líricos Vallisoletanos Siglos XIX y XX", "", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Juan Bautista Carrasco", "Mitología universal", "Gaspar y Roig", "1864", "", "LibrosAntiguos"));
        b.add(new Book("Oswald Spengler", "Años decisivos", "Espasa Calpe", "1936", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Antonio Tovar", "En el primer giro", "Espasa Calpe", "1941", "", "LibrosAntiguos"));
        b.add(new Book("M. Kant", "Lo bello y lo sublime", "Calpe", "1937", "", "LibrosAntiguos"));
        b.add(new Book("Nicolás Maquiavelo", "El príncipe", "Calpe", "1936", "", "LibrosAntiguos"));
        b.add(new Book("Sainte-Beuve", "Voluptuosidad T. I, II y III", "Calpe", "1923", "", "LibrosAntiguos"));
        b.add(new Book("Iván Bunin", "Una aldea", "Calpe", "1923", "", "LibrosAntiguos"));
        b.add(new Book("Gerardo de Nerval", "Noches de octubre y Paseos y recuerdos", "Calpe", "1923", "",
                "LibrosAntiguos"));
        b.add(new Book("Gerardo de Nerval", "Silvia y La mano encantada", "Calpe", "1923", "", "LibrosAntiguos"));
        b.add(new Book("David Hume", "Tratado de la naturaleza humana T. I, II y III", "Calpe", "1923", "",
                "LibrosAntiguos"));
        b.add(new Book("Agustin Thierry", "Relatos de los tiempos merovingios T. I y II", "Calpe", "1922", "",
                "LibrosAntiguos"));
        b.add(new Book("De Senancour", "Obermann T. I, II y III (T. II 2 ej)", "Calpe", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Martin Buber", "Moisés", "Imán", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Karel Capek", "Guerra con las salamandras", "R. Occidente", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Espinoza", "Etica", "L. Perlado", "1940", "Intonso", "LibrosAntiguos"));
        b.add(new Book("Henry  Barbuse", "El infierno", "Prometeo", "1919", "", "LibrosAntiguos"));
        b.add(new Book("Aristófanes", "Comedias T. I y II", "Prometeo", "", "", "LibrosAntiguos"));
        b.add(new Book("L. Sacher-Masoch", "La venus de las pieles", "F. Beltrán", "1934", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Eduardo del Palacio Fontán", "Método de lengua francesa", "I. Torrent", "1934", "",
                "LibrosAntiguos"));
        b.add(new Book("J. W. Goethe", "La nueva Melusina", "Juventud", "1943", "", "LibrosAntiguos"));
        b.add(new Book("J. W. Goethe", "Hermann y Dorotea", "Maucci", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Nicolás Berdiaeff", "Una nueva Edad Media", "Apolo", "1938", "8ª ed.", "LibrosAntiguos"));
        b.add(new Book("Stendhal", "Rojo y negro", "Argonauta", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Jacques Fouguet", "Ingres", "Anaquel", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Henry N. Brailsford", "Voltaire", "F. C. E.", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Jorge Manrique", "Coplas a la muerte de su padre", "Más allá", "1943", "", "LibrosAntiguos"));
        b.add(new Book("José Vasconcelos", "Etica", "M. Aguilar", "1932", "", "LibrosAntiguos"));
        b.add(new Book("Ralph Waldo Emerson", "Hombres representativos", "Losada, S.A.", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Giambattista Vico", "Ciencia Nueva I y II", "Cº México", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Eugenio D'Ors", "Estilos de pensar", "E. y Pub. Esp.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("José Luis L. Aranguren", "La filosofía de Eugenio D'Ors", "E. y Pub. Esp.", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Joaquín Xirau", "Vida, pensamiento y obra de Bergson", "Leyenda, S.A.", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("José Ferrater Mora", "Variaciones sobre el espíritu", "Sudamericana", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Ayala", "Histrionismo y representación", "Sudamericana", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Manuel Azaña", "El jardín de los frailes", "Espasa Calpe", "1936", "", "LibrosAntiguos"));
        b.add(new Book("Etienne Gilson", "La filosofía en la Edad Media", "Pegaso", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Angel Lacalle", "Historia general de la literatura", "Barcelona", "1932", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Goy de Silva", "Viaje a Belén", "A. Aguado", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Remberto Reinhardt", "Psicología animal", "Espasa-Calpe", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Luis S. Sors", "Elementos de aviación", "Espasa-Calpe", "1941", "", "LibrosAntiguos"));
        b.add(new Book(" Lecomte du Noüy", "El destino humano", "S. Rueda", "1948", "8ª ed. ??", "LibrosAntiguos"));
        b.add(new Book("Le Danois", "El Atlántico", "Espasa-Calpe", "1940", "", "LibrosAntiguos"));
        b.add(new Book("P. L Roederer", "Bonaparte me decía", "José Janés", "1948", "", "LibrosAntiguos"));
        b.add(new Book("A. N. Whitehead", "Aventuras  de las ideas", "José Janés", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Clemence Dane", "La arrogante historia de ben", "José Janés", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "El mundo histórico", "F. C. E.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "Teoría de la concepción del mundo", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "Hegel y el idealismo", "F. C. E.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "Vida y poesía", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Pierre Loüys", "Las canciones de Bilitis", "Lib. Bergua", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "De Leibniz a Goethe", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Dilthey", "Hombre y mundo en los siglos XVI y XVII", "F. C. E.", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Jacob Burckhardt", "Del paganismo al cristianismo", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Teodoro Mommsen", "El mundo de los césares", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Johannes Bühler", "Vida y cultura en la Edad Media", "F. C. E.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "El tema del hombre", "R. Occidente", "1943", "", "LibrosAntiguos"));
        b.add(new Book("M. de Iriarte, S. I.", "El Dr. Huarte de San Juan y su examen de…", "Cº Sup. Inv. C.", "1948",
                "3ª ed. correg.", "LibrosAntiguos"));
        b.add(new Book("Charles Guignebert", "Manual de Hª antigua del cristianismo", "Albatros", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("H. Hóffding", "Filósofos contemporáneos", "Daniel Jorro", "1909", "", "LibrosAntiguos"));
        b.add(new Book("H. Hóffding", "Filosofía de la religión", "Daniel Jorro", "1909", "", "LibrosAntiguos"));
        b.add(new Book("Hegel", "Filosofía del espíritu T. I y II", "Daniel Jorro", "1907", "", "LibrosAntiguos"));
        b.add(new Book("Rudolf Eucken", "Las grandes corrientes del pensamiento contemporáneo", "Daniel Jorro", "1912",
                "", "LibrosAntiguos"));
        b.add(new Book("Rudolf Eucken", "El contenido de verdad en religión", "Daniel Jorro", "1925", "",
                "LibrosAntiguos"));
        b.add(new Book("Rodolfo Eucken", "Los grandes pensadores Su teoría de la vida", "Daniel Jorro", "1914", "",
                "LibrosAntiguos"));
        b.add(new Book("Guillermo Wundt", "Fundamentos de metafísica T. I y II", "Daniel Jorro", "1913", "",
                "LibrosAntiguos"));
        b.add(new Book("Hugo Riemann", "Elementos de estética musical", "Daniel Jorro", "1914", "", "LibrosAntiguos"));
        b.add(new Book("Alfredo Weber", "Historia de la filosofía europea", "Daniel Jorro", "1914", "",
                "LibrosAntiguos"));
        b.add(new Book("Teodoro Lipps", "Los fundamentos de la estética", "Daniel Jorro", "1923", "", "LibrosAntiguos"));
        b.add(new Book("Henri Bergson", "La energía espiritual", "Daniel Jorro", "1928", "", "LibrosAntiguos"));
        b.add(new Book("Enrique Lichtenberger", "La filosofía de Nietzsche", "Daniel Jorro", "1910", "",
                "LibrosAntiguos"));
        b.add(new Book("Guyan", "Los problemas de la estética contemporánea", "Daniel Jorro", "1920", "",
                "LibrosAntiguos"));
        b.add(new Book("V. Mellusi", "Del amor al delito", "Góngora", "1914", "", "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Meditaciones sudamericanas", "E. Calpe, S.A.", "1933", "",
                "LibrosAntiguos"));
        b.add(new Book("Padre A. Gratry", "El conocimiento de Dios", "Pegaso", "1941", "", "LibrosAntiguos"));
        b.add(new Book("W. S. Jerons", "Lógica", "Pegaso", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Eugenio Imaz", "El pensamiento de Dilthey", "El Coleg. de Méx.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Joaquín Xirau", "Amor y mundo", "El Coleg. de Méx.", "1940", "", "LibrosAntiguos"));
        b.add(new Book("Olga Victoria Quiroz-Martínez", "La introducción de la Fª moderna en España",
                "El Coleg. de Méx.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Platón Obras Completas", "Hipias Mayor Fedro", "Univ.Aut. México", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Platón Obras Completas", "Banquete Ion", "Univ.Aut. México", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Platón Obras Completas", "Eutifron Apología Critón", "Univ.Aut. México", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Jenofonte Obras Completas", "Recuerdos de Sócrates Banquete Apología", "Univ.Aut. México",
                "1946", "", "LibrosAntiguos"));
        b.add(new Book("J. G. Fichte", "El destino del hombre y el destino del sabio", "V. Suárez", "1913", "",
                "LibrosAntiguos"));
        b.add(new Book("M. Kant", "Crítica de la razón práctica", "V. Suárez", "1913", "", "LibrosAntiguos"));
        b.add(new Book("M. Kant", "Crítica del juicio 1ª y 2ª parte", "V. Suárez", "1914", "", "LibrosAntiguos"));
        b.add(new Book("G. W. F. Hegel", "Enciclopedia de las ciencias filosóficas T. I y II", "V. Suárez", "1917", "",
                "LibrosAntiguos"));
        b.add(new Book("G. W. F. Hegel", "Enciclopedia de las ciencias filosóficas T. III", "V. Suárez", "1918", "",
                "LibrosAntiguos"));
        b.add(new Book("Hegel", "Fenomenología del espíritu", "R. Occidente", "1935", "", "LibrosAntiguos"));
        b.add(new Book("Francisco Suárez", "Sobre el concepto del ente", "R. Occidente", "1935", "", "LibrosAntiguos"));
        b.add(new Book("C. G. Yung", "Lo insconsciente", "R. Occidente", "1927", "", "LibrosAntiguos"));
        b.add(new Book("A. Pfänder", "Fenomenología de la voluntad", "R. Occidente", "1931", "", "LibrosAntiguos"));
        b.add(new Book("J. von Uexküll", "Meditaciones biológicas", "R. Occidente", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "De lo eterno en el hombre", "R. Occidente", "1940", "", "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "Muerte y supervivencia Ordo amoris", "R. Occidente", "1934", "",
                "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "El puesto del hombre en el cosmos", "R. Occidente", "1936", "", "LibrosAntiguos"));
        b.add(new Book("E. Murger", "Escenas de la vida bohemia T. I", "Calpe", "1924", "", "LibrosAntiguos"));
        b.add(new Book("Fichte", "Introducción a la teoría de la ciencia", "R. Occidente", "1934", "", "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "San Anselmo y el insensato", "R. Occidente", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Pablo Luis Landsberg", "La academia platónica", "R. Occidente", "1926", "", "LibrosAntiguos"));
        b.add(new Book("Francisco Brentano", "El porvenir de la filosofía", "R. Occidente", "1936", "",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Brentano", "Psicología", "R. Occidente", "1935", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Francisco Brentano", "El orígen del conocimiento moral", "R. Occidente", "1941", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Balduin Schwartz", "La psicología del llanto", "R. Occidente", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Harold Hóffding", "Rousseau", "R. Occidente", "1931", "", "LibrosAntiguos"));
        b.add(new Book("Harold Hóffding", "Kierkegard", "R. Occidente", "1949", "", "LibrosAntiguos"));
        b.add(new Book("W. Brand y M. Deutschbein", "Introducción a la filosofía matemática", "R. Occidente", "1930",
                "", "LibrosAntiguos"));
        b.add(new Book("Emmanuel Mounier", "Introducción a los existencialismos", "R. Occidente", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Jorge Simmel", "Problemas fundamentales de la filosofía", "R. Occidente", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Schopenhauer", "Sobre la libertad humana", "R. Occidente", "1934", "", "LibrosAntiguos"));
        b.add(new Book("Augusto Comte", "Discurso sobre el espíritu positivo", "R. Occidente", "1934", "",
                "LibrosAntiguos"));
        b.add(new Book("Sören Kierkegaard", "El concepto de la angustia", "R. Occidente", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Henri Bercson", "La evolución creadora", "R. Occidente", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Manuel Granell", "Cartas filosóficas a una mujer", "R. Occidente", "1946", "", "LibrosAntiguos"));
        b.add(new Book("A. Delp", "Existencia trágica", "Razón y Fe S.A.", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Windelband", "Preludios filosóficos", "S. Rueda", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Moralistas Griegos", "Pensamientos", "L. Rubio", "1935", "", "LibrosAntiguos"));
        b.add(new Book("Juan Wahl", "Estudio sobre el \"Parménides de Platón\"", "L. Rubio", "1929", "",
                "LibrosAntiguos"));
        b.add(new Book("Pitágoras", "Los versos de oro Hierócles", "L. Rubio", "1929", "", "LibrosAntiguos"));
        b.add(new Book("Jacques Maritain", "Los grados del saber T. I y II", "Desclée de B.", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Sigfrido Huber", "Los Santos Padres T. I y II", "Desclée de B.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Rodolfo Mandolfo", "Moralistas griegos", "Imán", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Richard M. Lonsbach", "Nietxsche y los judíos", "Imán", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Leon Chestov", "Kierkegard y la filosofía existencial", "Sudamericana", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio Imaz", "Topia y utopía", "Tezontle", "1946", "", "LibrosAntiguos"));
        b.add(new Book("André Cresson", "Los sistemas filosóficos", "Tridente", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Osvaldo Spengler", "Heráclito", "Esp.-Calpe, S.A.", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Pedro Guirao", "Escritos pitagóricos", "Glem", "1944", "", "LibrosAntiguos"));
        b.add(new Book("A. Petrie", "Introducción al estudio de Grecia", "F. C. E.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Ernst Bolch", "El pensamiento de Hegel", "F. C. E.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Edmund Husserl", "Ideas relativas a una fenomenología pura y…", "F. C. E.", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio Imaz (Jornadas)", "Asedio a Dilthey", "Coleg. de México", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Josué de Castro", "Fisiología de los tabús", "Coleg. de México", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Etienne Gilson", "La filosofía de San Buenaventura", "Desclée de B.", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("Henry Bremond", "Newman Ensayo de biografía psicológica", "Desclée de B.", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Bertand Russell", "Misticismo y lógica y otros ensayos", "Paidós", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Guido de Ruggiero", "El retorno a la razón", "Paidós", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Universidad Nacional A. de México", "Homenaje a Bergson", "I. Universitaria", "1941", "",
                "LibrosAntiguos"));
        b.add(new Book("A. de Waehlens", "La filosofía de Mantin Heidegger", "Inst. Luis Vives", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Werner Jalger", "Aristóteles", "F. C. E.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Ernst Cassirer", "El problema del conoc. De la muerte de Hegel a n. días", "F. C. E.", "1948",
                "", "LibrosAntiguos"));
        b.add(new Book("Ernst Cassirer", "Antropología filosófica", "F. C. E.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Ernst Cassirer", "Kant Vida y doctrina", "F. C. E.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("José Gaos", "Exclusivas del hombre. La mano y el tiempo", "U. Nuevo León", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. I, II y  III", "R. Occidente", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. IV, V y VI", "R. Occidente", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Ciriaco Morón Arroyo", "El sistema de Ortega y Gasset", "Alcalá", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Guillermo Dilthey", "Introducción a las vivencias del espíritu I y II", "Esp. Calpe S.A.",
                "1948", "", "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Diario de viaje de un filósofo I y II", "Esp. Calpe S.A.", "1928", "",
                "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Norteamérica libertada", "Esp. Calpe S.A.", "1931", "", "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Europa Análisis espectral de un continente", "Esp. Calpe S.A.", "1929",
                "", "LibrosAntiguos"));
        b.add(new Book("Etienne Gilson", "Dios y la filosofía", "Emecé", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Emile Bréhier", "Historia de la Filosofía T. I y II", "Sudamericana", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Miguel de Cervantes Saavedra", "El ingenioso hidalgo D. Quijote de la mancha", "Aguilar, S.A.",
                "1949", "Piel", "LibrosAntiguos"));
        b.add(new Book("Wenceslao Fernández Flórez", "Obras completas T. I, II, III, IV y V", "M. Aguilar", "1945",
                "Piel", "LibrosAntiguos"));
        b.add(new Book("Miguel de Unamuno", "Ensayos T. I y II", "M. Aguilar", "1945", "Piel", "LibrosAntiguos"));
        b.add(new Book("Angel Ganivet", "Obras completas T. Primero y Segundo", "M. Aguilar", "1943", "Piel",
                "LibrosAntiguos"));
        b.add(new Book("Virgilio / Horacio", "Obras completas", "M. Aguilar", "1945", "Piel", "LibrosAntiguos"));
        b.add(new Book("Juan Jacobo Rousseau", "Julia ó la nueva Heloísa", "De Oliva", "1836", "", "LibrosAntiguos"));
        b.add(new Book("Séneca", "El libro de oro", "I. Cabrerizo", "1831", "2ª impresión", "LibrosAntiguos"));
        b.add(new Book("Don Jaime Balmes", "El criterio", "Garnier Hnos.", "1893", "5ª ed.", "LibrosAntiguos"));
        b.add(new Book("Ramiro de Maeztu", "La crisis del humanismo", "Sudamericana", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Del sufrimiento a la plenitud", "Sudamericana", "1947", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "Viaje a través del tiempo T. I", "Sudamericana", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("José Ferrater Mora", "El sentido de la muerte", "Sudamericana", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Henri Bergson", "Las dos fuentes de la moral y la religión", "Sudamericana", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Edgar Alan Poe", "Eureka Marginalia, La Fª de la composición", "Emecé", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Charles Péguy", "Nota conjunta sobre Descartes y la Fª cartesiana", "Emecé", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Charles Dubos", "Extractos de un diario", "Emecé", "1947", "", "LibrosAntiguos"));
        b.add(new Book("León Chestov", "La filosofía de la tragedia", "Emecé", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "I El cuaderno gris II El correccional", "Losada", "1944",
                "", "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "III El buen tiempo", "Losada", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "IV La consulta V La sorellina", "Losada", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "VI La muerte del padre", "Losada", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "VIII El verano de 1914 II", "Losada", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Roger Martin du Gard LOS THIBAULT", "X Epílogo", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "II El crimen de Quinette", "Losada", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "III Los amores infantiles", "Losada", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "IV Eros de París", "Losada", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "V Los soberbios", "Losada", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "VI Los humildes", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "VII En busca de una iglesia", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "VIII Provincia", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Jules Romains", "IX Marea de peligros", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Charles Renouvier", "Bosquejo de una clasif. sist. de las doct. filos. T. I y II",
                "Losada, S. A.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Alfred N. Whitehead", "Modos de pensamiento", "Losada, S. A.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Victor Brochard", "Los escépticos griegos", "Losada, S. A.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Jens Peter Jacobsen", "Niels Lyhne", "Nausica", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Victor Brochard", "Estudios sobre Sócrates y Platón", "Losada, S. A.", "1945", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Romero", "Fª contemporánea Estudios y notas 1ª serie", "Losada, S. A.", "1944",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Francisco Romero", "Papeles para una filosofía", "Losada, S. A.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Rodolfo Mandolfo", "El pensamiento antiguo T. I y II", "Losada, S. A.", "1945", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Leibniz", "Correspondencia con Arnauld", "Losada, S. A.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Leibniz", "Tratados fundamentales 1ª serie Tª de metafísica", "Losada, S. A.", "1946",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Emilio Oribe", "Teoría del Nous", "Losada, S. A.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("René Guénon", "Introduc. gral. al estudio de las doctrinas hindúes", "Losada, S. A.", "1945",
                "", "LibrosAntiguos"));
        b.add(new Book("Ugo Spirito", "El pragmatismo en la Fª contemporánea", "Losada, S. A.", "1945", "",
                "LibrosAntiguos"));
        b.add(new Book("Sören Kierkegaard", "Temor y temblor", "Losada, S. A.", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Octave Hamelin", "El sistema de Descartes", "Losada, S. A.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Juan Davil García Bacca", "Introducción general a las Enéadas", "Losada, S. A.", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("Otto Weininger", "Sexo y carácter", "Losada, S. A.", "1945", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Bertrand Russell", "Investigación sobre el significado y la verdad", "Losada, S. A.", "1946",
                "", "LibrosAntiguos"));
        b.add(new Book("Guillermo Dilthey", "La esencia de la folosofía", "Losada, S. A.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Wilhem Dilthey", "Poética", "Losada, S. A.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Charles Renouvier", "Los dilemas de la metafísica pura", "Losada, S. A.", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Richard Avenarius", "La folosofía como el pensar del mundo...", "Losada, S. A.", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Plotino", "Enéadas (Enéada I)", "Losada, S. A.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Karl Vossler", "Filosofía del lenguaje Ensayos", "Losada, S. A.", "1947", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Paul Valery", "El alma y la danza Eupalinos o el arquitecto", "Losada, S. A.", "1944",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Santo Tomás de Aquino", "Del ente y de la esencia", "Losada, S. A.", "1945", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Ayala", "Razón del mundo", "Losada, S. A.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Carlos Vaz Ferreira", "Lógica viva", "Losada, S. A.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Walter Blumenfeld", "Sentido y sinsentido", "Losada, S. A.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Alberto Wagner de Reyna", "La antología fundamental de Heidegger", "Losada, S. A.", "1945",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Eduard Spranger", "Las ciencias del espíritu y la escuela", "Losada, S. A.", "1942", "",
                "LibrosAntiguos"));
        b.add(new Book("Georg Simmel", "Goethe", "Nova", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Teodoro Haecker", "La joroba de Kierkegaard", "Rialp", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Kant", "Filosofía de la historia", "Col. México", "1941", "", "LibrosAntiguos"));
        b.add(new Book("David Hume", "Diálogos sobre religión natural", "Col. México", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Trad. y Pró. David Gª Bacca", "Los presocráticos I", "Col. México", "1943", "",
                "LibrosAntiguos"));
        b.add(new Book("Trad. y Pró. David Gª Bacca", "Los presocráticos II", "Col. México", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("José Antonio Míguez", "En torno al romanticismo alemán", "A. Aguado", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("George Santayana", "La idea de Cristo en los evangelios", "Sudamericana", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Jacques Maritain", "Acerca de la existencia y lo existente", "Desclee B.", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Antonio Caso", "El acto ideatorio y la filosofía de Husserl", "Porrúa, S. A.", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("León Pierre-Quint", "Marcel Proust (juventud-obra-tiempo)", "S. Rueda", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Marcel Proust", "Crónicas", "S. Rueda", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Marcel Proust", "En busca del tiempo perdido", "S. Rueda", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Marcel Proust", "Los salones y la vida de Paris", "Sudamericana", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Xavier Zubiri", "Naturaleza, Historia, Dios", "Edit. Nacional", "1944", "", "LibrosAntiguos"));
        b.add(new Book("J. Huizinga", "El otoño de la Edad Media", "R. Occid. Arg.", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Eduardo Spranger", "Formas de vida", "R. Occid. Arg.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Eduardo Spranger", "Psicología de la edad juvenil", "R. Occid. Arg.", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Erick Przywara S. I.", "San Agustin", "R. Occid. Arg.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "Historia de la filosofía", "R. Occid. Arg.", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Hegel", "Lecciones sobre la Fª de la Hª universal I y II", "R. Occid. Arg.", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "Etica I y II", "R. Occid. Arg.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "Sociología del saber", "R. Occid. Arg.", "1947", "", "LibrosAntiguos"));
        b.add(new Book("W. Moog", "Hegel y la escuela hegeliana", "R. Occidente", "1931", "", "LibrosAntiguos"));
        b.add(new Book("Jorge Simmel", "Cultura femenina Filosofía de la moda", "R. Occidente", "1934", "",
                "LibrosAntiguos"));
        b.add(new Book("Alois Dempf", "Filosofía de la cultura", "R. Occidente", "1933", "", "LibrosAntiguos"));
        b.add(new Book("David Katz", "El mundo de las sensaciones táctiles", "R. Occidente", "1930", "",
                "LibrosAntiguos"));
        b.add(new Book("Alois Müller", "Introducción a la filosofía", "R. Occidente", "1931", "", "LibrosAntiguos"));
        b.add(new Book("Antonio Tovar", "Vida de Sócrates", "R. Occidente", "1947", "", "LibrosAntiguos"));
        b.add(new Book("H. Heimsoeth", "La metafísica moderna", "R. Occidente", "1932", "", "LibrosAntiguos"));
        b.add(new Book("Julio Stenzel", "Filosofía del lenguaje", "R. Occidente", "1935", "", "LibrosAntiguos"));
        b.add(new Book("A. Pfänder", "Lógica", "R. Occidente", "1933", "", "LibrosAntiguos"));
        b.add(new Book("Kant", "Antropología", "R. Occidente", "1935", "", "LibrosAntiguos"));
        b.add(new Book("Manuel Granell", "Lógica", "R. Occidente", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Manuel G. Morente", "Ensayos", "R. Occidente", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Pablo Krische", "El enigma del matriarcado", "R. Occidente", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega I", "R. Occidente", "1935", "", "LibrosAntiguos"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega II", "R. Occidente", "1936", "", "LibrosAntiguos"));
        b.add(new Book("Jacobo Burckhardt", "Hª de la cultura griega III", "R. Occidente", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Teodoro Celms", "El idealismo fenomenológico de Husserl", "R. Occidente", "1931", "",
                "LibrosAntiguos"));
        b.add(new Book("Heinz Heimsoeth", "Los seis grandes temas de la metaf. Occidental", "R. Occidente", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("F. Müller-Lyer", "La familia", "R. Occidente", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "El método histórico de las generaciones", "R. Occidente", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Teodoro Celms", "El idealismo fenomenológico de Husserl", "R. Occidente", "1931", "",
                "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "Introducción a la folosofía", "R. Occidente", "1947", "", "LibrosAntiguos"));
        b.add(new Book("F. Müller-Lyer", "La familia", "R. Occidente", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "El método histórico de las generaciones", "R. Occidente", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Julián Marías", "Ortega y la idea de la razón", "A. Zúñiga", "1948", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Henri-Fredéric Amiel", "Diario íntimo", "Losada", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Robert Waelder", "El pensamiento vivo de Freud", "Losada, S. A.", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Tomas Mann", "El pensamiento vivo de Schopenhauer", "Losada, S. A.", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Trad. y notas de León Dujovne", "David Hume", "Sudamericana", "1939", "", "LibrosAntiguos"));
        b.add(new Book("James Marschall Campbell", "Los padres griegos", "Nova", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Alfred Edwuard Taylor", "El platonismo y su influencia", "Nova", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Ralph Turner", "Las grandes culturas de la humanidad", "F. C. E.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("", "", "", "", "", "LibrosAntiguos"));
        b.add(new Book("C. G. Jung", "La psique y sus problemas actuales", "Pobret", "1935", "", "LibrosAntiguos"));
        b.add(new Book("C. G. Jung", "Tipos psicológicos", "Sur", "1936", "", "LibrosAntiguos"));
        b.add(new Book("C. G. Jung", "Conflictos del alma infantil", "Paidos", "1945", "", "LibrosAntiguos"));
        b.add(new Book("C. G. Jung", "Realidad del alma", "Losada, S. A.", "1946", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("C. G. Jung", "Teoría del psicoanálisis", "Apolo", "1937", "2ª ED.", "LibrosAntiguos"));
        b.add(new Book("E. Kretschmer", "Constitución y carácter", "Labor, S. A.", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Dr. A. Vallejo Nájera", "Propedéutica clínica y psiquiátrica", "Labor, S. A.", "1936", "",
                "LibrosAntiguos"));
        b.add(new Book("Alfredo Adler", "La psicología individual y la escuela", "Revista Pedag.", "1930", "",
                "LibrosAntiguos"));
        b.add(new Book("H. F. Hoffman", "Teoría de los estratos psíquicos", "Morata", "1946", "", "LibrosAntiguos"));
        b.add(new Book("E. Bleuler", "Afectividad, Sugestividad, Parsimonia", "Morata", "1942", "", "LibrosAntiguos"));
        b.add(new Book("G. E. Störring", "Carácter y significación del síntoma…", "Morata", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Prof. Dr. M. Bañuelos", "Personalidad y carácter", "Morata", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Charles Bandouin", "La fuerza en nosotros", "Victoria", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Gustav R. Heyer", "Psicoterapia y práctica", "Joaquin Gil", "1937", "", "LibrosAntiguos"));
        b.add(new Book("E. Noguera y Luis Huerta", "Genética, eugenésica y pedagogía sexual T. I y II", "Morata",
                "1934", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Alfred Adler", "El sentido de la vida", "L. Miracle", "1941", "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Dr. Fritz Künkel", "Del yo al nosotros", "L. Miracle", "1940", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Ernest Aeppli", "El lenguaje de los sueños", "L. Miracle", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Willis Helepach", "Geopsique", "Espasa-Calpe", "1940", "", "LibrosAntiguos"));
        b.add(new Book("Alfred Adler", "Conocimiento del hombre", "Espasa-Calpe", "1940", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("David Kayz", "Psicología de la forma", "Espasa-Calpe", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Smith Ely Jelliffe", "Técnica del psicoanálisis", "B. Nueva", "1929", "", "LibrosAntiguos"));
        b.add(new Book("Bruno Cassinelli", "Historia de la locura", "J. Gil", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Oswald Bumke", "El psicoanálisis y sus satélites", "Aymá", "1944", "", "LibrosAntiguos"));
        b.add(new Book("José Bergua", "Psicología del pueblo español", "Bergua", "1934", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Auguste Rarie", "La crisis del psicoanálisis", "Argis", "1930", "", "LibrosAntiguos"));
        b.add(new Book("M. Usandizaga", "Hª de la obstetricia y de la ginecología en España", "Aldus, S. A.", "1944",
                "", "LibrosAntiguos"));
        b.add(new Book("Victor Heiser", "La odisea de un médico", "J. Gil", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Henry Bremond", "NEWMAN", "DDB", "1947", "", "LibrosAntiguos"));
        b.add(new Book("H. Rohracher", "Introducción a la caracterología", "Losada, S A.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Marcos Victoria", "Variaciones sobre lo sentimental", "Sudamericana", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Prof. Dr. José Morros Sardá", "Elementos de fisiología", "Cient. Médica", "1946", "4ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("L. Szymonowicz - R. Krause", "Tratado de histología y anatomía microscópica", "Labor, S. A.",
                "1943", "3ª ed. Revis", "LibrosAntiguos"));
        b.add(new Book("A. Fisxhel", "Compendio de embriología humana", "Labor, S. A.", "1943", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Osvaldo Bumke", "Nuevo tratado de enfermedades mentales", "F. Seix", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("G. Marañón", "Manual de diagnóstico etiológico", "Espasa-Calpe", "1946", "3ª ed. Revis.",
                "LibrosAntiguos"));
        b.add(new Book("Prof. Dr. Med. R. Novoa Santos", "Manual de patología general T I y II", "Suc. Rivaden.",
                "1948", "8ª ed. Revis.", "LibrosAntiguos"));
        b.add(new Book("Dirección de Oswald Schwarz", "Psicogénesis y Psicoterapia de los sist. Corporales",
                "Labor, S. A.", "1932", "", "LibrosAntiguos"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. I y II", "E. Cient. Méd.", "1940",
                "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. III", "E. Cient. Méd.", "1941",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. IV", "E. Cient. Méd.", "1940", "",
                "LibrosAntiguos"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. V", "E. Cient. Méd.", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Dr. C. Jiménez Díaz", "Lecciones de Patología Médica T. VI", "E. Cient. Méd.", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("L. Testut", "Tratado de anatomía humana T. I, II, III y IV", "Salvat y Cía", "1904",
                "5ª y 6ª Revis.", "LibrosAntiguos"));
        b.add(new Book("Pedro Laín Entralgo", "Medicina e historia", "Escorial", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Adolfo Lafuente y P. de los Cobos", "Guía médica de urgencia", "T. Moderna", "1949",
                "Numerado", "LibrosAntiguos"));
        b.add(new Book("Enrico Giupponi", "Hospital Mi vida de cirujano", "Joaquín Gil", "1941", "", "LibrosAntiguos"));
        b.add(new Book("José M. Sacristán", "Figura y carácter Los biotipos de Kretschmer", "La lectura", "1926", "",
                "LibrosAntiguos"));
        b.add(new Book("Prof. E. von Aster", "Introducción a la psicología", "Labor", "1935", "3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Jean Lhermitte", "Los sueños", "Surco", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Rousseau", "El contrato social. Meditaciones.... En rústica", "Lib. Bergua", "1936", "",
                "LibrosAntiguos"));
        b.add(new Book("Lucio Anneo Séneca", "Obras completas", "Aguilar", "1949", "2ª ed. Piel", "LibrosAntiguos"));
        b.add(new Book("F. de Quevedo Villegas", "Obras completas Prosa", "Aguilar", "1941", "2ª ed. Piel",
                "LibrosAntiguos"));
        b.add(new Book("J. W. Goethe", "Obras literarias T. I", "Aguilar", "1944", "Piel", "LibrosAntiguos"));
        b.add(new Book("J. W. Goethe", "Obras literarias T. II", "Aguilar", "1945", "Piel", "LibrosAntiguos"));
        b.add(new Book("Moliere", "Obras completas", "Aguilar", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Fiodor M. Dostoyerski", "Obras completas T. I", "Aguilar", "1946", "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Fiodor M. Dostoyerski", "Obras completas T. II", "Aguilar", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Jhon Dos Passos", "Manhatan Transfer", "S. Rueda", "1941", "", "LibrosAntiguos"));
        b.add(new Book("J.Huizinga", "En los albores de la paz", "NuestroTiempo", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Burckhardt", "La cultura del renacimiento en Italia", "O. Maestras", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Platón", "Diálogos", "O. Maestras", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Montaigne", "Ensayos completos", "O. Maestras", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Apuleyo", "La metamorfósis o el asno de oro", "O. Maestras", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Píndaro", "Himnos triunfales", "O. Maestras", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Walter Pater", "El renacimiento", "O. Maestras", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Chaucer", "Cuentos de Canterbury I y II", "O. Maestras", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Thomas Carlyle", "Sartor Resartus Nº 3", "Emecé", "1945", "", "LibrosAntiguos"));
        b.add(new Book("William James", "Pragmatismo Nº 4", "Emecé", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Menéndez Pelayo", "Ensayos de crítica filosófica Nº 32", "Emecé", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Daniel Halévy", "La vida de Federico Nietzsche nª 41", "Emecé", "1946", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Friedrich Hölderlin", "Hiperión o el eremita en Grecia Nº 47", "Emecé", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Walter Pater", "Platón y el platonismo Nº 52", "Emecé", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Igor Strawinski", "Poética musical Nº 59", "Emecé", "1946", "", "LibrosAntiguos"));
        b.add(new Book("William James", "Compendio de psicología", "Emecé", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Werner Jaeger", "Paideia I, II y III", "F.C.E.", "1946", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Osvald Spengler", "La decadencia de Occidente V. III y IV", "Espasa Calpe", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Conde Herman Keyserling", "Renacimiento", "Espasa Calpe", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Charlotte Bühler", "El curso de la vida humana como problema psicológico", "Espasa Calpe",
                "1943", "", "LibrosAntiguos"));
        b.add(new Book("Leopoldo Alas Clarín", "Obras selectas", "Biblio. Nueva", "1947", "C. Dor.", "LibrosAntiguos"));
        b.add(new Book("Segismud Freud", "Obras completas T. I y II", "Biblio. Nueva", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Windelband", "La filosofóa de los griegos I", "Robredo", "1948", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Wilhelm Windelband", "La filosofía de la Edad Media II", "Robredo", "1946", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Wilhelm Windelband", "El idealismo alemán", "Robredo", "1946", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. I El origen de la tragedia", "M. Aguilar", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. II Consideraciones intespestivas", "M. Aguilar", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. III Humano, demasiado humano 1", "M. Aguilar", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. IV Humano, demasiado humano 2", "M. Aguilar", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. V Aurora", "M. Aguilar", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VI El eterno retorno", "M. Aguilar", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VII Así habló Zaratustra", "M. Aguilar", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VIII Más allá del bien y del mal", "M. Aguilar", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. IX La voluntad de dominio", "M. Aguilar", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. X El ocaso de los ídolos", "M. Aguilar", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Platón", "Obras completas T. I, II, III y IV", "Anaconda", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Aristóteles", "Obras completas T. I, II, III y IV", "Anaconda", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Descartes", "Obras completas", "Anaconda", "1946", "", "LibrosAntiguos"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía", "Atlante", "1944", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Ramiro de Maeztu", "Don Quijote, Don Juan y la Celestina", "Austral", "1938", "",
                "LibrosAntiguos"));
        b.add(new Book("Ramón Menéndez Pidal", "Estudios literarios", "Espasa-Calpe", "1944", "L", "LibrosAntiguos"));
        b.add(new Book("Georg Simmel", "Cultura femenina y otros ensayos", "Espasa-Calpe", "1946", "F",
                "LibrosAntiguos"));
        b.add(new Book("D. B. Wyndham Lewis", "Carlos de Europa,  emperador de Occidente", "Espasa-Calpe", "1941", "B",
                "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "La vida íntima", "Espasa-Calpe", "1945", "F", "LibrosAntiguos"));
        b.add(new Book("Pascal", "Pensamientos", "Espasa-Calpe", "1944", "F", "LibrosAntiguos"));
        b.add(new Book("J.  Hessen", "Teoría del conocimiento", "Espasa-Calpe", "1945", "F", "LibrosAntiguos"));
        b.add(new Book("Gregorio Marañón", "Don Juan", "Espasa-Calpe", "1942", "L", "LibrosAntiguos"));
        b.add(new Book("Miguel de Unamuno", "Amor y pedagogía", "Espasa-Calpe", "1946", "F", "LibrosAntiguos"));
        b.add(new Book("Gregorio Marañón", "Ensayo biológico de Enrique IV de Cª y su tiempo", "Espasa-Calpe", "1941",
                "B", "LibrosAntiguos"));
        b.add(new Book("El Cristóbal de Villalón", "El crotalón", "Espasa-Calpe", "1945", "L", "LibrosAntiguos"));
        b.add(new Book("Antonio Espina", "Ganivet El Hombre y la obra", "Espasa-Calpe", "1944", "F", "LibrosAntiguos"));
        b.add(new Book("Enrique González Martínez", "Antología Poética", "Espasa-Calpe", "1944", "POESÍA",
                "LibrosAntiguos"));
        b.add(new Book("P. Francisco Suárez, S. I.", "Introducción a la metafísica", "Espasa-Calpe", "1946", "F",
                "LibrosAntiguos"));
        b.add(new Book("Aristóteles", "Metafísica", "Espasa-Calpe", "1945", "F", "LibrosAntiguos"));
        b.add(new Book("Francisco Navarro y Ledesma", "El ingenioso Hidalgo D. Miguel de Cervantes S.", "Espasa-Calpe",
                "1948", "L", "LibrosAntiguos"));
        b.add(new Book("Ramón Gómez de la Serna", "D. Ramón María del Valle Inclán", "Espasa-Calpe", "1948", "B",
                "LibrosAntiguos"));
        b.add(new Book("Desiderio Papp", "Más allá del sol (La estructura del Universo)", "Espasa-Calpe", "1944", "F",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio Dors", "El valle de Josafat", "Espasa-Calpe", "1944", "F", "LibrosAntiguos"));
        b.add(new Book("Victor Said Armesto", "La Leyenda de D. Juan", "Espasa-Calpe", "1946", "L", "LibrosAntiguos"));
        b.add(new Book("Hegel", "De lo bello y sus formas (Estética)", "Espasa-Calpe", "1946", "F", "LibrosAntiguos"));
        b.add(new Book("Juan Huarte", "Exámen de ingenios para las ciencias", "Espasa-Calpe", "1946", "F",
                "LibrosAntiguos"));
        b.add(new Book("Gregorio Marañón", "Ensayos liberales", "Espasa-Calpe", "1947", "F", "LibrosAntiguos"));
        b.add(new Book("Anónimo", "Cuentos populares y leyendas de Irlanda", "Espasa-Calpe", "1946", "L",
                "LibrosAntiguos"));
        b.add(new Book("Oscar Wilde", "El crítico como artista. Ensayos", "Espasa-Calpe", "1946", "F", "LibrosAntiguos"));
        b.add(new Book("M. Kant", "Fundamentación de la metafísica de las cost.", "Espasa-Calpe", "1946", "F",
                "LibrosAntiguos"));
        b.add(new Book("Anónimo", "Viaje a través de los mitos irlandeses", "Espasa-Calpe", "1947", "L",
                "LibrosAntiguos"));
        b.add(new Book("Robert Burton", "Anatomía de la melancolía", "Espasa-Calpe", "1947", "S", "LibrosAntiguos"));
        b.add(new Book("Erasmo", "Coloquios", "Espasa-Calpe", "1947", "F", "LibrosAntiguos"));
        b.add(new Book("G. F. Hegel", "Sistema de las artes", "Espasa-Calpe", "1947", "F", "LibrosAntiguos"));
        b.add(new Book("Miguel de Unamuno", "El Cristo de Velázquez", "Espasa-Calpe", "1947", "POESÍA",
                "LibrosAntiguos"));
        b.add(new Book("Torres Villaroel", "Vida", "Espasa-Calpe", "1948", "L", "LibrosAntiguos"));
        b.add(new Book("Alfredo Fouillee", "Aristóteles y su polémica contra Platón", "Espasa-Calpe", "1948", "F",
                "LibrosAntiguos"));
        b.add(new Book("Carlos Baudelaire", "Pequeños poemas en prosa. Critica de arte", "Espasa-Calpe", "1948",
                "POESÍA", "LibrosAntiguos"));
        b.add(new Book("José Pérez Ballesteros", "Cancionero popular gallego T. II", "Dorna", "1942", "Gallego",
                "LibrosAntiguos"));
        b.add(new Book("Eusebio Bravo Rodríguez", "Guía documentada de S. de Compostela", "Barrientos", "1920", "",
                "LibrosAntiguos"));
        b.add(new Book("Antonio López Carballeira", "Síntesis de mi pensamiento filosóf.-religioso", "Valladolid",
                "1946", "Orig. a máq.", "LibrosAntiguos"));
        b.add(new Book("Antonio López Carballeira", "Religión y Religiones", "La Lectura", "1918", "", "LibrosAntiguos"));
        b.add(new Book("Juan Rodríguez del Padrón", "Siervo libre de amor", "Nova", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Jesús Rodríguez López", "Supersticiones de Galicia", "Nova", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Francisco Sánchez", "Que nada se sabe", "Nova", "1944", "", "LibrosAntiguos"));
        b.add(new Book("V. García Martí", "Una punta de Europa", "Mundo Latino", "1927", "", "LibrosAntiguos"));
        b.add(new Book("Correa-Calderón", "Índice de utopías gallegas", "J. A. Public.", "1929", "Dedicado",
                "LibrosAntiguos"));
        b.add(new Book("Ramón Otero Pedrayo", "Romanticismo, saudade, sentimiento…", "NOS", "1931", "Dedicado",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio Carré Aldao", "Influencias de la liter. gallega en la castellana", "F. Beltrán",
                "1915", "", "LibrosAntiguos"));
        b.add(new Book("Joaquín Verdaguer", "El arte de fumar en pipa", "Trofeo", "1943", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("R. Otero Pedrayo", "Guía de Galicia", "Suc. de Gali", "1945", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("José Mª Rodríguez", "Nociones de Historia de Galicia", "La Corres. Gal.", "1916", "",
                "LibrosAntiguos"));
        b.add(new Book("Florencio Vaamonde", "Anxélica", "Lar", "1925", "Gallego", "LibrosAntiguos"));
        b.add(new Book("Luis Amado Carballo", "Maliaxe", "Alborada", "1922", "Gallego", "LibrosAntiguos"));
        b.add(new Book("Ramón Otero Pedrayo", "Historia de la Cultura Gallega", "Emecé", "1939", "Piel",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio Montes", "Elegías europeas", "A. Aguado", "1949", "", "LibrosAntiguos"));
        b.add(new Book("P. Juan de Mairena", "Tratado de las cosas íntimas de la C. de Jesús", "Mundo latino", "1931",
                "", "LibrosAntiguos"));
        b.add(new Book("Francisco Montes", "El arte de torear", "A. Aguado", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Johan W. von Goethe", "Teoría de los colores", "Poseidón", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Matilde Ras", "Grafología", "Labor, S.A.", "1942", "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Jacques Boulenger", "Los dandis", "Aspas, S. A.", "1944", "", "LibrosAntiguos"));
        b.add(new Book("H. G. Wells", "A propósito de dolores", "Poseidón", "1948", "", "LibrosAntiguos"));
        b.add(new Book("G. M. Bruño", "Teneduría de libros. Libro del alumno", "Depósito", "1928", "4ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Ciriaco Pérez Bustamante", "Historia de la literatura universal", "Atlal", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Albert Tribaudet", "Hª de la literatura francesa desde 1789 hasta ns. Días", "Losada", "1945",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Real Academia Española", "Epítome gramatical", "Hernando, S.A.", "1929", "69ª ed. Numer.",
                "LibrosAntiguos"));
        b.add(new Book("Adolfo Cuadrado", "Gramática griega", "Pueyo, S.L.", "1940", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Paul C. Jacof", "El arte de hablar bien y con persuasión", "J. Gil", "1939", "3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Antonio Tovar", "Lingüística y filología clásica", "R. Occidente", "1944", "", "LibrosAntiguos"));
        b.add(new Book("Pascal", "Elocuencia y estilo", "Tor", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Pedro Lezcano", "Muriendo dos a dos Ejemplar nº 219", "Sever Cuesta", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Salvador Pérez Valiente", "Cuando ya no hay remedio Ejemplar nº 423", "Sever Cuesta", "1947",
                "", "LibrosAntiguos"));
        b.add(new Book("Enrique Gómez Martínez", "Antología poética", "Espasa Calpe", "1944", "3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Carlos Obligado", "Los poemas de Edgar Poe", "E. Calpe", "1944", "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Ildefonso Manuel Gil", "El corazón en los labios Ej. Nº 299", "Sever Cuesta", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Federico García Lorca", "Romancero Gitano", "Losada", "1949", "4ª ed.", "LibrosAntiguos"));
        b.add(new Book("Lope Mateo", "Y el tiempo se hizo carne", "Public. Españ.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Jorge Manrique", "Coplas a la muerte de su padre", "Más allá", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Pascoaes", "Las mejores poesías de los mejores poetas VII", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Novalis", "Las mejores poesías de los mejores poetas X", "Cervantes", "", "", "LibrosAntiguos"));
        b.add(new Book("Carducci", "Las mejores poesías de los mejores poetas XI", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Balmont", "Las mejores poesías de los mejores poetas XIV", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("MÖRYKE", "Las mejores poesías de los mejores poetas XX", "Cervantes", "", "", "LibrosAntiguos"));
        b.add(new Book("Nazariantz", "Las mejores poesías de los mejores poetas XXIII", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Antero de Quental", "Las mejores poesías de los mejores poetas XXIX", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Hölderlin", "Las mejores poesías de los mejores poetas XXX", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Salvador Albert", "Las mejores poesías de los mejores poetas XXXVIII", "Cervantess", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Eugenio de Castro", "Las mejores poesías de los mejores poetas XL", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Guerra Junquiero", "Las mejores poesías de los mejores poetas XLIV", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("DJELAL EDDIN RUMI", "Las mejores poesías de los mejores poetas XLV", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("Amalia Puga", "Las mejores poesías de los mejores poetas L", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("María Monvel", "Las mejores poesías de los mejores poetas LI", "Cervantes", "", "",
                "LibrosAntiguos"));
        b.add(new Book("E. Ugarte Albizu", "El traductor francés Primer curso", "Hijos M. G. Hdez.", "1928", "",
                "LibrosAntiguos"));
        b.add(new Book("Alicia Lardé de Venturino", "Las mejores poesías de los mejores poetas LIII", "Cervantes", "",
                "", "LibrosAntiguos"));
        b.add(new Book("RODENBACH", "Las mejores poesías de los mejores poetas LVII", "Cervantes", "1930", "",
                "LibrosAntiguos"));
        b.add(new Book("Juan Guzmán Cruchaga", "Las mejores poesías de los mejores poetas LX", "Cervantes", "1932", "",
                "LibrosAntiguos"));
        b.add(new Book("Luis Cané", "Libro en espera", "Losada", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Eugenio Julio Iglesias", "Soledad", "Losada", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Alberto Ureta", "Antología Poética", "Losada", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Selección de Fernando Gutiérrez", "Antología de la poesía amorosa española", "José Janes",
                "1948", "", "LibrosAntiguos"));
        b.add(new Book("Rafael Alberti", "De un momento a otro y Cantata de los héroes", "Bajel", "1942", "",
                "LibrosAntiguos"));
        b.add(new Book("Félix Pons", "9 Poemas de Valery y doce sonetos de muerte", "Apolo", "1939", "",
                "LibrosAntiguos"));
        b.add(new Book("Paul Gauguin y Charles Morice", "Noa Noa (La isla feliz)", "Malinca P.", "1942", "",
                "LibrosAntiguos"));
        b.add(new Book("M. Manent", "La poesía inglesa. Los contemporáneos", "José Janés", "1948", "Bilingüe",
                "LibrosAntiguos"));
        b.add(new Book("Eduardo de Ory", "Antología de poesía mexicana", "M. Aguilar", "1936", "", "LibrosAntiguos"));
        b.add(new Book("Edmundo Bianchi", "Antología de poetas franceses contemporáneos", "Hachete", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Rainer María Rilke", "Cartas a Rodin", "Archipiélago", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Fernando Maristany", "Las cien mejores poesías de la lengua alemana", "Ed. Cervantes", "1919",
                "", "LibrosAntiguos"));
        b.add(new Book("Agustín Haro y Tamariz", "Rubaiyat de Omar KHYYAM", "T. G. La nación", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("José María Castroviejo", "Don Quijote 1947", "M. Roel", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Dr. J. Joaquín Díaz-González", "EROS", "Bibliot. Clio", "1935", "", "LibrosAntiguos"));
        b.add(new Book("Havelock Ellis", "Estudios de psicología sexual I - II", "Hijos de Reus", "1913", "",
                "LibrosAntiguos"));
        b.add(new Book("Havelock Ellis", "Estudios de psicología sexual III-IV-V", "Hijos de Reus", "1913", "",
                "LibrosAntiguos"));
        b.add(new Book("Havelock Ellis", "Estudios de psicología sexual VI-VII", "Hijos de Reus", "1913", "",
                "LibrosAntiguos"));
        b.add(new Book("STENDHAL", "Del amor", "Hachete, S. A.", "1943", "", "LibrosAntiguos"));
        b.add(new Book("A. Adler", "El problema del homosexualismo y otros e. s.", "Apolo", "1936", "",
                "LibrosAntiguos"));
        b.add(new Book("Dr. Augusto Forel", "La cuestión sexual", "Baylly-Baill.", "1931", "3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Prof. Ronaldo Pelegrini", "Sexuología", "Morata", "1946", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Alfonso Martínez Rizo", "El amor dentro de 200 años", "Orto", "1932", "", "LibrosAntiguos"));
        b.add(new Book("Prof. Novoa Santos", "Patología postural", "Espasa Calpe", "1934", "", "LibrosAntiguos"));
        b.add(new Book("Doctor Jaff", "Arte de conservar el amor en el matrimonio", "J. Gil", "1935", "4ª ed. Revis.",
                "LibrosAntiguos"));
        b.add(new Book("Dr. A. Austregesilo", "La neurastenia sexual y su tratamiento", "Manuel Marín", "1929", "",
                "LibrosAntiguos"));
        b.add(new Book("A. De Musset", "Dos noches de placer", "Ed. Selección", "", "", "LibrosAntiguos"));
        b.add(new Book("Pablo Montegazza", "Los amores de los hombres", "Maucci", "", "", "LibrosAntiguos"));
        b.add(new Book("Jaime Torrubiano Ripoll", "El divorcio vincular y el dogma católico", "J. Morata", "1926", "",
                "LibrosAntiguos"));
        b.add(new Book("Hildegart", "La rebeldía sexual de la juventud", "J. Morata", "1931", "", "LibrosAntiguos"));
        b.add(new Book("H. Van der Velde", "Fertilidad y esterilidad en el matrimonio", "J. Morata", "1932", "",
                "LibrosAntiguos"));
        b.add(new Book("Th. H. Van de Velde", "El matrimonio perfecto", "J. Morata", "1930", "", "LibrosAntiguos"));
        b.add(new Book("Th. H. Van de Velde", "Aversión y atracción en el matrimonio", "J. Morata", "1931", "",
                "LibrosAntiguos"));
        b.add(new Book("R. Novoa Santos", "La inmortalidad y los orígenes del sexo", "J. Morata", "1931", "",
                "LibrosAntiguos"));
        b.add(new Book("R. Novoa Santos", "La mujer, nuestro sexto sentido y otros esbozos", "J. Morata", "1929", "",
                "LibrosAntiguos"));
        b.add(new Book("Lorenzo Rodero", "La risa del sexo", "", "1931", "", "LibrosAntiguos"));
        b.add(new Book("Dr. Pierre Vachet", "El enigma de la mujer", "Ed. Oriente", "1931", "", "LibrosAntiguos"));
        b.add(new Book("E. Laurent y P. Nagour", "La magia y el amor", "Más allá", "", "", "LibrosAntiguos"));
        b.add(new Book("Pietro Aretino", "Los ragionamenti Diálogos putañescos", "Bergua", "1933", "", "LibrosAntiguos"));
        b.add(new Book("Universidad de Oxford", "El legado de Grecia", "Pegaso", "1947", "BUDISMAGI,2ª ed Revis.",
                "LibrosAntiguos"));
        b.add(new Book("Maurice Besson", "Totemismo", "Labor, S. A.", "1931", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Pedro Guirao", "Seis ensayos sobre esoterismo", "Jasón", "1931", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Universidad de Oxford", "El legado de la India", "Pegaso", "1945", "BUDISMAGI",
                "LibrosAntiguos"));
        b.add(new Book("Libro de San Cipriano", "Tesoro del hechicero", "C. ocultas", "", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("José A. Sánchez Pérez", "Supersticiones españolas", "Saeta", "1948", "BUDISMAGI",
                "LibrosAntiguos"));
        b.add(new Book("Fco. C. Sainz de Robles", "Diccionario mitológico universal", "M. Aguilar", "1944",
                "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Ignacio Puig, S. I.", "¿Qué es la física cósmica?", "Espasa Calpe", "1944",
                " BUDISMAGI,V. Extra", "LibrosAntiguos"));
        b.add(new Book("Blas Cabrera", "Principio de relatividad", "Public. R. Est.", "1923", "BUDISMAGI",
                "LibrosAntiguos"));
        b.add(new Book("Hans Reichenbach", "Atomo y cosmos", "R. Occidente", "1931", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Artur March", "La física del átomo", "R. Occidente", "1934", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("S. Ramón y Cajal", "Reglas y consejos sobre la investigación científica", "Beltrán", "1940",
                "BUDISMAGI,8ª ed.", "LibrosAntiguos"));
        b.add(new Book("Teodoro Wult", "Los sillares del universo material", "Manuel Marín", "1939", "BUDISMAGI",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Vera", "Historia de la ciencia", "J. Gil", "1937", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Thomas Huntmorgan", "La base científica de la evolución", "Espasa-Calpe", "1943", "BUDISMAGI",
                "LibrosAntiguos"));
        b.add(new Book("Remberto Reinhardt", "Psicología animal", "Espasa-Calpe", "1944", "BUDISMAGI", "LibrosAntiguos"));
        b.add(new Book("Henri Bergson", "La risa", "Losada, S. A.", "1947", "LOSADA,F", "LibrosAntiguos"));
        b.add(new Book("José Ferrater Mora", "Unamuno. Bosquejo de una filosofía", "Losada, S. A.", "1944", "LOSADA,F",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Romero", "Filosofía de la persona", "Losada, S. A.", "1944", "LOSADA,F",
                "LibrosAntiguos"));
        b.add(new Book("Georges Duhamel", "Diario de un aspirante a santo", "Losada, S. A.", "1945", "LOSADA",
                "LibrosAntiguos"));
        b.add(new Book("Angel Vassallo", "¿Qué es filosofía?", "Losada, S. A.", "1945", "LOSADA,F", "LibrosAntiguos"));
        b.add(new Book("José María Monner Sans", "Pirandello, su vida y su teatro", "Losada, S. A.", "1947",
                "LOSADA,Teatro", "LibrosAntiguos"));
        b.add(new Book("Francisco Romero", "Filósofos y problemas", "Losada, S. A.", "1947", "LOSADA,F",
                "LibrosAntiguos"));
        b.add(new Book("Guillermo de Torre", "La aventura y el orden", "Losada, S. A.", "1948", "LOSADA",
                "LibrosAntiguos"));
        b.add(new Book("Guillermo de Torre", "Tríptico del sacrificio", "Losada, S. A.", "1948", "LOSADA",
                "LibrosAntiguos"));
        b.add(new Book("Rafael Alberti", "El adefesio (Fábula del amor y las viejas)", "Losada, S. A.", "1944",
                "LOSADA,Teatro", "LibrosAntiguos"));
        b.add(new Book("Federico García Lorca", "Romancero Gitano", "Losada, S. A.", "1949", "LOSADA,Poesía",
                "LibrosAntiguos"));
        b.add(new Book("Wu Ch'eng-En", "Mono", "Cervantes", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Paul Verlaine", "Obras completas", "Claridad", "1944", "", "LibrosAntiguos"));
        b.add(new Book("León Bloy", "El peregrino de lo absoluto", "Mundo moder.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("León Bloy", "En el umbral del apocalípsis", "Mundo moder.", "1949", "", "LibrosAntiguos"));
        b.add(new Book("Homero", "Odisea", "M. Aguilar", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Homero", "Iliada", "M. Aguilar", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Colección Telémaco Vol. IV", "Aventuras  de Safo y Faón", "A. Pueyo", "", "", "LibrosAntiguos"));
        b.add(new Book("A. Nimzowitsch", "Mi sistema T. 1, 2, 3, 4 y 5", "Grabo", "1943", "", "LibrosAntiguos"));
        b.add(new Book("Rodolfo Gil Bermejo", "Marruecos andaluz", "Diana", "1942", "", "LibrosAntiguos"));
        b.add(new Book("A. Macía Serrano", "Ciclo nacional de conferencias a la tropa", "EPESA", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("José Cordero Torres", "La misión africana en España", "Diana", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Santiago Ibero", "Lo bueno y lo malo de Manolete", "J. Pugés", "1944", "", "LibrosAntiguos"));
        b.add(new Book("César Silió Beleña", "Nociones de economía", "Cuesta", "1940", "5ª ed. Modif.",
                "LibrosAntiguos"));
        b.add(new Book("León Batardón", "La contabilidad al alcance de todos", "Labor", "1949", "3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("León Batardón", "Contabilidad de empresas", "Labor", "1943", "4ª reimp.", "LibrosAntiguos"));
        b.add(new Book("José Dalmau Carles", "Resumen de las lecciones de aritmética Grado Medio", "Dalmau Carles",
                "1925", "", "LibrosAntiguos"));
        b.add(new Book("Félix Correa", "Ampliación de aritmética", "H. De Aragón", "1939", "", "LibrosAntiguos"));
        b.add(new Book("Mauricio Bacarisse", "El esfuerzo", "José Yagües", "1917", "", "LibrosAntiguos"));
        b.add(new Book("Charles H. Fernanld", "Formación  práctica del agente de ventas", "Labor", "1949", "",
                "LibrosAntiguos"));
        b.add(new Book("Sindicato Nacional del Seguro", "Tarifa de riesgos sencillos", "Perman", "1947", "",
                "LibrosAntiguos"));
        b.add(new Book("Dr. Ricardo Espeso de Hinojosa", "Economía política moderna", "Clarasó", "1940", "7ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Dr. Ricardo Espeso de Hinojosa", "Rudimentos de derecho", "Clarasó", "1939", "2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Jesús Guzmán y Martínez", "Método de lengua francesa", "Martosa", "1935", "10ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Jesús Guzmán y Martínez", "Lengua francesa", "Martosa", "1935", "9ª ed.", "LibrosAntiguos"));
        b.add(new Book("José Pérez Villamil", "El problema del mundo exterior", "Paredea", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Hilario Rodríguez Sanz", "El problema de los valores morales Tª de F. Montano", "Univ. Salam.",
                "1948", "", "LibrosAntiguos"));
        b.add(new Book("Casares", "Diccionario ideológico de la lengua española", "Gustavi Gili, S.A.", "1947",
                "1ª ed. 2ª tirada", "LibrosAntiguos"));
        b.add(new Book("P. Juan Mir y Noguera", "Diccionario de Frases", "Joaquín Gil", "1942", "", "LibrosAntiguos"));
        b.add(new Book("Rafael Reyes", "Diccionario Francés-Español y Español-Francés", "Caro Raggio", "1936",
                "10ª ed.", "LibrosAntiguos"));
        b.add(new Book("Casa Editrice Brietti", "Novísimo Dizionario Italiano -Espagnolo", "Editrice Brietti", "1938",
                "", "LibrosAntiguos"));
        b.add(new Book("L. Levy Bruhl", "David Hume", "Sudamericana", "1939", "Intonso", "LibrosAntiguos"));
        b.add(new Book("José Antonio Primo de Rivera", "Obras completas", "Af. Aguado", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Pedro Simón Abril", "La ética de Aristóteles", "R A Cª  Morales", "1918", "", "LibrosAntiguos"));
        b.add(new Book("Hesíodo-Herondas-Teofastro", "La teogonía. Los trabajos y los días. Los mimos", "Lib. Bergua",
                "", "", "LibrosAntiguos"));
        b.add(new Book("Fray Luis de Granada", "Guía de pedadores", "Miñón S.A.", "", "", "LibrosAntiguos"));
        b.add(new Book("Francisco Bonmatí de Codecido", "Pilar (Novela de guerra)", "Santarén", "1939", "",
                "LibrosAntiguos"));
        b.add(new Book("David H. Lawrence", "El amante de Lady Chatterley", "Tor", "1939", "", "LibrosAntiguos"));
        b.add(new Book("Gabriel D'Anuncio", "El Placer I y II", "Maucci", "", "", "LibrosAntiguos"));
        b.add(new Book("Moritz Geiger", "Estética", "Argos", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Musas Lejanas XI", "Trece fabliaux franceses (2 ejs.)", "R. Occidente", "1927", "",
                "LibrosAntiguos"));
        b.add(new Book("Musas Lejanas (Susana Strowska)", "Leyendas polacas (2º ej. 1944, 2ª ed.)", "R. Occidente",
                "1928", "", "LibrosAntiguos"));
        b.add(new Book("M. Golmayo", "Temas de ajedrez", "Dossat, S.A.", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Sin autor", "Los mil y un días", "Juan Oliveres", "1863", "Piel Lujo", "LibrosAntiguos"));
        b.add(new Book("Iván  Bunin", "Sujodol (novela)", "Espasa Calpe", "1923", "", "LibrosAntiguos"));
        b.add(new Book("Pascal", "Pensamientos seguidos de las provinciales", "Lib. Bergua", "1933", "",
                "LibrosAntiguos"));
        b.add(new Book("Kant", "Crítica de la razón pura T. I y II", "Lib. Bergua", "1934", "", "LibrosAntiguos"));
        b.add(new Book("Stendhal", "Del amor", "Tor", "", "Sin pasta", "LibrosAntiguos"));
        b.add(new Book("J. Roviralta Borrell, Traductor", "BHAGAVAD-GÌTÀ Canto del Señor", "C. y  Esteva", "1910",
                "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("H. Hallopeau", "Tratado elemental de Patología general", "José Espasa", "1898", "",
                "LibrosAntiguos"));
        b.add(new Book("Octavio Mirbeau", "El jardín de los suplicios", "Maucci", "1902", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Julián Sorel", "Los hombres del 98 Unamuno", "R. C. Raggio", "1917", "", "LibrosAntiguos"));
        b.add(new Book("Ceferino González", "Filosofía elemental T. I", "Agustín Jubera", "1886", "5ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("San Ambrosio", "Tratado de la vírgenes", "Renacimiento", "1914", "", "LibrosAntiguos"));
        b.add(new Book("León Bloy", "La sangre del pobre", "José Janés", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Mr. A. Dumas", "El bandido de Sierra Nevada", "M. Minuesa", "1857", "", "LibrosAntiguos"));
        b.add(new Book("Stendhal (Henry Beyle)", "La cartuja de Parma T. I y II", "Calleja", "1917", "",
                "LibrosAntiguos"));
        b.add(new Book("Rousseau", "El contrato social. Meditaciones. Cartas escogidas", "Lib. Bergua", "1936", "",
                "LibrosAntiguos"));
        b.add(new Book("N. Berdiaev", "La destinación del hombre", "José Janés", "1947", "2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Dr. R. Rey Ardiz", "Los principios del ajedrez", "Lib. Gral. Zarag.", "1939", "",
                "LibrosAntiguos"));
        b.add(new Book("Derek Traversi", "Visión de Shakerpeare", "José Janés", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Gerald Kersh", "La canción de la pulga", "José Janés", "1949", "", "LibrosAntiguos"));
        b.add(new Book("C. González Ruano", "Baudelaire", "José Janés", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Ley de contrato de trabajo", "Decretos de 1944", "La editorial", "", "", "LibrosAntiguos"));
        b.add(new Book("Kant", "Sobre el saber filosófico", "Adán", "1943", "", "LibrosAntiguos"));
        b.add(new Book("M. Kant", "Tratado de lógica", "Araujo", "1938", "", "LibrosAntiguos"));
        b.add(new Book("P. Natorp", "Em. Kant y la escuela de Marburgo", "F. Beltrán", "1915", "", "LibrosAntiguos"));
        b.add(new Book("Manuel G. Morente", "La filosofía de Kant", "V. Suárez", "1917", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Alonso F. de Avellaneda", "El Quijote", "Espasa Calpe", "1946", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Lafcadio Hearn", "Kwaidan (Cuentos fantásticos)", "Espasa Calpe", "1922", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("Escipión Sighele", "Eva moderna", "Espasa Calpe", "1921", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Ismael Quiles, S. I.", "Sartre El existencialismo del  absurdo", "Espasa Calpe", "1949",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Ismael Quiles, S. I.", "Heidegger El existencialismo de la angustia", "Espasa Calpe", "1948",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Ismael Quiles, S. I.", "Filosofar y vivir", "Espasa Calpe", "1948", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Juan Luis Segundo, S. I.", "Existencialismo, filosofía y poesía", "Espasa Calpe", "1948",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Victoriano García Martí", "La voluntad y el destino (ensayo)", "Espasa Calpe", "1942",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("William Faulkner", "Santuario (novela)", "Espasa Calpe", "1934", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Julián Benda", "La ordenación", "Espasa Calpe", "1922", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Augusto Messer", "Filosofía antigua y medieval", "Espasa Calpe", "1939", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("Augusto Messer", "La filosofía en el siglo XIX", "Espasa Calpe", "1936", "RESTOS,3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Augusto Messer", "Del renacimiento a Kant", "Espasa Calpe", "1942", "RESTOS,2ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Augusto Messer", "De Kant a Hegel", "Espasa Calpe", "1945", "RESTOS,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Augusto Messer", "La filosofía actual", "Espasa Calpe", "1945", "RESTOS,3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Cardenal D. J. Mercier", "Lógica T. I y II", "Espasa Calpe", "1935", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Los grandes pensadores", "I Antigüedad, edad media y renacimiento", "Espasa Calpe", "1938",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Tomás Carlyle", "Obras filosóficas Los héroes", "Nueva B. Fca.", "1932", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("Himnario evangélico (SIN PAGINAR)", "Cánticos de fe, amor y esperanza", "Indust. Gráfica", "",
                "RESTOS,C. Dorado", "LibrosAntiguos"));
        b.add(new Book("Edmundo González Blanco", "Los evangelios apócrifos T. I, II y III", "Lib. Bergua", "1934",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Giuseppe Spalletti", "Saggio Sopra la Bellezza", "A. Minuciano", "1945", "RESTOS,En italiano",
                "LibrosAntiguos"));
        b.add(new Book("Daniel Defoe", "Venturas y desvent. de la famosa Moll Flanders", "Hisp. Americ.", "1945",
                "RESTOS", "LibrosAntiguos"));
        b.add(new Book("J. y  J. Izquierdo Croselles", "Compendio de Historia General I Edad Antigua", "I. Urania",
                "1935", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Remy de Gourmont", "El peregrino del silencio", "Bibliot. Nueva", "1915", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("José Ferrater Mora", "Cóctel de verdad", "Literatura", "1935", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Reinaldo Temprano Azcona", "¡Alto humanidad!", "Astrea", "1946", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Lord Byron", "O.  completas I  Childe- Harold", "Espasa Calpe", "1930", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("Francisco Agustín", "Don Juan en el teatro, en la novela...", "Páez", "1928", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("André Malraux", "Los conquistadores", "B. Moderna", "1947", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Alberto el Grande", "Alberto el Grande y sus admirables secretos", "Hollyvood", "", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("Paul Foulquié", "El existencialismo", "Surco", "1948", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Guillaume Apollinaire", "El heresiárca y Cía.", "Argonauta", "1946", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Rodolfo Otto", "Lo santo", "R. Occidente", "1925", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Erwin Rohde", "Psique La idea del alma y la inmortalidad entre…", "F. C. E.", "1948", "RESTOS",
                "LibrosAntiguos"));
        b.add(new Book("San Agustin", "La ciudad de Dios", "Apost. Prensa", "1944", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Vicente Noguera", "Yunque de oro", "Lib. Bergua", "1930", "RESTOS", "LibrosAntiguos"));
        b.add(new Book("Mahoma", "El Korán", "Lib. Bergua", "", "PUERTA PSICOLOGIA, 4ª ed.", "LibrosAntiguos"));
        b.add(new Book("H. G. Wells", "Breve historia del mundo", "M. Aguilar", "1935", "PUERTA PSICOLOGIA",
                "LibrosAntiguos"));
        b.add(new Book("VYASA", "Los vedas", "Lib. Bergua", "1935", "SILLON", "LibrosAntiguos"));
        b.add(new Book("H. Taine", "La inteligencia T. I y II", "Albatros", "1944", "LIBROS AUSTRAL", "LibrosAntiguos"));
        b.add(new Book("E. Gómez Carrillo", "La Grecia eterna", "Mundo latino", "", "LIBROS AUSTRAL", "LibrosAntiguos"));
        b.add(new Book("San Juan de  la Cruz", "Obras completas", "El M. Carmelo", "1940", "LIBROS AUSTRAL,3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Alexis Carrel", "La oración", "Orellana", "1946", "LIBROS AUSTRAL", "LibrosAntiguos"));
        b.add(new Book("Villarroel", "Obras varias Viaje fantástico, la suma M.", "Prometeo", "1920", "LIBROS AUSTRAL",
                "LibrosAntiguos"));
        b.add(new Book("Arturo Schopenhauer", "Los dolores del mundo", "Tor", "1945", "GALICIA POESIA",
                "LibrosAntiguos"));
        b.add(new Book("Edouard Le Roy", "Bergson", "Labor", "1932", "GALICIA POESIA", "LibrosAntiguos"));
        b.add(new Book("Breviarios del pensam. Filosófico", "Descartes", "Sudamericana", "1939", "SEXMUJER, Intonso",
                "LibrosAntiguos"));
        b.add(new Book("Giovanni Papini", "Hombre acabado", "B. Nueva", "1923", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Anónimo Colección Pompadour", "Filosofía de las cortesanas", "México", "", "SEXMUJER",
                "LibrosAntiguos"));
        b.add(new Book("La Santa Biblia", "La Santa Biblia", "S .Bíblica B y E", "1921", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("J. F. Jacobsen", "Un amor", "Lauro", "1944", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("André Maurois", "Las quintaesencias", "José Juanes", "1942", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("W. B. Maxwell", "Diario íntimo", "Tartessos", "1943", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("F. Pi y Margall", "Las nacionalidades", "Lib. Bergua", "1936", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("E. Gómez Carrillo", "El modernismo", "F. Beltrán", "", "SEXMUJER,Ed. Correg.", "LibrosAntiguos"));
        b.add(new Book("Vicente Noguera", "Yunque de fuego", "Lib. Bergua", "1934", "SEXMUJER,Intonso",
                "LibrosAntiguos"));
        b.add(new Book("J. M. Vargas Vila", "Los ojos de Astrea", "Bauzá", "1889", "SEXMUJER,Estampilla",
                "LibrosAntiguos"));
        b.add(new Book("H. de Balzac", "Luis Lambert. Los desterrados. Serafita.", "Luis Tasso", "",
                "SEXMUJER,Sin pasta", "LibrosAntiguos"));
        b.add(new Book("Bartolomé Soler", "La llanura  muerta", "Lara", "1947", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Kalidasa", "El reconocimiento de Sakuntala", "J. Yagües Sanz", "", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Havelock Ellis", "Afirmaciones", "Joaquín Gil", "1936", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Cantos del Hoggar", "Cantos de los oásis del Hoggar", "Centauro , S.A.", "1944", "SEXMUJER",
                "LibrosAntiguos"));
        b.add(new Book("Antonio López Carballeira", "Religión del porvenir ¿Cristo es un mito?", "Roel", "1936",
                "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Henri Hubert", "Los celtas y la civilización céltica", "Cervantes", "1942", "SEXMUJER",
                "LibrosAntiguos"));
        b.add(new Book("Eloíno Nacar y Alberto Colunga, O.P.", "Sagrada Biblia", "BAC", "1947",
                "SEXMUJER,2ª ed. Corr.", "LibrosAntiguos"));
        b.add(new Book("José Mª Badía", "Las tentaciones", "La novela deliciosa", "1932", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("André Gide", "Corydon", "Ed. Oriente", "1929", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Platón", "Obras Completas I Diálogos polémicos", "Nueva B. Fca.", "1927", "SEXMUJER",
                "LibrosAntiguos"));
        b.add(new Book("E. Ugarte Albizu", "Lengua francesa Tercer Curso", "Hijos M. G. Hdez.", "1931",
                "SEXMUJER,4ª ed.", "LibrosAntiguos"));
        b.add(new Book("Th. De Quincey", "El asesinato considerado como una de las bellas artes", "Mundo latino", "",
                "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Barón D^Holbach", "Moisés, Jesús y Mahoma", "Sempere y Cía.", "", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Miguel de Molinos", "Guía espiritual", "J. Torrens y C.", "", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Camilo Flammarión", "La muerte", "Maucci", "1922", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("D. H. Lawrence", "La dama encantadora", "S. Rueda", "1947", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Jacobo Burckhardt", "Reflexiones  sobre la historia del mundo", "El ateneo", "1945",
                "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("R. Novoa Santos", "El instinto de la muerte", "J. Morata", "1927", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Balmes", "Filosofía elemental", "E. Ibéricas", "1940", "SEXMUJER,4ª ed.", "LibrosAntiguos"));
        b.add(new Book("Juan Ramón Jiménez", "Platero y yo", "Signo", "1934", "SEXMUJER", "LibrosAntiguos"));
        b.add(new Book("Remy Collin", "Las hormonas", "Espasa-Calpe", "1941", "", "LibrosAntiguos"));
        b.add(new Book("León Bloy", "Cartas a sus ahijados J. Maritaine y P. Vardem.", "Dedebec", "1948", "",
                "LibrosAntiguos"));
        b.add(new Book("Conde de Keyserling", "El mundo que nace", "R. Occidente", "1926", "", "LibrosAntiguos"));
        b.add(new Book("Madame de La  Fayette", "La princesa de Cleves", "Calpe", "1924", "TEORELIGION",
                "LibrosAntiguos"));
        b.add(new Book("FRIEDRICH HÖLDERLIN", "Doce poemas Adonais LXI", "Rialp", "1949", "TEORELIGION",
                "LibrosAntiguos"));
        b.add(new Book("Vicariato General Castrense", "Devocionario del soldado", "Serv. G. Ejército", "1944",
                "TEORELIGION", "LibrosAntiguos"));
        b.add(new Book("André Maurois", "El instinto de la felicidad", "Juventud", "1943", "TEORELIGION,3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("Alberto Insúa", "La batalla sentimental", "Hachete", "1945", "TEORELIGION", "LibrosAntiguos"));
        b.add(new Book("B. Groethuysen", "Introduc. al pensamiento alemán desde Nietzsche", "Hernando", "1927",
                "LITERNOVELA", "LibrosAntiguos"));
        b.add(new Book("Karin Michaelis", "Pasiones y muerte de D. Juan", "Emporión", "1941", "LITERNOVELA",
                "LibrosAntiguos"));
        b.add(new Book("G. W. Leibnitz", "La monadología. Opúsculos Vol. V", "S. G. Librería", "", "LITERNOVELA",
                "LibrosAntiguos"));
        b.add(new Book("Melchor de Almagro San Martín", "Biografía del 1900", "R. Occidente", "1944",
                "LITERNOVELA,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Musas Lejanas", "Chung-Kuei, domador de demonios", "R. Occidente", "1929", "ADONAIS POESIA",
                "LibrosAntiguos"));
        b.add(new Book("Musas Lejanas", "Cuentos malayos", "R. Occidente", "1926", "ADONAIS POESIA", "LibrosAntiguos"));
        b.add(new Book("Lord Dunsany", "Cuentos de un soñador", "R. Occidente", "1924", "ADONAIS POESIA",
                "LibrosAntiguos"));
        b.add(new Book("Otto Gründler", "Filosofía de la religión", "R. Occidente", "1926", "ADONAIS POESIA",
                "LibrosAntiguos"));
        b.add(new Book("Max Scheler", "El saber y la cultura", "R. Occidente", "1926", "ADONAIS POESIA",
                "LibrosAntiguos"));
        b.add(new Book("Paul Verlaine", "Obras poéticas", "M. Aguilar", "1947", "ADONAIS POESIA", "LibrosAntiguos"));
        b.add(new Book("Concha Zardoya", "Pájaros del nuevo mundo XXVII", "Rialp", "1946", "", "LibrosAntiguos"));
        b.add(new Book("F. Pérez Dolz", "Iniciación a la técnica de la pintura", "Apolo", "1941", "", "LibrosAntiguos"));
        b.add(new Book("Eduardo Alonso", "Guía lírica del auditor de conciertos", "", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Wilhelm Pinder", "El problema de las generaciones en la Hª del arte", "Losada, S. A.", "1946",
                "", "LibrosAntiguos"));
        b.add(new Book("Torcuato Tasso", "La Jerusalén libertada", "M. Aguilar", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Garcilaso de la Vega y Juan Boscán", "Obras completas", "M. Aguilar", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Jean de la Bruyere", "Los caracteres o las costumbres de este siglo", "M. Aguilar", "1944", "",
                "LibrosAntiguos"));
        b.add(new Book("Giacomo Leopardi", "Obras", "M. Aguilar", "1945", "", "LibrosAntiguos"));
        b.add(new Book("Ralf Waldo Emerson", "Ensayos", "M. Aguilar", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Joaquin P. de Oliveira Martins", "Historia de la civilización ibérica", "M. Aguilar", "1946",
                "", "LibrosAntiguos"));
        b.add(new Book("M. Sainte-Beuve", "Reflex., sents. y máx.  morales de la Rachefoucould", "Garnier Hnos.",
                "1926", "", "LibrosAntiguos"));
        b.add(new Book("John Milton", "El paraiso perdido", "M. Aguilar", "1946", "", "LibrosAntiguos"));
        b.add(new Book("Diógenes Loercio", "Vidas de los filósofos más ilustres", "M. Aguilar", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("Fr. Pedro Malon de Chaide", "Libro de la Conversión de la Magdalena", "M. Aguilar", "1946", "",
                "LibrosAntiguos"));
        b.add(new Book("H. R. Lenormand", "Los fracasados. La loca del cielo. La inocente", "Losada, S. A.", "1949",
                "Teatro", "LibrosAntiguos"));
        b.add(new Book("Eduardo Alonso", "Guía lírica del auditor de conciertos", "", "1948", "LRADIO",
                "LibrosAntiguos"));
        b.add(new Book("A. P. Sinnett", "El buddhismo esotérico", "B. Rguez. Serra", "1931", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("L. P. Gachard", "Carlos V y Felipe II (C. Cisneros)", "Atlas", "1943", "LRADIO,Nº 100",
                "LibrosAntiguos"));
        b.add(new Book("Juan Ruiz Arcipreste de Hita", "Libro del buen amor", "M. Aguilar", "1945", "LRADIO",
                "LibrosAntiguos"));
        b.add(new Book("Miguel de unamuno", "Niebla. Abel Sánchez", "M. Aguilar", "1946", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Guillermo Díaz-Plaja", "Ensayos escogidos", "M. Aguilar", "1944", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Azorin", "El artista y el estilo", "M. Aguilar", "1946", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Aldous Huxley", "Un mundo feliz", "José Janés", "1947", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Santa Teresa de Jesús", "El libro de su vida (C. Cisneros)", "Atlas", "1944", "LRADIO,Nº 1",
                "LibrosAntiguos"));
        b.add(new Book("Centro Estudios filos. Univ. México", "La filosofía de los valores", "Minerva", "1944",
                "LRADIO", "LibrosAntiguos"));
        b.add(new Book("William Graham Summer", "Los pueblos y las costumbres", "G. Kraft", "1948", "LRADIO,Numerado",
                "LibrosAntiguos"));
        b.add(new Book("Dr. R. Rey Ardiz", "Cien nuevas partidas de ajedrez (1934/1940)", "Lib. Gral. Zarag.", "1940",
                "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Dra. J. Jacobi", "La psicología de C. G. Jung", "Espasa Calpe", "1947", "LRADIO",
                "LibrosAntiguos"));
        b.add(new Book("Charles Baudelaire", "Delacroix", "Anaquel", "1946", "LRADIO", "LibrosAntiguos"));
        b.add(new Book("Dr. R. Rey Ardiz", "Aperturas de ajedrez T. I La apertura española", "Lib. Gral. Zarag.",
                "1945", "", "LibrosAntiguos"));
        b.add(new Book("Dr. R. Rey Ardiz", "Aperturas de ajedrez T. II Aperturas abiertas exc. esp. Fasc. 1º",
                "Lib. Gral. Zarag.", "1945", "", "LibrosAntiguos"));
        b.add(new Book("J. B. Sánchez Pérez", "Diccionario Ilustrado de Ajedrez", "Cleto Vallinas", "1934", "AJEDREZ",
                "LibrosAntiguos"));
        b.add(new Book("Savielly G. Tartakower", "Sugestiones para la estrategia ajedrecista", "Sopena Arg. S.R.",
                "1941", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Ing. M. Botwinnik", "Secretos de estrategia magistral de ajedrez", "Grabo", "1942", "AJEDREZ",
                "LibrosAntiguos"));
        b.add(new Book("José Palucie y Lucerna", "Manual de ajedrez Estrategia ( Parte segunda)", "Elzeviriana",
                "1924", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("E. D. Bogoljubow", "La apertura moderna", "Grabo", "1943", "AJEDREZ,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("A. Nimzowitsch", "La práctica de mi sistema T. 1º y 2º", "Grabo", "1941", "AJEDREZ",
                "LibrosAntiguos"));
        b.add(new Book("Federación Española de Ajedrez", "Ajedrez español Revista mensual marzo 1946",
                "Fed. Esp. Ajed.", "1946", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Federación Española de Ajedrez", "Ajedrez español Revista mensual mayo 1946",
                "Fed. Esp. Ajed.", "1946", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Francisco A. de Icaza", " Nietzsche, poeta (Interpretaciones líricas)", "Sáez Hnos.", "",
                "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("CAISSA", "Catálogo Biblioteca ajedrecista", "Grabo", "1936", "AJEDREZ,junio", "LibrosAntiguos"));
        b.add(new Book("F. W. J. Schelling", "Filosofía del arte", "Nova", "1949", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Joaquín  López Barbadillo", "Los diálogos del divino Pedro Aretino", "J. L. Barbadillo",
                "1914", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("F. Salignac de la Mothe (Fenelón)", "Las aventuras de Telémaco, hijo de Ulises", "M. Aguilar",
                "1944", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Pedro Laín  Entralgo", "Estudios de Hª de la Medicina y de la antrop. Médica (lradio)",
                "Escorial", "1943", "AJEDREZ", "LibrosAntiguos"));
        b.add(new Book("Gabriel D'Annunzio", "El triunfo de la muerte T. Primero", "Maucci", "1910", "AJEDREZ,4ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("E. Ugarte Albizu", "El traductor francés Curso Superior", "Hijos M. G. Hdez.", "1928",
                "AJEDREZ,3ª ed.", "LibrosAntiguos"));
        b.add(new Book("Eloy Luis y André", "Etica individual y social", "Hijos M. G. Hdez.", "1923", "AJEDREZ,3ª ed.",
                "LibrosAntiguos"));
        b.add(new Book("George Simmel", "Shcopenhauer y Nietzsche", "F. Beltrán", "1915", "", "LibrosAntiguos"));
        b.add(new Book("Crane Brinton", "Nietzsche", "Losada", "1947", "", "LibrosAntiguos"));
        b.add(new Book("Rainer María Rilke", "Historias del buen Dios", "José Janés", "1948", "", "LibrosAntiguos"));
        b.add(new Book("Pedro Lain Entralgo", "Estudios de Hª de la Medicina y de la Antrop. Médica", "Escorial",
                "1943", "", "LibrosAntiguos"));
        b.add(new Book("Dr. R. Rey Ardiz", "Aperturas de ajedrez T. II Aperturas abiertas exc. esp. Fasc. 2º",
                "Lib. Gral. Zarag.", "1945", "RESUMEN", "LibrosAntiguos"));
        b.add(new Book("Manuel de Agustin Comentador", "Todas las partidas de ajedrez de Margate 1939", "Ambo", "1939",
                "RESUMEN", "LibrosAntiguos"));
        b.add(new Book("Alfredo Gómez  Jaime", "Bajo la máscara", "La nueva prensa", "1929", "RESUMEN,Dedicado",
                "LibrosAntiguos"));
        b.add(new Book("Antonio Jiménez-Laudi", "Selección de poetas hispanoamericanos (C. Cisneros)", "Atlas", "1944",
                "RESUMEN,Nº 99", "LibrosAntiguos"));
        b.add(new Book("Giménez Caballero", "España y Franco", "Los combatientes", "1938", "ARTE HISTORIA MUSICA,Nº 1",
                "LibrosAntiguos"));
        b.add(new Book("Giménez Caballero", "Camisa azul y boina colorada", "Los combatientes", "1939",
                "ARTE HISTORIA MUSICA,Nº 2", "LibrosAntiguos"));
        b.add(new Book("Giménez Caballero", "Triunfo del dos de mayo", "Los combatientes", "1938",
                "ARTE HISTORIA MUSICA,Nº 3", "LibrosAntiguos"));
        b.add(new Book("Benvenuto Cellini", "Mi vida", "M. Aguilar", "1940", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("César González Ruano", "Vida, pensamiento y aventura de M. de Unamuno", "M. Aguilar", "1930",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Hans Driesch", "El acto moral", "M. Aguilar", "1929", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Mario Meunier", "Leyendas épicas de Grecia y Roma", "M. Aguilar", "", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("Mario Meunier", "La leyenda dorada de los dioses y los héroes", "M. Aguilar", "",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Georges Gurvitch", "Nuevas tendencias de la filosofía alemana", "M. Aguilar", "1931",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("El Abate du Part", "Venus en el claustro", "Mundo latino", "1931",
                "ARTE HISTORIA MUSICA,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Teócrito - Tirteo", "Idilios y epigramas Odas anacreónticas", "Prometeo", "",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Eurípides", "Obras completas T. I y II", "Prometeo", "", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("Eurípides", "Obras completas T. III y IV", "Prometeo", "", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("J. K. Huysmans", "En familia", "Prometeo", "1919", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("J. K. Huysmans", "En rada", "Prometeo", "1919", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("E. Ugarte Albizu", "El traductor francés Segundo curso", "Hijos M. G. Hdez.", "1930",
                "ARTE HISTORIA MUSICA,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("ABZ-UL-AGRIB", "El diván de ABZ-UL-AGRIB", "Centauro , S.A.", "1945", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("Henri Hubert", "Los celtas y la expansión céltica", "Cervantes", "1941",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Joaquín Xirau Palau", "El sentido de la verdad", "Cervantes", "1927", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("Hans Driesch", "Metafísica", "Labor", "1930", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Prof. Karl Jaspers", "Ambiente espiritual de nuestro tiempo", "Labor", "1933",
                "ARTE HISTORIA MUSICA", "LibrosAntiguos"));
        b.add(new Book("Alberto Insúa", "El complejo de Edipo", "Hachete", "1944", "ARTE HISTORIA MUSICA",
                "LibrosAntiguos"));
        b.add(new Book("Anatole France", "El figón de la reina patoja", "Hachete", "1946",
                "ARTE HISTORIA MUSICA,2ª ed.", "LibrosAntiguos"));
        b.add(new Book("Louis Ferdinand Céline", "Mea culpa", "Sur", "1937", "ARTE HISTORIA MUSICA", "LibrosAntiguos"));

    }

    // TODO
    private static void fillGalicia_ling_miscelanea() {
        DB.get("Galicia_ling_miscelanea");
    }

    private static void fillFsillon() {
        final List<Book> b = DB.get("Fsillon");
        b.add(new Book("Prólogo de R. Cansinos Assens", "Las mil y una noche T I", "Aguilar", "1954", "Piel", "Fsillon"));
        b.add(new Book("Prólogo de R. Cansinos Assens", "Las mil y una noche T III", "Aguilar", "1955", "Piel",
                "Fsillon"));
        b.add(new Book("Herman Hesse", "Obras escogidas T II", "Aguilar", "1967", "3ª ed.", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T I", "Lorenzana", "1964", "  C. Dorado", "Fsillon"));
        b.add(new Book("Herman Hesse", "Obras completas T III", "Aguilar", "1963", "", "Fsillon"));
        b.add(new Book("Herman Hesse", "Obras completas T IV", "Aguilar", "1967", "", "Fsillon"));
        b.add(new Book("Aldous Huxley", "Novelas I", "Planeta", "1957", "Piel C. Dor", "Fsillon"));
        b.add(new Book("Doctor J. C. Mardruz", "El libro de las mil y una noche T. I, II y III", "Cía Gral. Edic.",
                "1957", "4ª ed.", "Fsillon"));
        b.add(new Book("Spinoza", "Obras escogidas", "El Ateneo", "1953", "", "Fsillon"));
        b.add(new Book("Jhon Dos Passos", "Manhattan Transfer", "S. Rueda", "1941", "", "Fsillon"));
        b.add(new Book("Rabindranath Tagore", "Recuerdos de mi vida", "S. Rueda", "1952", "", "Fsillon"));
        b.add(new Book("André Gide", "Los alimentos terrestres y los nuevos alimentos", "Losada", "1953", "", "Fsillon"));
        b.add(new Book("André Gide", "Et nunc manet in te", "Losada", "1953", "", "Fsillon"));
        b.add(new Book("Albert Camus", "La caída", "Losada", "1957", "", "Fsillon"));
        b.add(new Book("Christiane Rochefort", "El reposo del guerrero", "Losada", "1962", "5ª ed.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "La edad de la razón I", "Losada", "1954", "3ª ed.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "El aplazamiento II", "Losada", "1954", "3ª ed.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "El muro", "Diana", "1957", "2ª ed.", "Fsillon"));
        b.add(new Book("William Faulkner", "Sartoris", "Schapire", "1953", "", "Fsillon"));
        b.add(new Book("Samuel Beckett", "Malone muere", "Sur", "1958", "", "Fsillon"));
        b.add(new Book("Aldous Huxley", "Los demonios de loudun", "Hermes", "1953", "", "Fsillon"));
        b.add(new Book("Bertolt Brecht", "Cuentos de almanaque", "Fabril", "1960", "", "Fsillon"));
        b.add(new Book("Stefan Zweig", "Obras completas Novelas I", "Juventud", "1955", "", "Fsillon"));
        b.add(new Book("Stefan Zweig", "Obras completas Biografías II", "Juventud", "1952", "", "Fsillon"));
        b.add(new Book("Stefan Zweig", "Obras completas Memorias y ensayos IV", "Juventud", "1953", "", "Fsillon"));
        b.add(new Book("Louis de Raymaeker", "Filosofía del ser Nº 3", "Gredos", "1956", "2ª ed. Revis.", "Fsillon"));
        b.add(new Book("Louis de Raymaeker", "Introducción a la folosofía Nº 4", "Gredos", "1969", "2ª ed. Ampl.",
                "Fsillon"));
        b.add(new Book("Jesús Antonio Collado", "Kierkegard y Unamuno Nº 34", "Gredos", "1962", "", "Fsillon"));
        b.add(new Book("Alberto Caturelli", "La filosofía Nº 49", "Gredos", "1966", "", "Fsillon"));
        b.add(new Book("I. M. Bochenski", "Historia de la lógica formal Nº 55", "Gredos", "1967", "", "Fsillon"));
        b.add(new Book("José Vives, S. I.", "Génesis y evolución de la ética platónica Nº 64", "Gredos", "1970", "",
                "Fsillon"));
        b.add(new Book("Leo Gabriel", "Lógica integral Nº 70", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("Josepf de Finance", "Conocimiento del ser Nº 72", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("Arnol Hauser", "Conversaciones con Lukács", "Guadarrama", "1979", "", "Fsillon"));
        b.add(new Book("Rene Le Senne", "Tratado de moral general Nº 78", "Gredos", "1973", "", "Fsillon"));
        b.add(new Book("Guillermo Fraile, O. P.", "Historia de la filosofía I Grecia y Roma nº 160", "B. A. C.",
                "1965", "2ª ed.", "Fsillon"));
        b.add(new Book("Alfonso López Quintás", "Pensadores cristianos contemporáneos I Nº 274", "B. A. C.", "1968",
                "", "Fsillon"));
        b.add(new Book("Progreso", "Historia de la Filosofía T. I y II", "Progreso", "1978", "", "Fsillon"));
        b.add(new Book("Morris Bishop", "Pascal", "Hermes", "", "", "Fsillon"));
        b.add(new Book("J. Huizinga", "En los albores de la paz", "Nuestro Tiempo", "1946", "", "Fsillon"));
        b.add(new Book("Thomas Carlyle", "Sartor Resartus Nº 3", "Emecé", "1945", "", "Fsillon"));
        b.add(new Book("William James", "Pragmatismo Nº 4", "Emecé", "1945", "", "Fsillon"));
        b.add(new Book("Menéndez Pelayo", "Ensayos de crítica filosófica Nº 32", "Emecé", "1946", "", "Fsillon"));
        b.add(new Book("Daniel Halévy", "La vida de Federico Nietzsche nª 41", "Emecé", "1946", "2ª ed.", "Fsillon"));
        b.add(new Book("Friedrich Hölderlin", "Hiperión o el eremita en Grecia Nº 47", "Emecé", "1946", "", "Fsillon"));
        b.add(new Book("Igor Strawinsky", "Poética musical Nº 59", "Emecé", "1946", "", "Fsillon"));
        b.add(new Book("William James", "Compendio de psicología", "Emecé", "1947", "", "Fsillon"));
        b.add(new Book("Werner Jaeger", "Paideia I, II y III", "F.C.E.", "1946", "2ª ed.", "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. I y II", "R. Occidente", "1966", "7ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. III y IV", "R. Occidente", "1966", "6ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. V", "R. Occidente", "1970", "7ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. VI", "R. Occidente", "1964", "6ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. VII", "R. Occidente", "1969", "3ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. VIII", "R. Occidente", "1970", "3ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. IX", "R. Occidente", "1971", "3ª ed. C. Dor.",
                "Fsillon"));
        b.add(new Book("José Ortega y Gasset", "Obras completas T. X y XI", "R. Occidente", "1969", "C. Dor.",
                "Fsillon"));
        b.add(new Book("Oswald Spengler", "La decadencia de Occidente V. I y II", "Espasa Calpe", "1950", "", "Fsillon"));
        b.add(new Book("Conde Herman Keyserling", "Renacimiento", "Espasa Calpe", "1930", "", "Fsillon"));
        b.add(new Book("Charlotte Bühler", "El curso de la vida humana como problema psicológico", "Espasa Calpe",
                "1943", "", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Meditaciones y ens. espirituales T. VII", "Scelicer",
                "1967", "C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Autobiografía y recuerdos pers. T.VIII", "Scelicer",
                "1966", "C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Discursos y artículos T. IX", "Scelicer", "1971",
                "C. Dorado", "Fsillon"));
        b.add(new Book("Leopoldo Alas Clarín", "Obras selectas", "Biblio. Nueva", "1947", "C. Dor.", "Fsillon"));
        b.add(new Book("Segismud Freud", "Obras completas T. I y II", "Biblio. Nueva", "1948", "", "Fsillon"));
        b.add(new Book("Segismud Freud", "Obras completas T. III", "Biblio. Nueva", "1968", "", "Fsillon"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. II", "Sudamericana", "1965", "5ª ed.",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "El asalto a la razón", "F. C. E.", "1959", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. I El origen de la tragedia", "M. Aguilar", "1947", "",
                "Fsillon"));
        b.add(new Book("N. Abbagmano y A. Visalberghi", "Historia de la pedagogía", "F. C. E.", "1964", "", "Fsillon"));
        b.add(new Book("Gore Vidal", "Creación", "Edhasa", "1982", "", "Fsillon"));
        b.add(new Book("Gore Vidal", "Juliano el Apóstata", "Edhasa", "1983", "1ª reimp.", "Fsillon"));
        b.add(new Book("Gilles Deleuze y F. Guattari", "El antiedipo", "Barral", "1973", "", "Fsillon"));
        b.add(new Book("Gilles Deleuze y F. Guattari", "Mil mesetas (capitalismo y esquizofrenia)", "Pre-textos",
                "1988", "", "Fsillon"));
        b.add(new Book("Giuseppe Ricciotti", "Vida de Jesucristo", "Luis Miracle", "1979", "", "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 1: La percepción y la gloria", "Encuentro", "1985", "",
                "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 2: Estilos eclesiásticos", "Encuentro", "1986", "", "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 3: Estilos laicales", "Encuentro", "1986", "", "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 4: Metafísica. Edad antigua", "Encuentro", "1986", "",
                "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 5: Matafísica. Edad moderna", "Encuentro", "1988", "",
                "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 6: Antiguo Testamento", "Encuentro", "1988", "", "Fsillon"));
        b.add(new Book("Hans Urs Von Balthasar", "Gloria 7: Nuevo Testamento", "Encuentro", "1989", "", "Fsillon"));
        b.add(new Book("A. Díez Macho", "Apócrifos del A. Testamento II", "Cristiandad", "1982", "", "Fsillon"));
        b.add(new Book("A. Díez Macho", "Apócrifos del A. Testamento III", "Cristiandad", "1982", "", "Fsillon"));
        b.add(new Book("A. Díez Macho", "Apócrifos del A. Testamento IV", "Cristiandad", "1984", "", "Fsillon"));
        b.add(new Book("A. Díez Macho", "Apócrifos del A. Testamento V", "Cristiandad", "1987", "", "Fsillon"));
        b.add(new Book("H. Vorgrimler y R. V. Gucht", "La teología en el s. XX/I El entorno cultural", "BAC", "1973",
                "", "Fsillon"));
        b.add(new Book("H. Vorgrimler y R. V. Gucht", "La teología en el s. XX/II y III Tª gral. y discus. Teológicas",
                "BAC", "1973", "", "Fsillon"));
        b.add(new Book("Herman Wouk", "Este es mi Dios", "Plaza Janés", "1963", "", "Fsillon"));
        b.add(new Book("Marcello Craveri", "Vida de Jesús", "B. Gandesa", "1966", "", "Fsillon"));
        b.add(new Book("Jacques Le Goff", "La civilización del occidente medieval", "Juventud", "1969", "", "Fsillon"));
        b.add(new Book("Emmanuel Mounier", "Tratado del carácter", "A. Zamora", "1955", "", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. I", "Emecé", "1951", "", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. III", "Emecé", "1953", "", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. IV  Parte 1ª y 2ª", "Emecé", "1955", "",
                "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. VI Parte 1ª y 2ª", "Emecé", "1959", "",
                "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. VIII", "Emecé", "1960", "", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "La civilización helénica", "Emecé", "1960", "", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "El historiador y la religión", "Emecé", "1958", "", "Fsillon"));
        b.add(new Book("Theodor Gomperz", "Pensadores griegos T. I", "Guarania", "1951", "", "Fsillon"));
        b.add(new Book("Prólogo de R. Cansinos Assens", "Las mil y una noche T II", "Aguilar", "1955", "Piel",
                "Fsillon"));
        b.add(new Book("Theodor Gomperz", "Pensadores griegos T. II", "Guarania", "1952", "", "Fsillon"));
        b.add(new Book("Theodor Gomperz", "Pensadores griegos T. III", "Guarania", "1952", "", "Fsillon"));
        b.add(new Book("C. M. Bowra", "Hª de la literatura griega nº 1", "F. C. E.", "1953", "3ª ed.", "Fsillon"));
        b.add(new Book("Karl Mannheim", "Diagnóstico de nuestro tiempo nº 9", "F. C. E.", "1959", "3ª ed.", "Fsillon"));
        b.add(new Book("Jean Rostand", "El hombre y la vida nº 14", "F. C. E.", "1960", "", "Fsillon"));
        b.add(new Book("", "", "", "", "", "Fsillon"));
        b.add(new Book("Georges Lichtheim", "Lukács 1", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Benedetto Croce", "La historia como azaña de la libertad nº 18", "F. C. E.", "1960", "2ª ed.",
                "Fsillon"));
        b.add(new Book("Rabindranaz Tagore", "Obra escogida", "Aguilar", "1960", "4ª ed.", "Fsillon"));
        b.add(new Book("James Joyce", "Ulises", "S. Rueda", "1952", "2ª ed. rev.", "Fsillon"));
        b.add(new Book("Manuel Gonzalo Casas", "Introducción a la filosofía Nº 27", "Gredos", "1967", "3ª ed.",
                "Fsillon"));
        b.add(new Book("Geoffrey Chaucer", "Cuentos de Canterbury", "Bruguera", "1971", "C. Dorado", "Fsillon"));
        b.add(new Book("Moliere", "Obras completas", "Aguilar", "1945", "FCE  BOLSILLO", "Fsillon"));
        b.add(new Book("Ramón del Valle Inclán", "Obras completas T. I y II Ej. Nº 870", "Plenitud", "1954",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,3ª ed. C. Dor.", "Fsillon"));
        b.add(new Book("Mario Méndez Bejarano", "Hª de la Filosofía en España hasta el siglo XX", "Renacimiento", "",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("André Gide", "Obras escogidas", "Aguilar", "1967",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2ª ed Num. 1811", "Fsillon"));
        b.add(new Book("Albert Camus", "Narraciones y teatro", "Aguilar", "1979",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,7ª ed.", "Fsillon"));
        b.add(new Book("Albert Camus", "Obras completas T II", "Aguilar", "1968",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,3ª ed", "Fsillon"));
        b.add(new Book("Aristóteles", "Obras", "Aguilar", "1982", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,1ª ed.",
                "Fsillon"));
        b.add(new Book("Stefan Zweig", "Obras completas Biografías ** III", "Juventud", "1953",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Georg Lukács", "Estética 1", "Grijalbo", "1966", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO",
                "Fsillon"));
        b.add(new Book("Bertrand Russell", "Historia de la filosofía T I y II  (2 ejemplares)", "Aguilar", "1973",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,Piel", "Fsillon"));
        b.add(new Book("Henry Miller", "Big Sur y las naranjas de Hieronymus Bosch", "Losada", "1960",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Alfred North Whitehead", "El concepto de la naturaleza Nº 56", "Gredos", "1968",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,Intonso", "Fsillon"));
        b.add(new Book("Roger Verneaux", "Lecciones sobre el ateísmo moderno Nº 66", "Gredos", "1971",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2 ejemplares", "Fsillon"));
        b.add(new Book("Wilhelm Windelband", "Hª de la Filosofía La Fª de los griegos y helenística  I y II",
                "Robredo", "1948", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2ª ed.", "Fsillon"));
        b.add(new Book("Ch. Guignebert", "El cristianismo antiguo nº 114", "F. C. E.", "1656",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2 ejemplares", "Fsillon"));
        b.add(new Book("Wilhelm Windelband", "Hª de la filosofía La Fª  de la E. M. y del Renacimiento III y IV",
                "Robredo", "1946", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2ª ed.", "Fsillon"));
        b.add(new Book("Wilhelm Windelband", "Hª de la Fª  El idealismo alemán y la Fª del iluminismo V y VI",
                "Robredo", "1946", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2ª ed.", "Fsillon"));
        b.add(new Book("Ch. Guignebert", "El cristianismo medieval y moderno nº 126", "F. C. E.", "1957",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,2 ejemplares", "Fsillon"));
        b.add(new Book("Burckhardt", "Historia de la cultura griega I y II", "O. Maestras", "1953",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Osvald Spengler", "La decadencia de Occidente V. III y IV", "Espasa Calpe", "1949",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Pitirim A. Sorokin", "Dinámica social y cultural T- I y II", "Inst. Est. Políticos", "1952",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Platón", "Obras completas T. I, II, III y IV", "Anaconda", "1946",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. II", "Emecé", "1953",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. V", "Emecé", "1957",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia T. X", "Emecé", "1962",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T II", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T III", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T IV", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T V", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T VI", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T VII", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T VIII", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T IX", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XV", "Lorenzana", "1964",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XVII", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XIX", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XXI", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XXIV", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XXIX", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Honorato de Balzac", "La comedia humana   T XXX", "Lorenzana", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. II Novelas", "Afr. Aguado", "1951",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. III Ensayos", "Afr. Aguado", "1950",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. IV Ensayos", "Afr. Aguado", "1950",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. V De esto y aquello I", "Afr. Aguado", "1951",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. VI La raza y la lengua", "Afr. Aguado", "1958",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. VII Prólogos, conf., discursos", "Afr. Aguado",
                "1959", "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. VIII Letras de América y ...", "Afr. Aguado", "1961",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. IX Novela II y monodiálogos", "Afr. Aguado", "1961",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. XI Medit. y otros escritos", "Afr. Aguado", "1962",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. XII Teatro", "Afr. Aguado", "1962",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. XIII Poesía I", "Afr. Aguado", "1962",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. XV Poesía III", "Afr. Aguado", "1963",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras Completas Paisajes y ensayos T. I", "Scelicer", "1966",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Novelas T. II", "Scelicer", "1967",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Nuevos ensayos T. III", "Scelicer", "1968",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas La raza y la lengua T. IV", "Scelicer", "1968",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Teatro completo T. V", "Scelicer", "1968",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas Poesía T. VI", "Scelicer", "1969",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO,C. Dorado", "Fsillon"));
        b.add(new Book("Bartolomé Carranza", "Comentarios sobre el catecismo cristiano I y II", "BAC", "1972",
                "MAESTROS DEL PENSAMIENTO CONTEMPORÁNEO", "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. I Paisaje", "Afr. Aguado", "1951",
                "BREVIARIOS DEL F. C. E.zq,C. Dorado", "Fsillon"));
        b.add(new Book("JohannesB. Bauer", "Diccionaro de Teología bíblica", "Herder", "1972",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("X. Léon-Dufour", "Vocabulario de teología bíblica", "Herder", "1978",
                "BREVIARIOS DEL F. C. E.zq;10ª ed.", "Fsillon"));
        b.add(new Book("Georg Lukács", "Estética 3 y 4", "Grijalbo", "1967", "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Obras completas T. VI", "Grijalbo", "1968", "BREVIARIOS DEL F. C. E.zq",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "Obras completas T. XI", "Grijalbo", "1970", "BREVIARIOS DEL F. C. E.zq",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "Obras completas T. XII", "Grijalbo", "1969", "BREVIARIOS DEL F. C. E.zq",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "Obras completas T. XIX", "Grijalbo", "1969", "BREVIARIOS DEL F. C. E.zq",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "Aportaciones a la historia de la estética", "Grijalbo", "1966",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Prolegómenos a una estética marxista", "Grijalbo", "1965",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "El joven Hegel", "Grijalbo", "1963", "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Ensayos sobre el realismo", "Siglo veinte", "1965",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Significación actual del realismo crítico", "ERA", "1963",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("TOMOS I a XII", "DICCIONARIO ENCICLOPÉDICO SALVAT", "Salvat", "1955",
                "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Estética 2", "Grijalbo", "1966", "BREVIARIOS DEL F. C. E.zq", "Fsillon"));
        b.add(new Book("Georg Lukács", "Obras completas T. I", "Grijalbo", "1975", "BREVIARIOS DEL F. C. E.zq",
                "Fsillon"));
        b.add(new Book("Miguel de Unamuno", "Obras completas  T. XVI Ensayos espir.  y otros esc.", "Afr. Aguado",
                "1964", "C. Dorado", "Fsillon"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía", "Sudamericana", "1951", "3ª ed.", "Fsillon"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía T. I", "Sudamericana", "1965", "5ª ed.",
                "Fsillon"));
        b.add(new Book("José Ferrater Mora", "Diccionario de Filosofía", "Atlante", "1944", "2ª ed.", "Fsillon"));
        b.add(new Book("Gÿorgy Lukács", "Diario 1910-1911 y otros inéditos de juventud", "Península", "1985", "",
                "Fsillon"));
        b.add(new Book("Georg Lukács", "Problemas del realismo", "F. C. E.", "1966", "", "Fsillon"));
        b.add(new Book("Francisco Delicado", "La lozana andaluza", "Lorenzana", "1965", "", "Fsillon"));
        b.add(new Book("Oscar Wilde", "Obras completas", "Aguilar", "1961", "Piel", "Fsillon"));
        b.add(new Book("Charles Baudelaire", "Obras", "Aguilar", "1961", "Piel", "Fsillon"));
        b.add(new Book("Lucio Anneo Séneca", "Obras completas", "Aguilar", "1949", "2ª ed. Piel", "Fsillon"));
        b.add(new Book("F. de Quevedo Villegas", "Obras completas Prosa", "Aguilar", "1941", "2ª ed. Piel", "Fsillon"));
        b.add(new Book("J. W. Goethe", "Obras literarias T. I", "Aguilar", "1944", "Piel", "Fsillon"));
        b.add(new Book("J. W. Goethe", "Obras literarias T. II", "Aguilar", "1945", "Piel", "Fsillon"));
        b.add(new Book("William Shakespeare", "Obras completas", "Aguilar", "1951", "Piel", "Fsillon"));
        b.add(new Book("Erasmo", "Obras escogidas", "Aguilar", "1964", "", "Fsillon"));
        b.add(new Book("Fiodor M. Dostoyerski", "Obras completas T. I", "Aguilar", "1946", "3ª ed.", "Fsillon"));
        b.add(new Book("Fiodor M. Dostoyerski", "Obras completas T. II", "Aguilar", "1945", "", "Fsillon"));
        b.add(new Book("Ramón Pérez de Ayala", "Obras completas T. I", "Aguilar", "1964", "", "Fsillon"));
        b.add(new Book("Anatole France", "Novelas completas y otros escritos  T I, II y III", "Aguilar", "1967", "",
                "Fsillon"));
        b.add(new Book("Luigi Pirandello", "Obras escogidas T I", "Aguilar", "1955", "", "Fsillon"));
        b.add(new Book("Luigi Pirandello", "Obras escogidas T II", "Aguilar", "1971", "1ª reimpr.", "Fsillon"));
        b.add(new Book("Martin du Gard", "Obras completas T I y II", "Aguilar", "1959", "", "Fsillon"));
        b.add(new Book("Wladislaw Reymont", "Los campesinos", "Aguilar", "1955", "", "Fsillon"));
        b.add(new Book("Bernard Shaw", "Comedias escogidas", "Aguilar", "1960", "", "Fsillon"));
        b.add(new Book("Knut Hamsun", "Obras escogidas", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("Carl Spitteler", "Obras escogidas", "Aguilar", "1959", "2ª ed.", "Fsillon"));
        b.add(new Book("Henri Bergsón", "Obras escogidas", "Aguilar", "1963", "", "Fsillon"));
        b.add(new Book("R. C. Eucken", "Obras escogidas", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("Paul Heyse", "Novelas escogidas", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("Selma Lagerlöf", "Novelas escogidas", "Aguilar", "1956", "", "Fsillon"));
        b.add(new Book("Henryk  Pontoppidan", "Obras escogidas", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("Frans  Eemil Sillanpää", "Novelas escogidas", "Aguilar", "1956", "", "Fsillon"));
        b.add(new Book("Herman Hesse", "Obras escogidas T I", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("William Faulkner", "Obras escogidas T II", "Aguilar", "1960", "", "Fsillon"));
        b.add(new Book("Halldor K. Laxness", "Novelas escogidas", "Aguilar", "1959", "", "Fsillon"));
        b.add(new Book("François Mauriac", "Novelas escogidas", "Aguilar", "1957", "", "Fsillon"));
        b.add(new Book("Plutarco", "Biógrafos griegos", "Aguilar", "1973", "1ª reimp.", "Fsillon"));
        b.add(new Book("Platón", "Obras completas", "Aguilar", "1979", "4ª reimp.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "Obras completas T III Filosofía", "Aguilar", "1982", "", "Fsillon"));
        b.add(new Book("Aldous Huxley", "Novelas II", "Planeta", "1958", "Piel C. Dor.", "Fsillon"));
        b.add(new Book("Nikos Kazantzaki", "Obras selectas I", "Planeta", "1960", "Piel C. Dor.", "Fsillon"));
        b.add(new Book("Nikos Kazantzaki", "Obras selectas II", "Planeta", "1962", "Piel C. Dor.", "Fsillon"));
        b.add(new Book("Nikos Kazantzaki", "Obras selectas III", "Planeta", "1968", "Piel C. Dor.", "Fsillon"));
        b.add(new Book("Nikos Kazantzaki", "Obras selectas IV", "Planeta", "1975", "Piel C. Dor.", "Fsillon"));
        b.add(new Book("Jacobo Casanova", "Memorias T I y II", "Cía Gral. Edic", "1957", "", "Fsillon"));
        b.add(new Book("Voltaire", "Obras selectas", "El Ateneo", "1958", "2ª ed.", "Fsillon"));
        b.add(new Book("Rabelais", "Gargantúa y Pantagruel", "El Ateneo", "1956", "", "Fsillon"));
        b.add(new Book("Lord Byron", "Obras escogidas", "El Ateneo", "1951", "", "Fsillon"));
        b.add(new Book("Montaigne", "Ensayos selectos", "El Ateneo", "1959", "2ª ed.", "Fsillon"));
        b.add(new Book("Gustave Flaubert", "Novelas completas", "El Ateneo", "1954", "", "Fsillon"));
        b.add(new Book("Emmanuel Kant", "Crítica de la razón pura y prolegómenos a ...", "El Ateneo", "1950", "",
                "Fsillon"));
        b.add(new Book("Stendhal", "Obras selectas", "El Ateneo", "1952", "", "Fsillon"));
        b.add(new Book("Rene Le Senne", "Introducción a la filosofía", "El Ateneo", "1954", "", "Fsillon"));
        b.add(new Book("James Joyce", "Retrato del artista adolescente", "S. Rueda", "1956", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche", "Mi hermana y yo", "S. Rueda", "1955", "", "Fsillon"));
        b.add(new Book("Sören Kierkegaard", "El amor y la religión", "S. Rueda", "1960", "", "Fsillon"));
        b.add(new Book("Sören Kierkegaard", "Diario de un seductor", "S. Rueda", "1955", "", "Fsillon"));
        b.add(new Book("Sören Kierkegaard", "Etapas en el camino de la vida", "S. Rueda", "1952", "", "Fsillon"));
        b.add(new Book("Sören Kierkegaard", "Diario íntimo", "S. Rueda", "1955", "", "Fsillon"));
        b.add(new Book("Rabindranath Tagore", "El alma y el mundo", "S. Rueda", "1952", "", "Fsillon"));
        b.add(new Book("Andrea Majocchi", "La vida de un cirujano", "S. Rueda", "1953", "", "Fsillon"));
        b.add(new Book("D. H. Lawrence", "El arco iris", "S. Rueda", "1950", "", "Fsillon"));
        b.add(new Book("Upton Sinclair", "Peregrinación de amor", "S. Rueda", "1955", "", "Fsillon"));
        b.add(new Book("Marcel Proust", "La vida de Jean Santeuil", "S. Rueda", "1954", "", "Fsillon"));
        b.add(new Book("Henry Miller", "Noches  de amor y alegría", "S. Rueda", "1959", "", "Fsillon"));
        b.add(new Book("Henry Miller", "Trópico de Cáncer", "S. Rueda", "1959", "", "Fsillon"));
        b.add(new Book("Henry Miller", "Trópico de Capricornio", "S. Rueda", "1960", "", "Fsillon"));
        b.add(new Book("Henry Miller", "Primavera negra", "S. Rueda", "1964", "", "Fsillon"));
        b.add(new Book("André Gide", "Si la semilla no muere", "Losada", "1956", "", "Fsillon"));
        b.add(new Book("Franz Kafka", "El proceso", "Losada", "1953", "", "Fsillon"));
        b.add(new Book("Albert Camus", "El exilio y el reino", "Losada", "1957", "", "Fsillon"));
        b.add(new Book("William Faulkner", "Estos trece", "Losada", "1956", "", "Fsillon"));
        b.add(new Book("William Faulkner", "Intruso en el polvo", "Losada", "1951", "", "Fsillon"));
        b.add(new Book("Alberto Moravia", "El amor conyugal", "Losada", "1959", "3ª ed.", "Fsillon"));
        b.add(new Book("Christiane Rochefort", "Celine y el matrimonio", "Losada", "1964", "", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "La náusea", "Losada", "1953", "4ª ed.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "La muerte en el alma III", "Losada", "1954", "2ª ed.", "Fsillon"));
        b.add(new Book("Lin Yutang", "La viuda, la monja, la cortesana", "Hermes", "1958", "5ª ed.", "Fsillon"));
        b.add(new Book("Wilheim Capelle", "Hª de la filosofía griega Nº 11", "Gredos", "1972", "", "Fsillon"));
        b.add(new Book("Etienne Gilson", "La filosofía en la E. Media Nº 12", "Gredos", "1965", "2ª ed.", "Fsillon"));
        b.add(new Book("Fernando Montero Moliner", "Parménides Nº 25", "Gredos", "1960", "", "Fsillon"));
        b.add(new Book("Claude Tresmontant", "Estudios de metafísica bíblica Nº 28", "Gredos", "1961", "", "Fsillon"));
        b.add(new Book("Raimundo Paniker", "Ontonomía de la ciencia Nº 29", "Gredos", "1961", "", "Fsillon"));
        b.add(new Book("Angel González Alvarez", "Tratado de metafísica Ontología  Nº 30", "Gredos", "1961", "",
                "Fsillon"));
        b.add(new Book("Joseph Bernhart", "De profundis Nº 32", "Gredos", "1962", "", "Fsillon"));
        b.add(new Book("Leopoldo Eulogio Palacios", "Filosofía del saber Nº 33", "Gredos", "1962", "", "Fsillon"));
        b.add(new Book("Angel Amor Ruibal", "Cuatro manuscritos inéditos Nº 39", "Gredos", "1964", "", "Fsillon"));
        b.add(new Book("Hermann Noack", "La filosofía europea occidental Nº 46", "Gredos", "1966", "", "Fsillon"));
        b.add(new Book("K. H. Volkmann-Schluck", "Introducción al pensamiento filosófico Nº 50", "Gredos", "1967", "",
                "Fsillon"));
        b.add(new Book("Karl Jaspers", "Psicología de las concepciones del mundo Nº 51", "Gredos", "1967", "",
                "Fsillon"));
        b.add(new Book("Heinrich Beck", "El dios de los sabios y los pensadores Nº 52", "Gredos", "1968", "", "Fsillon"));
        b.add(new Book("Juan Zaragüeta", "Curso de Filosofía I Lógica Nº 53", "Gredos", "1968", "", "Fsillon"));
        b.add(new Book("Juan Zaragüeta", "Curso de Filosofía II Cosmología y antropología Nº 53", "Gredos", "1968", "",
                "Fsillon"));
        b.add(new Book("Juan Zaragüeta", "Curso de Filosofía III Ontología y ética Nº 53", "Gredos", "1968", "",
                "Fsillon"));
        b.add(new Book("Karl Jaspers", "La fe filosófica ante la revelación Nº 54", "Gredos", "1968", "", "Fsillon"));
        b.add(new Book("J. N. Findlay", "La disciplina de la caverna Nº 57", "Gredos", "1969", "", "Fsillon"));
        b.add(new Book("J. N. Findlay", "La transcencendencia de la caverna Nº 58", "Gredos", "1969", "", "Fsillon"));
        b.add(new Book("René Scherer", "La fenomenología de las \"I.L.\" de Husserl Nº 59", "Gredos", "1969", "",
                "Fsillon"));
        b.add(new Book("Teodoro de Andrés S. I.", "El nominalismo de G. de Ochkham Nº 60", "Gredos", "1969", "",
                "Fsillon"));
        b.add(new Book("Sergio Rábade Romeo", "Kant Problemas gnoseológicos Nº 61", "Gredos", "1969", "", "Fsillon"));
        b.add(new Book("G. S. Kirk y J. E. Raven", "Los filósofos presocráticos Nº 63", "Gredos", "1969", "", "Fsillon"));
        b.add(new Book("Olof Gigon", "Los orígenes de la F. Griega Nº 67", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("Arturo García Estrada", "Tiempo y eternidad Nº 68", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("H.-J. Barrand", "Ciencia y filosofía Nº 69", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("Jacques Merleau-Ponty", "Cosmología del siglo XX Nº 71", "Gredos", "1971", "", "Fsillon"));
        b.add(new Book("Jorge L- García Venturin", "Filosofía de la historia Nº 73", "Gredos", "1972", "", "Fsillon"));
        b.add(new Book("Eleuterio Elorduy, S. I.", "El estoicismo I y II Nº 75", "Gredos", "1972", "", "Fsillon"));
        b.add(new Book("Gerardo Remolina Vargas, S.I.", "K. Jaspers en el diálogo de la fe Nº 76", "Gredos", "1972",
                "", "Fsillon"));
        b.add(new Book("Karl Jaspers", "Conferencias y ensayos sobre Hª de la Fil. Nº 77", "Gredos", "1972", "",
                "Fsillon"));
        b.add(new Book("Miguel F. Sciacca", "El oscurecimiento de la inteligencia Nº 79", "Gredos", "1973", "",
                "Fsillon"));
        b.add(new Book("G. M. A. Grube", "El pensamiento de Platón Nº 80", "Gredos", "1973", "", "Fsillon"));
        b.add(new Book("Guillermo A. Nicolás", "El hombre un ser en vías de realización Nº 81", "Gredos", "1974", "",
                "Fsillon"));
        b.add(new Book("Fernando Goñi Arregui", "La cara oculta del mundo físico Nº 82", "Gredos", "1974", "",
                "Fsillon"));
        b.add(new Book("Etienne Gilson", "Lingüística y filosofía Nº 83", "Gredos", "1974", "", "Fsillon"));
        b.add(new Book("F. Javier Herrero, S. I.", "Religión e historia en Kant Nº 84", "Gredos", "1975", "", "Fsillon"));
        b.add(new Book("Eutimio Martino", "Aristóteles. El alma y la comparación Nº 85", "Gredos", "1975", "",
                "Fsillon"));
        b.add(new Book("Sergio Rábade Romeo", "Hume y el fenomenismo moderno Nº 86", "Gredos", "1975", "", "Fsillon"));
        b.add(new Book("C. Díaz y M. Maceiras", "Introducción al personalismo actual Nº 87", "Gredos", "1975", "",
                "Fsillon"));
        b.add(new Book("Alberto Wagner de Reyna", "Analogía y evocación Nº 88", "Gredos", "1976", "", "Fsillon"));
        b.add(new Book("Alfonso López Quintás", "Cinco grandes tareas de la Fª actual Nº 89", "Gredos", "1977", "",
                "Fsillon"));
        b.add(new Book("Fernando Martín Balzas", "La teología de S. del Río y del K. Español Nº 90", "Gredos", "1977",
                "", "Fsillon"));
        b.add(new Book("Ernesto Grassi", "Humanismo y marxismo Nº 91", "Gredos", "1977", "", "Fsillon"));
        b.add(new Book("Guillermo Fraile, O. P.", "Historia de la filosofía III Humanismo Nº 259", "B. A. C.", "1966",
                "", "Fsillon"));
        b.add(new Book("Guillermo Fraile, O. P.", "Historia de la folisofía española Nº 327", "B. A. C.", "1971", "",
                "Fsillon"));
        b.add(new Book("Guillermo Fraile, O. P.", "Historia de la filosofía española Nº 330", "B. A. C.", "1972", "",
                "Fsillon"));
        b.add(new Book("Teófilo Urdanoz, O. P.", "Historia de la Filosofía IV Nº 371", "B. A. C.", "1975", "",
                "Fsillon"));
        b.add(new Book("Teófilo Urdanoz, O. P.", "Historia de la Filosofía V Nº 375", "B. A. C.", "1975", "", "Fsillon"));
        b.add(new Book("Alfonso López Quintás", "Filosofía española comtemporánea Nº 298", "B. A. C.", "1970", "",
                "Fsillon"));
        b.add(new Book("Leo Gabriel", "Filosofía de la existencia Nº 352", "B. A. C.", "1973", "", "Fsillon"));
        b.add(new Book("Carl F. Von Weizsäcker", "La imagen física del mundo Nº 366", "B. A. C.", "1974", "", "Fsillon"));
        b.add(new Book("José Mª de Alejandro S. I.", "Gnoseología Nº 290", "B. A. C.", "1969", "", "Fsillon"));
        b.add(new Book("Marcelino Menéndez y  Pelayo", "Historia de los heterodoxos españoles I", "B. A. C.", "1978",
                "", "Fsillon"));
        b.add(new Book("Marcelino Menéndez y  Pelayo", "Historia de los heterodoxos españoles II", "B. A. C.", "1978",
                "", "Fsillon"));
        b.add(new Book("Progreso", "Fundamentos de filosofía Parte I y II", "Progreso", "1977", "", "Fsillon"));
        b.add(new Book("Burckhardt", "Historia de la cultura griega III, IV y V", "O. Maestras", "1954", "", "Fsillon"));
        b.add(new Book("Burckhardt", "La cultura del renacimiento en Italia", "O. Maestras", "1946", "", "Fsillon"));
        b.add(new Book("Condesa D'Aulnoy", "Viaje por España y cuentos feericos  I y II", "O. Maestras", "1962", "",
                "Fsillon"));
        b.add(new Book("John Ruskin", "Las piedras de Venecia y otros ensayos", "O. Maestras", "1961", "", "Fsillon"));
        b.add(new Book("Platón", "Diálogos", "O. Maestras", "1947", "", "Fsillon"));
        b.add(new Book("Montaigne", "Ensayos completos", "O. Maestras", "1947", "", "Fsillon"));
        b.add(new Book("Apuleyo", "La metamorfósis o el asno de oro", "O. Maestras", "1946", "", "Fsillon"));
        b.add(new Book("Píndaro", "Himnos triunfales", "O. Maestras", "1946", "", "Fsillon"));
        b.add(new Book("Walter Pater", "El renacimiento", "O. Maestras", "1945", "", "Fsillon"));
        b.add(new Book("Persio y Juvenal", "Sátiras completas", "O. Maestras", "1959", "", "Fsillon"));
        b.add(new Book("Chaucer", "Cuentos de Canterbury I y II", "O. Maestras", "1946", "", "Fsillon"));
        b.add(new Book("Wen Kang", "La amazona negra", "O. Maestras", "1958", "", "Fsillon"));
        b.add(new Book("Suetonio", "Los doce césares", "O. Maestras", "", "", "Fsillon"));
        b.add(new Book("Novelistas Chinos", "De los años 618 a 1715", "O. Maestras", "1954", "", "Fsillon"));
        b.add(new Book("Ovidio", "Arte de amar y las metamorfósis", "O. Maestras", "1955", "", "Fsillon"));
        b.add(new Book("Petrarca", "Los triunfos y otros escritos", "O. Maestras", "1961", "", "Fsillon"));
        b.add(new Book("Walter Pater", "Platón y el platonismo Nº 52", "Emecé", "1946", "", "Fsillon"));
        b.add(new Book("José Ferrater Mora", "Obras selectas T. I y II", "R. Occidente", "1967", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. II Consideraciones intespestivas", "M. Aguilar", "1949", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. III Humano, demasiado humano 1", "M. Aguilar", "1948", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. IV Humano, demasiado humano 2", "M. Aguilar", "1948", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. V Aurora", "M. Aguilar", "1948", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VI El eterno retorno", "M. Aguilar", "1949", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VII Así habló Zaratustra", "M. Aguilar", "1947", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. VIII Más allá del bien y del mal", "M. Aguilar", "1947", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. IX La voluntad de dominio", "M. Aguilar", "1947", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. X El ocaso de los ídolos", "M. Aguilar", "1949", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. XI Ecce homo", "M. Aguilar", "1950", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. XII Tratados filosóficos", "M. Aguilar", "1950", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. XIII Filosofía general", "M. Aguilar", "1950", "", "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. XIV La cultura de los griegos", "M. Aguilar", "1955", "",
                "Fsillon"));
        b.add(new Book("Federico Nietzsche O. Compl.", "T. XV Correspondencia", "M. Aguilar", "1951", "", "Fsillon"));
        b.add(new Book("Arturo Schopenhauer", "El mundo como voluntad y representación", "M. Aguilar", "1927", "",
                "Fsillon"));
        b.add(new Book("J. Mateos - J. Barreto", "El evangelio de Juan", "Cristiandad", "1979", "", "Fsillon"));
        b.add(new Book("Edward Schillebeeckx", "Cristo y los cristianos", "Cristiandad", "1982", "", "Fsillon"));
        b.add(new Book("Edward Schillebeeckx", "Jesús, la historia de un viviente", "Cristiandad", "1981", "",
                "Fsillon"));
        b.add(new Book("Raymond E. Brown", "El nacimiento del Mesías", "Cristiandad", "1982", "", "Fsillon"));
        b.add(new Book("A. Díez Macho", "Apócrifos del A. Testamento I", "Cristiandad", "1984", "", "Fsillon"));
        b.add(new Book("Aristóteles", "Obras completas T. I, II, III y IV", "Anaconda", "1947", "", "Fsillon"));
        b.add(new Book("Descartes", "Obras completas", "Anaconda", "1946", "", "Fsillon"));
        b.add(new Book("Martin Buber", "¿Qué es el hombre? nº10", "F. C. E.", "1970", "6ª reimp.", "Fsillon"));
        b.add(new Book("J. M. Bochenski", "La folisofía actual nº16", "F. C. E.", "1962", "4ª ed.", "Fsillon"));
        b.add(new Book("V. E. Frankl", "Psicoanálisis y existencialismo nº 27", "F. C. E.", "1957", "3ª ed.", "Fsillon"));
        b.add(new Book("Wing-Tsitchan y otros", "Filosofía de Oriente nº 28", "F. C. E.", "1954", "2ª ed.", "Fsillon"));
        b.add(new Book("Jean Wahl", "Introducción a la filosofía nº 34", "F. C. E.", "1950", "", "Fsillon"));
        b.add(new Book("E. Cassirer", "Las ciencias de la cultura nº 40", "F. C. E.", "1955", "2ª ed.", "Fsillon"));
        b.add(new Book("Johannes Pfeiffer", "La poesía nº 41", "F. C. E.", "1954", "1ª reimp.", "Fsillon"));
        b.add(new Book("Wilhelm Dilthey", "Historia de la Filosofía nº 50", "F. C. E.", "1951", "", "Fsillon"));
        b.add(new Book("Bertrand Russell", "Religión y ciencia nº 55", "F. C. E.", "1965", "3ª ed.", "Fsillon"));
        b.add(new Book("Albert Schweitzer", "El pensamiento de la India nº 63", "F. C. E.", "1952", "", "Fsillon"));
        b.add(new Book("Morris R. Cohen", "Introducción a la lógica nº 67", "F. C. E.", "1952", "", "Fsillon"));
        b.add(new Book("Henri Peyre", "Qué es el clasicismo nº 73", "F. C. E.", "1953", "", "Fsillon"));
        b.add(new Book("S. Serrano Poncela", "El pensamiento de Unamuno nº 76", "F. C. E.", "1953", "", "Fsillon"));
        b.add(new Book("Karl Jaspers", "La filosofía nº 77", "F. C. E.", "1953", "", "Fsillon"));
        b.add(new Book("Louis Lavelle", "Introducción a la ontología nº 85", "F. C. E.", "1953", "", "Fsillon"));
        b.add(new Book("W. K. C. Guthrie", "Los filósofos griegos nº 88", "F. C. E.", "1953", "", "Fsillon"));
        b.add(new Book("Varios Autores", "El pensamiento filosófico I y II nº 97 y 98", "F. C. E.", "1954", "",
                "Fsillon"));
        b.add(new Book("Aaron Copland", "Cómo escuchar la música nº 101", "F. C. E.", "1955", "", "Fsillon"));
        b.add(new Book("M. Zambrano", "El hombre y lo divino nº 103", "F. C. E.", "1955", "", "Fsillon"));
        b.add(new Book("L. Febvre", "Martin Lutero nº 113", "F. C. E.", "1956", "", "Fsillon"));
        b.add(new Book("Herbert Read", "Imagen e idea nº 127", "F. C. E.", "1957", "", "Fsillon"));
        b.add(new Book("L. Barnett", "El universo y el Dr. Einstein nº 132", "F. C. E.", "1957", "", "Fsillon"));
        b.add(new Book("Gaston Bachelard", "El aire y los sueños nº 139", "F. C. E.", "1958", "", "Fsillon"));
        b.add(new Book("James Collins", "El pensamiento de Kierkegaard nº 140", "F. C. E.", "1958", "", "Fsillon"));
        b.add(new Book("Harry Lerin", "James Joyce nº 144", "F. C. E.", "1959", "", "Fsillon"));
        b.add(new Book("Alfonso Reyes", "La folosofía helenística nº 153", "F. C. E.", "1959", "", "Fsillon"));
        b.add(new Book("M.I. Finley", "El mundo de Odiseo nº 158", "F. C. E.", "1961", "", "Fsillon"));
        b.add(new Book("A. E. Taylor", "El pensamiento de Sócrates nº 161", "F. C. E.", "1961", "", "Fsillon"));
        b.add(new Book("Israel I. Mattuck", "El pensamiento de los profetas nº 168", "F. C. E.", "1962", "", "Fsillon"));
        b.add(new Book("Gillo Dorfles", "El devenir de las artes nº 170", "F. C. E.", "1963", "", "Fsillon"));
        b.add(new Book("Claude Lévi-Strauss", "El pensamiento salvaje nº 173", "F. C. E.", "1970", "1ª reimp.",
                "Fsillon"));
        b.add(new Book("S. R. Y P. T. Raju", "El concepto el hombre nº 176", "F. C. E.", "1964", "", "Fsillon"));
        b.add(new Book("John Dewey", "Naturaleza humana y conducta nº 177", "F. C. E.", "1964", "", "Fsillon"));
        b.add(new Book("Raul N. Ondarza", "Introducción a la biología moderna nº 178", "F. C. E.", "1964", "",
                "Fsillon"));
        b.add(new Book("L. S. Stebbmg", "Introducción a la lógica moderna nº 180", "F. C. E.", "1965", "", "Fsillon"));
        b.add(new Book("E. Sourian", "La correspondencia de las artes nº 181", "F. C. E.", "1965", "", "Fsillon"));
        b.add(new Book("W. Jaeger", "Cristianismo y paideia griega nº 182", "F. C. E.", "1965", "", "Fsillon"));
        b.add(new Book("Gaston Bachelard", "La poética del espacio nº 183", "F. C. E.", "1965", "", "Fsillon"));
        b.add(new Book("C. Levi-Strauss", "El totemismo en la actualidad nº 185", "F. C. E.", "1965", "", "Fsillon"));
        b.add(new Book("Michel Foucault", "Hª de la locura en la época clásica nº 191", "F. C. E.", "1967", "",
                "Fsillon"));
        b.add(new Book("Michel Foucault", "Hª de la locura en la época clásica nº 191 I y II", "F. C. E.", "1976",
                "2ª ed.", "Fsillon"));
        b.add(new Book("V. Gordon Childe", "Los orígenes de la civilización nº 92", "F. C. E.", "1988", "19ª reimp.",
                "Fsillon"));
        b.add(new Book("Edmund Wilson", "Los rollos del mar muerto nº 124", "F. C. E.", "1973", "3ª reimp.", "Fsillon"));
        b.add(new Book("L. E. Halkin", "Erasmo nº 146 A", "F. C. E.", "1971", "", "Fsillon"));
        b.add(new Book("L. Robberechts", "El pensamiento de Husserl nº 198", "F. C. E.", "1968", "", "Fsillon"));
        b.add(new Book("Maurice Correz", "La filosofía de Heidegger nº 211", "F. C. E.", "1970", "", "Fsillon"));
        b.add(new Book("Jean-Michel Palmier", "Hegel nº 220", "F. C. E.", "1971", "", "Fsillon"));
        b.add(new Book("Erich Kahler", "Nuestro laberinto nº 222", "F. C. E.", "1972", "", "Fsillon"));
        b.add(new Book("W. Weischedel", "Los filósofos entre bambalinas nº 225", "F. C. E.", "1972", "", "Fsillon"));
        b.add(new Book("Henri Lefebvre", "Nietzsche nº 226", "F. C. E.", "1975", "1ª reimp.", "Fsillon"));
        b.add(new Book("P. Gardier", "Schopenhauer nº 244", "F. C. E.", "1975", "", "Fsillon"));
        b.add(new Book("A. Phillips Griffiths", "Conocimiento y creencia nº 245", "F. C. E.", "1974", "Rústica",
                "Fsillon"));
        b.add(new Book("C. W. K. Mundle", "Una crítica de la filosofía lingüística nº 249", "F. C. E.", "1975", "",
                "Fsillon"));
        b.add(new Book("Félix E. Opepenhein", "Etica y filosofía política nº 252", "F. C. E.", "1976", "", "Fsillon"));
        b.add(new Book("W. G. Runciman", "Crítica de la Fª de las c. s. de Max Weber nº 255", "F. C. E.", "1976", "",
                "Fsillon"));
        b.add(new Book("R. Frondizi", "Introducción a los prob. fund. del hombre nº 260", "F. C. E.", "1977",
                "Rústica", "Fsillon"));
        b.add(new Book("Edward Conze", "El budismo nº 275", "F. C. E.", "1978", "", "Fsillon"));
        b.add(new Book("Gaston Bachelard", "El agua y los sueños nº 279", "F. C. E.", "1978", "Rústica", "Fsillon"));
        b.add(new Book("Douglas R. Price-Williams", "Por los senderos de la psicología  intercultural nº 281",
                "F. C. E.", "1980", "", "Fsillon"));
        b.add(new Book("Isaiah Berlin", "Pensadores rusos nº 287", "F. C. E.", "1979", "", "Fsillon"));
        b.add(new Book("R. J. Zwi Werblowsky", "Más allá de la tradición y la modernidad nº 295", "F. C. E.", "1981",
                "", "Fsillon"));
        b.add(new Book("I. C. Tipton (ed.)", "Locke y el entendimiento humano nº 298", "F. C. E.", "1981", "",
                "Fsillon"));
        b.add(new Book("R. Gordon y otros", "El camino a Eleusis nº 305", "F. C. E.", "1980", "", "Fsillon"));
        b.add(new Book("Ivis Murdoch", "El fuego y el sol nº 320", "F. C. E.", "1982", "", "Fsillon"));
        b.add(new Book("Georges Steiner", "Heidegger nº 347", "F. C. E.", "1983", "", "Fsillon"));
        b.add(new Book("A. Rossi y otros", "José Ortega y Gasset nº 389", "F. C. E.", "1984", "", "Fsillon"));
        b.add(new Book("Peter Munz", "Cuando se quiebra la rama dorada nº 418", "F. C. E.", "1986", "", "Fsillon"));
        b.add(new Book("Jonathan Culler", "Barthes nº 428", "F. C. E.", "1987", "", "Fsillon"));
        b.add(new Book("Roland Barthes", "Michelet nº 433", "F. C. E.", "1988", "", "Fsillon"));
        b.add(new Book("Leo Bersani", "Baudelaire y Freud nº 434", "F. C. E.", "1988", "", "Fsillon"));
        b.add(new Book("Albert Beguin", "Gérad de Nerval nº 443", "F. C. E.", "1987", "", "Fsillon"));
        b.add(new Book("Fung Yu-Lan", "Breve historia de la filosofía china nº 446", "F. C. E.", "1987", "", "Fsillon"));
        b.add(new Book("Geneeve Allard y P. Lefort", "La máscara nº 447", "F. C. E.", "1988", "", "Fsillon"));
        b.add(new Book("Alejandro Bausani", "El Islám y su cultura nº448", "F. C. E.", "1988", "", "Fsillon"));
        b.add(new Book("John A. Phillips", "Eva La historia de una idea nº451", "F. C. E.", "1988", "", "Fsillon"));
        b.add(new Book("Janheinz Jahn", "Muntu: las culturas neoafricanas nº44", "F. C. E.", "1963", "", "Fsillon"));
        b.add(new Book("Thorstein Veblen", "Teoría de la clase ociosa nº 50", "F. C. E.", "1963", "3ª ed.", "Fsillon"));
        b.add(new Book("Erich Fromm", "El corazón del hombre nº76", "F. C. E.", "1966", "", "Fsillon"));
        b.add(new Book("Carlos Castaneda", "Las enseñanzas de Don Juan nº126", "F. C. E.", "1974", "", "Fsillon"));
        b.add(new Book("Carlos Castaneda", "Una realidad aparte nº 135", "F. C. E.", "1974", "", "Fsillon"));
        b.add(new Book("Carlos Castaneda", "Viaje a Ixtlan nº 143", "F. C. E.", "1975", "", "Fsillon"));
        b.add(new Book("Carlos Castaneda", "Relatos de poder nº154", "F. C. E.", "1976", "", "Fsillon"));
        b.add(new Book("Edward O. Wilson", "Sobre la naturaleza humana nº 187", "F. C. E.", "1980", "", "Fsillon"));
        b.add(new Book("Ernest Becker", "La estructura del mal nº 192", "F. C. E.", "1980", "", "Fsillon"));
        b.add(new Book("Elías Canetti", "La conciencia de las palabras n 218", "F. C. E.", "1982", "1ª reimp.",
                "Fsillon"));
        b.add(new Book("Sidney Hook", "Lenguaje y filosofía nº221", "F. C. E.", "1982", "", "Fsillon"));
        b.add(new Book("Andrew Arato/Paul Breines", "El joven Lukács y los orígenes del marxismo occ. nº336",
                "F. C. E.", "1986", "", "Fsillon"));
        b.add(new Book("Roger Caillois", "Los juegos y los hombres nº 344", "F. C. E.", "1980", "", "Fsillon"));
        b.add(new Book("Kenneth Thompson", "Augusto Comte Los orígenes de la sociología nº 378", "F. C. E.", "1988",
                "", "Fsillon"));
        b.add(new Book("Conor C. O'brien", "Camus 2", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Jonathan Miller", "Mchluhan 3", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Andrew Sinclair", "Che Guevara 4", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("David Pears", "Wittgenstein 5", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("George Woodccock", "Gandhi 6", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Richard Wollheim", "Freud 7", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Charles Rycroft", "Reich 8", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("Robert Conguest", "Lenin 9", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("A. J. Ayer", "Russell 10", "Grijalbo", "1973", "", "Fsillon"));
        b.add(new Book("John Gross", "Joice 11", "Grijalbo", "1974", "", "Fsillon"));
        b.add(new Book("A. Storr", "Yung 12", "Grijalbo", "1974", "", "Fsillon"));
        b.add(new Book("John Lyons", "Chomsky 13", "Grijalbo", "1974", "", "Fsillon"));
        b.add(new Book("Bryan Magee", "Popper 14", "Grijalbo", "1974", "", "Fsillon"));
        b.add(new Book("Jacques Texier", "Gramsci 15", "Grijalbo", "1976", "", "Fsillon"));
        b.add(new Book("William Faulkner", "Obras escogidas T I", "Aguilar", "1958", "2ª ed.", "Fsillon"));
        b.add(new Book("Suetonio y Petronio", "Suetonio: Los doce Césares Petronio: El satiricón", "El Ateneo", "1959",
                "2ª ed.", "Fsillon"));
        b.add(new Book("Jean Paul Sartre", "La suerte está echada. El engranaje", "Losada", "1955", "2ª ed.", "Fsillon"));
        b.add(new Book("Philipp Lersch", "El hombre en la actualidad Nº 16", "Gredos", "1958", "2ª ed.", "Fsillon"));
        b.add(new Book("Guillermo Fraile, O. P.", "Historia de la filosofía II Judaísmo Nº 190", "B. A. C.", "1966",
                "2ª ed.", "Fsillon"));
    }

    private static void fillFiloextranjera() {
        final List<Book> b = DB.get("Filoextranjera");
        b.add(new Book("Ignace Lepp", "Riesgos y osadías del existir", "Fax", "1967", "", "Filoextranjera"));
        b.add(new Book("Gregorio Fingermann", "Filosofía", "El Ateneo", "1976", "12ª ed.", "Filoextranjera"));
        b.add(new Book("Dieter Wyss", "Estructuras de la moral", "Gredos", "1975", "", "Filoextranjera"));
        b.add(new Book("Pierre Bertaux", "Mutación de la humanidad", "Gredos", "1969", "", "Filoextranjera"));
        b.add(new Book("Salo W. Baron", "VI La época moderna", "Paidós", "1965", "", "Filoextranjera"));
        b.add(new Book("Francois Gregoire", "El más allá", "Paidós", "1957", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Leo Baeck", "La esencia del judaísmo", "Paidós", "1964", "", "Filoextranjera"));
        b.add(new Book("H. D. F. Kitto", "Los griegos", "Eudeba", "1962", "", "Filoextranjera"));
        b.add(new Book("León Rozitchner", "Persona y comunidad", "Eudeba", "1962", "", "Filoextranjera"));
        b.add(new Book("Enzo Paci", "La filosofía contemporánea", "Eudeba", "1963", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Livio Sichirollo", "Dialéctica", "Labor, S.A.", "1976", "", "Filoextranjera"));
        b.add(new Book("Michel Leiris", "Edad de hombre", "Labor, S.A.", "1976", "", "Filoextranjera"));
        b.add(new Book("Héctor D. Mandrioni", "Introducción a la filosofía", "Kapelusz", "1964", "", "Filoextranjera"));
        b.add(new Book("Dirección. C. D. Kernig", "Marxismo y democracia Filosofía 1, 2, 3, 4 y 5", "Rioduero", "1975",
                "", "Filoextranjera"));
        b.add(new Book("Jorge Plejanov", "El papel del individuo en la historia", "Intermundo", "1959", "",
                "Filoextranjera"));
        b.add(new Book("Francois Umbral-Xavier Delcourt", "Contra la nueva filosofía", "Premia Edra.", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Lia Formigari", "El mono y las estrellas", "Del Serbal", "1983", "", "Filoextranjera"));
        b.add(new Book("Alejandro Korn", "Sistema filosófico", "Nova", "1959", "", "Filoextranjera"));
        b.add(new Book("Jacques Chevalier", "Bergson y el Padre Pouget", "Aguilar", "1960", "", "Filoextranjera"));
        b.add(new Book("Erwin Schrödinger", "La naturaleza y los griegos", "Aguilar", "1961", "", "Filoextranjera"));
        b.add(new Book("Rodolfo Puiggros", "Los orígenes de la filosofía", "Jorge Alvarez", "1966", "",
                "Filoextranjera"));
        b.add(new Book("Otto Friedrich Bollnow", "Filosofía de la esperanza", "Fabril", "1962", "", "Filoextranjera"));
        b.add(new Book("Adam Schatt", "Filosofía del hombre Marx o Sartre", "Grijalbo, S.A.", "1965", "",
                "Filoextranjera"));
        b.add(new Book("Jean Rostand", "Lo que yo creo", "Americalee", "1955", "", "Filoextranjera"));
        b.add(new Book("V. Afanasiev", "Fundamentos de filosofía", "Progreso", "", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Aldo Pellegrini", "Para contribuir a la confusión general", "Nueva Visión", "1965", "",
                "Filoextranjera"));
        b.add(new Book("Martin Buber", "Eclipse de Dios", "Nueva Visión", "1970", "", "Filoextranjera"));
        b.add(new Book("E. Batálov", "Filosofía de la rebelión", "E.C. Sociales", "1987", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "La crisis del homo sapiens", "Tiempo Nuevo", "1970", "", "Filoextranjera"));
        b.add(new Book("Benjamín Farrington", "Mano y cerebro en la antigua Grecia", "Ayuso", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Petros Kuropulos", "El tiempo en el hombre", "Ayuso", "1970", "", "Filoextranjera"));
        b.add(new Book("Louis Ferdinand Celine", "Casse Pipe Conversaciones con el Profesor Y", "Guadarrama", "1976",
                "", "Filoextranjera"));
        b.add(new Book("Geneviere Rodis-Lewis", "Descartes y el racionalismo", "Oikos-tau, S.A.", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Paul A. Osterrieth", "Formar adultos", "Estela, S.A.", "1968", "", "Filoextranjera"));
        b.add(new Book("Francis Bacon", "Novum organum", "Hogar del Libro", "1988", "", "Filoextranjera"));
        b.add(new Book("Giorgio Agambe", "Idea de la prosa", "Península", "1989", "", "Filoextranjera"));
        b.add(new Book("Ruth Benedict", "El hombre y la cultura", "Edhasa", "1971", "", "Filoextranjera"));
        b.add(new Book("Pierre V. Zima", "La escuela de Frankfurt", "Galba", "1973", "", "Filoextranjera"));
        b.add(new Book("Louis Althusser", "Curso de filosofía para científicos", "Laia", "1975", "", "Filoextranjera"));
        b.add(new Book("Vito Fumagalli", "Cuando el cielo se oscurece La vida en la E. Media", "Nerea", "1987", "",
                "Filoextranjera"));
        b.add(new Book("George Thomson", "Los primeros filósofos", "Una. México", "1959", "", "Filoextranjera"));
        b.add(new Book("Arthur Koestler", "Jano", "Debate", "1981", "", "Filoextranjera"));
        b.add(new Book("Paul Nizan", "Los perros guardianes", "Fundamentos", "1973", "", "Filoextranjera"));
        b.add(new Book("George Uscatescu", "Profetas de Europa", "Edra. Nacional", "1962", "", "Filoextranjera"));
        b.add(new Book("Antony Flew", "Dios y la filosofía", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("C. S. Lewis", "La imagen del mundo", "Antoni Bosch", "1980", "", "Filoextranjera"));
        b.add(new Book("Oswald Ducrot y otros", "¿Qué es el estructuralismo?", "Losada, S.A.", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Robert Scholes", "Introducción al estructuralismo en la literatura", "Gredos", "1981", "",
                "Filoextranjera"));
        b.add(new Book("L. Seve y otros", "Dialéctica y estructuralismo", "Orbelius", "1969", "", "Filoextranjera"));
        b.add(new Book("Louis Millet Madeleine V. d'Ainvelle", "El estructuralismo como método", "Edicusa", "1972", "",
                "Filoextranjera"));
        b.add(new Book("François Wahl", "¿Qué es el estructuralismo? Filosofía", "Losada", "1975", "", "Filoextranjera"));
        b.add(new Book("Maurice Corvez", "Los estructuralistas: Foucault, Levi-Straus, Lacan...", "Amorrortu", "1972",
                "", "Filoextranjera"));
        b.add(new Book("Pierre Daix, Piaget y otros", "Claves del estructuralismo", "Calden", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Jean B. Fages", "Para comprender el estructuralismo", "Galerna", "1969", "", "Filoextranjera"));
        b.add(new Book("C. Levi-Straus y otros", "Aproximación al estructuralismo", "Galerna", "1967", "",
                "Filoextranjera"));
        b.add(new Book("Oscar Masotta", "Conciencia y estructura", "Jorge Alvarez", "1968", "", "Filoextranjera"));
        b.add(new Book("Romano Luperini", "El estructuralismo y la crítica marxista", "Centro Editor", "1968", "",
                "Filoextranjera"));
        b.add(new Book("Dan Sperber", "El estructuralismo en antropología", "Losada, S.A.", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Manfred Bierwisch", "El estructuralismo", "Tusquets", "1971", "", "Filoextranjera"));
        b.add(new Book("Jean Piaget", "El estructuralismo", "Proteo", "1968", "", "Filoextranjera"));
        b.add(new Book("Jean Pieget", "Sabiduría e ilusiones de la filosofía", "Península", "1970", "",
                "Filoextranjera"));
        b.add(new Book("Jeanne Parain-Vial", "Análisis estructurales e ideologías estructuralistas", "Amorrortu",
                "1972", "", "Filoextranjera"));
        b.add(new Book("Gregory Bateson", "Espíritu y naturaleza", "Amorrortu", "2001", "", "Filoextranjera"));
        b.add(new Book("Inmanuel Swedenborg", "La sabiduría de los ángeles", "Swan", "1988", "", "Filoextranjera"));
        b.add(new Book("V. Keshelara", "Humanismo real y humanismo ficticio", "Progreso", "1977", "", "Filoextranjera"));
        b.add(new Book("Felip Lorda", "Conocer a Spinoza y su obra", "Dopesa", "1980", "", "Filoextranjera"));
        b.add(new Book("Jean Lacroix", "Marxismo Existencialismo Personalismo", "Fontanella", "1962", "",
                "Filoextranjera"));
        b.add(new Book("Jean Lacroix", "Fuerza y debilidades de la familia", "Fontanella", "1962", "", "Filoextranjera"));
        b.add(new Book("Jean Lacroix", "Kant", "Sudamericana", "1969", "", "Filoextranjera"));
        b.add(new Book("Jean Wahl", "La experiencia metafísica", "Marfil, S.A.", "1966", "", "Filoextranjera"));
        b.add(new Book("Jean Wahl", "Historia del existencialismo", "Deucalión", "1954", "", "Filoextranjera"));
        b.add(new Book("Julien Benda", "Tradición del existencialismo", "Siglo veinte", "1958", "", "Filoextranjera"));
        b.add(new Book("Leonardo Sciascia", "Las parroquias de Regalpetra", "Bruguera", "1982", "", "Filoextranjera"));
        b.add(new Book("Leonardo Sciascia", "En tierra de infieles", "Bruguera", "1982", "", "Filoextranjera"));
        b.add(new Book("Wilhelm Reich", "Escucha hombrecito", "Bruguera", "1981", "", "Filoextranjera"));
        b.add(new Book("J. Huxley y otros", "El humanismo y el futuro del hombre", "Hormé, S.A.", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Robert Wallis", "El tiempo, cuarta dimensión de la mente", "El Ateneo", "1976", "",
                "Filoextranjera"));
        b.add(new Book("Augusto Comte", "Catecismo positivista", "Edra. Nacional", "1982", "", "Filoextranjera"));
        b.add(new Book("Johan Huizinga", "Hombres e ideas", "Fabril", "1960", "", "Filoextranjera"));
        b.add(new Book("Franz Borkenau", "Arnold Toynbee y la nueva decadencia", "Siglo veinte", "1957", "",
                "Filoextranjera"));
        b.add(new Book("Guillermo Francovich", "Toynbee, Heidegger y Whitehead", "Raigal", "1951", "", "Filoextranjera"));
        b.add(new Book("Arnold Toynbee", "El mundo y el occidente", "Aguilar", "1953", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Charles Fourier", "El extravío de la razón", "Grijalbo", "1974", "", "Filoextranjera"));
        b.add(new Book("Ludwig Feuerbach", "Tesis provisionales para la reforma de la filosofía", "Labor, S.A.",
                "1976", "", "Filoextranjera"));
        b.add(new Book("Michel Butor y otros", "Aproximación al pensamiento de Fourier", "Castellote", "1973", "",
                "Filoextranjera"));
        b.add(new Book("Emmanuel Mounier", "¿Qué es el personalismo?", "Criterio", "1956", "", "Filoextranjera"));
        b.add(new Book("Emmanuel Mounier", "El compromiso de la acción", "ZYX, S.A.", "1967", "", "Filoextranjera"));
        b.add(new Book("H. S. Blackham", "Seis pensadores existencialistas; Sartre, Marcel...", "E. de Occidente",
                "1964", "", "Filoextranjera"));
        b.add(new Book("A. I. Oparin", "El origen de la vida", "Akal", "1985", "", "Filoextranjera"));
        b.add(new Book("Emile  Durkheim", "El suicidio", "Akal", "1976", "", "Filoextranjera"));
        b.add(new Book("Eugenio Garin", "El renacimiento italiano", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("Paul K. Feyerabend", "Contra el método", "Ariel", "1987", "", "Filoextranjera"));
        b.add(new Book("Martin Hollis", "Invitación a la filosofía", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("John Cottingham", "El racionalismo", "Ariel", "1987", "", "Filoextranjera"));
        b.add(new Book("Hilary Putnam", "Razón, verdad e historia", "Tecnos", "1988", "", "Filoextranjera"));
        b.add(new Book("W. V. Quine", "La relatividad ontológica y otros ensayos", "Tecnos", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Edgar Morin", "El método III El conocimiento del conocimiento", "Cátedra", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Edward Evans-Pritchard", "Historia del pensamiento antropológico", "Cátedra", "1987", "",
                "Filoextranjera"));
        b.add(new Book("Bryan Magee", "Los grandes filósofos", "Cátedra", "1990", "", "Filoextranjera"));
        b.add(new Book("Roland Barthes", "Ensayos críticos", "Seix Barral", "1967", "", "Filoextranjera"));
        b.add(new Book("C. K. Ogden y I. A. Richards", "El significado del significado", "Paidos", "1984", "",
                "Filoextranjera"));
        b.add(new Book("Erich Rothacker", "Filosofía de la historia", "Pegaso", "1951", "", "Filoextranjera"));
        b.add(new Book("Henri Van Lier", "La nueva edad", "Marfil, S.A.", "1967", "", "Filoextranjera"));
        b.add(new Book("Georges Duby", "Civilización latina", "Laia", "1986", "", "Filoextranjera"));
        b.add(new Book("Otto Saame", "El principio de razón en Leibniz", "Laia", "1988", "", "Filoextranjera"));
        b.add(new Book("Henri Bergson", "Introduc. a la metafísica y a la intuición filosófica", "Leviatán", "1956",
                "", "Filoextranjera"));
        b.add(new Book("Reading Greek", "El mundo de Atenas", "PPU", "1988", "", "Filoextranjera"));
        b.add(new Book("Alan Guy y otros", "Filosofía de Hispanoamérica", "(CE) PPU", "1987", "", "Filoextranjera"));
        b.add(new Book("Jean Mesnard", "Pascal El hombre y su obra", "Tecnos", "1973", "", "Filoextranjera"));
        b.add(new Book("Hans Heinz Holz", "Leibniz", "Tecnos", "1970", "", "Filoextranjera"));
        b.add(new Book("Tobías Churton", "Los gnósticos", "Edaf", "1988", "", "Filoextranjera"));
        b.add(new Book("André Bareau", "Buda", "Edaf", "1974", "", "Filoextranjera"));
        b.add(new Book("Kostas Papaioannon", "Hegel", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Michel Piclin", "Schopenhauer", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Chantal Moubachir", "Freud", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Colette Andry", "Sartre", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Philippe Devaux", "Russell", "Edaf", "1976", "", "Filoextranjera"));
        b.add(new Book("Stanislas Breton", "Sto. Tomás", "Edaf", "1976", "", "Filoextranjera"));
        b.add(new Book("André Nicolás", "Reich", "Edaf", "1976", "", "Filoextranjera"));
        b.add(new Book("G. Rodis-Lewis", "Platón", "Edaf", "1977", "", "Filoextranjera"));
        b.add(new Book("A. Kremer-Marietti", "Jaspers", "Edaf", "1977", "", "Filoextranjera"));
        b.add(new Book("Daniel Christoff", "Husserl", "Edaf", "1979", "", "Filoextranjera"));
        b.add(new Book("Josef Pieper", "El ocio y la vida intelectual", "Rialp", "1983", "", "Filoextranjera"));
        b.add(new Book("Roger Verneaux", "Crítica de la \"Critica de la razón pura\"", "Rialp", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Robert Spaemann", "Lo natural y lo racional", "Rialp", "1989", "", "Filoextranjera"));
        b.add(new Book("I. M. Bochenski", "Los métodos actuales del pensamiento", "Rialp", "1985", "15ª ed.",
                "Filoextranjera"));
        b.add(new Book("Bronislaw Malinowski", "Una teoría científica de la cultura", "Edhasa", "1970", "",
                "Filoextranjera"));
        b.add(new Book("Maurice Dupuy", "La filosofía alemana", "Oikos-tau", "1976", "", "Filoextranjera"));
        b.add(new Book("Emile Lehonck", "Fourier o la armonía y el caos", "Labor, S.A.", "1966", "", "Filoextranjera"));
        b.add(new Book("Paolo Casini", "Naturaleza", "Labor, S.A.", "1977", "", "Filoextranjera"));
        b.add(new Book("M. Foucault y otros", "La crisis de la razón", "Univ. Murcia", "1986", "", "Filoextranjera"));
        b.add(new Book("George Lukacs y otros", "Polémica sobre realismo", "Buenos Aires", "1982", "", "Filoextranjera"));
        b.add(new Book("Pietro Scarduelli", "Introducción a la antropología cultural", "Villalar", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Leslie A. White", "La ciencia de la cultura", "C. Lectores", "1988", "", "Filoextranjera"));
        b.add(new Book("Bruno de Solages", "Iniciación metafísica", "Razón y Fe", "1967", "", "Filoextranjera"));
        b.add(new Book("François Chatelet (Director)", "Historia de las ideologías I y II", "Zero Zyx", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Jorge Uscatescu", "Hombres y realidades de nuestro tiempo", "Rialp", "1961", "",
                "Filoextranjera"));
        b.add(new Book("Henri Arvon", "Lenin", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Jenofonte", "Hieron", "Inst. Est Polít.", "1954", "Bilingüe", "Filoextranjera"));
        b.add(new Book("Eduard Spranger", "Reflexiones sobre el desarrollo de la existencia", "Fabril, S.A.", "1964",
                "", "Filoextranjera"));
        b.add(new Book("Angel J. Cappelletti", "Los fragmentos de Heráclito", "Tiempo Nuevo", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Jacobo Kogan", "Literatura y metafísica", "Nova", "1971", "", "Filoextranjera"));
        b.add(new Book("Marc Oraison", "Vocación fenómeno humano", "Desclée de B.", "1972", "", "Filoextranjera"));
        b.add(new Book("W. Luypen", "Fenomenología existencial", "Carlos Lohlé", "1967", "", "Filoextranjera"));
        b.add(new Book("J. F. Donceel", "Antropología filosófica", "Carlos Lohlé", "1969", "", "Filoextranjera"));
        b.add(new Book("M. A. Virasoro", "La intuición metafísica", "Carlos Lohlé", "1965", "", "Filoextranjera"));
        b.add(new Book("J. C. Friedrich Hölderlin", "Ensayos", "Hiperión", "1976", "", "Filoextranjera"));
        b.add(new Book("J. C. Friedrich Hölderlin", "El archipiélago", "Alianza", "1979", "Bilingüe", "Filoextranjera"));
        b.add(new Book("J. C. Friedrich Hölderlin", "El archipiélago", "R. Occidente", "1970", "", "Filoextranjera"));
        b.add(new Book("Peter Hártling", "Hölderlin (novela)", "Montesinos", "1976", "", "Filoextranjera"));
        b.add(new Book("George Lakoff y Mark Johnson", "Metáforas de la vida cotidiana", "Cátedra", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Jonathan Barnes", "Aristóteles", "Cátedra", "1987", "", "Filoextranjera"));
        b.add(new Book("Julius Weinberg", "Breve historia de la filosofía medieval", "Cátedra", "1987", "",
                "Filoextranjera"));
        b.add(new Book("David Ross", "Teoría de las ideas de Platón", "Cátedra", "1986", "", "Filoextranjera"));
        b.add(new Book("Alexander Woodcock y Monte Davis", "Teoría de las catástrofes", "Cátedra", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Vincent Descombes", "Lo mismo y lo otro", "Cátedra", "1982", "", "Filoextranjera"));
        b.add(new Book("Rüdiger Bubner", "La filosofía alemana contemporárea", "Cátedra", "1984", "", "Filoextranjera"));
        b.add(new Book("Kazimierz Ajdukiewicz", "Introducción a la filosofía", "Cátedra", "1986", "", "Filoextranjera"));
        b.add(new Book("Alain Coulon", "La etnometodología", "Cátedra", "1988", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "La lechuza de Minerva ¿Qué es filosofia?", "Cátedra", "1979", "",
                "Filoextranjera"));
        b.add(new Book("Richard Rorty", "La filosofía y el espejo de la naturaleza", "Cátedra", "1983", "",
                "Filoextranjera"));
        b.add(new Book("Igor A. Caruso", "Narcisismo y socialización", "Siglo XXI", "1979", "", "Filoextranjera"));
        b.add(new Book("Marta Harnecker", "Los conceptos fund. del materialismo histórico", "Siglo XXI", "1973",
                "20ª ed.", "Filoextranjera"));
        b.add(new Book("Igor A. Carner", "Psicoanálisis, marxismo, utopía", "Siglo XXI", "1974", "", "Filoextranjera"));
        b.add(new Book("Michel Foucault", "El nacimiento de la clínica", "Siglo XXI", "1966", "", "Filoextranjera"));
        b.add(new Book("W. H. Walsh", "Introducción a la filosofía de la historia", "Siglo XXI", "1968", "",
                "Filoextranjera"));
        b.add(new Book("Michel Adam", "La calumnia, relación humana", "Siglo XXI", "1968", "", "Filoextranjera"));
        b.add(new Book("Thomas Moro Simpson Compilador", "Semántica filosófica: Problemas y discursos", "Siglo XXI",
                "1973", "", "Filoextranjera"));
        b.add(new Book("Marshall Berman", "Todo lo sólido se desvanece en el aire", "Siglo XXI", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Nicolai I. Bujarin", "Teoría del materialismo histórico", "Siglo XXI", "1974", "2ª ed.",
                "Filoextranjera"));
        b.add(new Book("Antonio Gramsci", "Antología Notas de Manuel Sacristán", "Siglo XXI", "1974", "2ª ed.",
                "Filoextranjera"));
        b.add(new Book("Lucien Sebag", "Marxismo y estructuralismo", "Siglo XXI", "1969", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "Cartas de viaje (1923-1939)", "Taurus", "1957", "", "Filoextranjera"));
        b.add(new Book("Edouard Morot-Sir", "La metafísica de Pascal", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "El medio divino", "Taurus", "1959", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "Nuevas cartas de viaje (1939-1955)", "Taurus", "1960", "",
                "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "El porvenir del hombre", "Taurus", "1962", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "El fenómeno humano", "Taurus", "1963", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "El himno del universo", "Taurus", "1964", "", "Filoextranjera"));
        b.add(new Book("Colin Wilson", "El desplazado", "Taurus", "1957", "", "Filoextranjera"));
        b.add(new Book("Jean Daniélou", "Ensayo sobre Filón de Alejandría", "Taurus", "1962", "", "Filoextranjera"));
        b.add(new Book("Jean Daniélou", "Dios y nosotros", "Taurus", "1957", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "El grupo zoológico humano", "Taurus", "1957", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "La aparición del hombre", "Taurus", "1958", "", "Filoextranjera"));
        b.add(new Book("P. Teilhard de Chardin", "La visión del pasado", "Taurus", "1958", "", "Filoextranjera"));
        b.add(new Book("Jean-François Lyotard", "¿Porqué filosofar?", "Paidos", "1989", "", "Filoextranjera"));
        b.add(new Book("Robert Nisbet", "Historia de la idea de progreso", "Gedisa", "1981", "", "Filoextranjera"));
        b.add(new Book("Jean François Lyotard", "La diferencia", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Jean François Lyotard", "El entusiasmo", "Gedisa", "1987", "", "Filoextranjera"));
        b.add(new Book("Alain Finkielkraut", "La sabiduría del amor", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Ernest Gellner", "Cultura, identidad y política", "Gedisa", "1989", "", "Filoextranjera"));
        b.add(new Book("Gregoty Bateson y Mari C. Bateson", "El temor de los ángeles", "Gedisa", "1989", "",
                "Filoextranjera"));
        b.add(new Book("Pierre Bourdien", "Cosas dichas", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Paul Watzlawick y otros", "La realidad inventada", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Karl Jaspers", "La práctica médica en la era tecnológica", "Gedisa", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Reuben Guilead", "Ser y libertad", "G. del Toro", "1969", "", "Filoextranjera"));
        b.add(new Book("Nicolai Hartmann", "Estética", "Univ. A. México", "1977", "", "Filoextranjera"));
        b.add(new Book("Georg Picht", "Frente a la utopía", "Plaza Janés", "1972", "", "Filoextranjera"));
        b.add(new Book("Paul Radin", "El hombre primitivo como filósofo", "Eudeba", "1960", "", "Filoextranjera"));
        b.add(new Book("L. Renon", "El hinduísmo", "Eudeba", "1960", "", "Filoextranjera"));
        b.add(new Book("Jean Servier", "El hombre y lo invisible", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Edouard Morot-Sir", "El pensamiento francés actual", "El Ateneo", "1974", "", "Filoextranjera"));
        b.add(new Book("Ernst Cassirer", "Esencia y efecto del concepto del símbolo", "F. C. E.", "1975", "",
                "Filoextranjera"));
        b.add(new Book("H. H. Price", "Pensamiento y experiencia", "F. C. E.", "1975", "", "Filoextranjera"));
        b.add(new Book("Paul Kurtz", "Filosofía norteamericana en el siglo veinte", "F. C. E.", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Soren Kierkegaard", "In vino veritas La repetición", "Guadarrama", "1975", "", "Filoextranjera"));
        b.add(new Book("Kierkegaard", "Elogio de Abraham (Páginas líricas)", "Athenas", "1959", "Intonso",
                "Filoextranjera"));
        b.add(new Book("I. F. Stone", "El juicio de Sócrates", "Mondadori", "1988", "", "Filoextranjera"));
        b.add(new Book("Enrique Lynch", "La lección de Sheherezade", "Anagrama", "1987", "", "Filoextranjera"));
        b.add(new Book("Drew A. Hiland", "Los orígenes de la Fª en el mito y los presocráticos", "El Ateneo", "1975",
                "", "Filoextranjera"));
        b.add(new Book("E. R. Learch", "Sistemas políticos de la Alta Birmania", "Anagrama", "1977", "",
                "Filoextranjera"));
        b.add(new Book("E. R. Learch", "Replanteamiento de la antropología", "Seix Barral", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Marcel Mauss", "Sociología y antropología", "Tecnos", "1971", "", "Filoextranjera"));
        b.add(new Book("Marvin Harris", "El desarrollo de la teoría antropológica", "Siglo XXI", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Marschall Sahlius", "Cultura y razón práctica", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Emerich Coreth, S. J.", "Metafísica", "Ariel", "1964", "", "Filoextranjera"));
        b.add(new Book("Kenelm Foster", "Petrarca", "Crítica", "1989", "", "Filoextranjera"));
        b.add(new Book("Peter Gorman", "Pitágoras", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("M. I. Finley, Ed.", "El legado de Grecia", "Crítica", "1983", "", "Filoextranjera"));
        b.add(new Book("Eugenio Garin", "Descartes", "Crítica", "1989", "", "Filoextranjera"));
        b.add(new Book("Kostas Axelos", "Introducción a un pensar futuro", "Amorrortu", "1973", "", "Filoextranjera"));
        b.add(new Book("Jacques Derrida", "Márgenes de la filosofía", "Cátedra", "1989", "", "Filoextranjera"));
        b.add(new Book("Pierre Vendryés", "Hacia la teoría del hombre", "El Ateneo", "1975", "", "Filoextranjera"));
        b.add(new Book("Gabriel Marcel", "Aproximación al misterio del ser", "Encuentros", "1987", "", "Filoextranjera"));
        b.add(new Book("Rodolfo Mondolfo", "Figuras e ideas de la filosofía del renacimiento", "Icaria", "1980", "",
                "Filoextranjera"));
        b.add(new Book("Rodolfo Mondolfo", "Heráclito Textos y problemas...", "Siglo XXI", "1966", "", "Filoextranjera"));
        b.add(new Book("Theodor W. Adorno", "Consignas", "Amorrortu", "1973", "", "Filoextranjera"));
        b.add(new Book("Maurice Merleau-Ponty", "Elogio a la filosofía", "Nueva Visión", "1957", "", "Filoextranjera"));
        b.add(new Book("René Girard", "El misterio de nuestro mundo", "Sígueme", "1982", "", "Filoextranjera"));
        b.add(new Book("Paul-Laurent Assoun", "Freud y Nietzsche", "F. C. E.", "1984", "", "Filoextranjera"));
        b.add(new Book("Federico Nietzsche", "Mi hermana y yo", "S. Rueda", "1980", "", "Filoextranjera"));
        b.add(new Book("Victor Massuh", "Nietzsche y el fin de la religión", "Sudamericana", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Paul Valadier", "Nietzsche y la crítica del cristianismo", "Cristiandad", "1982", "",
                "Filoextranjera"));
        b.add(new Book("Jules Chaix-Ruy", "Síntesis del pensamiento de Nietzsche", "Nova Terra", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Eugen Biser", "Nietzsche y la destrucción de la conciencia cristiana", "Sígueme", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Karl Jaspers", "Nietzsche y el cristianismo", "Deucalión", "1955", "", "Filoextranjera"));
        b.add(new Book("Lou Andreas Salomé", "Nietzsche", "Zero Zys", "1978", "", "Filoextranjera"));
        b.add(new Book("Rafael Gutiérrez Girardot", "Nietzsche y la filología clásica", "Eudeba", "1966", "",
                "Filoextranjera"));
        b.add(new Book("Otto Pöggeler", "Filosofía y política de Heidegger", "Alfa", "1984", "", "Filoextranjera"));
        b.add(new Book("Otto Pöggeler", "El camino del pensar de Martín Heidegger", "Alianza", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Rüdiger Safrauski", "Martin Heidegger y su tiempo", "Tusquets", "2000", "", "Filoextranjera"));
        b.add(new Book("W. Charlton", "Introducción a la estética", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("Henst Bloch", "Sujeto-objeto (El pensamiento de Hegel)", "F. C. E.", "1982", "",
                "Filoextranjera"));
        b.add(new Book("Héctor Rauvich", "Hegel y la lógica de la pasión", "Marymar", "1976", "", "Filoextranjera"));
        b.add(new Book("John Finflay", "Reexamen de Hegel", "Grijalbo, S.A.", "1969", "", "Filoextranjera"));
        b.add(new Book("Karl Löwith", "De Hegel a Nietzche", "Sudamericana", "1968", "", "Filoextranjera"));
        b.add(new Book("André Glucksmann", "Los maestros pensadores", "Anagrama", "1978", "", "Filoextranjera"));
        b.add(new Book("François Chàtelet", "Hegel según Hegel", "Laia", "1972", "", "Filoextranjera"));
        b.add(new Book("Cornelio Fabro", "La dialéctica de Hegel", "Columba", "1969", "", "Filoextranjera"));
        b.add(new Book("G. R. G. Mure", "La filosofía de Hegel", "Cátedra", "1984", "", "Filoextranjera"));
        b.add(new Book("Jacques D'Hont Director", "Hegel y el pensamiento moderno", "Siglo XXI", "1973", "",
                "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Los cuadernos azul y marrón", "Tecnos", "1968", "", "Filoextranjera"));
        b.add(new Book("Alejandro Tomasini Bassols", "El pensamiento del último Wittgenstein", "Trillas", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Peter Winch y colaboradores", "Estudios sobre la filosofía de Wittgenstein", "Eudeba", "1971",
                "", "Filoextranjera"));
        b.add(new Book("W. P. Alston y otros", "Moore, Russell, Wittgenstein", "Tecnos", "1976", "", "Filoextranjera"));
        b.add(new Book("K. T. Fann", "El concepto de filosofía de Wittgenstein", "Tecnos", "1975", "", "Filoextranjera"));
        b.add(new Book("Anthony Kenny", "Wittgenstein", "R. Occidente", "1974", "", "Filoextranjera"));
        b.add(new Book("G. E. M. Auscombe", "Introducción al \"Tractatus\" de Wittgenstein", "El Ateneo", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Beda Allemann", "Hölderlin y Heidegger", "Mirasol", "1965", "", "Filoextranjera"));
        b.add(new Book("Hans-Georg Gadamer", "Verdad y método", "Sígueme", "1977", "", "Filoextranjera"));
        b.add(new Book("Emmanuel Levinas", "Totalidad e infinito", "Sígueme", "1977", "", "Filoextranjera"));
        b.add(new Book("Joseph Gevaert", "El problema del hombre", "Sígueme", "1976", "", "Filoextranjera"));
        b.add(new Book("Friedrich Dessaner", "Discusión sobre la técnica (lingüística)", "Rialp", "1964", "",
                "Filoextranjera"));
        b.add(new Book("Antoinette Virieux-Reymond", "La lógica formal", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("Benedictus de Spinoza", "Tratado breve de Dios, del hombre y...", "C. Lectores", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Platón", "La república", "C. Lectores", "1996", "", "Filoextranjera"));
        b.add(new Book("René Descartes", "Discurso del método. Correspondencia", "C. Lectores", "1996", "",
                "Filoextranjera"));
        b.add(new Book("Filósofos Cirenáicos", "Antología comentada", "C. Lectores", "1996", "", "Filoextranjera"));
        b.add(new Book("G. W. Leibniz", "Antología", "C. Lectores", "1996", "", "Filoextranjera"));
        b.add(new Book("F. H. Jacobi", "Cartas a Mendelssohn. David Hume-", "C. Lectores", "1996", "", "Filoextranjera"));
        b.add(new Book("G. W. F. Hegel", "Lecciones sobre la filosofía de la historia", "C. Lectores", "1996", "",
                "Filoextranjera"));
        b.add(new Book("Ludwing Feuerbach", "La esencia del cristianismo", "C. Lectores", "1996", "", "Filoextranjera"));
        b.add(new Book("Wilhelm von Humboldt", "Sobre la diversidad de la estructura del lenguaje", "C. Lectores",
                "1996", "", "Filoextranjera"));
        b.add(new Book("Jean-Jacques Rousseau", "Discursos. El contrato social", "C. Lectores", "1996", "",
                "Filoextranjera"));
        b.add(new Book("Juan Huarte de San juan", "Examen de ingenios para las ciencias", "C. Lectores", "1996", "",
                "Filoextranjera"));
        b.add(new Book("Diógenes Laercio", "Sexto empírico. Esbozos pirrónicos", "C. Lectores", "1996", "",
                "Filoextranjera"));
        b.add(new Book("Robert Stewart", "Ideas que transformaron el mundo", "C. Lectores", "1997", "",
                "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "De lágrimas y de santos", "Tusquets", "1988", "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Ese maldito yo", "Tusquets", "1987", "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Desgarradura", "Montesinos", "1983", "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Ensayo sobre el pensamiento reaccionario y otros textos", "Montesinos", "1985",
                "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Silogismos de  la amargura", "Monte Avila", "1986", "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "La caida del tiempo (2 ejemplares)", "Monte Avila", "1977", "2 ejemp.",
                "Filoextranjera"));
        b.add(new Book("Margaret Mead", "La antropología y el mundo contemporáneo", "Siglo XX", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Margaret Mead", "Antropología, la ciencia del hombre", "Siglo XX", "1971", "", "Filoextranjera"));
        b.add(new Book("Platón", "La republica o el estado", "Edaf", "1979", "", "Filoextranjera"));
        b.add(new Book("Rousseau", "El contrato social", "Edaf", "1979", "", "Filoextranjera"));
        b.add(new Book("Jean-Jacques Rousseau", "Emilio o la educación", "Fontanella", "1973", "", "Filoextranjera"));
        b.add(new Book("B. I. Skinner", "Más allá de la libertad y la dignidad", "Fontanella", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Roger Garaudy", "Una nueva civilización", "Edicusa", "1977", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Roger Garaudy", "Palabra de hombre", "Edicusa", "1977", "3ª ed.", "Filoextranjera"));
        b.add(new Book("Michel Federico Sciacca", "En espíritu y en verdad", "Excelicer, S.A.", "1955", "",
                "Filoextranjera"));
        b.add(new Book("Carlos Marx Federico Engels", "Manifiesto comunista y otros escritos", "Grijalbo", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Marx Engels", "El libro rojo y negro", "Jucar", "1977", "", "Filoextranjera"));
        b.add(new Book("Federico Engels", "El origen de la familia, la propiedad priv. y  el estado", "Ayuso", "1972",
                "", "Filoextranjera"));
        b.add(new Book("Victor G. Afanasiev", "Fundamentos de filosofía marxista", "E. Mex. Unidos", "1978", "",
                "Filoextranjera"));
        b.add(new Book("V. I. Lenin", "Materialismo y empiriocriticismo", "Laia", "1974", "", "Filoextranjera"));
        b.add(new Book("Jean Piaget", "Sabiduría e ilusiones de la filosofía", "Nexos", "1988", "", "Filoextranjera"));
        b.add(new Book("W. V. Quine", "La relatividad ontológica y otros ensayos", "Tecnos", "1986", "1ª reimp.",
                "Filoextranjera"));
        b.add(new Book("Jean Pucelle", "El tiempo", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("James A. Boon", "Del simbolismo al estructuralismo", "El Ateneo", "1976", "", "Filoextranjera"));
        b.add(new Book("Gaston Bachelard", "La filosofía del no", "Amorrortu", "1973", "", "Filoextranjera"));
        b.add(new Book("Olof Gigon", "Problemas fundamentales de la filosofía antigua", "Fabril", "1962", "",
                "Filoextranjera"));
        b.add(new Book("Georges Balandier", "Modernidad y poder", "Jucar U.", "1988", "", "Filoextranjera"));
        b.add(new Book("Hugh Lloid-Jones (Ed.)", "Los griegos", "Gredos", "1965", "", "Filoextranjera"));
        b.add(new Book("Joshúa Trachtenberg", "El diablo y los judíos", "Paidós", "1965", "", "Filoextranjera"));
        b.add(new Book("Alan Richardson", "La Biblia en la edad de la ciencia", "Paidós", "1966", "", "Filoextranjera"));
        b.add(new Book("Lejezkel Kaufmann", "I La época bíblica", "Paidós", "1964", "", "Filoextranjera"));
        b.add(new Book("Ralph Marcus Gerson D. Cohen", "II La época helenistica III La época Talmúdica", "Paidós",
                "1965", "", "Filoextranjera"));
        b.add(new Book("Abraham S. Halkin Cecil Roth", "IV La época judeo-islámica V La época europea", "Paidós",
                "1965", "", "Filoextranjera"));
        b.add(new Book("Gilbert Durand", "La imaginación simbólica", "Amorrortu", "1971", "", "Filoextranjera"));
        b.add(new Book("Bernard Mandeville", "La fábula de las abejas", "EFE", "1982", "", "Filoextranjera"));
        b.add(new Book("Thomas Mann Ed. A. Sánchez", "Schopenhauer, Nietzche, Freud", "Bruguera", "1984", "",
                "Filoextranjera"));
        b.add(new Book("Ludwig Landgrebe", "El camino de la fenomenología", "Sudamericana", "1968", "",
                "Filoextranjera"));
        b.add(new Book("Gabriel Marcel", "Incredulidad y fe", "Guadarrama", "1971", "", "Filoextranjera"));
        b.add(new Book("Paul Roubiczek", "El existencialismo", "Labor, S.A.", "1966", "", "Filoextranjera"));
        b.add(new Book("Charles Werner", "La filosofía griega", "Labor, S.A.", "1965", "", "Filoextranjera"));
        b.add(new Book("Henry David Thoreau", "Walden seguido de Del deber de la des. Civil", "Del Cotal, S.A.",
                "1976", "", "Filoextranjera"));
        b.add(new Book("E. Bréhier", "Ciencia y humanismo", "Athenas", "1958", "Intonso", "Filoextranjera"));
        b.add(new Book("Debats Nº 18", "Viena 1880/1938 Revista", "A.G. Vicent, S.A.", "1986", "", "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Historia y utopía", "Tusquets", "1988", "", "Filoextranjera"));
        b.add(new Book("Jean Delumeau", "El caso Lutero", "Luis de Caralt", "1988", "", "Filoextranjera"));
        b.add(new Book("Danilo Cruz Vélez", "Filosofía sin supuestos", "Sudamericana", "1970", "", "Filoextranjera"));
        b.add(new Book("Gabriel Marcel", "Filosofía para un tiempo de crisis", "Guadarrama", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Gabriel Marcel", "Diario metafísico (1928-1933)", "Guadarrama", "1969", "", "Filoextranjera"));
        b.add(new Book("Gabriel Marcel", "En busca de la verdad y la justicia", "Herder", "1967", "", "Filoextranjera"));
        b.add(new Book("Etienne Gilson", "El ser y los filósofos", "Eunsa", "1979", "", "Filoextranjera"));
        b.add(new Book("A. J.  Festugiére", "La esencia de la tragedia griega", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("Michel Vadée", "Bachelard o el nuevo idealismo epistemológico", "Pre-textos", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Ernst Von Aster", "Introducción a la filosofía contemporánea", "Guadarrama", "1961", "",
                "Filoextranjera"));
        b.add(new Book("E. M. Cioran", "Contra la historia", "Tusquets", "1980", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Justus Hartnack", "La teoría del conocimiento de Kant", "Cátedra", "1977", "", "Filoextranjera"));
        b.add(new Book("Aldous Husley", "Los demonios de Loudun", "Planeta", "1972", "", "Filoextranjera"));
        b.add(new Book("Charles Moeller", "Humanismo y existencialismo", "Eds. Humanismo", "1959", "", "Filoextranjera"));
        b.add(new Book("Henri Van Lier", "Humanismo y hombre moderno", "Eds. Humanismo", "1959", "", "Filoextranjera"));
        b.add(new Book("François Duyckaerts", "Humanismo y psicología", "Eds. Humanismo", "1959", "", "Filoextranjera"));
        b.add(new Book("Jean Danielou", "Humanismo e hinduísmo", "Eds. Humanismo", "1959", "", "Filoextranjera"));
        b.add(new Book("Pierre Jouguelet", "Humanismo y condición humana", "Eds. Humanismo", "1960", "",
                "Filoextranjera"));
        b.add(new Book("Max Weber", "La ética protestante y el espíritu del capitalismo", "Península", "1988",
                "8ª ed.", "Filoextranjera"));
        b.add(new Book("Jacques Heers", "Carnavales y fiestas de locos", "Península", "1988", "", "Filoextranjera"));
        b.add(new Book("Gershon Scholem", "Walter Benjamin Historia de una amistad", "Península", "1987", "",
                "Filoextranjera"));
        b.add(new Book("William James", "Las variedades de la experiencia religiosa", "Península", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Karl Menninger", "El hombre contra sí mismo", "Península", "1972", "", "Filoextranjera"));
        b.add(new Book("Georg Simmel", "El indivíduo y la libertad", "Península", "1986", "", "Filoextranjera"));
        b.add(new Book("Georg Simmel", "Sobre la aventura Ensayos filosóficos", "Península", "1981", "",
                "Filoextranjera"));
        b.add(new Book("Ayatollah Jomeini", "Princ. políticos, filosóficos, sociales y religiosos", "Icaria", "1981",
                "", "Filoextranjera"));
        b.add(new Book("Schelling Ed. José L. Villacañas B.", "Antología", "Península", "1987", "", "Filoextranjera"));
        b.add(new Book("Antonio Gramsci", "Introducción a la filosofía de la praxis", "Península", "1970", "",
                "Filoextranjera"));
        b.add(new Book("Jon Elster", "Uvas amargas", "Península", "1988", "", "Filoextranjera"));
        b.add(new Book("Massimo Cacciari", "Hombres póstumos", "Península", "1989", "", "Filoextranjera"));
        b.add(new Book("André Glucksmann", "La estupidez", "Península", "1988", "", "Filoextranjera"));
        b.add(new Book("Jan Patocka", "Ensayos heréticos", "Península", "1988", "", "Filoextranjera"));
        b.add(new Book("E. F. Schumacher", "Guía para perplejos", "Debate", "1986", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Carlo Augusto Viano", "Etica", "Labor, S.A.", "1977", "", "Filoextranjera"));
        b.add(new Book("Ernst Bloch", "El principio de esperanza I", "Aguilar", "1977", "", "Filoextranjera"));
        b.add(new Book("Ernst Bloch", "El principio de esperanza II", "Aguilar", "1979", "", "Filoextranjera"));
        b.add(new Book("Ernst Bloch", "El principio de esperanza III", "Aguilar", "1980", "", "Filoextranjera"));
        b.add(new Book("George Uscatescu", "Aporías del estructuralismo", "Inst. Es. Polit.", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Jean Pouillon y otros", "Problemas del estructuralismo", "Siglo XXI", "1967", "",
                "Filoextranjera"));
        b.add(new Book("Galvano Della Volpe/Lefebvre", "Ajuste de cuentas con el estructuralismo", "A. Corazón",
                "1969", "", "Filoextranjera"));
        b.add(new Book("F. Nietzche/Lou v. Salomé/ P. Rel", "Documentos de un encuentro", "Laertes", "1982", "2ª ed.",
                "Filoextranjera"));
        b.add(new Book("Jean Lacroix", "Los hombres ante el fracaso", "Herder", "1970", "", "Filoextranjera"));
        b.add(new Book("Rosa Krauze", "Introducción a la investigación filosófica", "U. Aut. México", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Carlos Thiebant", "Cabe Aristóteles", "Visor", "1988", "", "Filoextranjera"));
        b.add(new Book("Edgar de Bruyne", "La estética de la Edad Media", "Visor", "1988", "", "Filoextranjera"));
        b.add(new Book("Paul Valery", "La idea fija", "Visor", "1988", "", "Filoextranjera"));
        b.add(new Book("Rosario Assunto", "Naturaleza y razón en la estética del setecientos", "Visor", "1989", "",
                "Filoextranjera"));
        b.add(new Book("Franz Rosenzweig", "El nuevo pensamiento", "Visor", "1989", "", "Filoextranjera"));
        b.add(new Book("Carl Friedrich Geyer", "Teoría crítica (Max. H./T. W. Adorno)", "Alfa", "1985", "",
                "Filoextranjera"));
        b.add(new Book("Rüdiger Bittner", "Mandato moral o autonomía", "Alfa", "1988", "", "Filoextranjera"));
        b.add(new Book("Gerhard Schmidt", "Razón y experiencia", "Alfa", "1982", "", "Filoextranjera"));
        b.add(new Book("Ferdinand Fellmann", "Fenomenología y expresionismo", "Alfa", "1984", "", "Filoextranjera"));
        b.add(new Book("Hans Albert", "La miseria de la teología", "Alfa", "1982", "", "Filoextranjera"));
        b.add(new Book("Karl Otto Apel", "Estudios éticos", "Alfa", "1986", "", "Filoextranjera"));
        b.add(new Book("Hans Leuk", "Filosofía pragmática", "Alfa", "1982", "", "Filoextranjera"));
        b.add(new Book("Friedrich Rapp", "Filosofía analítica de la técnica", "Alfa", "1981", "", "Filoextranjera"));
        b.add(new Book("Joachim Ritter", "Subjetividad Seis ensayos", "Alfa", "1986", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Spinoza y el problema de la experiencia", "Muchnik", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Leszek Kolakowski", "La filosofía positivista", "Cátedra", "1979", "", "Filoextranjera"));
        b.add(new Book("Alberto Savinio", "Nueva enciclopedia", "Seix Barral", "1983", "", "Filoextranjera"));
        b.add(new Book("Jean Ferrari", "Kant", "Edaf", "1974", "", "Filoextranjera"));
        b.add(new Book("André Combes", "T. de Chardin", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Luciano de Crescenzo", "Historia de la filosogía griega Los presocráticos", "Seix Barral",
                "1986", "", "Filoextranjera"));
        b.add(new Book("Luciano de Crescenzo", "Hª de la filosofía griega De Sócrates en adelante", "Seix Barral",
                "1987", "", "Filoextranjera"));
        b.add(new Book("R. D. Laineg y D. G. Cooper", "Razón y violencia", "Paidos", "1973", "", "Filoextranjera"));
        b.add(new Book("Jacobo Kogan", "Filosofía de la imaginación", "Paidos", "1986", "", "Filoextranjera"));
        b.add(new Book("Robert Wuthnow y otros", "Análisis cultural La obra de Berger...", "Paidos", "1988", "",
                "Filoextranjera"));
        b.add(new Book("J. L. Austin", "Cómo hacer cosas con palabras", "Paidos", "1982", "", "Filoextranjera"));
        b.add(new Book("P. L. Assoum", "Freud La filosofía y los filósofos", "Paidos", "1982", "", "Filoextranjera"));
        b.add(new Book("P. Ariés", "El tiempo de la historia", "Paidos", "1988", "", "Filoextranjera"));
        b.add(new Book("Karl R. Popper", "Conjeturas y refutaciones", "Paidos", "1989", "2ª reimp.", "Filoextranjera"));
        b.add(new Book("Karl R. Popper", "La sociedad abierta y sus enemigos", "Paidos", "1981", "", "Filoextranjera"));
        b.add(new Book("Karl R. Popper", "Búsqueda sin término", "Tecnos", "1977", "", "Filoextranjera"));
        b.add(new Book("David Cooper", "La gramática de la vida", "Ariel", "1978", "", "Filoextranjera"));
        b.add(new Book("William Wallace", "Arthur Schopenhauer", "El laberinto 28", "1988", "", "Filoextranjera"));
        b.add(new Book("Rosental-Iudin", "Diccionario filosófico", "Universo", "1967", "", "Filoextranjera"));
        b.add(new Book("René Schéver y Arión L. Kelkel", "Heidegger", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Jeanne Delhommme", "Nietzsche", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Robert Misrahi", "Spinoza", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Sergio Perottino", "Garaudy", "Edaf", "1975", "", "Filoextranjera"));
        b.add(new Book("Etienne Gilson", "De Aristóteles a Darwin (y vuelta)", "Eunsa", "1980", "2ª ed.",
                "Filoextranjera"));
        b.add(new Book("Etienne Gilson", "Elementos de filosofía cristiana", "Rialp", "1969", "", "Filoextranjera"));
        b.add(new Book("Lawrence Krader", "Los apuntes etnológicos de Karl Marx", "Siglo XXI", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Platón", "Protágoras", "Humanitas", "1983", "", "Filoextranjera"));
        b.add(new Book("Pierre-Maxime Schuhl", "La obra de Platón", "Hachete", "1954", "", "Filoextranjera"));
        b.add(new Book("Paul Friedländer", "Platón verdad del ser y realidad de vida", "Tecnos", "1989", "",
                "Filoextranjera"));
        b.add(new Book("Varios autores", "Si los astros estuviesen habitados", "Fº de Cultura", "1964", "",
                "Filoextranjera"));
        b.add(new Book("Georges Bataille", "Documentos", "Monte Avila", "1969", "", "Filoextranjera"));
        b.add(new Book("Elemire Zolla", "Historia de la imaginación viciosa", "Monte Avila", "1968", "",
                "Filoextranjera"));
        b.add(new Book("Federico Rin", "Ensayos sobre Sartre", "Monte Avila", "1968", "", "Filoextranjera"));
        b.add(new Book("Jean Grenier", "Sobre el espíritu de ortodoxia", "Monte Avila", "1969", "", "Filoextranjera"));
        b.add(new Book("Paul-Laurent Assoun", "Freud y Nietzsche", "F. C. E.", "1984", "", "Filoextranjera"));
        b.add(new Book("Bryan Magee", "Los hombres detrás de las ideas", "F. C. E.", "1982", "", "Filoextranjera"));
        b.add(new Book("Paul Oskar Kristeller", "El pensamiento renacentista y sus fuentes", "F. C. E.", "1982", "",
                "Filoextranjera"));
        b.add(new Book("Enrique D. Dussel", "Método para una filosofía de la liberación", "Sígueme", "1974", "",
                "Filoextranjera"));
        b.add(new Book("L. Séchan", "El mito de Prometeo", "Eudeba", "1960", "", "Filoextranjera"));
        b.add(new Book("J. C. Friedrich Hölderlin", "Fragmento de Hiperión", "Er", "1986", "", "Filoextranjera"));
        b.add(new Book("Feliciano Blázquez  Carmona", "La filosofía de Gabriel Marcel", "Encuentro", "1988", "",
                "Filoextranjera"));
        b.add(new Book("J. Brun", "Platón y la academia", "Eudeba", "1961", "", "Filoextranjera"));
        b.add(new Book("J. Brun", "Aristóteles y el liceo", "Eudeba", "1963", "", "Filoextranjera"));
        b.add(new Book("Claude Cuénot", "P. Teilhard de Chardín Etapas de su evolución", "Taurus", "1967", "",
                "Filoextranjera"));
        b.add(new Book("Dante Alighieri", "El convite. Monarquía. Disputa...", "C. Lectores", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Richard H. Popkin", "La Hª del escepticismo desde Erasmo hasta Spinosa", "F. C. E.", "1983",
                "", "Filoextranjera"));
        b.add(new Book("Franklin L. Baumer", "El pensamiento europeo moderno. Continuidad y cambio...", "F. C. E.",
                "1985", "", "Filoextranjera"));
        b.add(new Book("Norbert Elías", "Sobre el tiempo", "F. C. E.", "1989", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "Lo demoníaco", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "La hora de Job", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "El mito de la pena", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "Ideas que hicieron nuestro tiempo", "Monte Avila", "1970", "",
                "Filoextranjera"));
        b.add(new Book("Varios autores", "El gran inquisidor", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "La muerte de Dios", "Monte Avila", "1970", "", "Filoextranjera"));
        b.add(new Book("Bernard Henri-Levi", "La barbarie con rostro humano", "Monte Avila", "1978", "",
                "Filoextranjera"));
        b.add(new Book("Leszek Kolakowski", "Conversaciones con el diablo", "Monte Avila", "1977", "", "Filoextranjera"));
        b.add(new Book("H. A. Murena", "Folisofía", "Monte Avila", "1976", "", "Filoextranjera"));
        b.add(new Book("Tito Perlini", "La escuela de Francfort", "Monte Avila", "1976", "", "Filoextranjera"));
        b.add(new Book("Roland Barthes", "Sade, Loyola, Fourier", "Monte Avila", "1977", "", "Filoextranjera"));
        b.add(new Book("Havelock Ellis", "Mi vida Tomos I y II", "Felmar", "1976", "", "Filoextranjera"));
        b.add(new Book("David Cooper", "La muerte de la familia", "Ariel", "1976", "", "Filoextranjera"));
        b.add(new Book("J. O. Urmson", "El análisis filosófico", "Ariel", "1978", "", "Filoextranjera"));
        b.add(new Book("Stephan Körner", "Qué es filosofía", "Ariel", "1975", "", "Filoextranjera"));
        b.add(new Book("Robert Haremann", "Dialéctica sin dogma", "Ariel", "1967", "", "Filoextranjera"));
        b.add(new Book("W. V. Quine", "Los métodos de la lógica", "Ariel", "1969", "2ª reimp.", "Filoextranjera"));
        b.add(new Book("M. I. Finley", "Aspectos de la antigüedad", "Ariel", "1975", "", "Filoextranjera"));
        b.add(new Book("Pierre Bayle", "Diccionario histórico y crítico", "C. Lectores", "1995", "", "Filoextranjera"));
        b.add(new Book("P. Bürger y otros", "Estética de la recepción", "Arcolibros, S.A.", "1987", "",
                "Filoextranjera"));
        b.add(new Book("Edmund Hussel", "Meditaciones cartesianas", "F. C. E.", "1985", "", "Filoextranjera"));
        b.add(new Book("Eduardo Nicol", "La idea del hombre", "F. C. E.", "1977", "", "Filoextranjera"));
        b.add(new Book("Eduardo Nicol", "El porvenir de la filosofía", "F. C. E.", "1972", "", "Filoextranjera"));
        b.add(new Book("Ernst Cassirer", "Filosofía de las formas simbólicas I", "F. C. E.", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Ernst Cassirer", "Filosofía de las formas simbólicas II", "F. C. E.", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Ernst Cassirer", "Filosofía de las formas simbólicas III", "F. C. E.", "1976", "",
                "Filoextranjera"));
        b.add(new Book("Paul Benichon", "El tiempo de los profetas", "F. C. E.", "1984", "", "Filoextranjera"));
        b.add(new Book("Eugene Lunn", "Marxismo y modernismo", "F. C. E.", "1986", "", "Filoextranjera"));
        b.add(new Book("C. R. Hallpike", "Los fundamentos del pensamiento primitivo", "F. C. E.", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Pierre Chaunu", "El pronóstico del futuro", "Herder", "1982", "", "Filoextranjera"));
        b.add(new Book("Edmund Hussel", "La idea de la fenomenología", "F. C. E.", "1982", "", "Filoextranjera"));
        b.add(new Book("Hugo Margain", "Racionalidad, lenguaje filosofía", "F. C. E.", "1978", "", "Filoextranjera"));
        b.add(new Book("Fritz Wenisch", "La filosofía y su método", "F. C. E.", "1987", "", "Filoextranjera"));
        b.add(new Book("Javier Sádaba", "Lenguaje, magia y metafísica (El otro Wittgenstein)", "Pluma-Rota", "1984",
                "", "Filoextranjera"));
        b.add(new Book("Martin Kriele", "Liberación e ilustración", "Herder", "1982", "", "Filoextranjera"));
        b.add(new Book("Marianus Müller", "Angustia y esperanza", "Herder", "1956", "", "Filoextranjera"));
        b.add(new Book("Wolfhart Paaenberg", "El hombre como problema", "Herder", "1976", "", "Filoextranjera"));
        b.add(new Book("Schopenhauer Ed. A. I. Rábade", "Antología", "Península", "1989", "", "Filoextranjera"));
        b.add(new Book("Paul Goodman", "La nueva reforma Un nuevo manifiesto anarquista", "Kairos", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Jean Bernhard y otros", "Divorcio e indisolubilidad del matrimonio", "Herder", "1963", "",
                "Filoextranjera"));
        b.add(new Book("Emerich Coreth", "¿Qué es el hombre?", "Herder", "1980", "", "Filoextranjera"));
        b.add(new Book("Arno Auzenbacher", "Introducción a la filosofía", "Herder", "1984", "", "Filoextranjera"));
        b.add(new Book("David Bohm", "La totalidad y el orden implicado", "Kairos", "1988", "", "Filoextranjera"));
        b.add(new Book("René Descartes", "Discurso del método", "R. Occidente", "1974", "", "Filoextranjera"));
        b.add(new Book("Eileen Power", "Gente medieval", "Ariel", "1987", "", "Filoextranjera"));
        b.add(new Book("Heinrich Fries", "El nihilismo", "Herder", "1967", "", "Filoextranjera"));
        b.add(new Book("C. F. Bonifaci", "Kierkegaard y el amor", "Herder", "1963", "", "Filoextranjera"));
        b.add(new Book("Marx Ed. De Jacobo Muñoz", "Antología", "Península", "1988", "", "Filoextranjera"));
        b.add(new Book("Romeo de Maio", "Mujer y renacimiento", "Mondadori", "1988", "", "Filoextranjera"));
        b.add(new Book("Carlo Sini", "Pasar el signo", "Mondadori", "1989", "", "Filoextranjera"));
        b.add(new Book("Gaston Bachelard", "Epistemología", "Anagrama", "1973", "", "Filoextranjera"));
        b.add(new Book("Maestro Eckhart", "El fruto de la nada y otros escritos", "Siruela", "1998", "",
                "Filoextranjera"));
        b.add(new Book("Barón D'Holbach", "Sistema de la naturaleza", "Edra. Nacional", "1982", "", "Filoextranjera"));
        b.add(new Book("Ilse M. De Brugger", "Maestro Eckart Tratados y sermones", "Edhasa", "1983", "",
                "Filoextranjera"));
        b.add(new Book("E. Labrousse, R. Zazzo y otros", "Las estructuras y los hombres", "Ariel", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Georges Mounin", "Saussure Presentación y textos", "Anagrama", "1969", "", "Filoextranjera"));
        b.add(new Book("Georges Mounin", "Introducción a la semiología", "Anagrama", "1972", "", "Filoextranjera"));
        b.add(new Book("Varios autores", "La teoría", "Anagrama", "1971", "", "Filoextranjera"));
        b.add(new Book("Guy Rosolato", "Ensayos sobre lo simbólico", "Anagrama", "1974", "", "Filoextranjera"));
        b.add(new Book("Pierre Cabanne", "Conversaciones con Marcel Duchamp", "Anagrama", "1972", "", "Filoextranjera"));
        b.add(new Book("Pierre Legendre", "El amor del censor", "Anagrama", "1979", "", "Filoextranjera"));
        b.add(new Book("Giorgio Colli", "Después de Nietzche", "Anagrama", "1978", "", "Filoextranjera"));
        b.add(new Book("Dominique Lecourt", "Bachelard o el día y la noche", "Anagrama", "1975", "", "Filoextranjera"));
        b.add(new Book("Jean Baudrillard", "El otro por sí mismo", "Anagrama", "1988", "", "Filoextranjera"));
        b.add(new Book("Sigmund Freud Georg Groddeck", "Correspondencia", "Anagrama", "1977", "", "Filoextranjera"));
        b.add(new Book("Juliet Mitchell", "Psicoanálisis y feminismo", "Anagrama", "1976", "", "Filoextranjera"));
        b.add(new Book("G. W. Leibniz", "Nuevos ensayos sobre el entendimiento humano", "Edra. Nacional", "1983",
                "2ª ed.", "Filoextranjera"));
        b.add(new Book("Jean-Michel Palmier", "Introducción a Wilhelm Reich", "Anagrama", "1970", "", "Filoextranjera"));
        b.add(new Book("Willhelm Reich", "Reich habla de Freud", "Anagrama", "1970", "", "Filoextranjera"));
        b.add(new Book("Roger Dadoum", "Cien flores para Wilhelm Reich", "Anagrama", "1978", "", "Filoextranjera"));
        b.add(new Book("Catherine Clément", "Vidas y leyendas de Jacques Lacan", "Anagrama", "1981", "",
                "Filoextranjera"));
        b.add(new Book("Paul Virilio", "Estética de la desesperación", "Anagrama", "1988", "", "Filoextranjera"));
        b.add(new Book("Raymond Bellour", "El libro de los otros", "Anagrama", "1973", "", "Filoextranjera"));
        b.add(new Book("Claude Levi-Strauss", "Historia de Lince", "Anagrama", "1992", "", "Filoextranjera"));
        b.add(new Book("Paolo Caruso", "Conversaciones con Levi-Strauss, Foucault y Lacan", "Anagrama", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Albert Forment", "José Martínez: La epopeya de Ruedo Ibérico", "Anagrama", "2000", "",
                "Filoextranjera"));
        b.add(new Book("Joachim Unseld", "Franz Kafka Una vida de escritor", "Anagrama", "1989", "", "Filoextranjera"));
        b.add(new Book("Jean-Didier Vincent", "Biología de las pasiones", "Anagrama", "1987", "", "Filoextranjera"));
        b.add(new Book("André Glucksmann", "Cinismo y pasión", "Anagrama", "1982", "", "Filoextranjera"));
        b.add(new Book("Ino Rossi y Edward O'Higgins", "Teorías de la cultura y métodos antropológicos", "Anagrama",
                "1981", "", "Filoextranjera"));
        b.add(new Book("John J. Gumperz y Adrian Bennett", "Lenguaje y cultura", "Anagrama", "1981", "",
                "Filoextranjera"));
        b.add(new Book("Maurice Godelier", "Instituciones económicas", "Anagrama", "1981", "", "Filoextranjera"));
        b.add(new Book("Erik Schwimmer", "Religión y cultura", "Anagrama", "1982", "", "Filoextranjera"));
        b.add(new Book("Stanley Diamond y Bernard Belasco", "De la cultura primitiva a la cultura moderna", "Anagrama",
                "1982", "", "Filoextranjera"));
        b.add(new Book("Ira Buchler", "Estudios de parentesco", "Anagrama", "1982", "", "Filoextranjera"));
        b.add(new Book("George Devos", "Antropología psicológica", "Anagrama", "1981", "", "Filoextranjera"));
        b.add(new Book("Pierre Joseph Proudhon", "Apuntes autobiográficos", "EFE", "1987", "2ª ed.", "Filoextranjera"));
        b.add(new Book("Lawrence  Krader e Ino Rossi", "Antropología política", "Anagrama", "1982", "",
                "Filoextranjera"));
        b.add(new Book("Kenneth T. Gallagher", "La filosofía de Gabriel Marcel", "Razon y Fe", "1968", "",
                "Filoextranjera"));
        b.add(new Book("A. R. Radcliffe-Brown", "El método de la antropología social", "Anagrama", "1975", "",
                "Filoextranjera"));
        b.add(new Book("J. S. Kahn", "El concepto de cultura: textos fundamentales", "Anagrama", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Adam Kuper", "Antropología y antropólogos La esc. Británica 1922-1972", "Anagrama", "1973", "",
                "Filoextranjera"));
        b.add(new Book("E. E. Evans-Pritchard", "Los Nuer", "Anagrama", "1977", "", "Filoextranjera"));
        b.add(new Book("M. Kay Martin y Bárbara Voorhies", "La mujer: un enfoque antropológico", "Anagrama", "1978",
                "", "Filoextranjera"));
        b.add(new Book("A. R. Radcliffe-Brown y Daryll Forde (Eds.)", "Sistemas africanos de parentesco y matrimonio",
                "Anagrama", "1982", "", "Filoextranjera"));
        b.add(new Book("Revista Anthropologica", "Anthropologica Nº 2 (1974)", "C. E. A. F.", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Revista Anthropologica", "Anthropologica Nº 3 (1975)", "C. E. A. F.", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Clifford Geertz", "El antropólogo como autor", "Paidos", "1989", "", "Filoextranjera"));
        b.add(new Book("Clifford Geertz", "La interpretación de las culturas", "Gedisa", "1988", "1ª reimp.",
                "Filoextranjera"));
        b.add(new Book("Ludovico Geymonat", "Hª del pensamiento filosófico y científico S. XX/I", "Ariel", "1984", "",
                "Filoextranjera"));
        b.add(new Book("Stanley M. Honer Thomas C. Hunt", "Invitación a la filosofía", "Diana, S.A.", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Ernst Tugendhat", "Problemas de la ética", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("Ludovico Geymonat", "Hª del pensamiento filosófico y científico S. XX/II", "Ariel", "1985", "",
                "Filoextranjera"));
        b.add(new Book("Ludovico Geymonat", "Hª del pensamiento filosófico y científico S. XX/III", "Ariel", "1985",
                "", "Filoextranjera"));
        b.add(new Book("Madame du Châtelet", "Discurso sobre la felicidad", "Cátedra", "1996", "", "Filoextranjera"));
        b.add(new Book("Karl Marx", "Escritos sobre Epicuro", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Empirismo y subjetividad", "Granica", "1977", "", "Filoextranjera"));
        b.add(new Book("Emanuele Severino", "La filosofía antigua", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("Emanuele Severino", "La filosofía moderna", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("Emanuele Severino", "La filosofía contemporánea", "Ariel", "1987", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "La pregunta por la cosa", "Alfa Argent.", "1975", "", "Filoextranjera"));
        b.add(new Book("Stephan Körner", "Cuestiones fundamentales de filosofía", "Ariel", "1984", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Lógica del sentido", "Paidos", "1984", "", "Filoextranjera"));
        b.add(new Book("Kostas Axelos", "Argumentos para una investigación", "Fundamentos", "1973", "",
                "Filoextranjera"));
        b.add(new Book("Eli de Gortari", "Iniciación a la lógica", "Grijalbo, S.A.", "1972", "", "Filoextranjera"));
        b.add(new Book("P. L. Landsberg", "Reflexiones sobre Unamuno", "Cruz del Sur", "1963", "Cruz y Raya",
                "Filoextranjera"));
        b.add(new Book("Teodore Roszak", "El nacimiento de una contracultura", "Kairos", "1970", "", "Filoextranjera"));
        b.add(new Book("Edgar Morin", "Para salir del siglo XX", "Kairos", "1981", "", "Filoextranjera"));
        b.add(new Book("Hal Foster y otros", "La posmodernidad", "Kairos", "1985", "", "Filoextranjera"));
        b.add(new Book("Roland Barthes y otros", "Conversaciones sobre la nueva cultura", "Kairos", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Alan Watts", "El futuro del éxtasis y otras meditaciones", "Kairos", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Bernard Vincent", "Paul Goodman o la recuperación del presente", "Kairos", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Kostas Axelos", "Marx Pensador de la técnica", "Fontanella", "1969", "", "Filoextranjera"));
        b.add(new Book("W. V. Quine", "Las raíces de la referencia", "R. Occidente", "1977", "", "Filoextranjera"));
        b.add(new Book("Jan Lukasiewicz", "Estudios de lógica y filosofía", "R. Occidente", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Peter F. Strawson", "Los límites del sentido", "R. Occidente", "1975", "", "Filoextranjera"));
        b.add(new Book("Franco Basaglia", "La institución negada", "Barral", "1972", "", "Filoextranjera"));
        b.add(new Book("John L. Austin", "Ensayos filosóficos", "R. Occidente", "1975", "", "Filoextranjera"));
        b.add(new Book("Bruno Liebrucks", "Conocimiento y dialéctica", "R. Occidente", "1975", "", "Filoextranjera"));
        b.add(new Book("Harold C. Raley", "Ortega y Gasset Filósofo de la unidad europea", "R. Occidente", "1977", "",
                "Filoextranjera"));
        b.add(new Book("Ferdinand Alquie", "Filosofía del surrealismo", "Barral", "1974", "", "Filoextranjera"));
        b.add(new Book("Jacques Monod", "El azar y la necesidad", "Barral", "1971", "", "Filoextranjera"));
        b.add(new Book("Kostas Axelos", "El pensamiento planetario", "Monte Avila", "1969", "", "Filoextranjera"));
        b.add(new Book("Luigi de Marchi", "Wilhelm Reich Biografía de una idea", "Península", "1974", "",
                "Filoextranjera"));
        b.add(new Book("Bronislaw Malinowski", "Los argonautas del Pacífico occidental", "Península", "1973", "",
                "Filoextranjera"));
        b.add(new Book("Marthe Robert", "Freud y la conciencia judía", "Península", "1976", "", "Filoextranjera"));
        b.add(new Book("Lucien Lévi-Bruhl", "El alma primitiva", "Península", "1974", "", "Filoextranjera"));
        b.add(new Book("Roger Scruton", "Historia de la filosofía moderna", "Península", "1983", "", "Filoextranjera"));
        b.add(new Book("Madeleine Barthelemy-Madaule", "La ideología del azar y la necesidad", "Barral", "1974", "",
                "Filoextranjera"));
        b.add(new Book("José Lezama Lima", "Introducción a los vasos órficos", "Barral", "1971", "", "Filoextranjera"));
        b.add(new Book("Agnes Heller", "Aristóteles y el mundo antiguo", "Península", "1983", "", "Filoextranjera"));
        b.add(new Book("Agnes Heller", "La revolución de la vida cotidiana", "Península", "1982", "", "Filoextranjera"));
        b.add(new Book("Charles Fourier", "Teoría de los cuatro movimientos", "Barral", "1974", "", "Filoextranjera"));
        b.add(new Book("Clement Rosset", "Lógica de lo peor", "Barral", "1976", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "El pliegue Leibniz y el barroco", "Paidos", "1989", "", "Filoextranjera"));
        b.add(new Book("Bruno Bettelheim", "Heridas simbólicas", "Barral", "1975", "", "Filoextranjera"));
        b.add(new Book("Ivan Illich", "Némesis médica", "Barral", "1975", "", "Filoextranjera"));
        b.add(new Book("Walter Kaufmann", "Tragedia y filosofía", "Seix Barral", "1978", "", "Filoextranjera"));
        b.add(new Book("Hannanh  Arendt", "La condición humana", "Seix Barral", "1974", "", "Filoextranjera"));
        b.add(new Book("Michel Gourinat", "Introducción al pensamiento filosófico I, II y III", "Istmo", "1974", "",
                "Filoextranjera"));
        b.add(new Book("William Dunphy", "La nueva moral", "Sígueme", "1972", "", "Filoextranjera"));
        b.add(new Book("Emmanuel Mounier", "La esperanza de los desesperados: Malraux, Camus...", "Tiempo Nuevo",
                "1971", "", "Filoextranjera"));
        b.add(new Book("Pierre Bondog", "Desmenuzando a Nietzsche", "Castellote", "1976", "", "Filoextranjera"));
        b.add(new Book("Alex Comfort", "Darwin y la mujer desnuda", "Seix Barral", "1961", "", "Filoextranjera"));
        b.add(new Book("Jacques Derrida", "La filosofía como institución", "J. Granica", "1984", "", "Filoextranjera"));
        b.add(new Book("A. J. Ayer", "Concepto de persona", "Seix Barral", "1969", "", "Filoextranjera"));
        b.add(new Book("Jacques Derrida y otros", "Doce lecciones de filosofía", "J. Granica", "1983", "",
                "Filoextranjera"));
        b.add(new Book("Jacques Derrida", "Del espíritu Heidegger y la pregunta", "Pre-Textos", "1989", "",
                "Filoextranjera"));
        b.add(new Book("A. J. Ayer", "Ensayos filosóficos", "Ariel", "1979", "", "Filoextranjera"));
        b.add(new Book("Jacques Derrida", "Espolones Los estilos de Nietzche", "Pre-Textos", "1981", "",
                "Filoextranjera"));
        b.add(new Book("Roger Garaudy", "Perspectivas del hombre", "Fontanella", "1970", "", "Filoextranjera"));
        b.add(new Book("Roger Garaudy", "El pensamiento de Hegel", "Seix Barral", "1974", "", "Filoextranjera"));
        b.add(new Book("Roger Garaudy y otros Mayo 68", "Problemas en torno a un cambio de civilización",
                "El laberinto", "1988", "", "Filoextranjera"));
        b.add(new Book("Roger Garaudy y otros", "Lecciones de filosofía marxista", "Grijalbo, S.A.", "1966", "",
                "Filoextranjera"));
        b.add(new Book("Henri Lefebvre", "Manifiesto diferencialista", "Siglo XXI", "1972", "", "Filoextranjera"));
        b.add(new Book("Henri Lefebvre", "Hegel, Marx, Nietzsche", "Siglo XXI", "1976", "", "Filoextranjera"));
        b.add(new Book("Henri Lefebvre", "Introducción a la modernidad", "Tecnos", "1971", "", "Filoextranjera"));
        b.add(new Book("Henri Lefebvre", "La presencia y la ausencia", "F. C. E.", "1983", "", "Filoextranjera"));
        b.add(new Book("Enrique D. Dussel", "El humanismo semita", "Eudeba", "1969", "", "Filoextranjera"));
        b.add(new Book("René Bissiéres", "La búsqueda de la verdad", "Labor, S.A.", "1968", "", "Filoextranjera"));
        b.add(new Book("Arnold J. Toymbee-D. Ikeda", "Escoge la vida", "Emecé", "1980", "", "Filoextranjera"));
        b.add(new Book("Ignace Lepp", "Filosofía cristiana de la existencia", "Carlos Lohlé", "1963", "",
                "Filoextranjera"));
        b.add(new Book("Jacques Maritain", "Humanismo integral", "Carlos Lohlé", "1966", "", "Filoextranjera"));
        b.add(new Book("Louis Dumont", "Introduc. a  dos teorías de la antropología social", "Anagrama", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Ignace Lepp", "La existencia auténtica", "Carlos Lohlé", "1963", "", "Filoextranjera"));
        b.add(new Book("Gaston Bachelard", "La dialéctica de la duración", "Villalar", "1978", "", "Filoextranjera"));
        b.add(new Book("Arnold Toynbee", "Los griegos: herencias y raíces", "F. C. E.", "1988", "", "Filoextranjera"));
        b.add(new Book("Robert Scholes", "Introducción al estructuralismo en la literatura", "Gredos", "1981", "",
                "Filoextranjera"));
        b.add(new Book("A. J. Ayer", "Wittgensteim", "Crítica", "1986", "", "Filoextranjera"));
        b.add(new Book("A. J. Ayer", "Voltaire", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("A. J. Ayer", "La filosofía del siglo XX", "Crítica", "1983", "", "Filoextranjera"));
        b.add(new Book("A. J. Ayer y otros", "La filosofía y los problemas actuales", "Fundamentos", "1981", "",
                "Filoextranjera"));
        b.add(new Book("A. J. Ayer y otros", "Homenaje a Bertrand Russel", "Oikos-Tau, S.A.", "1968", "",
                "Filoextranjera"));
        b.add(new Book("A. J. Ayer, Compilador", "El positivismo lógico", "F. C. E.", "1965", "", "Filoextranjera"));
        b.add(new Book("Theodor W. Adorno", "Crítica cultural y sociedad", "Ariel", "1969", "", "Filoextranjera"));
        b.add(new Book("Theodor W. Adorno", "Intervenciones Nueve modelos de crítica", "Monte Avila", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Hans-Georg Gadamer", "El inicio de la filosofía occidental", "Paidos", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Hans-Georg Gadamer", "La razón en la época de la ciencia", "Alfa", "1981", "", "Filoextranjera"));
        b.add(new Book("Theodor W. Adorno", "Sobre la metacrítica de la teoría del conocimiento", "Monte Avila",
                "1970", "", "Filoextranjera"));
        b.add(new Book("Theodor W. Adorno", "Mínima moralia", "Monte Avila", "1975", "", "Filoextranjera"));
        b.add(new Book("M. Horkheimer T. W. Adorno", "Dialéctica del iluminismo", "Sur", "1970", "", "Filoextranjera"));
        b.add(new Book("Martin Jay", "Adorno", "Siglo XXI", "1988", "", "Filoextranjera"));
        b.add(new Book("Maurice Merleau-Ponty", "Posibilidad de la filosofía", "Narcea, S.A.", "1979", "",
                "Filoextranjera"));
        b.add(new Book("Maurice Merleau-Ponty", "Lo visible y lo invisible", "Seix Barral", "1970", "",
                "Filoextranjera"));
        b.add(new Book("Maurice Merleau-Ponty", "Signos", "Seix Barral", "1964", "", "Filoextranjera"));
        b.add(new Book("Javier Sádaba", "La filosofía moral analítica De Wittgenstein a Tugendhat", "Mondadori",
                "1989", "", "Filoextranjera"));
        b.add(new Book("Luis M. Ravagnan", "Merleau-Ponty", "C.E. América L.", "1967", "", "Filoextranjera"));
        b.add(new Book("Konrad Lorenz", "Los ocho pecados mortales de la humanidad civilizada", "Plaza Janés", "1973",
                "", "Filoextranjera"));
        b.add(new Book("Konrad Lorenz", "Cuando el hombre encontró al perro", "Tusquets", "1975", "", "Filoextranjera"));
        b.add(new Book("Konrad Lorenz", "Sobre la agresión: el pretendido mal", "Siglo XXI", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Konrad Lorenz", "Evolución y modificación de la conducta", "Siglo XXI", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Konrad Lorenz y Paul Leyhausen", "Biología del comportamiento", "Siglo XXI", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Konrad Lorenz  Franz M. Wuketits", "La evolución del pensamiento", "Argos Vergara", "1984", "",
                "Filoextranjera"));
        b.add(new Book("René Girard", "El chivo expiatorio", "Anagrama", "1986", "", "Filoextranjera"));
        b.add(new Book("Yvon Belaval, Dirección de", "Historia de la filosofía Tomos 1 a 11 (1971/1981)", "Siglo XXI",
                "1971", "", "Filoextranjera"));
        b.add(new Book("Jacques Le Goff (Compilador)", "Herejías y sociedades en la Europa preind. S. XI-XVIII",
                "Siglo XXI", "1987", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Diferencia y repetición", "Jucar Univ.", "1988", "", "Filoextranjera"));
        b.add(new Book("José Babini", "El saber", "Nueva Visión", "1957", "", "Filoextranjera"));
        b.add(new Book("René Girard", "Mentira romántica y verdad novelesca", "Anagrama", "1985", "", "Filoextranjera"));
        b.add(new Book("René Girard", "La ruta antigua de los hombres perversos", "Anagrama", "1989", "",
                "Filoextranjera"));
        b.add(new Book("René Girard", "La violencia y lo sagrado", "Anagrama", "1983", "", "Filoextranjera"));
        b.add(new Book("René Girard", "Literatura, mímesis y antropología", "Gedisa", "1984", "", "Filoextranjera"));
        b.add(new Book("Isaiah Berlin", "Lo inevitable de la historia", "Nueva Visión", "1957", "", "Filoextranjera"));
        b.add(new Book("Norman O. Brown", "El cuerpo del amor", "Sudamericana", "1972", "", "Filoextranjera"));
        b.add(new Book("Jürgen Moltmann", "Sobre la libertad, la alegría y el juego", "Sígueme", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Hans-Georg Gadamer", "Verdad y método V. II", "Sígueme", "1992", "", "Filoextranjera"));
        b.add(new Book("Ben-Ami Scharfstein", "Los filósofos y sus vidas", "Cátedra", "1984", "", "Filoextranjera"));
        b.add(new Book("Susanne K. Langer", "Esquemas filosóficos", "Nova", "1962", "", "Filoextranjera"));
        b.add(new Book("Pablo  Evdokimov", "Introducción a Dostoyevsky", "Athenas", "1959", "Intonso", "Filoextranjera"));
        b.add(new Book("H. D. Lewis y R. Lawson Slater", "Religiones orientales y cristianismo", "Labor, S.A.", "1968",
                "", "Filoextranjera"));
        b.add(new Book("Hans Georg Gadamer", "La dialéctica de Hegel", "Cátedra", "1980", "", "Filoextranjera"));
        b.add(new Book("J. C. Friedrich Hölderlin", "Empédocles (teatro)", "Cantalapiedra", "1959", "",
                "Filoextranjera"));
        b.add(new Book("Mauro Wolf", "Sociologías de la vida cotidiana", "Cátedra", "1982", "", "Filoextranjera"));
        b.add(new Book("Immanuel Kant", "Primera introducción a la \"Crítica del juicio\"", "Visor", "1987", "",
                "Filoextranjera"));
        b.add(new Book("Inmanuel Kant", "Lecciones de ética", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("Bruno Bettelheim", "Freud y el alma humana", "Crítica", "1983", "", "Filoextranjera"));
        b.add(new Book("Bruno Bettelheim", "Educación y vida moderna", "Crítica", "1982", "", "Filoextranjera"));
        b.add(new Book("Richard Macksey/Eugenio Donato", "Los lenguajes críticos y las ciencias del hombre", "Barral",
                "1972", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Qué es metafísica. Versión X. Zubiri", "Cruz del Sur", "1963",
                "Curz y Raya", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "El bergsonismo", "Cátedra", "1996", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Nietzche y la filosofía", "Anagrama", "1971", "", "Filoextranjera"));
        b.add(new Book("Louis Althusser, J. Semprún y otros", "Polémica sobre marxismo y humanismo", "Siglo XXI",
                "1968", "", "Filoextranjera"));
        b.add(new Book("Herbert Marcusse", "El marxismo soviético", "R. Occidente", "1967", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Proust y los signos", "Anagrama", "1972", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Qué es la filosofía", "Anagrama", "1995", "3ª ed.", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Serenidad", "Odós", "1989", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "La lógica del sentido", "Barral", "1971", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Estudios sobre mística medieval", "Siruela", "1995", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "De camino al habla", "Odós", "1987", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Conferencias y artículos", "Odós", "1994", "", "Filoextranjera"));
        b.add(new Book("Gianni Vattimo", "Las aventuras de la diferencia", "Península", "1986", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Hitos", "Alianza", "2000", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Conceptos fundamentales", "Alianza", "1989", "", "Filoextranjera"));
        b.add(new Book("Gilbert Maire", "Los instantes privilegiados", "Herrero Hnos.", "1964", "", "Filoextranjera"));
        b.add(new Book("Gianni Vattimo", "El sujeto y la máscara", "Península", "1989", "", "Filoextranjera"));
        b.add(new Book("Javier Sádaba", "Conocer  Wittgenstein y su obra", "Dopesa", "1980", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Ser, verdad y fundamento", "Monte Avila", "1968", "", "Filoextranjera"));
        b.add(new Book("More", "Utopía", "Humanitas", "1983", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger/Eugen Fink", "Heráclito", "Ariel", "1986", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Interpretaciones sobre la poesía de Hölderlin", "Ariel", "1983", "",
                "Filoextranjera"));
        b.add(new Book("Gianni Vattimo", "Introducción a Heidegger", "Gedisa", "1986", "", "Filoextranjera"));
        b.add(new Book("Gianni Vattimo", "El fin de la modernidad", "Gedisa", "1986", "", "Filoextranjera"));
        b.add(new Book("Gianni Vattimo y Pier Aldo Rovatti (Edrs.)", "El pensamiento débil", "Cátedra", "1988", "",
                "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "Principium Sapientiae", "Visor", "1988", "", "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "La teoría platónica del conocimiento", "Paidos", "1982", "", "Filoextranjera"));
        b.add(new Book("Helena Cortés Gabandán", "Claves para una lectura de Hiperión", "Hiperión", "1996", "",
                "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "La teoría platónica del conocimiento", "Paidos", "1968", "", "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "Platón y Parménides", "Visor", "1989", "", "Filoextranjera"));
        b.add(new Book("Peter Sloterdijk", "Crítica de la razón cínica I y II", "Taurus", "1989", "", "Filoextranjera"));
        b.add(new Book("Pierre Aubenque", "El problema del ser de Aristóteles", "Taurus", "1987", "Reimp.",
                "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Ocasiones filosóficas 1912-1951", "Cátedra", "1997", "",
                "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "Sócrates y el pensamiento griego", "Norte y Sur", "1964", "",
                "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "Antes y después de Sócrates", "Ariel", "1980", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Conferencia sobre ética", "Paidos", "1989", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Observaciones", "Siglo XXI", "1986", "2ª ed.", "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "La filosofía no escrita", "Ariel", "1984", "", "Filoextranjera"));
        b.add(new Book("F. M. Cornford", "De la religión a la filosofía", "Ariel", "1984", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Zettel", "Univ. A. México", "1979", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Investigaciones filosóficas", "Crítica", "1986", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Sobre la certidumbre", "Tiempo Nuevo", "1972", "", "Filoextranjera"));
        b.add(new Book("G. W. F. Hegel", "Lecciones sobre filosofía de la religión 1", "Alianza", "1984", "",
                "Filoextranjera"));
        b.add(new Book("G. W. F. Hegel", "Lecciones sobre filosofía de la religión 2 y 3", "Alianza", "1987", "",
                "Filoextranjera"));
        b.add(new Book("G. W. F. Hegel", "Escritos de juventud", "F. C. E.", "1978", "", "Filoextranjera"));
        b.add(new Book("G. W. F. Hegel", "El concepto de religión", "F. C. E.", "1981", "", "Filoextranjera"));
        b.add(new Book("Octavi Piulats", "Antígona y Platón en el jóven Hegel", "Integral", "1989", "",
                "Filoextranjera"));
        b.add(new Book("Varios autores", "La concepción marxista del hombre", "Akal", "1978", "", "Filoextranjera"));
        b.add(new Book("Benjamin Farrington", "Ciencia y filosofía en la antigüedad", "Ariel", "1971", "",
                "Filoextranjera"));
        b.add(new Book("Allan Bloom", "El cierre de la mente moderna", "Plaza Janés", "1989", "", "Filoextranjera"));
        b.add(new Book("François Chatelet", "Crónica de las ideas perdidas", "Mascarón", "1981", "", "Filoextranjera"));
        b.add(new Book("Pierre Chaunu", "El rechazo de la vida", "Espasa-Calpe", "1978", "", "Filoextranjera"));
        b.add(new Book("Ernst Bloch", "Avicena y la izquierda aristotélica", "Ciencia Nueva", "1966", "",
                "Filoextranjera"));
        b.add(new Book("Erasmo de Rotterdam", "Escritos de crítica religiosa y política", "C. Lectores", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Marcel Detienne", "Dioniso a cielo abierto", "Gedisa", "1986", "", "Filoextranjera"));
        b.add(new Book("Eugenio Garin", "La revolución cultural del renacimiento", "Crítica", "1981", "",
                "Filoextranjera"));
        b.add(new Book("Charles S. Peirce", "El hombre, un signo", "Crítica", "1988", "", "Filoextranjera"));
        b.add(new Book("J. J. A. Bertrand", "Cervantes en el país de Fausto", "Cult. Hispánica", "1950", "",
                "Filoextranjera"));
        b.add(new Book("Cornelius Castoriadis", "La institución imaginaria de la sociedad Vol. 2", "Tusquest", "1989",
                "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Diario filosófico (1914-1916)", "Ariel", "1982", "", "Filoextranjera"));
        b.add(new Book("Thomas Hobbes", "Leviatán", "C. Lectores", "1995", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Observaciones sobre los fundamentos de la matemática", "Alianza",
                "1987", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Sobre la certeza", "Gedisa", "1988", "", "Filoextranjera"));
        b.add(new Book("Hanna Fenicgel Pitkin", " Wittgenstein: el lenguaje, la política y la justicia",
                "C. Est. Const.", "1984", "", "Filoextranjera"));
        b.add(new Book("Justus Hartnack", "Wittgenstein y la filosofía contemporánea", "Ariel", "1972", "",
                "Filoextranjera"));
        b.add(new Book("William Warren Bartley III", "Wittgenstein", "Cátedra", "1982", "", "Filoextranjera"));
        b.add(new Book("Hervé Barreau", "Aristóteles", "Edaf", "1978", "", "Filoextranjera"));
        b.add(new Book("Joseph Rassam", "Introduc. a la filosofía de Sto. Tomás de Aquino", "Rialp", "1980", "",
                "Filoextranjera"));
        b.add(new Book("Josef Pieper", "El ocio y la vida intelectual", "Rialp", "1962", "", "Filoextranjera"));
        b.add(new Book("Vittorio Mathieu", "Temas y problemas de la filosofía actual", "Rialp", "1980", "",
                "Filoextranjera"));
        b.add(new Book("Gianfranco Dalmasso", "El lugar de la ideología", "Zero-Zix", "1978", "", "Filoextranjera"));
        b.add(new Book("Emile Poulat", "La crisis modernista (Historia, dogma, crítica)", "Taurus", "1974", "",
                "Filoextranjera"));
        b.add(new Book("J. J. Izurieta Craig", "Introducción a la filosofía T. I y II", "Guadalupe", "1972", "",
                "Filoextranjera"));
        b.add(new Book("José Ferrater Mora y otros", "Las filosofías de Ludwig Wittgenstein", "Oikos-tau", "1966", "",
                "Filoextranjera"));
        b.add(new Book("Cornelius Castoriadis", "Los dominios del hombre: las encrucijadas del lab.", "Gedisa", "1988",
                "", "Filoextranjera"));
        b.add(new Book("Paul Ricoeur", "Ideología y utopía", "Gedisa", "1989", "", "Filoextranjera"));
        b.add(new Book("Adolfo Levi", "Historia de la filosofía romana", "Eudeba", "1969", "", "Filoextranjera"));
        b.add(new Book("B. Zenkovsky", "Historia de la filosofía rusa T. I (fin entrada)", "Eudeba", "1953", "",
                "Filoextranjera"));
        b.add(new Book("G. G. Granger", "La razón (Cuadernos Eudeba)", "Eudeba", "1959", "", "Filoextranjera"));
        b.add(new Book("A. J. Festugiére", "Epicuro y sus dioses", "Eudeba", "1960", "", "Filoextranjera"));
        b.add(new Book("J.-C. Filloux", "La personalidad", "Eudeba", "1962", "2ª ed.", "Filoextranjera"));
        b.add(new Book("L. Geimonat", "El pensamiento científico", "Eudeba", "1961", "", "Filoextranjera"));
        b.add(new Book("Harold Rosenberg", "Descubriendo el presente", "Monte Avila", "1976", "", "Filoextranjera"));
        b.add(new Book("Angel J. Cappelletti", "La filosofía de Heráclito de Efeso", "Monte Avila", "1969", "",
                "Filoextranjera"));
        b.add(new Book("Herbert Marcusse", "El final de la utopía", "Ariel", "1968", "", "Filoextranjera"));
        b.add(new Book("Willem L. Oltmans (compilador)", "Debate sobre el crecimiento", "F. C. E.", "1975", "",
                "Filoextranjera"));
        b.add(new Book("Michel Schmaus", "El problema escatológico", "Herder", "1964", "", "Filoextranjera"));
        b.add(new Book("J. L. Rodríguez García", "F. Hölderlin: El exilado en la tierra I y II", "Univ. Zaragoza",
                "1987", "", "Filoextranjera"));
        b.add(new Book("Wilhelm Waiblinger", "Vida, poesía y locura de Hölderlin", "Hiperión", "1988", "",
                "Filoextranjera"));
        b.add(new Book("David Hume", "Investigación sobre el conocimiento humano...", "C. Lectores", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Aristóteles", "Acerca del cielo", "C. Lectores", "1995", "", "Filoextranjera"));
        b.add(new Book("Michel de Montaigne", "Ensayos", "C. Lectores", "1995", "", "Filoextranjera"));
        b.add(new Book("Wladislaw Jatarkiewicz", "Historia de seis ideas", "Tecnos", "1988", "", "Filoextranjera"));
        b.add(new Book("Bertrand Russel", "Elogio de la ociosidad", "Edhasa", "1989", "1ª reimp.", "Filoextranjera"));
        b.add(new Book("Varios autores", "La concepción marxista del hombre", "Akal", "1978", "", "Filoextranjera"));
        b.add(new Book("Maurice Merleau-Ponty", "Sentido y sinsentido", "Península", "1977", "", "Filoextranjera"));
        b.add(new Book("Ludwig Wittgenstein", "Tractatus logico-philosophicus", "Alianza", "1987", "", "Filoextranjera"));
        b.add(new Book("Morris Berman", "El reencantamiento del mundo", "Cuatro Vientos", "1987", "", "Filoextranjera"));
        b.add(new Book("De Tales a Demócrito", "Fragmentos presocráticos", "C. Lectores", "1995", "", "Filoextranjera"));
        b.add(new Book("Giordano Bruno", "Expulsión de la bestia triunfante", "C. Lectores", "1995", "",
                "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Nietzsche Tomos I y II", "Destino", "2000", "", "Filoextranjera"));
        b.add(new Book("Jaime Labastida", "Producción,  ciencia y sociedad: de Descartes a Marx", "Siglo XXI", "1969",
                "", "Filoextranjera"));
        b.add(new Book("Rene Kraus", "La vida privada y pública de Sócrates", "Sudamericana", "1959", "",
                "Filoextranjera"));
        b.add(new Book("Alain", "El perro que tenía alma de hombre y otras pgs.", "Athenas", "1959", "Intonso",
                "Filoextranjera"));
        b.add(new Book("Giacomo Marramao", "Poder y secularización (en el lomo con \"i\")", "Península", "1989", "",
                "Filoextranjera"));
        b.add(new Book("S. Meliujin", "El problema de lo finito y lo infinito", "Grijalbo, S.A.", "1960", "Intonso",
                "Filoextranjera"));
        b.add(new Book("C. R. Badcock", "Levi-Strauss, el estruct.  y la teoría sociológica", "EFE", "1979", "",
                "Filoextranjera"));
        b.add(new Book("Ignacio Izusquiza", "Henri Bergson: La arquitectura del deseo", "Univ. Zaragoza", "1986", "",
                "Filoextranjera"));
        b.add(new Book("Jean Guitton", "Historia y destino", "Rialp", "1977", "", "Filoextranjera"));
        b.add(new Book("Jean Guitton", "Justificación del tiempo", "Edcnes. Fax", "1967", "", "Filoextranjera"));
        b.add(new Book("Karlfried Graf Dürckheim", "Meditar por qué y cómo", "Mensajero", "1982", "", "Filoextranjera"));
        b.add(new Book("Tomás Campanella", "La ciudad del sol", "Mondadori", "1988", "", "Filoextranjera"));
        b.add(new Book("Anthony A. Long", "La filosofía Helenistica", "R. Occidente", "1977", "", "Filoextranjera"));
        b.add(new Book("Pierre Klossowski", "Nietzsche y el círculo vicioso", "Seix Barral", "1972", "",
                "Filoextranjera"));
        b.add(new Book("Michel Foucault", "Nietzsche, la genealogía, la historia", "Pre-textos", "1988", "",
                "Filoextranjera"));
        b.add(new Book("Werner Ross", "F. Nietzsche El águila angustiada", "Paidos", "1994", "", "Filoextranjera"));
        b.add(new Book("Martin Heidegger", "Desde la experiencia del pensamiento", "Ediciones 62", "1986", "Trilingüe",
                "Filoextranjera"));
        b.add(new Book("Gianni Vattimo", "Introducción a Nietzsche", "Península", "1987", "", "Filoextranjera"));
        b.add(new Book("Gilles Deleuze", "Spinoza, Kant, Nietzsche", "Labor, S.A.", "1974", "", "Filoextranjera"));
        b.add(new Book("Friedrich Nietzsche", "Schopenhauer como educador y otros textos", "C. Lectores", "1996", "",
                "Filoextranjera"));
    }

    private static void fillFiloespanola() {
        final List<Book> b = DB.get("Filoespanola");
        b.add(new Book("Xavier Zubiri", "Cinco lecciones de filosofía", "Soc. E. y Public.", "1963", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Inteligencia sentiente", "Alianza", "1980", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Inteligencia y logos", "Alianza", "1982", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Inteligencia y razón", "Alianza", "1983", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "El hombre y Dios", "Alianza", "1984", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Sobre el hombre", "Alianza", "1986", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Estructura dinámica de la realidad", "Alianza", "1989", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "El problema teologal del hombre: cristianismo", "Alianza", "1997", "",
                "Filoespanola"));
        b.add(new Book("Varios autores", "Homenaje a Xavier Zubiri", "E. Moneda y C.", "1970", "", "Filoespanola"));
        b.add(new Book("J. Ignacio Tellechea Idígoras", "Zubiri 1898-1983", "Gº Vasco", "1984", "", "Filoespanola"));
        b.add(new Book("Realitas Seminario X. Zubiri", "Realitas I Trabajos 1972-1973", "Soc. E.y Public.", "1974", "",
                "Filoespanola"));
        b.add(new Book("Diego Gracia", "Voluntad de verdad Para leer a Zubiri", "Labor, S.A.", "1986", "",
                "Filoespanola"));
        b.add(new Book("Revista Alcalá", "Homenaje a Xavier Zubiri", "Revista  Alcalá", "1953", "", "Filoespanola"));
        b.add(new Book("Germán Marquínez Argote", "En torno a Zubiri", "Studium", "1965", "", "Filoespanola"));
        b.add(new Book("Paulino Garagorri", "Unamuno Ortega Zubiri en la filosofía española", "Plenitud", "1968", "",
                "Filoespanola"));
        b.add(new Book("Varios autores", "Homenaje a Eugenio D'ors", "Edra. Nacional", "1968", "", "Filoespanola"));
        b.add(new Book("Eugenio D'ors", "El secreto de la filosofía", "Tecnos", "1997", "", "Filoespanola"));
        b.add(new Book("Ramón Xirau", "El péndulo y la espiral", "Univ. Veracruz", "1959", "", "Filoespanola"));
        b.add(new Book("Miguel de Unamuno", "Diario íntimo Prólogo Felix García", "Escelicer", "1970", "",
                "Filoespanola"));
        b.add(new Book("Miguel de Unamuno", "De esto y aquello T. I", "Sudamericana", "1950", "", "Filoespanola"));
        b.add(new Book("Antonio Sánchez Barbudo", "Miguel de Unamuno", "Taurus", "1974", "", "Filoespanola"));
        b.add(new Book("François Meyer", "La ontología de M. de Unamuno", "Gredos", "1962", "", "Filoespanola"));
        b.add(new Book("Mario Federici", "La imagen del hombre en la poesía de Unamuno", "Fragua", "1974", "",
                "Filoespanola"));
        b.add(new Book("Carlos París", "Unamuno Estructura de su mundo intelectual", "Península", "1968", "",
                "Filoespanola"));
        b.add(new Book("Arturo Barea", "Unamuno", "Sur", "1959", "", "Filoespanola"));
        b.add(new Book("C. Mendizábal", "Introducción al problema de Unamuno", "Faro de Vigo", "1967", "",
                "Filoespanola"));
        b.add(new Book("Eduardo Ortega y Gasset", "Monodiálogos de D. Miguel de Unamuno", "Ibérica", "1958", "",
                "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "El problema filosófico de la Hª de las religiones", "Alianza", "1993", "",
                "Filoespanola"));
        b.add(new Book("Paulino Garagorri", "Introducción a M. de Unamuno", "Alianza", "1986", "", "Filoespanola"));
        b.add(new Book("Enrique Rivera de Ventosa", "Unamuno y Dios", "Encuentro", "1985", "", "Filoespanola"));
        b.add(new Book("Pedro Cerezo Galán", "Las máscaras de lo trágico (M. Unamuno)", "Trotta", "1996", "",
                "Filoespanola"));
        b.add(new Book("Avelina Cecilia Lafuente", "Antropología filosófica de M. de Unamuno", "Univ. Sevilla", "1983",
                "", "Filoespanola"));
        b.add(new Book("Emilio Salcedo", "Vida de D. Miguel", "Anaya", "1964", "", "Filoespanola"));
        b.add(new Book("Cuadernos Hispanoamericanos", "M. de Unamuno (1864-1936)", "Inst. Coop. Ib.", "1958", "",
                "Filoespanola"));
        b.add(new Book("Diwan", "Unamuno", "Alcrudo", "1981", "", "Filoespanola"));
        b.add(new Book("Quintín Pérez S.J.", "El pensamiento religioso de Unamuno frente a la Iglesia", "Sal Terrae",
                "1946", "", "Filoespanola"));
        b.add(new Book("Antonio Castro y Castro", "Unamuno Testigo del hombre", "Lithoarte", "1976", "", "Filoespanola"));
        b.add(new Book("Carlos Blanco Aguinaga", "El Unamuno contemplativo", "Laia", "1975", "", "Filoespanola"));
        b.add(new Book("Julián Marías", "Miguel de Unamuno", "Espasa Calpe, S.A.", "1943", "", "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "Las palabras y los hombres", "Península", "1972", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Diccionario del espíritu", "Planeta", "1996", "", "Filoespanola"));
        b.add(new Book("Varios autores", "Teoría y sociedad Homenaje al Prof. Aranguren", "Ariel", "1970", "",
                "Filoespanola"));
        b.add(new Book("Luis Farré", "Antropología filosófica", "Guadarrama", "1968", "", "Filoespanola"));
        b.add(new Book("Luis Farré", "Filosofía cristiana, patrística y medieval", "Nova", "1960", "", "Filoespanola"));
        b.add(new Book("Manuel Sacristán", "Sobre Marx y marxismo Panfletos y materiales I", "Icaria", "1983", "",
                "Filoespanola"));
        b.add(new Book("Manuel Sacristán", "Papeles de filosofía Panfletos y materiales II", "Icaria", "1984", "",
                "Filoespanola"));
        b.add(new Book("Manuel Sacristán", "Lecturas Panfletos y materiales IV", "Icaria", "1985", "", "Filoespanola"));
        b.add(new Book("José Ignacio de Alcorta", "El realismo trascendental", "Fax", "1969", "", "Filoespanola"));
        b.add(new Book("Fernando de los Ríos", "Escritos sobre democracia y socialismo", "Taurus", "1974", "",
                "Filoespanola"));
        b.add(new Book("Antoni Mari", "Euforión. Espíritu y naturaleza del genio", "Tecnos", "1989", "", "Filoespanola"));
        b.add(new Book("José Pérez Villamil", "El problema del mundo exterior", "Univ. S. Comp.", "1948", "",
                "Filoespanola"));
        b.add(new Book("Enrique Tierno Galván", "Qué es ser agnóstico", "Tecnos", "1975", "", "Filoespanola"));
        b.add(new Book("Enrique Tierno Galván", "Humanismo y sociedad", "Seix Barral", "1964", "", "Filoespanola"));
        b.add(new Book("Alfredo Llanos", "Los presocráticos y sus fragmentos", "Juárez", "1968", "", "Filoespanola"));
        b.add(new Book("Miguel Benzo Mestre", "Sobre el sentido de la vida", "BAC", "1971", "", "Filoespanola"));
        b.add(new Book("José Camón Aznar", "Cinco pensadores ante el espíritu", "BAC", "1975", "", "Filoespanola"));
        b.add(new Book("Varios autores Conferencias", "Simbolismo, sentido y realidad", "C.S.I.C.", "1979", "",
                "Filoespanola"));
        b.add(new Book("Ramón Valls Plana", "Del yo al nosotros", "Estela", "1971", "", "Filoespanola"));
        b.add(new Book("Ramón Miquel", "La soledad", "Temas de Hoy", "1988", "", "Filoespanola"));
        b.add(new Book("José Luis Abellán", "Panorama de la filosofía española actual", "Espasa Calpe, S.A:", "1978",
                "", "Filoespanola"));
        b.add(new Book("Carlos París", "Hombre y naturaleza", "Tecnos", "1970", "", "Filoespanola"));
        b.add(new Book("Federico Urales", "La evolucion de la filosofía en España", "Laia", "1977", "", "Filoespanola"));
        b.add(new Book("Josef Ramoneda", "Apología del presente", "Península", "1989", "", "Filoespanola"));
        b.add(new Book("Andrés Ortiz Osés", "Metafísica del sentido", "Univ. Deusto", "1989", "", "Filoespanola"));
        b.add(new Book("A. Ortiz-Osés/Aurelio Orensanz", "Contracultura y revolución", "M. Castellote", "1976", "",
                "Filoespanola"));
        b.add(new Book("Jacobo Muñoz", "Lecturas de filosofía contemporánea", "Materiales", "1978", "", "Filoespanola"));
        b.add(new Book("José Antonio Merino", "Ciencia filosofía y existencia", "Encuentro", "1987", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Naturaleza Historia Dios", "Edra. Nacinal", "1978", "7ª ed.", "Filoespanola"));
        b.add(new Book("Eduardo Subirats", "La cultura como espectáculo", "F. C. E.", "1988", "", "Filoespanola"));
        b.add(new Book("Eduardo Subirats", "Utopía y subversión", "Anagrama", "1975", "", "Filoespanola"));
        b.add(new Book("Juan Gil-Albert", "Heraclés Sobre una manera de ser", "Eds. J. B.", "1975", "", "Filoespanola"));
        b.add(new Book("Rafael Gómez Pérez", "Introducción a la metafísica", "Rialp, S.A.", "1978", "", "Filoespanola"));
        b.add(new Book("Fernando Sánchez Dragó", "Del Priscilianismo al liberalismo", "P. E. Iber. S.A.", "1987", "",
                "Filoespanola"));
        b.add(new Book("Ramiro Flórez", "Libertad y liberación", "Univ. Valladolid", "1975", "", "Filoespanola"));
        b.add(new Book("Marino Gómez-Santos", "Gregorio Marañón cuenta su vida", "Aguilar", "1961", "", "Filoespanola"));
        b.add(new Book("José Alsina", "Los grandes períodos de la cultura griega", "Espasa Calpe", "1988", "",
                "Filoespanola"));
        b.add(new Book("Javier Echeverría", "Análisis de la identidad", "J. Granica", "1987", "", "Filoespanola"));
        b.add(new Book("Fernando Uriarte", "Ortega Filosofía y circunstancia", "A. Uni. Chile", "1958", "",
                "Filoespanola"));
        b.add(new Book("Adolfo Sánchez Vázquez", "Filosofía de la praxis", "Grijalbo, S.A.", "1967", "", "Filoespanola"));
        b.add(new Book("Adolfo Sánchez Vázquez", "Escritos de política y filosofía", "Ayuso", "1987", "",
                "Filoespanola"));
        b.add(new Book("Juan Pegueroles", "El pensamiento filosófico de San Agustín", "Labor, S.A.", "1972", "",
                "Filoespanola"));
        b.add(new Book("Félix de Azúa", "La paradoja del primitivo", "Seix Barral", "1983", "", "Filoespanola"));
        b.add(new Book("José Luis Suárez Rodríguez", "Filosofía y Humor El guiño de la lechuza", "Apis", "1988", "",
                "Filoespanola"));
        b.add(new Book("Biblioteca Salvat", "La filosofía hoy", "Salvat", "1973", "", "Filoespanola"));
        b.add(new Book("Universidad de Madrid", "Temas de filosofía", "Coloquio", "1986", "", "Filoespanola"));
        b.add(new Book("María Isabel Lafuente", "Teoría y metodología de la Hª de la filosofía", "Univ. León", "1986",
                "", "Filoespanola"));
        b.add(new Book("Francisco Espinar Lafuente", "Esquema filosófico de la masonería", "Istmo", "1981", "",
                "Filoespanola"));
        b.add(new Book("Miguel Morey", "Camino de Santiago", "F. C. E.", "1987", "", "Filoespanola"));
        b.add(new Book("J. L. Fdez. de Castillejo", "Actualidad y participación", "Tecnos", "1968", "", "Filoespanola"));
        b.add(new Book("Moisés González", "Introducción al pensamiento filosófico", "Tecnos", "1987", "",
                "Filoespanola"));
        b.add(new Book("Guillermo de Torre", "El fiel de la balanza", "Taurus", "1961", "", "Filoespanola"));
        b.add(new Book("José M. R. Delgado", "La felicidad", "Temas de hoy", "1988", "", "Filoespanola"));
        b.add(new Book("Vidal I. Peña García", "El materialismo de Spinoza", "R. Occidente", "1974", "", "Filoespanola"));
        b.add(new Book("Andrés Ollero Tassara", "Dialéctica y praxis en Merleau Ponty", "Univ. Granada", "1971", "",
                "Filoespanola"));
        b.add(new Book("José S. Lasso de la Vega", "Ideales de la formación griega", "Rialp", "1966", "",
                "Filoespanola"));
        b.add(new Book("Josep Picó Compilación de", "Modernidad y posmodernidad", "Alianza", "1988", "", "Filoespanola"));
        b.add(new Book("Jesús Pastor Gómez", "El simbolismo de Tantalio", "Coloquio", "1989", "", "Filoespanola"));
        b.add(new Book("Jaime Balmes", "Obras completas T. II", "BAC", "1968", "", "Filoespanola"));
        b.add(new Book("Manuel Benavides Lucas", "El cometa y el filósofo", "FCE", "1987", "", "Filoespanola"));
        b.add(new Book("Realitas Seminario X. Zubiri", "Realitas II 1974-1975", "Soc. E.y Public.", "1976", "",
                "Filoespanola"));
        b.add(new Book("Andrés Martínez Lorca", "Atomos, hombres y dioses", "Tecnos", "1988", "", "Filoespanola"));
        b.add(new Book("Ramón Soriano", "La ilustración y sus enemigos", "Tecnos", "1988", "", "Filoespanola"));
        b.add(new Book("H. Martin Izquierdo", "El hombre en el pensamiento fiosófico de Occ.", "Esc. Prof. Va.",
                "1980", "", "Filoespanola"));
        b.add(new Book("Pedro Ortega Campos", "Notas para una filosofía de la ilusión", "Encuentro", "1982", "",
                "Filoespanola"));
        b.add(new Book("P. Martín Ortuzar Arriaga", "Los prenotandos del conocimiento natural de Dios", "Monast. Poyo",
                "1963", "", "Filoespanola"));
        b.add(new Book("Carlos A. Baliñas", "El pensamiento de Amor Ruibal", "Edra. Nacional", "1968", "",
                "Filoespanola"));
        b.add(new Book("Plutarco Marsá Vancells", "La mujer en la filosofía", "Fragua", "1976", "", "Filoespanola"));
        b.add(new Book("Varios autores", "El pensamiento alemán contemporáneo", "San Esteban", "1985", "",
                "Filoespanola"));
        b.add(new Book("Magi Cadevall i Soler", "La estructura de la teoría de la evolución", "Univ. Aut. Barna.",
                "1988", "", "Filoespanola"));
        b.add(new Book("Felipe Martínez Marzoa", "Iniciación a la filosofía", "Istmo", "1974", "", "Filoespanola"));
        b.add(new Book("Felipe Martínez Marzoa", "Desconocida raiz común", "Visor", "1987", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "El contenido de la felicidad", "Taurus", "1996", "", "Filoespanola"));
        b.add(new Book("Mariano Artiaga", "Karl Popper: Búsqueda sin término", "E.M.E.S.A.", "1979", "", "Filoespanola"));
        b.add(new Book("Josep LL. Blasco", "Lenguaje, filosofía y conocimiento", "Ariel", "1973", "", "Filoespanola"));
        b.add(new Book("Eusebi Colomer", "De la Edad Media al renacimiento", "Herder", "1975", "", "Filoespanola"));
        b.add(new Book("Félix Duque y otros", "Los confines de la modernidad", "Granica", "1988", "", "Filoespanola"));
        b.add(new Book("Luis Jiménez Moreno", "Nietzsche", "Labor, S.A.", "1972", "", "Filoespanola"));
        b.add(new Book("Fernando Inciarte Armiñán", "El reto del positivismo lógico", "Rialp", "1974", "",
                "Filoespanola"));
        b.add(new Book("Jorge Enjuto Bernal", "La filosofía de Northwhitehead", "Tecnos", "1967", "", "Filoespanola"));
        b.add(new Book("Diego Sabiote Navarro", "El problema del humanismo en E. Fromm y H.Marcusse",
                "Univ. Salamanca", "1983", "", "Filoespanola"));
        b.add(new Book("María Zambrano", "Notas de un método", "Mondadori", "1989", "", "Filoespanola"));
        b.add(new Book("Octavio Fullat", "La moral atea de Albert Camus", "Pubul", "1963", "", "Filoespanola"));
        b.add(new Book("Patricio Peñalver Gómez", "Márgenes de Platón", "Univ. Murcia", "1986", "", "Filoespanola"));
        b.add(new Book("Amparo Moreno Sardá", "La otra \"política\" de Aristóteles", "Icaria", "1988", "",
                "Filoespanola"));
        b.add(new Book("José Luis Arce Carrascoso", "Hombre, conocimiento y sociedad", "PPU", "1987", "",
                "Filoespanola"));
        b.add(new Book("Javier García Sánchez", "Conversaciones con la joven filosofía española", "Península", "1980",
                "", "Filoespanola"));
        b.add(new Book("Pilar Palop Jonquéres", "Epistemología, genética y filosofía", "Ariel", "1981", "",
                "Filoespanola"));
        b.add(new Book("A. López Quintas", "El pensamiento filosófico de Ortega y D'Ors", "Guadarrama", "1972", "",
                "Filoespanola"));
        b.add(new Book("Varios autores Rev. Tiempo de EspañaI I", "España en el desarrollo mediterráneo", "Insula",
                "1964", "", "Filoespanola"));
        b.add(new Book("Ricardo Gullón", "Autobiografías de Unamuno", "Gredos", "1964", "", "Filoespanola"));
        b.add(new Book("Varios autores Rev. Tiempo de España I", "Libertad y organización", "Insula", "1963", "",
                "Filoespanola"));
        b.add(new Book("José María Ripalda", "La nación dividida -Hegel-", "F. C. E.", "1978", "", "Filoespanola"));
        b.add(new Book("José Lorite Mena", "El Parménides de Platón", "F. C. E.", "1985", "", "Filoespanola"));
        b.add(new Book("Antonio Gómez Robledo", "Sócrates  y el socratismo", "F. C. E.", "1988", "2ª ed. Cor/ aum.",
                "Filoespanola"));
        b.add(new Book("Carlos Gurméndez", "Tratado de las pasiones", "F. C. E.", "1985", "", "Filoespanola"));
        b.add(new Book("Carlos Gurméndez", "Crítica de la pasión pura I", "F. C. E.", "1989", "", "Filoespanola"));
        b.add(new Book("José Jiménez", "La vida como azar La complejidad de lo moderno", "Mondadori", "1989", "",
                "Filoespanola"));
        b.add(new Book("Gabriel Albiac", "La sinagoga vacía", "Hiperión", "1987", "", "Filoespanola"));
        b.add(new Book("Angel Rodríguez Luño", "Etica", "Eunsa", "1982", "", "Filoespanola"));
        b.add(new Book("Jacinto Choza", "Conciencia y afectividad", "Eunsa", "1978", "", "Filoespanola"));
        b.add(new Book("Jacinto Choza", "Manual de antropología filosófica", "Rialp", "1988", "", "Filoespanola"));
        b.add(new Book("Ediciones Bellaterra, S.A.", "Diccionario de antropología", "Bellaterra, S.A.", "1980", "",
                "Filoespanola"));
        b.add(new Book("José R. Llobera", "La antropología como ciencia", "Anagrama", "1975", "", "Filoespanola"));
        b.add(new Book("Pedro Cerezo Galán", "La voluntad de aventura", "Ariel", "1984", "", "Filoespanola"));
        b.add(new Book("Victor Gómez Pin", "Filosofía El saber del esclavo", "Anagrama", "1989", "", "Filoespanola"));
        b.add(new Book("Fernando Montero", "Mente y sentido interno en la crítica de la razón pura", "Crítica", "1989",
                "", "Filoespanola"));
        b.add(new Book("Carlos García Gual / Eduardo Costa", "Etica de Epicuro", "Barral", "1974", "Bilingüe",
                "Filoespanola"));
        b.add(new Book("R. Adrados y otros", "Introducción a Homero", "Guadarrama", "1963", "", "Filoespanola"));
        b.add(new Book("Eduardo Haro Tecglen", "Sociedad y terror", "Dopesa", "1977", "2ª ed. (M)", "Filoespanola"));
        b.add(new Book("Javier Sádaba Garay", "Lenguaje religioso y filosofía analítica", "Ariel", "1977", "",
                "Filoespanola"));
        b.add(new Book("Javier Sádaba", "Lecciones de filosofía de la religión", "Mondadori", "1989", "",
                "Filoespanola"));
        b.add(new Book("Jacobo Muñoz", "Lecturas de filosofía contemporánea", "Ariel", "1984", "", "Filoespanola"));
        b.add(new Book("Joaquín Lomba", "El oráculo de Narciso", "Univ. Zaragoza", "1985", "", "Filoespanola"));
        b.add(new Book("Armando Segura", "Emmanuel Principia Philosophica", "Encuentro", "1982", "", "Filoespanola"));
        b.add(new Book("J. Muguerza y R. Rguez. Aramayo (Edts.)", "Kant después de Kant", "Tecnos", "1989", "",
                "Filoespanola"));
        b.add(new Book("Rafael Arrillaga Torrens", "Kant y el idealismo trascendental", "R. Occidente", "1979", "",
                "Filoespanola"));
        b.add(new Book("V. V. A. A.,", "Fª y ciencia en el pensamiento esp. Contemporáneo", "Tecnos", "1973", "",
                "Filoespanola"));
        b.add(new Book("Realitas Seminario X. Zubiri", "Realitas III y IV 1976-1979", "Soc. E.y Public.", "1979", "",
                "Filoespanola"));
        b.add(new Book("Victor Farías", "Heidegger y el nacismo", "Muchnik", "1989", "", "Filoespanola"));
        b.add(new Book("Juan Pegueroles", "El pensamiento filosófico de San Agustín", "Labor", "1972", "",
                "Filoespanola"));
        b.add(new Book("Universidad de Valladolid", "Homenaje a Alfonso Candau", "Univ. Vallad.", "1975", "",
                "Filoespanola"));
        b.add(new Book("Ricardo García Carcel", "La inquisición", "El Sol", "1991", "", "Filoespanola"));
        b.add(new Book("A. Carlos Merchán Fernández", "Los judíos de Valladolid", "Dip. Valladolid", "1976", "",
                "Filoespanola"));
        b.add(new Book("Jaime Contreras", "El Santo Oficio de la Inquisición de Galicia", "Akal", "1982", "",
                "Filoespanola"));
        b.add(new Book("Franz Mussner", "Tratado sobre los judíos", "Sígueme", "1983", "", "Filoespanola"));
        b.add(new Book("Edward Burman", "Los secretos de la inquisicion", "Mnez. Roca", "1988", "", "Filoespanola"));
        b.add(new Book("Cecil Roth", "La inquisición española", "Mnez. Roca", "1989", "", "Filoespanola"));
        b.add(new Book("Henry Kamen", "La inquisición española", "Crítica", "1979", "", "Filoespanola"));
        b.add(new Book("Bartolomé Bennassar", "Inquisición española: poder político y control social", "Crítica",
                "1981", "", "Filoespanola"));
        b.add(new Book("Arthur Stanley Turberville", "La inquisición española (breviarios, 2)", "EFE", "1981",
                "7ª ed.", "Filoespanola"));
        b.add(new Book("Nicolau Eimeric Fco. Peña", "El manual de los inquisidores", "Muchnik", "1983", "",
                "Filoespanola"));
        b.add(new Book("Juan Miguel Blázquez Miguel", "Inquisición y criptojudaismo", "Kaydeda", "1988", "",
                "Filoespanola"));
        b.add(new Book("Juan Miguel Blázquez Miguel", "La Inquisición", "Penthalon", "1988", "", "Filoespanola"));
        b.add(new Book("Sagrario Muñoz Calvo", "Inquisición y ciencia en la España moderna", "Edra. Nacional", "1977",
                "", "Filoespanola"));
        b.add(new Book("Juan Antonio Llorente", "Noticia biográfica (Autobiografía)", "Taurus", "1982", "",
                "Filoespanola"));
        b.add(new Book("Juan Antonio Llorente", "Hª crítica de la Inquisición en España I, II, III y IV", "Hiperión",
                "1980", "", "Filoespanola"));
        b.add(new Book("Fernando Sánchez Dragó", "Gárgoris y Habidis 1, 2, 3 y 4", "Hiperión", "1979", "3ª ed.",
                "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Enfermedad y pecado", "Toray", "1961", "", "Filoespanola"));
        b.add(new Book("Franz Mussner", "Tratado sobre los judíos", "Sígueme", "1983", "", "Filoespanola"));
        b.add(new Book("Leon Poliakov", "Hª del antisemitismo La Europa suicida 1870-1933", "Muchnik", "1981", "",
                "Filoespanola"));
        b.add(new Book("Leon Poliakov", "Hª del antisemitismo De Mahoma a los marranos", "Muchnik", "1982", "",
                "Filoespanola"));
        b.add(new Book("Leon Poliakov", "Hª del antisemitismo El siglo de las luces", "Muchnik", "1984", "",
                "Filoespanola"));
        b.add(new Book("Leon Poliakov", "Hª del antisemitismo De Cristo a los judíos de las cortes", "Muchnik", "1986",
                "", "Filoespanola"));
        b.add(new Book("Ricardo García Carcel", "La inquisición", "El Sol", "1991", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "El estado de enfermedad", "Ed. Moneda y C.", "1968", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Ocio y trabajo", "R. Occidente", "1960", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Sobre la amistad", "R. Occidente", "1972", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Descargo de conciencia 1930-1960", "Barral", "1976", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Antropología de la esperanza", "Guadarrama", "1978", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Historia de la medicina", "Salvat", "1982", "Reimp.", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "La empresa de ser hombre", "Taurus", "1958", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Antropología médica", "Salvat", "1984", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Cencia, técnica y medicina", "Alianza", "1986", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "El cuerpo humano Oriente y Grecia Antigua", "Espasa Calpe", "1987", "",
                "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "El cuerpo humano Teoría actual", "Espasa-Calpe", "1989", "",
                "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "Idea del hombre", "C. Lectores", "1996", "", "Filoespanola"));
        b.add(new Book("Pedro Laín Entralgo", "El problema de ser cristiano", "C. Lectores", "1997", "", "Filoespanola"));
        b.add(new Book("Antonio Millán Puelles", "Fundamentos de filosofía", "Rialp, S.A.", "1969", "6ª ed.",
                "Filoespanola"));
        b.add(new Book("Antonio Millán Puelles", "La función social de los saberes liberales", "Rialp, S.A.", "1961",
                "", "Filoespanola"));
        b.add(new Book("Miguel de Unamuno", "De esto y aquello T. II", "Sudamericana", "1951", "", "Filoespanola"));
        b.add(new Book("Miguel de Unamuno", "De esto y aquello T. III", "Sudamericana", "1953", "", "Filoespanola"));
        b.add(new Book("Miguel de Unamuno", "De esto y aquello T. IV", "Sudamericana", "1954", "", "Filoespanola"));
        b.add(new Book("Antonio Regalado García", "El siervo y el Señor (M. Unamuno)", "Gredos", "1968", "",
                "Filoespanola"));
        b.add(new Book("Julián Marías", "El tiempo que ni vuelve ni tropieza", "Edhasa", "1964", "", "Filoespanola"));
        b.add(new Book("Agustin Basave Fdez. del Valle", "Tratado de metafísica Teoría de la  \"Habencia\"", "Limusa",
                "1982", "", "Filoespanola"));
        b.add(new Book("Gustavo Bueno", "El papel de la filosofía en el conjunto del saber", "Ciencia Nueva", "1970",
                "", "Filoespanola"));
        b.add(new Book("Gustavo Bueno", "La metafísica presocrática", "Pentalfa", "1974", "", "Filoespanola"));
        b.add(new Book("Gustavo Bueno", "El animal divino", "Pentalfa", "1985", "", "Filoespanola"));
        b.add(new Book("Gustavo Bueno", "El mito de la cultura", "Prensa Ibérica", "1996", "", "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "El ser y la muerte", "Aguilar", "1962", "", "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "El ser y la muerte", "Alianza", "1988", "", "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "Modos de hacer filosofía", "Crítica", "1985", "", "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "Ortega y Gasset", "Seix Barral", "1958", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "La filosofía y su sombra", "Seix Barral", "1969", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Lo bello y lo siniestro", "Seix Barral", "1982", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Metodología del pensamiento", "Edhasa", "1970", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Meditación sobre el poder", "Anagrama", "1977", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "El lenguaje del perdón Un ensayo sobre Hegel", "Anagrama", "1981", "",
                "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Los límites del mundo", "Ariel", "1985", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Filosofía del futuro", "Ariel", "1983", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Drama e identidad o bajo el signo de interrogación", "Barral", "1974", "",
                "Filoespanola"));
        b.add(new Book("Emilio Lledó", "El epicureismo", "Montesinos", "1984", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "La aventura filosófica (2 ejemplares)", "Mondadori", "1988", "",
                "Filoespanola"));
        b.add(new Book("Eugenio Trías", "La memoria perdida de las cosas", "Mondadori", "1988", "", "Filoespanola"));
        b.add(new Book("Emilio Lledó", "Filosofía y lenguaje", "Ariel", "1970", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Tratado de la pasión", "Mondadori", "1988", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "Teoría de las ideologías y otros textos afines", "Nexos", "1987", "",
                "Filoespanola"));
        b.add(new Book("Eugenio Trías", "El último de los episodios nacionales", "EFE", "1989", "", "Filoespanola"));
        b.add(new Book("Eugenio Trías", "La edad del espíritu", "Destino", "1994", "", "Filoespanola"));
        b.add(new Book("Emilio Lledó", "Días y libros", "Junta Cª y León", "1994", "", "Filoespanola"));
        b.add(new Book("Emilio Lledó", "El surco del tiempo", "Crítica", "1992", "2ª ed.", "Filoespanola"));
        b.add(new Book("Emilio Lledó", "Memoria de la ética", "Taurus", "1994", "", "Filoespanola"));
        b.add(new Book("Emilio Lledó", "Lenguaje e historia", "Ariel", "1978", "", "Filoespanola"));
        b.add(new Book("Manuel García Morente", "Ejercicios espirituales", "Espasa-Calpe, S.A.", "1961", "",
                "Filoespanola"));
        b.add(new Book("Xavier Rubert de Ventós", "Teoría de la sensibilidad", "Península", "1989", "4ª ed.",
                "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "Implicaciones de la filosofía en la vida contemporánea", "Taurus",
                "1971", "", "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "El cristianismo de Dostoievski", "Taurus", "1970", "",
                "Filoespanola"));
        b.add(new Book("I. Grigulevich", "Historia de la Inquisición", "Progreso", "1980", "", "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "Etica de la felicidad y otros lenguajes", "Tecnos", "1988", "",
                "Filoespanola"));
        b.add(new Book("Carlos París", "Unamuno Estructura de su mundo intelectual", "Anthropos", "1989", "",
                "Filoespanola"));
        b.add(new Book("Universidad de Santiago de Comp.", "Agora Papeles de Filosofía 1", "Univ. Sant Comp.", "1981",
                "", "Filoespanola"));
        b.add(new Book("Manuel Sacristán", "Interveciones políticas Panfletos y materiales III", "Icaria", "1985", "",
                "Filoespanola"));
        b.add(new Book("Universidad de Santiago de Comp.", "Agora Papeles de Filosofía 2", "Univ. Sant. Comp.", "1981",
                "", "Filoespanola"));
        b.add(new Book("Xavier Rubert de Ventós", "El laberinto de la Hispanidad", "Planeta", "1987", "",
                "Filoespanola"));
        b.add(new Book("Enrique Bonete Perales", "Aranguren: La ética entre la religión y la política", "Tecnos",
                "1989", "", "Filoespanola"));
        b.add(new Book("Xavier Rubert de Ventós", "Oficio de Semana Santa", "Kairos", "1979", "", "Filoespanola"));
        b.add(new Book("Xavier Rubert de Ventós", "Filosofía y política", "Península", "1984", "", "Filoespanola"));
        b.add(new Book("Xavier Rubert de Ventós", "La estética y sus herejías", "Anagrama", "1974", "", "Filoespanola"));
        b.add(new Book("José Gaos", "Introducción a la fenomenologia", "Univ. Veracruz", "1960", "", "Filoespanola"));
        b.add(new Book("Victoria Camps, Ed.", "Historia de la ética (III) La ética contemporánea", "Crítica", "1989",
                "", "Filoespanola"));
        b.add(new Book("Victoria Camps, Ed.", "La imaginación ética", "Seix Barral", "1983", "", "Filoespanola"));
        b.add(new Book("Victoria Camps", "Pragmática del lenguaje y filosofía analítica", "Península", "1976", "",
                "Filoespanola"));
        b.add(new Book("Salvador Paniker", "Conversaciones en Madrid", "Kairos", "1969", "", "Filoespanola"));
        b.add(new Book("Salvador Paniker", "La dificultad de ser español y otras contrariedades", "Kairos", "1979", "",
                "Filoespanola"));
        b.add(new Book("Salvador Paniker", "Aproximación al orígen", "Kairos", "1982", "", "Filoespanola"));
        b.add(new Book("Salvador Paniker", "Ensayos retrospectivos", "Kairos", "1987", "", "Filoespanola"));
        b.add(new Book("Salvador Paniker", "Primer testamento", "Seix Barral", "1985", "", "Filoespanola"));
        b.add(new Book("Francisco Pérez Gutiérrez", "Renan en España", "Taurus", "1988", "", "Filoespanola"));
        b.add(new Book("Antonio Márquez", "Los alumbrados Orígenes y filosofía (1525-1529)", "Taurus", "1980",
                "2ª ed.", "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "Etica", "Alianza", "1986", "4ª ed.", "Filoespanola"));
        b.add(new Book("Antonio Rodríguez Huescar", "Con Ortega y otros escritos", "Taurus", "1964", "", "Filoespanola"));
        b.add(new Book("Antonio Rodríguez Huescar", "La innovación metafísica de Ortega", "Mº Ed. Y Ciencia", "1982",
                "", "Filoespanola"));
        b.add(new Book("Luis Trabazo", "¿Violencia o razón?", "Indice", "1969", "", "Filoespanola"));
        b.add(new Book("J. Vázquez E. Guisau", "Aproximación analítica al pensamiento platónico", "Univ. Sant Comp.",
                "1982", "", "Filoespanola"));
        b.add(new Book("Agustín García Calvo", "Razón común Heráclito", "Lucina", "1985", "", "Filoespanola"));
        b.add(new Book("J. F. Yvars", "Modos de persuasión", "Península", "1988", "", "Filoespanola"));
        b.add(new Book("Victor M. Pérez Díaz", "Pueblos y clases sociales en el campo español", "Siglo XXI", "1974",
                "", "Filoespanola"));
        b.add(new Book("Gonzalo Fernández de la Mora", "Filósofos españoles del siglo XX", "Planeta", "1973", "",
                "Filoespanola"));
        b.add(new Book("José A. Ramírez", "Caín", "Planeta", "1965", "", "Filoespanola"));
        b.add(new Book("Varios autores", "Qué es el estoicismo", "PPU", "1988", "", "Filoespanola"));
        b.add(new Book("Alfredo Marcos", "Pierre Duhem: La F. de la ciencia en sus orígenes", "PPU", "1988", "",
                "Filoespanola"));
        b.add(new Book("Fernando Sabater", "Impertinencias y desafíos", "Legasa", "1981", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "Apóstatas razonables", "Madrágora", "1976", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "La piedad apasionada", "Sígueme", "1977", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "De los dioses y del mundo", "F. Torres", "1982", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "Conocer a Nietzsche y su obra", "Dopesa", "1977", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "Ética como amor propio", "Mondadori", "1988", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater", "Invitación a la ética", "Anagrama", "1989", "", "Filoespanola"));
        b.add(new Book("Fernando Sabater, Edición de", "Filosofía y sexualidad", "Anagrama", "1988", "", "Filoespanola"));
        b.add(new Book("Luis Crespo y José Ramoneda M.", "Sobre la Filosofía y su no lugar en el marxismo", "Laia",
                "1974", "", "Filoespanola"));
        b.add(new Book("Rafael Larrañeta", "La preocupación ética", "San Esteban", "1986", "", "Filoespanola"));
        b.add(new Book("Miguel Cruz Hernández", "El pensamiento de Ramón Llull", "Castalia", "1977", "", "Filoespanola"));
        b.add(new Book("Miguel Cruz Hernández", "Historia del pensamiento en el mundo islámico I y II", "Alianza",
                "1981", "", "Filoespanola"));
        b.add(new Book("Josef Ramoneda", "El sentido íntimo Crítica del sentido común", "Muchnik", "1982", "",
                "Filoespanola"));
        b.add(new Book("Lorenzo Peña", "El ente y su ser", "Univ. León", "1985", "", "Filoespanola"));
        b.add(new Book("José Bergamín Prólogo y Selección", "Cruz y Raya Antología", "Turner, S.A.", "1974", "",
                "Filoespanola"));
        b.add(new Book("Agustín García Calvo", "Lecturas presocráticas", "Lucina", "1981", "", "Filoespanola"));
        b.add(new Book("Sergio Pérez Espejo", "La reducción trascendental: medit.  cart. de Husserl", "Athenas",
                "1959", "Intonso", "Filoespanola"));
        b.add(new Book("Cirilo Flórez Miguel", "La filosofía contemporánea", "Univ. Salamanca", "1980", "",
                "Filoespanola"));
        b.add(new Book("Pról.,  trad. y  notas de José Solana", "Los Sofistas . Testimonios y fragmentos",
                "C. Lectores", "1996", "", "Filoespanola"));
        b.add(new Book("Josep Monserrat y Torrens del Prats", "Las transformaciones del platonismo",
                "Univ. Aut. Barna.", "1987", "", "Filoespanola"));
        b.add(new Book("Manuel Abril", "Religión Arte Poesía", "Cruz del Sur", "1962", "Cruz y Raya", "Filoespanola"));
        b.add(new Book("Pascual Casau Muñoz", "El falsacionismo", "Nau Llibres", "1988", "", "Filoespanola"));
        b.add(new Book("Francisco Rico", "El pequeño mundo del hombre", "Alianza", "1986", "", "Filoespanola"));
        b.add(new Book("Juan B. Bergua", "Pitágoras", "Eds. Ibéricas", "1958", "", "Filoespanola"));
        b.add(new Book("Javier Oroz Ezcurra", "Finitud y compromiso", "Univ. Deusto", "1987", "", "Filoespanola"));
        b.add(new Book("Felipe Martínez Marzoa", "Historia de la filosofía Filosofía antigua y medieval I", "Istmo",
                "1973", "", "Filoespanola"));
        b.add(new Book("Luis Racionero", "Filosofías del Underground", "Anagrama", "1977", "", "Filoespanola"));
        b.add(new Book("Luis Racionero", "El mediterráneo y los bárbaros del norte", "Plaza Janés", "1985", "",
                "Filoespanola"));
        b.add(new Book("José Ferrater Mora", "Diccionario de filosofía abreviado", "Edhasa", "1979", "4ª ed.",
                "Filoespanola"));
        b.add(new Book("Laureano Bonet", "La revista Laye Estudio y antología", "Península", "1988", "", "Filoespanola"));
        b.add(new Book("Miguel Morey", "El orden de los acontecimientos", "Península", "1988", "", "Filoespanola"));
        b.add(new Book("Felipe Martínez Marzoa", "Historia de la filosofía Filosofía moderna y contemp. II", "Istmo",
                "1973", "", "Filoespanola"));
        b.add(new Book("Norbert Elías", "La soledad de los moribundos", "F. C. E.", "1987", "", "Filoespanola"));
        b.add(new Book("Adolfo García Ortega", "Un fin de siglo", "F. C. E.", "1988", "", "Filoespanola"));
        b.add(new Book("Rafael Argullol", "Territorio del nómada", "F. C. E.", "1987", "", "Filoespanola"));
        b.add(new Book("José Gaos", "Museo de filósofos", "Univ. México", "1960", "Intonso", "Filoespanola"));
        b.add(new Book("Ramón Garayte", "Nietzsche: su filosofía, su tragedia...", "Mensajero", "1968", "",
                "Filoespanola"));
        b.add(new Book("Domingo Carballo", "… y sobre la esperanza de la metafísica", "Pueyo", "1966", "",
                "Filoespanola"));
        b.add(new Book("José L. Villacañas Berlanga", "Racionalidad crítica", "Tecnos", "1987", "", "Filoespanola"));
        b.add(new Book("Mercé Rius", "T. W. Adorno Del sufrimiento a la verdad", "Laia", "1984", "", "Filoespanola"));
        b.add(new Book("Revista Zona Abierta", "La filosofía actual en España 3 (1975) VER REVISTAS", "Felmar", "1975",
                "", "Filoespanola"));
        b.add(new Book("Ortega y Gasset", "Sobre la razón histórica", "Rta. Occidente", "1979", "", "Filoespanola"));
        b.add(new Book("J. M. Bermudo y otros", "Lo utópico y la utopía", "Integral", "1984", "", "Filoespanola"));
        b.add(new Book("J. M. Bermudo, Dirección", "Los filósofos y sus filosofías 1, 2 y 3", "Vicens-Vives", "", "",
                "Filoespanola"));
        b.add(new Book("Lorenzo Peña", "Fundamentos de ontología dialéctica", "Siglo XXI", "1987", "", "Filoespanola"));
        b.add(new Book("Manuel y Javier Pastor", "Supuesto de la existencia", "Herpas Beal", "1976", "Dedicado",
                "Filoespanola"));
        b.add(new Book("José Jiménez", "El ángel caído", "Anagrama", "1982", "", "Filoespanola"));
        b.add(new Book("Alejandro Llano", "Gnoseología", "Eunsa", "1983", "", "Filoespanola"));
        b.add(new Book("Juan José Sanguineti", "Lógica", "Eunsa", "1982", "", "Filoespanola"));
        b.add(new Book("Tomás Alvira y otros", "Metafísica", "Eunsa", "1982", "", "Filoespanola"));
        b.add(new Book("Mª José Ragué Arias", "California", "Kairos", "1987", "", "Filoespanola"));
        b.add(new Book("Angel Aguirre (Ed.)", "Conceptos clave de la antropología cultural", "Daimon", "1982", "",
                "Filoespanola"));
        b.add(new Book("Angel Aguirre (Ed.)", "Diccionario temático de antropología", "PPU", "1988", "", "Filoespanola"));
        b.add(new Book("José Mª Valverde", "Breve historia y antología de la estética", "Ariel", "1987", "",
                "Filoespanola"));
        b.add(new Book("José Mª Valverde", "Vida y muerte de las ideas", "Ariel", "1989", "", "Filoespanola"));
        b.add(new Book("Xavier Zubiri", "Los problemas fundament. de la metaf.  Occidental", "Alianza", "1994", "",
                "Filoespanola"));
        b.add(new Book("Luis Díez Picazo", "Experiencias jurídicas y teoría del derecho", "Ariel", "1973", "",
                "Filoespanola"));
        b.add(new Book("José Luis Pardo", "La banalidad", "Anagrama", "1989", "", "Filoespanola"));
        b.add(new Book("Antonio Escohotado", "Historias de familia", "Anagrama", "1978", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Victoria Camps, Ed.", "Historia de la ética (I) De los griegos al renacimiento", "Crítica",
                "1987", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Antonio Escohotado", "Di physis a polis", "Anagrama", "1975", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Antonio Rguez. Huescar", "Del amor platónico a la libertad", "Puerta del sol", "1957",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Pedro Banadelli", "Cartas inéditas de M. de U. a Alberto Nin Frías", "La mandrágora", "1962",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Varios autores: Trías, Llovet…", "Col.legi de filosofía (Maneras de hacer filosofía)",
                "Tusquets", "1978", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Marcelino Menéndez y Pelayo", "Historia de los Heterodoxos españoles I y II", "BAC", "1978",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "Moral de la vida cotidiana, personal y religiosa", "Tecnos",
                "1987", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("María Luisa Amigo", "Guía para leer a Platón", "Univ. Deusto", "1989", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Juan J. Rguez. Rosado", "Finito e infinito en Kant", "Fac. F y L Madrid", "1960",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Eugenio Dors", "La ciencia de la cultura", "Rialp", "1964", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Los Cuadernos del Norte", "Prisciliano y el priscilianismo", "G. Summa", "1982",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Novena semana española de Filosofia", "Lenguaje y filosofía Ponencias y comunicaciones",
                "C.S.I.C.", "1969", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Julián Marías", "Nuevos ensayos de filosofía", "R. Occidente", "1968",
                "Intonso,JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Josef Ramoneda, R. de Ventós, Trías", "Conocimiento,  memoria,  invención", "Muchnik", "1982",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("María Helena Sánchez Ortega", "La inquisición y los gitanos", "Taurus", "1988",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Felipe Torroba B.  de Quirós", "Los judíos españoles", "Rivadeneira", "1967",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Tomás Alvira", "Pierre Bayle: pensamientos diversos sobre el cometa", "E.M.E.S.A.", "1977",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("J. M. Bermudo", "La filosofía moderna y su proyección contemporánea", "Barcanova", "1983",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Carlos Beorlegui", "Lecturas de antropología filosófica", "D.D. Brouwer", "1988",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Antonio Gómez Robledo", "Platón Los seis grandes temas de su filosofía", "F. C. E.", "1986",
                "JUDIOS E INQUISICIÓN,2ª reimp.", "Filoespanola"));
        b.add(new Book("José Francisco Ivars", "Conocer  Bertrand Russel y su obra", "Dopesa", "1977",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("M. F. Galiano y otros", "El concepto del hombre en la antigua Grecia", "C. Bermejo", "1955",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Eusebi Colomer", "El pensamiento alemán: de Kant a Heidegger I y II", "Herder", "1986",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Antonio Regalado García", "El laberinto de la razón: Ortega y Heidegger", "Alianza", "1990",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Ramón Xirau", "Palabra y silencio", "Siglo XXI", "1968", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("José A.  Gimbernat", "Ernst Bloch Utopía y esperanza", "Cátedra", "1983",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Ortega y Gasset", "Unas lecciones de metafísica", "Rta. Occidente", "1981",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Florencio Bao", "Diálogos con el viejo profesor", "Planeta", "1988", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Alfredo Fierro Bardají", "El hecho religioso", "Salvat Eds. S.A.", "1981",
                "JUDIOS E INQUISICIÓN,Nº 20", "Filoespanola"));
        b.add(new Book("Yitzhak Baer", "Hª de los judíos en la España cristiana", "Altalena", "1981",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Miguel A. Quintanilla (Director)", "Diccionario de filosofía contemporánea", "Sígueme", "1976",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Carlos Gurméndez", "El tiempo y la dialéctica", "Siglo XXI", "1971", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("José Mª Arias Azpiazu", "La certeza del yo dubitante en la filos. Prekantiana", "Guadarrama",
                "1971", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Juan de Sahagún Lucas, Director", "Antropologías del siglo XX", "Sígueme", "1976",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Cirilo Flórez Miguel", "La filosofía. De los presocráticos a Kant", "Univ. Salamanca", "1979",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Juan Massana Ronquillo", "El cerebro", "Salvat Eds. S.A.", "1983",
                "JUDIOS E INQUISICIÓN,Nº 31, 2ª reimp.", "Filoespanola"));
        b.add(new Book("José Ignacio de Alcorta", "El ser. Pensar transcendental", "Fax", "1961",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("José Bergamín", "La decadencia del analfabetismo y La importancia del d.", "Cruz del Sur",
                "1961", "JUDIOS E INQUISICIÓN,Cruz y Raya", "Filoespanola"));
        b.add(new Book("Félix de Azúa", "El aprendizaje de la decepción", "Pamiela", "1989", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("José Luis López Aranguren", "El oficio de intelectual y la crítica de la crítica", "Vox",
                "1979", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Hugo Múgica", "La palabra inicial", "Trotta", "1995", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Raimundo Paniker", "El silencio del  Dios", "Guadiana", "1970", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("W. F. Pastor", "Fundamentos de Historia de la Filosofía", "Playor", "1988",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Juan G. Atienza", "Guía de los Heterodoxos españoles", "Arin", "1985", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Juan G. Atienza", "Guía de la Inquisición en España", "Arin", "1988", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("Jesús Mosterín", "El pensamiento de la India", "Salvat Eds. S.A.", "1982",
                "JUDIOS E INQUISICIÓN,Nº 62", "Filoespanola"));
        b.add(new Book("José Mª Valverde", "La mente de nuestro siglo", "Salvat Eds. S.A.", "1982",
                "JUDIOS E INQUISICIÓN,Nº 66", "Filoespanola"));
        b.add(new Book("Diego Sánchez Meca", "Aproximación a la filosofía", "Salvat Eds. S.A.", "1982",
                "JUDIOS E INQUISICIÓN,Nº 71", "Filoespanola"));
        b.add(new Book("José Luis Pardo", "Transversales Texto sobre los textos", "Anagrama", "1977",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Antonio Escohotado", "La conciencia infeliz", "R. Occidente", "1972", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("M. F. Galiano y otros", "El concepto del hombre en la antigua Grecia", "C. Bermejo", "1955",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("José Camón Aznar", "La idea del tiempo en Bergson y el impresionismo", "S. Aguirre", "1956",
                "JUDIOS E INQUISICIÓN,Dedicado", "Filoespanola"));
        b.add(new Book("Hilario Rodríguez Sanz", "El problema de los valores en la  Tª  moral de F. Montano",
                "Univ. Salam.", "1948", "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Jesús Mosterín", "Grandes temas de la filosofía actual", "Salvat Eds. S.A.", "1983",
                "JUDIOS E INQUISICIÓN,Nº 56, 1ª reimp.", "Filoespanola"));
        b.add(new Book("Juan G. Atienza", "Guía de la España Griálica", "Arin", "1988", "JUDIOS E INQUISICIÓN",
                "Filoespanola"));
        b.add(new Book("José jiménez Lozano", "Hª de la Inquisición Española de J. A. Llorente", "Hiperion", "1981",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("Palacio de la Merced", "Maimónides y su época", "Ayto. Córdoba", "2000",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));
        b.add(new Book("F. Ramos  -  José Mª  y Jesús Sánchez- Caro", "La muerte: realidad y misterio",
                "Salvat Eds. S.A.", "1982", "JUDIOS E INQUISICIÓN,Nº 92", "Filoespanola"));
        b.add(new Book("Carmen Martin Gaite", "Macanaz, otro paciente de la inquisición", "Destino", "1982",
                "JUDIOS E INQUISICIÓN", "Filoespanola"));

    }

    private static void fillFilocont_2() {
        final List<Book> b = DB.get("Filocont_2");
        b.add(new Book("B. Russell, R. Carnap y otros", "La concepción analítica de la filosofía", "Alianza Univ.",
                "1981", "", "Filocont_2"));
        b.add(new Book("John Passmore", "100 años de filosofía", "Alianza Univ.", "1981", "", "Filocont_2"));
        b.add(new Book("Marvin Harris", "Introducción a la antropología general", "Alianza Univ.", "1981", "",
                "Filocont_2"));
        b.add(new Book("C. Ulises Moulines", "Exploraciones metacientíficas", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("G.Radnitzky, G. Gründerson y otros", "Progreso y racionalidad de la ciencia", "Alianza Univ.",
                "1982", "", "Filocont_2"));
        b.add(new Book("Rom Harré", "El ser social", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("John Hospers", "Introducción al análisis filosófico", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("León Grinberg", "Culpa y depresión", "Alianza Univ.", "1983", "", "Filocont_2"));
        b.add(new Book("Joachim Matthes", "Introducción a la sociología de la religión I y II", "Alianza Univ.",
                "1971", "", "Filocont_2"));
        b.add(new Book("Lewis Mumford", "Técnica y civilización", "Alianza Univ.", "1982", "4ª ed.", "Filocont_2"));
        b.add(new Book("Erwin Panofsky", "Estudios sobre iconología", "Alianza Univ.", "1972", "", "Filocont_2"));
        b.add(new Book("Robin Fox", "Sistemas de parentesco y matrimonio", "Alianza Univ.", "1972", "", "Filocont_2"));
        b.add(new Book("Walter Kaufmann", "Hegel", "Alianza Univ.", "1972", "", "Filocont_2"));
        b.add(new Book("W. V. Quine", "Filosofía de la lógica", "Alianza Univ.", "1981", "3ª ed.", "Filocont_2"));
        b.add(new Book("Rodney M. Coe", "Sociología de la medicina", "Alianza Univ.", "1973", "", "Filocont_2"));
        b.add(new Book("Jagjit Singh", "Teorías de la cosmología moderna", "Alianza Univ.", "1982", "3ª ed.",
                "Filocont_2"));
        b.add(new Book("Selección e introd. de Javier Muguerza", "La concepción analítica de la filosofía I y II",
                "Alianza Univ.", "1974", "", "Filocont_2"));
        b.add(new Book("John G. Taylor", "La nueva física", "Alianza Univ.", "1974", "", "Filocont_2"));
        b.add(new Book("Theodore Caplow", "Dos contra uno: Tª de coaliciones en las triadas", "Alianza Univ.", "1974",
                "", "Filocont_2"));
        b.add(new Book("W. D. Hudson", "La filosofía moral contemporánea", "Alianza Univ.", "1974", "", "Filocont_2"));
        b.add(new Book("George Rosen", "Locura y sociedad", "Alianza Univ.", "1974", "", "Filocont_2"));
        b.add(new Book("Eugen Fink", "La filosofía de Nietzsche", "Alianza Univ.", "1982", "5ª ed.", "Filocont_2"));
        b.add(new Book("John Hospers", "Introducción al análisis filosófico I y II", "Alianza Univ.", "1976", "",
                "Filocont_2"));
        b.add(new Book("Robert H. Lowie", "Religiones primitivas", "Alianza Univ.", "1976", "", "Filocont_2"));
        b.add(new Book("Mary Douglas", "Símbolos naturales", "Alianza Univ.", "1988", "1ª reimp.", "Filocont_2"));
        b.add(new Book("Titus Burckhardt", "La civilización hispano-árabe", "Alianza Univ.", "1982", "4ª ed.",
                "Filocont_2"));
        b.add(new Book("Irenäus Eibl-Eibesfeldt", "El hombre preprogramado", "Alianza Univ.", "1977", "", "Filocont_2"));
        b.add(new Book("S. Körner", "Kant", "Alianza Univ.", "1977", "", "Filocont_2"));
        b.add(new Book("Henry Kamen", "El siglo de Hierro", "Alianza Univ.", "1982", "2ª ed.", "Filocont_2"));
        b.add(new Book("Paul Roazen", "FREUD y sus discípulos", "Alianza Univ.", "1978", "", "Filocont_2"));
        b.add(new Book("Philip W. Silver", "Fenomenología y razón vital", "Alianza Univ.", "1978", "", "Filocont_2"));
        b.add(new Book("José Ferrater Mora", "De la materia a la razón", "Alianza Univ.", "1979", "", "Filocont_2"));
        b.add(new Book("Jonathan Bennett", "La \"Crítica de la razón pura\" de Kant 1 La Analítica", "Alianza Univ.",
                "1979", "", "Filocont_2"));
        b.add(new Book("Aron Gurwitsch", "El campo de la conciencia", "Alianza Univ.", "1979", "", "Filocont_2"));
        b.add(new Book("I. M. Crombie", "Análisis de las doctrinas de Platón I y II", "Alianza Univ.", "1979", "",
                "Filocont_2"));
        b.add(new Book("Stephen E. Toulmin", "El puesto de la razón en la ética", "Alianza Univ.", "1979", "",
                "Filocont_2"));
        b.add(new Book("A. J. Ayer", "Los problemas centrales de la filosofía", "Alianza Univ.", "1979", "",
                "Filocont_2"));
        b.add(new Book("Georg Henrik von Wright", "Explicación y comprensión", "Alianza Univ.", "1979", "",
                "Filocont_2"));
        b.add(new Book("Eric R. Wolf, J. Clyde Mitchell y otros", "Antropología social de las sociedades complejas",
                "Alianza Univ.", "1980", "", "Filocont_2"));
        b.add(new Book("Friedrich Heer", "Europa, madre de revoluciones I y II", "Alianza Univ.", "1980", "",
                "Filocont_2"));
        b.add(new Book("G. W. F. Hegel", "Lecciones sobre la filosofía de la historia universal", "Alianza Univ.",
                "1982", "2ª ed.", "Filocont_2"));
        b.add(new Book("Norman Cohn", "Los demonios familiares de Europa", "Alianza Univ.", "1980", "", "Filocont_2"));
        b.add(new Book("Hans J. Eysenck y Glenn D. Wilson", "El estudio experimental de las teorías freudianas",
                "Alianza Univ.", "1980", "", "Filocont_2"));
        b.add(new Book("Leszek Kolakowski", "Las principales corrientes del marxismo I Los fundadores",
                "Alianza Univ.", "1980", "", "Filocont_2"));
        b.add(new Book("Francisco Rodríguez Adrados", "El mundo de la lírica griega antigua", "Alianza Univ.", "1981",
                "", "Filocont_2"));
        b.add(new Book("Wolfgang Stegmüller", "La concepción estructuralista de las teorías", "Alianza Univ.", "1981",
                "", "Filocont_2"));
        b.add(new Book("Emilio Lamo de Espinosa", "La Tª de la cosificación. De Marx a la esc. de Francfort",
                "Alianza Univ.", "1981", "", "Filocont_2"));
        b.add(new Book("Gerd Brand", "Los textos fundamentales de Ludwig Wittgenstein", "Alianza Univ.", "1981", "",
                "Filocont_2"));
        b.add(new Book("José Ferrater Mora y Priscila Cohn", "Etica aplicada Del aborto a la violencia",
                "Alianza Univ.", "1981", "", "Filocont_2"));
        b.add(new Book("Curt Paul Janz", "Friedrich Nietzsche I.- Infancia y juventud", "Alianza Univ.", "1981", "",
                "Filocont_2"));
        b.add(new Book("Jonathan Bennett", "La \"Crítica de la razón pura\" de Kant 2 La Dialéctica", "Alianza Univ.",
                "1981", "", "Filocont_2"));
        b.add(new Book("G. Harman, J. J. Katz, W. V. Quine y otros", "Sobre Noam Chomsky: Ensayos críticos",
                "Alianza Univ.", "1981", "", "Filocont_2"));
        b.add(new Book("Leszek Kolakowski", "Las principales corrientes del marxismo II La edad de oro",
                "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Gerald Holton", "Ensayos sobre el pensamiento c. en la época de Einstein", "Alianza Univ.",
                "1982", "", "Filocont_2"));
        b.add(new Book("Victor Sánchez de Zavala", "Funcionalismo estructural y generativismo", "Alianza Univ.",
                "1982", "", "Filocont_2"));
        b.add(new Book("A. J. Ayer", "Parte de mi vida", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Marvin Harris", "El materialismo cultural", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Juan López-Morillas", "Racionalismo pragmático El pensamiento de G. de los Rios",
                "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Mercedes Allendesalazar Olaso", "Spinoza Filosofía, pasiones y política", "Alianza Univ.",
                "1988", "", "Filocont_2"));
        b.add(new Book("W. V. Quine", "Las raices de la referencia", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Patrick Suppes", "Estudios de filosofía y metodología de la ciencia", "Alianza Univ.", "1988",
                "", "Filocont_2"));
        b.add(new Book("Ferdinand Tönnies", "Hobbes", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Ronald Grimsley", "La filosofía de Rousseau", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Victoria Camps", "Etica, retórica, política", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Wilhelm Dilthey", "Teoría de las concepciones del mundo", "Alianza Univ.", "1988", "",
                "Filocont_2"));
        b.add(new Book("Francis Bacon", "El avance del saber", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("Compilación de Quentin Skinner", "El retorno de la Gran Teoría en las ciencias humanas",
                "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("John L. Austin", "Ensayos filosóficos", "Alianza Univ.", "1989", "", "Filocont_2"));
        b.add(new Book("G. W. F. Hegel", "Diferencia entre el sistema de fª de Fichte y el de Schelling",
                "Alianza Univ.", "1989", "", "Filocont_2"));
        b.add(new Book("Giordano Bruno", "Expulsión de la bestia triunfante", "Alianza Univ.", "1989", "", "Filocont_2"));
        b.add(new Book("Steven Weinberg", "Los tres primeros minutos del universo", "Alianza Univ.", "1986",
                "6ª reimp.", "Filocont_2"));
        b.add(new Book("Galileo Galilei", "Carta a Cristina de Lorena y otros textos", "Alianza Univ.", "1987", "",
                "Filocont_2"));
        b.add(new Book("Giordano Bruno", "La cena de las cenizas", "Alianza Univ.", "1987", "", "Filocont_2"));
        b.add(new Book("V. I. Arnold", "Teoría de catástrofes", "Alianza Univ.", "1987", "", "Filocont_2"));
        b.add(new Book("George Berkeley", "Tratado sobre los principios del conocimiento humano", "Gredos", "1982", "",
                "Filocont_2"));
        b.add(new Book("Descartes", "Meditaciones metafísicas y otros textos", "Gredos", "1987", "", "Filocont_2"));
        b.add(new Book("Descartes y Leibniz", "Sobre los principios de la filosofía", "Gredos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Nelson R. Orringer", "Unamuno y los protestantes liberales (1912)", "Gredos", "1985", "",
                "Filocont_2"));
        b.add(new Book("Ramiro Flórez", "La dialéctica de la historia en Hegel", "Gredos", "1983", "", "Filocont_2"));
        b.add(new Book("Heleno Saña", "La filosofía de Hegel", "Gredos", "1983", "", "Filocont_2"));
        b.add(new Book("Nelson R. Orringer", "Ortega y sus fuentes germánicas", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Olsen A. Ghirardi", "Hermenéutica del saber", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Juan Miguel Palacios", "El idealismo transcendental: teoría de la verdad", "Gredos", "1979",
                "", "Filocont_2"));
        b.add(new Book("G. S. Kirk, J. E. Raven y M. Schofield", "Los filósofos presocráticos", "Gredos", "1987",
                "2ª ed.", "Filocont_2"));
        b.add(new Book("Jesús-Antonio Collado", "Realidad y conocimiento", "Gredos", "1987", "", "Filocont_2"));
        b.add(new Book("Luis Cencillo", "Historia de la reflexión Tomo II De Ockhan a Lévi-Strauss", "Univ. Comp.",
                "1972", "2ª ed.", "Filocont_2"));
        b.add(new Book("Luis Cencillo", "Tratado de la intimidad y los saberes Tomo I", "Univ. Comp.", "1971", "",
                "Filocont_2"));
        b.add(new Book("Luis Cencillo", "Tratado de las realidades Tomo II", "Univ. Comp.", "1973", "2ª ed.",
                "Filocont_2"));
        b.add(new Book("Luis Cencillo José Luis García", "Antropología cultural: factores psíquicos de la cultura",
                "Guadiana P.", "1976", "", "Filocont_2"));
        b.add(new Book("Emile Durkheim", "Las formas elementales de la vida religiosa", "Akal", "1982", "",
                "Filocont_2"));
        b.add(new Book("J. Fernández Ubiña", "La crisis del s. III y el fin del mundo antiguo", "Akal", "1982", "",
                "Filocont_2"));
        b.add(new Book("Pierre Saintyves", "Las madres vírgenes y los embarazos milagrosos", "Akal", "1985", "",
                "Filocont_2"));
        b.add(new Book("J. J. Bachofen", "El matriarcado", "Akal", "1987", "", "Filocont_2"));
        b.add(new Book("Claude Kappler", "Monstruos, demonios y maravillas a fines de la E. Media", "Akal", "1986", "",
                "Filocont_2"));
        b.add(new Book("Bennett Simon", "Razón y locura en la antigua Grecia", "Akal", "1984", "", "Filocont_2"));
        b.add(new Book("Marc Bloch", "La sociedad feudal", "Akal", "1986", "", "Filocont_2"));
        b.add(new Book("F.  Châtelet y Gérard Mairet (Eds.)", "Historia de las ideologías De los faraones a Mao",
                "Akal", "1989", "", "Filocont_2"));
        b.add(new Book("Franz Cumont", "Las religiones orientales y el paganismo romano", "Akal", "1987", "",
                "Filocont_2"));
        b.add(new Book("F. Vazquez Gª  y A. Moreno Mengíbar", "Sexo y razón Moral sexual en España (S. XVI-XX)",
                "Akal", "1997", "", "Filocont_2"));
        b.add(new Book("W. G. Forrest", "Los orígenes de la democracia griega", "Akal", "1988", "", "Filocont_2"));
        b.add(new Book("M. I. Finley", "Estudios sobre historia antigua", "Akal", "1981", "", "Filocont_2"));
        b.add(new Book("R. Bianchi Bandinelli", "Del Helenismo a la Edad Media", "Akal", "1981", "", "Filocont_2"));
        b.add(new Book("Henri Hubert", "Los celtas y la civilización céltica", "Akal", "1988", "", "Filocont_2"));
        b.add(new Book("Sarah B. Pomeroy", "Diosas, rameras, esposas y esclavas", "Akal", "1987", "", "Filocont_2"));
        b.add(new Book("Marcel Detienne", "Los jardines de Adonis", "Akal", "1983", "", "Filocont_2"));
        b.add(new Book("B. V. Zeigarnik", "Psicopatología", "Akal", "1981", "", "Filocont_2"));
        b.add(new Book("I. M. Rozet", "Psicología de la fantasía", "Akal", "1981", "", "Filocont_2"));
        b.add(new Book("A. Arnauld P. Nicole", "La lógica o el arte de pensar", "Alfaguara", "1987", "", "Filocont_2"));
        b.add(new Book("Laurence Sterne", "La vida y las opiniones del caballero T. Shandy", "Alfaguara", "1978", "",
                "Filocont_2"));
        b.add(new Book("Jacob Böhme", "Aurora", "Alfaguara", "1979", "", "Filocont_2"));
        b.add(new Book("Immanuel Kant", "Crítica de la razón pura", "Alfaguara", "1978", "", "Filocont_2"));
        b.add(new Book("Blaise Pascal", "Obras Pensamientos. Provinciales. Escritos cients.", "Alfaguara", "1981", "",
                "Filocont_2"));
        b.add(new Book("Ramon Llull", "Obra escogida Vida cotánea. Libro de las maravillas", "Alfaguara", "1981", "",
                "Filocont_2"));
        b.add(new Book("Jean-Jacques Rousseau", "Escritos de combate", "Alfaguara", "1979", "", "Filocont_2"));
        b.add(new Book("Voltaire", "Opúsculos satíricos y filosóficos", "Alfaguara", "1978", "", "Filocont_2"));
        b.add(new Book("Giacomo Leopardi", "Poesía y prosa Diario del primer amor. Cantos", "Alfaguara", "1979", "",
                "Filocont_2"));
        b.add(new Book("Confucio", "Mencio Los cuatro libros", "Alfaguara", "1981", "", "Filocont_2"));
        b.add(new Book("Rene Descartes", "Meditaciones metafísicas con objeciones y respuestas", "Alfaguara", "1977",
                "", "Filocont_2"));
        b.add(new Book("Rene Descartes", "Discurso del método, Dióptrica Meteoros y geometría", "Alfaguara", "1981",
                "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Qué es Dios y quién es Dios", "Anthropos", "1986", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Necesidad y azar", "Anthropos", "1985", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Antropología filosófica contemporánea", "Anthropos", "1982", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Antropología y ciencias contemporáneas", "Anthropos", "1983", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Tres ejercicios literario-filosóficos de dialéctica", "Anthropos",
                "1983", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Tres ejercicios literario-filosóficos de economía", "Anthropos",
                "1983", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Tres ejercicios literario-filosóficos de antropología", "Anthropos",
                "1984", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Infinito  Transfinito Finito", "Anthropos", "1984", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Tres ejercicios literario-filosóficos de moral", "Anthropos",
                "1984", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Invitación a filosofar según esp. y letra de A. Machado",
                "Anthropos", "1984", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Tres ejercicios literario-filosóficos de lóg. y metafísica",
                "Anthropos", "1986", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Elogio de la técnica", "Anthropos", "1987", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "De magia a técnica Ensayo de teatro…", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Sobre el Quijote y Don Quijote de la Mancha", "Anthropos", "1991",
                "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Nueve grandes filósofos contemporáneos y sus temas", "Anthropos",
                "1990", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Presente, pasado y porvenir de Marx y el marxismo", "EFE", "1985",
                "2ª ed.", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Introducción literaria a la filosofía", "U. C. Venez.", "1964", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Historia filosófica de la ciencia", "Univ. A. Méx.", "1963", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "7 Modelos de filosofar", "U. C. Venez.", "1963", "", "Filocont_2"));
        b.add(new Book("Talcott Parson", "El sistema social", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Edmund Husserl", "Investigaciones Lógicas I y II", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Harald Fritzsch", "Los quarks, la materia prima de nuestro universo", "Alianza Univ.", "1982",
                "", "Filocont_2"));
        b.add(new Book("Frederick J. Newmeyer", "El primer cuarto de siglo de gramática…(1955-1980)", "Alianza Univ.",
                "1982", "", "Filocont_2"));
        b.add(new Book("Pedro Laín Entralgo", "La medicina hipocrática", "Alianza Univ.", "1982", "", "Filocont_2"));
        b.add(new Book("Curt Paul Janz", "Friedrich Nietzsche 2.-  Los diez años de Basilea", "Alianza Univ.", "1981",
                "", "Filocont_2"));
        b.add(new Book("Guillermo Araya", "El pensamiento de Américo Castro", "Alianza Univ.", "1983", "", "Filocont_2"));
        b.add(new Book("Leszek Kolakowoski", "Las principales corrientes del marxismo III La crisis", "Alianza Univ.",
                "1983", "", "Filocont_2"));
        b.add(new Book("Julián Marías", "ORTEGA *Circunstancia y vocación", "Alianza Univ.", "1983", "", "Filocont_2"));
        b.add(new Book("Julián Marías", "ORTEGA ** Las trayectorias", "Alianza Univ.", "1983", "", "Filocont_2"));
        b.add(new Book("Anthony A. Long", "La filosofía helenística", "Alianza Univ.", "1984", "", "Filocont_2"));
        b.add(new Book("Paul Veyne", "Cómo se escribe la historia Foucault revoluciona la Hª", "Alianza Univ.", "1984",
                "", "Filocont_2"));
        b.add(new Book("José Ferrater Mora", "Fundamentos de filosofía", "Alianza Univ.", "1985", "", "Filocont_2"));
        b.add(new Book("Mario Bunge", "Racionalidad y realismo", "Alianza Univ.", "1985", "", "Filocont_2"));
        b.add(new Book("Jean Paul Sartre", "El ser y la nada", "Alianza Univ.", "1984", "", "Filocont_2"));
        b.add(new Book("Robert Geroch", "La relatividad general (de la A a la B)", "Alianza Univ.", "1985", "",
                "Filocont_2"));
        b.add(new Book("Paulino Garagorri", "La Fª española en el s. XX. Unamuno, Ortega, Zubiri", "Alianza Univ.",
                "1985", "", "Filocont_2"));
        b.add(new Book("Javier Herrero", "Los orígenes del pensamiento reaccionario español", "Alianza Univ.", "1988",
                "", "Filocont_2"));
        b.add(new Book("Carlos Castilla del Pino", "Cuarenta años de psiquiatría", "Alianza Univ.", "1987", "",
                "Filocont_2"));
        b.add(new Book("Mijail Bajtin", "La cultura popular en la E. Media y en el renacimiento", "Alianza Univ.",
                "1987", "", "Filocont_2"));
        b.add(new Book("Helena Béjar", "El ámbito íntimo Privacidad, individualismo y modernidad", "Alianza Univ.",
                "1988", "", "Filocont_2"));
        b.add(new Book("Isaiah Berlin", "Karl Marx", "Alianza Univ.", "1988", "", "Filocont_2"));
        b.add(new Book("James Noxon", "La evolución de la filosofía de Hume", "Alianza Univ.", "1987", "", "Filocont_2"));
        b.add(new Book("Carl G. Hempel", "Fundamentos de la formación de conceptos en c. empírica", "Alianza Univ.",
                "1988", "", "Filocont_2"));
        b.add(new Book("F. W. J. Scheling", "Sistema del idealismo trascendental", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Jesús Conill", "El crepúsculo de la metafísica", "Anthropos", "1988", "", "Filocont_2"));
        b.add(new Book("Martin Heidegger", "Identidad y diferencia", "Anthropos", "1990", "Reimp.", "Filocont_2"));
        b.add(new Book("Javier San Martín", "El sentido de la filosofía del hombre", " Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Vicente Muñiz Rodríguez", "Introducción a la filosofía del lenguaje", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Patricio Peñalver", "Del espíritu al tiempo (Heidegger)", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Ignacio Izuzquiza", "El proyecto filosófico de Juan D. García Bacca", "Anthropos", "1984", "",
                "Filocont_2"));
        b.add(new Book("Alain Guy", "Historia de la filosofía española", "Anthropos", "1985", "", "Filocont_2"));
        b.add(new Book("Andrés Martínez Lorca", "Ensayos sobre la filosofía en Al-andalus", "Anthropos", "1990", "",
                "Filocont_2"));
        b.add(new Book("Ignacio Izuzquiza", "George Santayana o la ironía de la materia", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("José Alsina Clota", "El neoplatonismo", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Carla Cordua", "El mundo ético", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Alexis Philonenko", "Scopenhauer Una filosofía de la tragedia", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("José M. G. Gómez-Heras", "El a priori del mundo de la vida", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Felipe Martínez Marzoa", "Releer a Kant", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("André Dartigues", "La fenomenología", "Herder", "1975", "", "Filocont_2"));
        b.add(new Book("Georges Levesque", "Bergson Vida y muerte del hombre y de Dios", "Herder", "1975", "",
                "Filocont_2"));
        b.add(new Book("Henri Arvon", "Bakunin Absoluto y revolución", "Herder", "1975", "", "Filocont_2"));
        b.add(new Book("C. A. van Peursen", "Orientación filosófica", "Herder", "1975", "", "Filocont_2"));
        b.add(new Book("Manuel A. Suances Marcos", "Max Scheler Principios de una ética personalista", "Herder",
                "1976", "", "Filocont_2"));
        b.add(new Book("Werner Post/Alfred Schmidt", "El materialismo", "Herder", "1976", "", "Filocont_2"));
        b.add(new Book("Nelly Viallaneix", "Kierkegard El único ante Dios", "Herder", "1977", "", "Filocont_2"));
        b.add(new Book("J. M. Bochenski", "¿Qué es autoridad?", "Herder", "1979", "", "Filocont_2"));
        b.add(new Book("Jan M. Broekman", "El estructuralismo", "Herder", "1974", "", "Filocont_2"));
        b.add(new Book("Jean Lacroix", "Filosofía de la culpabilidad", "Herder", "1980", "", "Filocont_2"));
        b.add(new Book("Luis Cuéllar Bassols", "El hombre y la verdad", "Herder", "1981", "", "Filocont_2"));
        b.add(new Book("Béla Freiherr von Brandenstein", "Cuestiones fundamentales de la filosofía", "Herder", "1983",
                "", "Filocont_2"));
        b.add(new Book("Béla Freiherr von Brandenstein", "Problemas de una ética filosófica", "Herder", "1983", "",
                "Filocont_2"));
        b.add(new Book("Heinrich Dumoulin", "Encuentro con el budismo", "Herder", "1982", "", "Filocont_2"));
        b.add(new Book("Giovanni Reale", "Introducción a Aristóteles", "Herder", "1985", "", "Filocont_2"));
        b.add(new Book("Diego Sánchez Meca", "Martin Buber Fundamento existencial", "Herder", "1984", "", "Filocont_2"));
        b.add(new Book("John Thorp", "El libre albedrío", "Herder", "1985", "", "Filocont_2"));
        b.add(new Book("H. G. Hubbeling", "Spinoza", "Herder", "1981", "", "Filocont_2"));
        b.add(new Book("Ingrid Craemer-Ruegenberg", "Alberto Magno", "Herder", "1985", "", "Filocont_2"));
        b.add(new Book("Klaus Fischer", "Galileo Galilei", "Herder", "1986", "", "Filocont_2"));
        b.add(new Book("Otfried Hóffe", "Immanuel Kant", "Herder", "1986", "", "Filocont_2"));
        b.add(new Book("Pilar Lóppez de Santamaría Delgado", "Introducción a Wittgenstein", "Herder", "1986", "",
                "Filocont_2"));
        b.add(new Book("Kurt Salamun", "Karl Jaspers", "Herder", "1987", "", "Filocont_2"));
        b.add(new Book("H. Staudinger y W. Behler", "Preguntas básicas de la reflexión humana", "Herder", "1987", "",
                "Filocont_2"));
        b.add(new Book("Manuel Riobó González", "Fichte, filósofo de la intersubjetividad", "Herder", "1988", "",
                "Filocont_2"));
        b.add(new Book("Manuel Suances Marco", "Arthur Schopenhauer", "Herder", "1989", "", "Filocont_2"));
        b.add(new Book("James L. Peacock", "El enfoque de la antropología", "Herder", "1989", "", "Filocont_2"));
        b.add(new Book("Victor Kraft", "El círculo de Viena", "Taurus", "1986", "Rimp.", "Filocont_2"));
        b.add(new Book("Paul Ricoeur", "Finitud y culpabilidad", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Maurice Merleau-Ponty", "La prosa del mundo", "Taurus", "1971", "", "Filocont_2"));
        b.add(new Book("A. Amorós, Aranguren, Laín y otros", "Estudios sobre la obra de Américo Castro", "Taurus",
                "1971", "", "Filocont_2"));
        b.add(new Book("Carlos Moya", "Teoría sociológica", "Taurus", "1982", "2ª ed.", "Filocont_2"));
        b.add(new Book("Herbert Butterfield", "Los orígenes de la ciencia humana", "Taurus", "1982", "Reimp.",
                "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "La ideología como lenguaje", "Taurus", "1971", "", "Filocont_2"));
        b.add(new Book("Harvey Cox", "Las fiestas de locos (Para una teología feliz)", "Taurus", "1972", "",
                "Filocont_2"));
        b.add(new Book("E. M. Cioran", "Breviario de podredumbre", "Taurus", "1972", "", "Filocont_2"));
        b.add(new Book("Georges Bataille", "Sobre Nietzsche Voluntad de suerte", "Taurus", "1972", "", "Filocont_2"));
        b.add(new Book("Fernando Sabater", "La filosofía tachada", "Taurus", "1972", "", "Filocont_2"));
        b.add(new Book("Fernando Sabater", "La filosofía tachada precedida de Nihilismo y acción", "Taurus", "1978",
                "", "Filocont_2"));
        b.add(new Book("Emmanuel Mounier", "Manifiesto al servicio del personalismo", "Taurus", "1986", "Reimp.",
                "Filocont_2"));
        b.add(new Book("Walter Benjamin", "Discursos interrumpidos I", "Taurus", "1982", "Reimp.", "Filocont_2"));
        b.add(new Book("Georges Bataille", "La experiencia interior", "Taurus", "1972", "", "Filocont_2"));
        b.add(new Book("Eugenio Trías, F. Sabater y otros", "A favor de Nietzsche", "Taurus", "1972", "", "Filocont_2"));
        b.add(new Book("José Luis L. Aranguren", "Moralidades de hoy y de mañana", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Charles Fourier", "La armonía pasional del nuevo mundo", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("E.M. Cioran", "La tentación de existir", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Fernando Sabater", "Apología del sofista", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Giordano Bruno", "Mundo Magia Memoria", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Georg Groddeck", "El libro del ello", "Taurus", "1981", "2ª ed.", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "El libro del filósofo", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Ben Rekers", "Arias Montano", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Martin Jay", "La imaginación dialéctica", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Frances A. Yates", "El arte de la memoria", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Victor Gómez Pin", "El drama de la ciudad ideal", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Julio Caro Baroja", "De la superstición al ateismo", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Georges Bataille", "El culpable", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("E. M. Cioran", "El aciago demiurgo", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Clément Rosset", "La antinaturaleza", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Gilles Deleuze", "Presentación de Sacher-Masoch", "Taurus", "1973", "", "Filocont_2"));
        b.add(new Book("Allan Janik y Stephen Toulmin", "La Viena de Wittgenstein", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Jean Starobinski", "La relación crítica (Psicoanálisis y literatura)", "Taurus", "1974", "",
                "Filocont_2"));
        b.add(new Book("Klaus Dörner", "Ciudadanos y locos Historia social de la Psiquiatría", "Taurus", "1974", "",
                "Filocont_2"));
        b.add(new Book("Alfred Schmidt", "Feuerbach o la sensualidad emancipada", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("Fernando Sabater", "Ensayo sobre Cioran", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("Theodor Reik", "Variaciones psicoanalíticas sobre un tema de Mahler", "Taurus", "1975", "",
                "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Dialéctica negativa", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("Mircea Eliade", "Iniciaciones místicas", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("Georges Bataille", "Teoría de la religión", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("G. W. F. Hegel", "Historia de Jesús", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("Jean Starobinski", "La posesión demoníaca Tres estudios", "Taurus", "1975", "", "Filocont_2"));
        b.add(new Book("Marc Oraison", "El problema homosexual", "Taurus", "1976", "", "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Terminología filosófica I", "Taurus", "1976", "", "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Terminología filosófica II", "Taurus", "1977", "", "Filocont_2"));
        b.add(new Book("Javier Muguerza", "La razón sin esperanza", "Taurus", "1977", "", "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Teoría estética", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Victor Gómez Pin", "Ciencia de la lógica y lógica del sueño", "Taurus", "1978", "",
                "Filocont_2"));
        b.add(new Book("Alma Mahler", "Gustav Mahler Recuerdos y cartas", "Taurus", "1978", "", "Filocont_2"));
        b.add(new Book("Thomas Mermall", "La retórica del humanismo", "Taurus", "1978", "", "Filocont_2"));
        b.add(new Book("Jürgen Habermas", "Conocimiento e interés", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Ludwig Wittgenstein", "Cartas a Russell, Keynes y Moore", "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("F. Secret", "La kabbala cristiana del Renacimiento", "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("Alfredo Fierro", "Sobre la religión Descripción y teoría", "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("Compilación de Johannes Cremerius", "Neurosis y genialidad", "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("Alfredo Deaño", "Las concepciones de la lógica", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("J. G. Caffarena, Hans Mayer y otros", "A favor de Bloch Con un inédito de Ernst Bloch",
                "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Elementos de filosofía", "U. C. Venez.", "1967", "", "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Elementos de filosofía de las ciencias", "U. C. Venez.", "1967", "",
                "Filocont_2"));
        b.add(new Book("Juan David García Bacca", "Ensayos", "Península", "1970", "", "Filocont_2"));
        b.add(new Book("Carlos Beorlegui", "García Bacca La audacia de un pensar", "Univ. Deusto", "1988", "",
                "Filocont_2"));
        b.add(new Book("Ignacio Izuzquiza", "El proyecto filosófico de Juan D. García Bacca", "Anthropos", "1984", "",
                "Filocont_2"));
        b.add(new Book("Antonio Gorri Goñi", "Jean Paul Sartre Un compromiso histórico", "Anthropos", "1986", "",
                "Filocont_2"));
        b.add(new Book("Carlos Gurméndez", "Estudios sobre el amor", "Anthropos", "1985", "", "Filocont_2"));
        b.add(new Book("José Echeverría", "Libro de convocaciones I: Cervantes, Dostoyeski…", "Anthropos", "1986", "",
                "Filocont_2"));
        b.add(new Book("Manuel Ballestero", "El devenir y la apariencia", "Anthropos", "1985", "", "Filocont_2"));
        b.add(new Book("Max Horkheimer", "Ocaso", "Anthropos", "1986", "", "Filocont_2"));
        b.add(new Book("Miguel Morey", "El hombre como argumento", "Anthropos", "1987", "", "Filocont_2"));
        b.add(new Book("José Rubio Carracedo", "El hombre y la ética", "Anthropos", "1987", "", "Filocont_2"));
        b.add(new Book("Joaquín Lomba Fuentes", "Principios de filosofía del arte griego", "Anthropos", "1987", "",
                "Filocont_2"));
        b.add(new Book("Carlos París", "La máquina speculatrix", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Gilbert Azam", "El modernismo desde dentro", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Leopoldo Cea", "Discurso desde la marginación y la barbarie", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Esperanza Guisán (Coord.)", "Esplendor y miseria de la ética kantiana", "Anthropos", "1988",
                "", "Filocont_2"));
        b.add(new Book("Antonio Alegre Gorri", "Historia de la filosofía antigua", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("María Zambrano", "Persona y democracia La historia sacrificial", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Miguel A. Granada", "Cosmología, religión y política en el renacimiento", "Anthropos", "1988",
                "", "Filocont_2"));
        b.add(new Book("Juan José Lahuerta", "1927 La abstracción necesaria en el arte y la arquitect.", "Anthropos",
                "1989", "", "Filocont_2"));
        b.add(new Book("Jacques Derrida", "La estructura y la diferencia", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Salvio Turró", "Descartes. Del hermetismo a la nueva ciencia", "Anthropos", "1985", "",
                "Filocont_2"));
        b.add(new Book("Antonio Alegre Gorri", "Estudios sobre los presocráticos", "Anthropos", "1985", "",
                "Filocont_2"));
        b.add(new Book("Reyes Mate y F.  Niewöhner (Coords.)", "La ilustración en España y Alemania", "Anthropos",
                "1989", "", "Filocont_2"));
        b.add(new Book("Cristina de Peretti", "Jacques Derrida Texto y deconstrucción", "Anthropos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Manuel Cruz", "Por un naturalismo dialéctico", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("X. Palacios y F. Jarauta (Eds.)", "Razón, ética y política El c. de las sociedades modernas",
                "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Esperanza Guisán", "Manifiesto hedonista", "Anthropos", "1990", "", "Filocont_2"));
        b.add(new Book("Andrés Ortiz-Osés", "Mitología cultural y memorias antropológicas", "Anthropos", "1987", "",
                "Filocont_2"));
        b.add(new Book("Johann Jakob Bachofen", "Mitología arcaica y derecho materno", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Alain Verjat (Ed.)", "El retorno de Hermes Hermenéutica y cc. Humanas", "Anthropos", "1989",
                "", "Filocont_2"));
        b.add(new Book("Angel G. Loureiro (Coord.)", "Estelas, laberintos y nuevas sendas. Unamuno, Valle Inclán …",
                "Anthropos", "1988", "", "Filocont_2"));
        b.add(new Book("Andrés Ortiz-Osés", "La nueva filosofía hermenéutica", "Anthropos", "1986", "", "Filocont_2"));
        b.add(new Book("Franz K. Mayr", "La mitología occidental", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Luis Díaz (Coord.)", "Aproximación antropológica a Castilla y León", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book(" Santaló,  Buxó y R.  Becerra (Coords.)", "La religiosidad popular II. Vida y muerte",
                "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("J. A. López Cerezo J. L. Luján López", "El artefacto de la inteligencia", "Anthropos", "1989",
                "", "Filocont_2"));
        b.add(new Book("Carl Mitcham", "¿Qué es la filosofía de la tecnología?", "Anthropos", "1989", "", "Filocont_2"));
        b.add(new Book("Celia Amorós", "Sóren Kierkegard o la subjetividad del caballero", "Anthropos", "1987", "",
                "Filocont_2"));
        b.add(new Book("Juan Luis Vermal", "La crítica de la metafísica de Nietzsche", "Anthropos", "1987", "",
                "Filocont_2"));
        b.add(new Book("Joaquín Maristany", "Sartre. El círculo imaginario. Ontología real de la Imagen", "Anthropos",
                "1987", "", "Filocont_2"));
        b.add(new Book("Javier San Martín", "La fenomenología de Husserl como utopía de la razón", "Anthropos", "1987",
                "", "Filocont_2"));
        b.add(new Book("Fernando Montero", "Retorno a la fenomenología", "Anthropos", "1987", "", "Filocont_2"));
        b.add(new Book("Amelia Valcárcel", "Hegel y la ética", "Anthropos", "1988", "", "Filocont_2"));
        b.add(new Book("Julio Quesada", "Un pensamiento intempestivo (F. Nietzche)", "Anthropos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Kant", "Prolegómenos", "Aguilar", "1968", "5 ed.", "Filocont_2"));
        b.add(new Book("James", "Pragmatismo", "Aguilar", "1967", "4ª ed.", "Filocont_2"));
        b.add(new Book("Santo Tomás de Aquino", "De los principios de la naturaleza", "Aguilar", "1968", "5ª ed.",
                "Filocont_2"));
        b.add(new Book("Taine", "Introducción a la historia de la literatura inglesa", "Aguilar", "1960", "2ª ed.",
                "Filocont_2"));
        b.add(new Book("Platón", "Alcibíades o de la naturaleza del hombre", "Aguilar", "1965", "4ª ed.", "Filocont_2"));
        b.add(new Book("Eckehart", "El libro del consuelo divino", "Aguilar", "1959", "2ª ed.", "Filocont_2"));
        b.add(new Book("Ravaisson", "El Hábito", "Aguilar", "1964", "3ª ed.", "Filocont_2"));
        b.add(new Book("Baumgarten", "Reflexiones filosóficas acerca de la poesía", "Aguilar", "1964", "3ª ed.",
                "Filocont_2"));
        b.add(new Book("Schleiermacher", "Monólogos", "Aguilar", "1955", "", "Filocont_2"));
        b.add(new Book("Boecio", "La consolación de la filosofía", "Aguilar", "1964", "3ª ed.", "Filocont_2"));
        b.add(new Book("San Agustín", "De la vida feliz", "Aguilar", "1969", "4ª ed.", "Filocont_2"));
        b.add(new Book("Leibniz", "Discurso de metafísica", "Aguilar", "1967", "4ª ed.", "Filocont_2"));
        b.add(new Book("Duns Scoto", "Tratado del primer principio", "Aguilar", "1955", "", "Filocont_2"));
        b.add(new Book("Balmes", "De las ideas", "Aguilar", "1963", "3ª ed.", "Filocont_2"));
        b.add(new Book("Stuart Mill", "El utilitarismo", "Aguilar", "1968", "4ª ed.", "Filocont_2"));
        b.add(new Book("Suárez", "De las propiedades del ente en general y de sus principios", "Aguilar", "1961",
                "3ª ed.", "Filocont_2"));
        b.add(new Book("Dewey", "La reconstrucción de la filosofía", "Aguilar", "1964", "3ª ed.", "Filocont_2"));
        b.add(new Book("Plotino", "Eneada primera", "Aguilar", "1963", "3ª ed.", "Filocont_2"));
        b.add(new Book("Kant", "Por qué no es inútil una nueva crítica de la razón pura", "Aguilar", "1963", "3ª ed.",
                "Filocont_2"));
        b.add(new Book("Cousin", "De lo verdadero", "Aguilar", "1969", "", "Filocont_2"));
        b.add(new Book("Maine de Biran", "Autobiografía y otros escritos", "Aguilar", "1956", "", "Filocont_2"));
        b.add(new Book("Hegel", "Introducción a la historia de la filosofía", "Aguilar", "1965", "4ª ed.", "Filocont_2"));
        b.add(new Book("Hume", "Del conocimiento", "Aguilar", "1965", "4ª ed.", "Filocont_2"));
        b.add(new Book("Locke", "Ensayo sobre el entendimiento humano (Compendio)", "Aguilar", "1967", "4ª ed.",
                "Filocont_2"));
        b.add(new Book("Rousseau", "Discurso sobre el orígen de la desigualdad entre los hombres", "Aguilar", "1966",
                "4ª ed.", "Filocont_2"));
        b.add(new Book("Peirce", "Deducción, inducción e hipótesis", "Aguilar", "1970", "", "Filocont_2"));
        b.add(new Book("Condillac", "Lógica y extracto razonado del tratado de las sensaciones", "Aguilar", "1964",
                "3ª ed.", "Filocont_2"));
        b.add(new Book("Vico", "Ppios.  de una Cª nueva sobre la nat. común de las naciones I, II y IV", "Aguilart",
                "1956", "", "Filocont_2"));
        b.add(new Book("Vico", "Una ciencia nueva sobre la naturaleza común de las naciones III", "Aguilar", "1966",
                "3ª ed.", "Filocont_2"));
        b.add(new Book("Pascal", "Opúsculos", "Aguilar", "1964", "3ª ed.", "Filocont_2"));
        b.add(new Book("Spinoza", "Etica", "Aguilar", "1969", "4ª ed.", "Filocont_2"));
        b.add(new Book("Nicolás de Cusa", "La docta ignorancia", "Aguilar", "1957", "", "Filocont_2"));
        b.add(new Book("Leibniz", "Monadología", "Aguilar", "1968", "4ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "Fedón", "Aguilar", "1959", "", "Filocont_2"));
        b.add(new Book("James", "El significado de la verdad", "Aguilar", "1966", "3ª ed.", "Filocont_2"));
        b.add(new Book("Berkeley", "Principios del conocimiento humano", "Aguilar", "1962", "2ª ed.", "Filocont_2"));
        b.add(new Book("Occam", "Tratado sobre los principios de la teología", "Aguilar", "1957", "", "Filocont_2"));
        b.add(new Book("Kierkegaard", "Mi punto de vista", "Aguilar", "1959", "", "Filocont_2"));
        b.add(new Book("Descartes", "Meditaciones metafísicas", "Aguilar", "1970", "6ª ed.", "Filocont_2"));
        b.add(new Book("Farré", "Heráclito (Exposición y fragmentos)", "Aguilar", "1959", "", "Filocont_2"));
        b.add(new Book("Pierre Klossowski", "Tan funesto deseo", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Javier Echeverría", "Sobre el juego", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Pierre Aubenque", "El problema del ser en Aristóteles", "Taurus", "1974", "", "Filocont_2"));
        b.add(new Book("E. M. Cioran", "Del inconveniente de haber nacido", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Isidoro Reguera", "La miseria de la razón El primer Wittgenstein", "Taurus", "1980", "",
                "Filocont_2"));
        b.add(new Book("Edición de Eloy Rada", "La polémica Leibniz-Clarke", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Emmanuel Le Roy Ladurie", "Montaillou, aldea occitana de 1294 a 1324", "Taurus", "1981", "",
                "Filocont_2"));
        b.add(new Book("Henri Arvon", "El anarquismo en el siglo XX", "Taurus", "1979", "", "Filocont_2"));
        b.add(new Book("Georges Duby", "San Bernardo y el arte cisterciense (El nacimiento del gótico)", "Taurus",
                "1981", "", "Filocont_2"));
        b.add(new Book("Eduardo Subirats", "La ilustración insuficiente", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Erik H. Erikson", "Identidad Juventud y crisis", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Carlos García Gual", "Mitos, viajes, héroes", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Eugenio Garin", "Medioevo y renacimiento", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Miguel A. Quintanilla", "A favor de la razón", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Diego Romero de Solís", "Poíesis", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Hermann Bauer", "Historiografía del arte", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Louis Gernet", "Antropología de la Grecia antigua", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("E. E. Evans- Ptitchard", "La religión Nuer", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Marcel Detienne", "Los maestros de verdad en la Grecia arcáica", "Taurus", "1981", "",
                "Filocont_2"));
        b.add(new Book("Fernando Sabater", "La tarea del héroe", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Gilbert Durand", "Las estructuras antropológicas de lo imaginario", "Taurus", "1981", "",
                "Filocont_2"));
        b.add(new Book("Jean Gimpel", "La revolución industrial en la Edad Media", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Josef Simon", "El problema del lenguaje en Hegel", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Robert Klein", "La forma y lo inteligible", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Mircea Eliade", "Memoria I 1907-1937 Las promesas del equinocio", "Taurus", "1982", "",
                "Filocont_2"));
        b.add(new Book("Georges Duby", "El caballero, la mujer y el cura", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Georges Bataille y otros D.  Hollier (ed.)", "El Colegio de Psicología", "Taurus", "1982", "",
                "Filocont_2"));
        b.add(new Book("Karl Kraus", "Contra los periodistas y otros contras", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Eugenio Garin", "Ciencia y vida civil en el renacimiento italiano", "Taurus", "1982", "",
                "Filocont_2"));
        b.add(new Book("José E. Rodríguez-Ibáñez", "El sueño de la razón", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Elias Canetti", "La provincia del hombre Carnet de notas 1942-1972", "Taurus", "1982", "",
                "Filocont_2"));
        b.add(new Book("Louis Dumont", "Homo aequalis Génesis y apogeo de ideología econ.", "Taurus", "1982", "",
                "Filocont_2"));
        b.add(new Book("Henri-Charles Puech", "En torno a la gnosis I", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Wladimir Jankelevitch", "La ironía", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Marcel Detienne", "La muerte de Dionisos", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Jacques Le Goff", "Tiempo, trabajo y cultura en el Occidente medieval", "Taurus", "1983", "",
                "Filocont_2"));
        b.add(new Book("Jean Starobinski", "Jean-Jacques Rousseau La transparencia y el obstác.", "Taurus", "1983", "",
                "Filocont_2"));
        b.add(new Book("Ernst Bloch", "El ateismo en el cristianismo", "Taurus", "1983", "", "Filocont_2"));
        b.add(new Book("Max Weber", "Ensayos sobre sociología de la religión I", "Taurus", "1983", "", "Filocont_2"));
        b.add(new Book("Max Weber", "Ensayos sobre sociología de la religión II", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Max Weber", "Ensayos sobre sociología de la religión III", "Taurus", "1988", "", "Filocont_2"));
        b.add(new Book("Alexander Murray", "Razón y sociedad en la Edad Media", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Ignacio Gómez de Liaño", "El idioma de la religión", "Taurus", "1982", "", "Filocont_2"));
        b.add(new Book("Frank E. Manuel y Fritzie P. Manuel",
                "El pensamiento utópico en el mundo occidental I, II y III", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Ernst Bloch", "Entremundos en la historia de la filosofía", "Taurus", "1984", "", "Filocont_2"));
        b.add(new Book("Karl-Otto Apel", "La transformación de la filosofía I y II", "Taurus", "1985", "", "Filocont_2"));
        b.add(new Book("Jürgen Habermas", "Perfiles filosófico-políticos", "Taurus", "1984", "", "Filocont_2"));
        b.add(new Book("Emilio Lledó", "La memoria del Logos", "Taurus", "1984", "", "Filocont_2"));
        b.add(new Book("Jacques Le Goff", "El nacimiento del purgatorio", "Taurus", "1985", "", "Filocont_2"));
        b.add(new Book("William W. Austin", "La música del siglo XX Tomos I y II", "Taurus", "1985", "", "Filocont_2"));
        b.add(new Book("Hector Berlioz", "Memorias I y II", "Taurus", "1985", "", "Filocont_2"));
        b.add(new Book("Paul Oskar Kristeller", "El pensamiento renacentista y las artes", "Taurus", "1986", "",
                "Filocont_2"));
        b.add(new Book("Antonio Escohotado", "Realidad y sustancia", "Taurus", "1986", "", "Filocont_2"));
        b.add(new Book("Arnold van Gennep", "Los ritos de paso", "Taurus", "1986", "", "Filocont_2"));
        b.add(new Book("G. E. R. Lloyd", "Polaridad y analogía", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Minima moralia", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Jean P. Vernant/Pierre Vidal-Naquet", "Mito y tragedia en la Grecia antigua I", "Taurus",
                "1987", "", "Filocont_2"));
        b.add(new Book("Jean P. Vernant/Pierre Vidal-Naquet", "Mito y tragedia en la Grecia antigua II", "Taurus",
                "1989", "", "Filocont_2"));
        b.add(new Book("Jürgen Habermas", "Teoría de la acción comunitaria I y II", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Walter Benjamin/Gershom Scholem", "Correspondencia 1933-1940", "Taurus", "1987", "",
                "Filocont_2"));
        b.add(new Book("Jesús Aguirre, Duque de Alba", "Altas oportunidades", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Marcel Detienne-Jean Pierre Vernant", "Las artimañas de la inteligencia", "Taurus", "1988", "",
                "Filocont_2"));
        b.add(new Book("Walter Benjamin", "Diario de Moscú", "Taurus", "1987", "", "Filocont_2"));
        b.add(new Book("Victor W. Turner", "El proceso ritual", "Taurus", "1988", "", "Filocont_2"));
        b.add(new Book("Jean Starobinski", "1789, los emblemas de la razón", "Taurus", "1988", "", "Filocont_2"));
        b.add(new Book("Jürgen Habermas", "El discurso filosófico de la modernidad", "Taurus", "1989", "", "Filocont_2"));
        b.add(new Book("Jean Delumeau", "El miedo en Occidente", "Taurus", "1989", "", "Filocont_2"));
        b.add(new Book("Peter Brown", "El mundo en la Antigüedad tardía", "Taurus", "1989", "", "Filocont_2"));
        b.add(new Book("Jean Markale", "Druidas", "Taurus", "1989", "", "Filocont_2"));
        b.add(new Book("Vladimir Jankélévitch", "La aventura, el aburrimiento, lo serio", "Taurus", "1989", "",
                "Filocont_2"));
        b.add(new Book("Thérèse Brosse", "Conciencia-Energía", "Taurus", "1981", "", "Filocont_2"));
        b.add(new Book("Stephen Gilman", "La España de Fernando de Rojas", "Taurus", "1978", "", "Filocont_2"));
        b.add(new Book("Antonio Márquez", "Literatura e inquisición", "Taurus", "1980", "", "Filocont_2"));
        b.add(new Book("Hans Mayer", "Historia maldita de la literatura", "Taurus", "1977", "", "Filocont_2"));
        b.add(new Book("D'Alembert", "Discurso preliminar de la enciclopedia", "Aguilar", "1965", "4ª ed.",
                "Filocont_2"));
        b.add(new Book("Platón", "Fedro, o de la Belleza", "Aguilar", "1968", "6ª ed.", "Filocont_2"));
        b.add(new Book("San Anselmo", "Proslogion", "Aguilar", "1957", "2ª ed.", "Filocont_2"));
        b.add(new Book("Comte", "Discurso sobre el espíritu positivo", "Aguilar", "1971", "6ª ed.", "Filocont_2"));
        b.add(new Book("Cyrano de Bergerac", "El otro mundo I Los estados e imperios de la luna", "Aguilar", "1968",
                "", "Filocont_2"));
        b.add(new Book("San Buenaventura", "Itinerario de la mente a Dios", "Aguilar", "1957", "2ª ed.", "Filocont_2"));
        b.add(new Book("Berkeley", "Tres diálogos entre Hilas y Filonus", "Aguilar", "1963", "4ª ed.", "Filocont_2"));
        b.add(new Book("J.  Barrio Gutiérrez, traduc.  y prólogo", "Bhagavad-Gita o Canto del bienaventurado",
                "Aguilar", "1964", "4ª ed.", "Filocont_2"));
        b.add(new Book("Campanella", "La ciudad del sol", "Aguilar", "1963", "3ª ed.", "Filocont_2"));
        b.add(new Book("Cyrano de Bergerac", "El otro mundo II Los estados e imperios del sol", "Aguilar", "1968", "",
                "Filocont_2"));
        b.add(new Book("Stuart Mill", "Sobre la libertad", "Aguilar", "1968", "5ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "El banquete", "Aguilar", "1970", "7ª ed.", "Filocont_2"));
        b.add(new Book("Schelling", "La relación de las artes figurativas con la naturaleza", "Aguilar", "1963",
                "3ª ed.", "Filocont_2"));
        b.add(new Book("Paine", "Los derechos del hombre", "Aguilar", "1962", "3ª ed.", "Filocont_2"));
        b.add(new Book("Schopenhauer", "Aforismos sobre la sabiduría de la vida", "Aguilar", "1970", "", "Filocont_2"));
        b.add(new Book("Rosmini", "Breve esquema de los sistemas de Fª moderna y de mi pro…", "Aguilar", "1959",
                "2ª ed.", "Filocont_2"));
        b.add(new Book("Descartes", "Discurso del método", "Aguilar", "1968", "7ª ed.", "Filocont_2"));
        b.add(new Book("Séneca", "De la brevedad de la vida", "Aguilar", "1970", "7ª ed.", "Filocont_2"));
        b.add(new Book("Pascal", "Pensamientos I El hombre sin Dios", "Aguilar", "1959", "", "Filocont_2"));
        b.add(new Book("Pascal", "Pensamientos II El hombre con Dios", "Aguilar", "1959", "", "Filocont_2"));
        b.add(new Book("Platón", "Teeteto, o de la ciencia", "Aguilar", "1968", "3ª ed.", "Filocont_2"));
        b.add(new Book("Bacon", "La nueva Atlántida", "Aguilar", "1964", "2ª ed.", "Filocont_2"));
        b.add(new Book("Cicerón", "Sobre la naturaleza de los dioses", "Aguilar", "1970", "", "Filocont_2"));
        b.add(new Book("Lulio", "Libro del amigo y del amado", "Aguilar", "1965", "2ª ed.", "Filocont_2"));
        b.add(new Book("Tagore", "La religión del hombre", "Aguilar", "1960", "2ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "Critón", "Aguilar", "1960", "", "Filocont_2"));
        b.add(new Book("Saint-Simon", "Catecismo político de los industriales", "Aguilar", "1964", "2ª ed.",
                "Filocont_2"));
        b.add(new Book("Vico", "Autobiografía", "Aguilar", "1970", "", "Filocont_2"));
        b.add(new Book("Bacon", "Ensayos", "Aguilar", "1965", "2ª", "Filocont_2"));
        b.add(new Book("Kant", "Cimentación para la metafísica de las costumbres", "Aguilar", "1968", "3ª ed.",
                "Filocont_2"));
        b.add(new Book("Kierkegaard", "Diapsalmata", "Aguilar", "1964", "2ª ed.", "Filocont_2"));
        b.add(new Book("Aristóteles", "Gran ética", "Aguilar", "1968", "3ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "Gorgias", "Aguilar", "1969", "4ª ed.", "Filocont_2"));
        b.add(new Book("Filón", "Todo hombre bueno es libre", "Aguilar", "1966", "2ª ed.", "Filocont_2"));
        b.add(new Book("Aristóteles", "Argumentos sofísticos", "Aguilar", "1965", "2ª ed.", "Filocont_2"));
        b.add(new Book("Anaxágoras", "Fragmentos", "Aguilar", "1962", "", "Filocont_2"));
        b.add(new Book("Aristóteles", "Categorías", "Aguilar", "1965", "2ª ed.", "Filocont_2"));
        b.add(new Book("Aristóteles", "Del sentido y lo sensible y de la memoria y el recuerdo", "Aguilar", "1966",
                "2ª ed.", "Filocont_2"));
        b.add(new Book("Rousseau", "Discurso sobre las ciencias y las artes", "Aguilar", "1966", "2ª ed.", "Filocont_2"));
        b.add(new Book("Aristóteles", "Constitución de Atenas", "Aguilar", "1966", "2ª ed.", "Filocont_2"));
        b.add(new Book("Leibniz", "Nuevo tratado sobre el entendimiento humano I", "Aguilar", "1970", "", "Filocont_2"));
        b.add(new Book("Platón", "Critias o la Atlántida", "Aguilar", "1966", "2ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "Timeo", "Aguilar", "1971", "3ª ed.", "Filocont_2"));
        b.add(new Book("Leibniz", "Sistema nuevo de la naturaleza", "Aguilar", "1969", "2ª ed.", "Filocont_2"));
        b.add(new Book("Descartes", "Las pasiones del alma", "Aguilar", "1965", "2ª ed.", "Filocont_2"));
        b.add(new Book("Platón", "Eutifrón o de la piedad", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Platón", "Parménides", "Aguilar", "1966", "2ª ed.", "Filocont_2"));
        b.add(new Book("Jenófanes de Colofón", "Fragmentos y testimonios", "Aguilar", "1964", "", "Filocont_2"));
        b.add(new Book("Empédocles", "Sobre la naturaleza de los seres. Las purificaciones", "Aguilar", "1964", "",
                "Filocont_2"));
        b.add(new Book("Leucipo y Demócrito", "Fragmentos", "Aguilar", "1970", "2ª ed.", "Filocont_2"));
        b.add(new Book("Plotino", "Eneada segunda", "Aguilar", "1964", "", "Filocont_2"));
        b.add(new Book("Berkeley", "Ensayo de una nueva teoría de la visión", "Aguilar", "1965", "", "Filocont_2"));
        b.add(new Book("Schopenhauer", "Los problemas fundamentales de la ética I", "Aguilar", "1970", "2ª",
                "Filocont_2"));
        b.add(new Book("Schopenhauer", "Los problemas fundamentales de la ética II", "Aguilar", "1971", "2ª",
                "Filocont_2"));
        b.add(new Book("Plotino", "Eneada Tercera", "Aguilar", "1965", "", "Filocont_2"));
        b.add(new Book("Proclo", "Elementos de teología", "Aguilar", "1965", "", "Filocont_2"));
        b.add(new Book("Protágoras", "Fragmentos y testimonios", "Aguilar", "1965", "", "Filocont_2"));
        b.add(new Book("Nicolás de Cusa", "De Dios escondido. De la búsqueda de Dios", "Aguilar", "1965", "",
                "Filocont_2"));
        b.add(new Book("Pródico e Hippias", "Fragmentos y testimonios", "Aguilar", "1965", "", "Filocont_2"));
        b.add(new Book("Trasímaco, Licofrón y Jeniades", "Fragmentos y testimonios", "Aguilar", "1966", "",
                "Filocont_2"));
        b.add(new Book("Gorgias", "Fragmentos y testimonios", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Hermes Trismegisto", "Tres tratados Poimandres, La llave, Asclepios", "Aguilar", "1966", "",
                "Filocont_2"));
        b.add(new Book("Leibniz", "La profesión de fe del filósofo", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Descartes", "Reglas para la dirección de la mente", "Aguilar", "1970", "2ª ed.", "Filocont_2"));
        b.add(new Book("Plotino", "Eneada Cuarta", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Eunapio", "Vidas de filósofos y sofistas", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Critias", "Fragmentos y testimonios", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Schopenhauer", "Fragmentos sobre la historia de la filosofía", "Aguilar", "1966", "",
                "Filocont_2"));
        b.add(new Book("Cicerón", "Sobre las leyes", "Aguilar", "1966", "", "Filocont_2"));
        b.add(new Book("Cicerón", "La república", "Aguilar", "1967", "", "Filocont_2"));
        b.add(new Book("Plotino", "Eneada Quinta", "Aguilar", "1967", "", "Filocont_2"));
        b.add(new Book("Plotino", "Eneada Sexta", "Aguilar", "1967", "", "Filocont_2"));
        b.add(new Book("Schopenhauer", "Sobre la cuádruple raiz del pio. de razón suficiente", "Aguilar", "1967", "",
                "Filocont_2"));
        b.add(new Book("Kierkegaard", "Los estados eróticos inmediatos o lo erótico musical", "Aguilar", "1967", "",
                "Filocont_2"));
        b.add(new Book("Pseudo Calístenes", "Vida y hazañas de Alejandro de Macedonia", "Gredos", "1977", "",
                "Filocont_2"));
        b.add(new Book("Jenofonte", "Helénicas", "Gredos", "1977", "", "Filocont_2"));
        b.add(new Book("Heródoto", "Historia Libros I-II", "Gredos", "1977", "", "Filocont_2"));
        b.add(new Book("Eurípides", "Tragedias I", "Gredos", "1977", "", "Filocont_2"));
        b.add(new Book("Marco Aurelio", "Meditaciones", "Gredos", "1977", "", "Filocont_2"));
        b.add(new Book("P. Bádenas de la P. y J. López F. Trads.",
                "Fábulas de Esopo. Vida de Esopo. Fábulas de Babrio", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("Manuel Fernández- Galiano, Traductor", "Antología Palatina I", "Gredos", "1978", "",
                "Filocont_2"));
        b.add(new Book("Alberto Bernabé Pajares, Traductor", "Himnos Homéricos La \"Batracomiomaquia\"", "Gredos",
                "1978", "", "Filocont_2"));
        b.add(new Book("Apuleyo", "El asno de oro", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("Petronio", "El satiricón", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("Eurípides", "Tragedias II", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("C.  Eggers Lan y Victoria E. Juliá Trads.", "Los filósofos presocráticos I", "Gredos", "1978",
                "", "Filocont_2"));
        b.add(new Book("Hesíodo", "Obras y Fragmentos. Teogonía. Trabajos y días", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("Aristóteles", "Acerca del alma", "Gredos", "1978", "", "Filocont_2"));
        b.add(new Book("Demetrio. \"Longino\"", "Sobre el estilo. Sobre lo sublime", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("C.  de Afrodisias. Jenofonte de Efeso", "Quéreas y Calírroe. Efesíacas. Fragmentos novelescos",
                "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Juliano", "Discursos  I-V", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Filóstrato", "Vida de Apolonio de Tiana", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Cornelio Tácito", "Anales Libros I-VI", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Alberto Bernabé Pajares, Traductor", "Fragmentos de épica griega arcáica", "Gredos", "1978",
                "", "Filocont_2"));
        b.add(new Book("Heródoto", "Historia Libros III-IV", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Eurípedes", "Tragedias III Helena. Finicias. Orestes…", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Isócrates", "Discursos I", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Nestor L. Cordero y otros, Traductores", "Los filósofos presocráticos II", "Gredos", "1979",
                "", "Filocont_2"));
        b.add(new Book("Heliodoro", "Las Etiópicas o Teágenes y Cariclea", "Gredos", "1979", "", "Filocont_2"));
        b.add(new Book("Séneca", "Tragedias I Hércules loco. Las Troyanas. Las fenicias. …", "Gredos", "1979", "",
                "Filocont_2"));
        b.add(new Book("Séneca", "Tragedias II Fedra. Edipo. Agamenón…", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Armando Poratti y otros, traductores", "Los filósofos presocráticos III", "Gredos", "1980", "",
                "Filocont_2"));
        b.add(new Book("Isócrates", "Discursos II", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Cornelio Tácito", "Anales Libros XI-XVI", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Francisco Rguez.  Adrados, traductor", "Lírica griega arcáica (Poemas corales y monódicos)",
                "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Apuleyo", "Apología. Flórida", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Calímaco", "Himnos, Epigramas y fragmentos", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Apiano", "Historia romana I", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Demóstenes", "Discursos políticos I", "Gredos", "1980", "", "Filocont_2"));
        b.add(new Book("Cornelio Tácito", "Agrícola. Germania. Diálogo sobre los oradores", "Gredos", "1981", "",
                "Filocont_2"));
        b.add(new Book("Platón", "Diálogos I Apología, Critón, Eutrifón, Ion, Lisis…", "Gredos", "1981", "",
                "Filocont_2"));
        b.add(new Book("Polibio", "Historias Libros I-IV", "Gredos", "1981", "", "Filocont_2"));
        b.add(new Book("Sófloces", "Tragedias. Ayax. Traquinias. Antígona. Edipo Rey. Electra", "Gredos", "1981", "",
                "Filocont_2"));
        b.add(new Book("Enrique Montero Cartelle, traductor", "Priapeos. Grafitos amatorios pompeyanos…", "Gredos",
                "1981", "", "Filocont_2"));
        b.add(new Book("Luciano", "Obras I", "Gredos", "1981", "", "Filocont_2"));
        b.add(new Book("Polibio", "Historias Libros V-XV", "Gredos", "1981", "", "Filocont_2"));
        b.add(new Book("Herodas. Partenio de Nicea", "Mimiambros. Fragmentos mímicos. Sufrimiento de amor", "Gredos",
                "1981", "", "Filocont_2"));
        b.add(new Book("Juliano", "Discursos VI-XII", "Gredos", "1982", "", "Filocont_2"));
        b.add(new Book("Lactancio", "Sobre la muerte de los perseguidores", "Gredos", "1982", "", "Filocont_2"));
        b.add(new Book("Juliano", "Contra los galileos. Cartas y Fragmentos.Testimonios. Leyes", "Gredos", "1982", "",
                "Filocont_2"));
        b.add(new Book("Aristóteles", "Tratados de lógica (Órganon) I Categorías. Tópocos…", "Gredos", "1982", "",
                "Filocont_2"));
        b.add(new Book("Jenofonte", "Anábasis", "Gredos", "1982", "", "Filocont_2"));
        b.add(new Book("Orosio", "Historias Libros I-IV", "Gredos", "1982", "", "Filocont_2"));
        b.add(new Book("José Monserrat Torrents, traductor",
                "Los gnósticos I Irineo de Lyón Libro I Contra las herejías", "Gredos", "1983", "", "Filocont_2"));
        b.add(new Book("José Monserrat Torrents, traductor", "Los gnósticos II Hipólito de Roma. Refutación herejías",
                "Gredos", "1983", "", "Filocont_2"));
        b.add(new Book("Platón", "Diálogos II Gorgias. Menéxeno. Eutidemo. Menón. Crátilo", "Gredos", "1983", "",
                "Filocont_2"));
        b.add(new Book("Platón", "Diálogos III Fedón. Banquete. Fedro", "Gredos", "1986", "", "Filocont_2"));
        b.add(new Book("Platón", "Diálogos IV República", "Gredos", "1986", "", "Filocont_2"));
        b.add(new Book("Platón", "Diálogos V Parménides, Teeteto, Sofista, Político", "Gredos", "1988", "",
                "Filocont_2"));
        b.add(new Book("Heráclito. Antonino Liberal", "Alegorías de Homero. Metamorfósis.", "Gredos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Ortega y Gasset", "Unas lecciones de metafísica", "Alianza Ed.", "1966", "", "Filocont_2"));
        b.add(new Book("Julio Caro Baroja", "Las brujas y su mundo", "Alianza Ed.", "1966", "", "Filocont_2"));
        b.add(new Book("Alexandre Koyre", "Introducción a la lectura de Platón", "Alianza Ed.", "1966", "",
                "Filocont_2"));
        b.add(new Book("Jean Rostand", "El hombre", "Alianza Ed.", "1966", "", "Filocont_2"));
        b.add(new Book("Gaston Bachelard", "Psicoanálisis del fuego", "Alianza Ed.", "1966", "", "Filocont_2"));
        b.add(new Book("Eugen Fink", "La filosofía de Nietzsche", "Alianza Ed.", "1966", "", "Filocont_2"));
        b.add(new Book("Scientific American", "Física y química de la vida", "Alianza Ed.", "1967", "", "Filocont_2"));
        b.add(new Book("Paul Valery", "El cementerio marino", "Alianza Ed.", "1967", "", "Filocont_2"));
        b.add(new Book("Walter Kaufmann", "Hegel", "Alianza Ed.", "1968", "", "Filocont_2"));
        b.add(new Book("Hans Egon Holthusen", "Rainer María Rilke", "Alianza Ed.", "1968", "", "Filocont_2"));
        b.add(new Book("Sartre, Heidegger, Jaspers y otros", "Kierkegaard vivo", "Alianza Ed.", "1968", "",
                "Filocont_2"));
        b.add(new Book("Louis Ferdinand Celine", "Semmelweis", "Alianza Ed.", "1968", "", "Filocont_2"));
        b.add(new Book("I. Pavlov", "Fisiología y psicología", "Alianza Ed.", "1968", "", "Filocont_2"));
        b.add(new Book("Carl G. Jung", "Los complejos y el insconsciente", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Immanuel Kant", "La religión dentro de los límites de la mera razón", "Alianza Ed.", "1968",
                "", "Filocont_2"));
        b.add(new Book("Thomas Mann", "Relato de mi vida", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("José Ferrater Mora", "La filosofía actual", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Radhakrishnan", "La concepción hindú de la vida", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Jean-Marie Auzias", "El estructuralismo", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Francisco Giner de los Ríos", "Ensayos", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Werner Kemper", "El significado de los sueños", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Holz, Kofler y Abendroth", "Conversaciones con Lukács", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Howard Phillips Lovecraft y otros", "Los mitos de Cthulhu Narraciones de horror cósmico",
                "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Thomas J. Blakeley", "La escolástica soviética", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Antonio Escohotado", "Marcuse Utopía y razón", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Georges Gurvitch", "Dialéctica y sociología", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Ludwig Marcuse", "Sigmund Freud Su visión del hombre", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("Carlos Castilla del Pino", "Psicoanálisis y marxismo", "Alianza Ed.", "1969", "", "Filocont_2"));
        b.add(new Book("José Ferrater Mora", "Indagaciones sobre el lenguaje", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Arthur Schopenhauer", "Sobre la voluntad de la naturaleza", "Alianza Ed.", "1970", "",
                "Filocont_2"));
        b.add(new Book("Paulino Garagorri", "Introducción a Ortega", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Pierre Francastel", "Historia de la pintura francesa", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Klaus Wagenbach", "Kafka", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia Compendio I/IV", "Alianza Ed.", "1970", "",
                "Filocont_2"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia Compendio V/VIII", "Alianza Ed.", "1970", "",
                "Filocont_2"));
        b.add(new Book("Arnold J. Toynbee", "Estudio de la Historia Compendio IX/XIII", "Alianza Ed.", "1970", "",
                "Filocont_2"));
        b.add(new Book("Leszek Kolakovski", "El hombre sin alternativa", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Raymond Dawson", "El camaleón chino", "Alianza Ed.", "1970", "", "Filocont_2"));
        b.add(new Book("Herbert Marcuse", "Razón y revolución", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Max y Hedwig Born", "Ciencia y conciencia en la era atómica", "Alianza Ed.", "1971", "",
                "Filocont_2"));
        b.add(new Book("James Atkinson", "Lutero y el nacimiento del protestantismo", "Alianza Ed.", "1971", "",
                "Filocont_2"));
        b.add(new Book("Andrew Crowcroft", "La locura", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Jean Rostand", "El correo de un biólogo", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Manuel Valls Gorina", "Diccionario de la música", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Herbert Marcuse", "La agresividad en la sociedad industrial avanzada", "Alianza Ed.", "1971",
                "", "Filocont_2"));
        b.add(new Book("Carlos Castilla del Pino", "Cuatro ensayos sobre la mujer", "Alianza Ed.", "1971", "",
                "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "Ecce homo", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "La genealogía de la moral", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Hans Querner y otros", "Del origen de las especies", "Alianza Ed.", "1971", "", "Filocont_2"));
        b.add(new Book("Lewis Carroll", "El juego de la lógica", "Alianza Ed.", "1972", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "Así habló Zaratustra", "Alianza Ed.", "1972", "", "Filocont_2"));
        b.add(new Book("André Breton", "Los pasos perdidos", "Alianza Ed.", "1972", "", "Filocont_2"));
        b.add(new Book("Theodor W. Adorno", "Filosofía y superstición", "Alianza Ed.", "1972", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "Mas allá del bien y del mal", "Alianza Ed.", "1972", "", "Filocont_2"));
        b.add(new Book("Selección de José García Mercadal", "Viajes por España", "Alianza Ed.", "1972", "",
                "Filocont_2"));
        b.add(new Book("Henri Lefebvre", "La vida cotidiana en el mundo moderno", "Alianza Ed.", "1972", "",
                "Filocont_2"));
        b.add(new Book("Paul Roazen", "Hermano animal La historia de Freud y Tausk", "Alianza Ed.", "1972", "",
                "Filocont_2"));
        b.add(new Book("Karl Marx", "Isaiah Berlin", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "El nacimiento de la tragedia", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Isaac Asimov", "El Universo", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Mortimer Ostow", "La depresión: psicología de la melancolía", "Alianza Ed.", "1973", "",
                "Filocont_2"));
        b.add(new Book("Norman F. Cantor", "La era de la protesta Oposición y rebeldía en el s. XX", "Alianza Ed.",
                "1973", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "Crepúsculo de los ídolos", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Teófanes Egido, introd., selección y notas de", "Sátiras políticas de la España Moderna",
                "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Selección de Ramón Buckley y John Crispin", "Los vanguardistas españoles (1925-1935)",
                "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Karl R. Popper", "La miseria del historicismo", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Zolar", "Enciclopedia del saber antiguo y prohibido", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Lucien Malson", "Los niños selváticos", "Alianza Ed.", "1973", "", "Filocont_2"));
        b.add(new Book("Gaspar Gómez de la Serna", "Los viajeros de la ilustración", "Alianza Ed.", "1974", "",
                "Filocont_2"));
        b.add(new Book("José Ferrater Mora", "Cambio de marcha en filosofía", "Alianza Ed.", "1974", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "El anticristo", "Alianza Ed.", "1974", "", "Filocont_2"));
        b.add(new Book("C. M. Bowra", "La Atenas de Pericles", "Alianza Ed.", "1974", "", "Filocont_2"));
        b.add(new Book("Ruth Benedict", "El crisantemo y la espada Patrones de la cultura japonesa", "Alianza Ed.",
                "1974", "", "Filocont_2"));
        b.add(new Book("Selección de Peter Quennell", "En torno a Marcel Proust", "Alianza Ed.", "1974", "",
                "Filocont_2"));
        b.add(new Book("Gordon R. Lowe", "El desarrollo de la personalidad", "Alianza Ed.", "1974", "", "Filocont_2"));
        b.add(new Book("Fritz J. Raddatz", "Georg Lukács", "Alianza Ed.", "1975", "", "Filocont_2"));
        b.add(new Book("S. E. Luria", "La vida, experimento inacabado", "Alianza Ed.", "1975", "", "Filocont_2"));
        b.add(new Book("James Joice", "Escritos críticos", "Alianza Ed.", "1975", "", "Filocont_2"));
        b.add(new Book("E. O. James", "Historia de las religiones", "Alianza Ed.", "1975", "", "Filocont_2"));
        b.add(new Book("Ramón Xirau", "El desarrollo y las crisis de la filosofía occidental", "Alianza Ed.", "1975",
                "", "Filocont_2"));
        b.add(new Book("Arthur C. Danto", "Qué es filosofía", "Alianza Ed.", "1976", "", "Filocont_2"));
        b.add(new Book("Umberto Eco, Edmund Leach y otros", "Introducción al estructuralismo", "Alianza Ed.", "1976",
                "", "Filocont_2"));
        b.add(new Book("Ronald Grimsley", "La filosofía de Rouseau", "Alianza Ed.", "1977", "", "Filocont_2"));
        b.add(new Book("Textos escogidos por Gilles Deleuze", "Henri Bergson Memoria y vida", "Alianza Ed.", "1977",
                "", "Filocont_2"));
        b.add(new Book("Leszek Kolakowski", "Husserl y la búsqueda de la certeza", "Alianza Ed.", "1977", "",
                "Filocont_2"));
        b.add(new Book("Frank Donovan", "Historia de la brujería", "Alianza Ed.", "1988", "2ª reimp.", "Filocont_2"));
        b.add(new Book("Kenneth Clark", "Civilización 1 y 2", "Alianza Ed.", "1979", "", "Filocont_2"));
        b.add(new Book("Julián Marías", "Biografía de la filosofía", "Alianza Ed.", "1980", "", "Filocont_2"));
        b.add(new Book("José Luis L. Aranguren", "Catolicismo y protestantismo como formas de existencia",
                "Alianza Ed.", "1980", "", "Filocont_2"));
        b.add(new Book("E. M. Cioran", "Adiós a la existencia", "Alianza Ed.", "1980", "", "Filocont_2"));
        b.add(new Book("Xavier Zubiri", "Cinco lecciones de filosofía", "Alianza Ed.", "1980", "", "Filocont_2"));
        b.add(new Book("David Hume", "Investigación sobre el conocimiento humano", "Alianza Ed.", "1980", "",
                "Filocont_2"));
        b.add(new Book("Carlos García Gual", "Epicuro", "Alianza Ed.", "1981", "", "Filocont_2"));
        b.add(new Book("Francis Oakley", "Los siglos decisivos La experiencia medieval", "Alianza Ed.", "1981", "",
                "Filocont_2"));
        b.add(new Book("James A. Schllenberg", "Los fundadores de la psicología social", "Alianza Ed.", "1981", "",
                "Filocont_2"));
        b.add(new Book("Gerald Durrell", "Encuentros con animales", "Alianza Ed.", "1981", "", "Filocont_2"));
        b.add(new Book("Rafael Arrillaga Torrens", "Introducción a los problemas de la historia", "Alianza Ed.",
                "1982", "", "Filocont_2"));
        b.add(new Book("Patricia Highsmith", "Ese dulce mal", "Alianza Ed.", "1982", "", "Filocont_2"));
        b.add(new Book("Albert Camus", "Los posesos", "Alianza Ed.", "1982", "", "Filocont_2"));
        b.add(new Book("Max Horkheimer", "Historia, metafísica y escepticismo", "Alianza Ed.", "1982", "", "Filocont_2"));
        b.add(new Book("Stillman Drake", "Galileo", "Alianza Ed.", "1983", "", "Filocont_2"));
        b.add(new Book("Norman Cohn", "El mito de la conspiración judía mundial", "Alianza Ed.", "1983", "",
                "Filocont_2"));
        b.add(new Book("Jesús Mosterín", "Historia de la filosofía 1.- El pensamiento arcáico", "Alianza Ed.", "1983",
                "", "Filocont_2"));
        b.add(new Book("Jesús Mosterín", "Historia de la filosofía 2.- La Filosofía oriental antigua", "Alianza Ed.",
                "1983", "", "Filocont_2"));
        b.add(new Book("Jesús Mosterín", "Historia de la filosofía 3.- La Filosofía griega prearistotélica",
                "Alianza Ed.", "1984", "", "Filocont_2"));
        b.add(new Book("Jesús Mosterín", "Historia de la filosofía 4.- Aristóteles", "Alianza Ed.", "1984", "",
                "Filocont_2"));
        b.add(new Book("Jesús Mosterín", "Historia de la filosofía 5.- El pensamiento clásico tardío", "Alianza Ed.",
                "1985", "", "Filocont_2"));
        b.add(new Book("Eduart Mörike", "Mozart,  camino de Praga", "Alianza Ed.", "1983", "", "Filocont_2"));
        b.add(new Book("A. Einstein", "Notas autobiográficas", "Alianza Ed.", "1984", "", "Filocont_2"));
        b.add(new Book("David Hume", "Mi vida. Cartas de un caballero a su amigo de Edimburgo", "Alianza Ed.", "1985",
                "", "Filocont_2"));
        b.add(new Book("Francisco J. Flores Arroyuelo", "El diablo en España", "Alianza Ed.", "1985", "", "Filocont_2"));
        b.add(new Book("Marvin Harris", "Caníbales y reyes Los orígenes de las culturas", "Alianza Ed.", "1987", "",
                "Filocont_2"));
        b.add(new Book("Claude Lévi-Strauss", "Mito y significado", "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Spinoza", "Etica demostrada según el eje geométrico", "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Carlos García Gual/Diógenes Laercio", "La secta del perro/Vida de los filósofos cínicos",
                "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Martin Gardner", "Orden y sorpresa", "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Immanuel Kant", "Los sueños de un visionario", "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Flavio Josefo", "Autobiografía contra Apión", "Alianza Ed.", "1987", "", "Filocont_2"));
        b.add(new Book("Alberto Bernabé Traducción y notas", "De Tales a Demócrito Fragmentos presocráticos",
                "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Spinoza", "Correspondencia", "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("A. J. Ayer", "Hume", "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("David Hume", "Sobre el suicidio y otros ensayos", "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Spinoza", "Tratado de la reforma del entendimiento", "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Friedrich Nietzsche", "Consideraciones intempestivas 1", "Alianza Ed.", "1988", "",
                "Filocont_2"));
        b.add(new Book("Karl Jaspers", "Cifras de la transcendencia", "Alianza Ed.", "1993", "", "Filocont_2"));
        b.add(new Book("Wilhelm Baum", "Ludwig Wittgenstein Vida y obras", "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Carlos García Gual", "Los siete sabios (y tres más)", "Alianza Ed.", "1989", "", "Filocont_2"));
        b.add(new Book("Pedro Rodríguez Santidrián", "Historia de las religiones", "Alianza Ed.", "1989", "",
                "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones I", "El despertar de la civilización por Stuart Piggott",
                "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 2", "Civilizaciones extinguidas por Edward Bacon",
                "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 3", "Grecia y Roma por Michael Grant", "Alianza Ed.", "1988",
                "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 4", "El crisol del Cristianismo por Arnold Toynbee",
                "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 5", "La Alta Edad Media por David Talbot Rice", "Alianza Ed.",
                "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 6", "La baja Edad media por Joan Evans", "Alianza Ed.", "1988",
                "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 7", "La época del Renacimiento por Denys Hay", "Alianza Ed.",
                "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 8", "La época de la expansión por Hugh Trevor-Roper",
                "Alianza Ed.", "1988", "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 9", "El siglo XVIII por Alfred Cobban", "Alianza Ed.", "1989",
                "", "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 10", "El siglo XIX por Asa Briggs", "Alianza Ed.", "1989", "",
                "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 11", "El siglo XX por Alan Bullock", "Alianza Ed.", "1989", "",
                "Filocont_2"));
        b.add(new Book("Historia de las Civilizaciones 12", "Estados Unidos por Daniel J. Boorstin", "Alianza Ed.",
                "1989", "", "Filocont_2"));
        b.add(new Book("Manuel Maceiras", "¿Qué es filosofía? El hombre y su mundo", "Cincel", "1985", "Nº 1",
                "Filocont_2"));
        b.add(new Book("Victor García", "La sabiduría oriental: Taoísmo, Budismo…", "Cincel", "1985", "Nº 2",
                "Filocont_2"));
        b.add(new Book("Angel J. Cappelletti", "Mitología y filosofía: Los presocráticos", "Cincel", "1986", "Nº 3",
                "Filocont_2"));
        b.add(new Book("Tomás Calvo", "De los sofistas a Platón: Política y pensamiento", "Cincel", "1986", "Nº 4",
                "Filocont_2"));
        b.add(new Book("Carlos Gª Gual/Mª J. Imaz", "La filosofía helenística: éticas y sistemas", "Cincel", "1986",
                "Nº 6", "Filocont_2"));
        b.add(new Book("J.A. García-Junceda", "La cultura cristiana y San Agustin", "Cincel", "1987", "Nº 7",
                "Filocont_2"));
        b.add(new Book("R. Ramón Guerrero", "El pensamiento filosófico árabe", "Cincel", "1985", "Nº 8", "Filocont_2"));
        b.add(new Book("Jesús García López", "Tomás de Aquino, maestro del orden", "Cincel", "1985", "Nº 9",
                "Filocont_2"));
        b.add(new Book("Carlos Mínguez Pérez", "De Ockhan a Newton: la formación de la cª mod.", "Cincel", "1986",
                "Nº 10", "Filocont_2"));
        b.add(new Book("E. García Esteban", "El renacimiento: humanismo y sociedad", "Cincel", "1986", "Nº 11",
                "Filocont_2"));
        b.add(new Book("Javier de Lorenzo", "El racionalismo y los problemas del método", "Cincel", "1985", "Nº 12",
                "Filocont_2"));
        b.add(new Book("J.C. García-Borrón", "El empirismo e ilustración inglesa: de Hobbes a Hume", "Cincel", "1985",
                "Nº 13", "Filocont_2"));
        b.add(new Book("Arsenio Ginzo", "La ilustración francesa. Entre Voltaire y Rousseau", "Cincel", "1985",
                "Nº 14", "Filocont_2"));
        b.add(new Book("S. Rábade Romeo y otros", "Kant: conocimiento y racionalidad Vol. 1 y 2", "Cincel", "1987",
                "Nº 15", "Filocont_2"));
        b.add(new Book("Carlos Díaz", "Hegel, filósofo romántico", "Cincel", "1985", "Nº 16", "Filocont_2"));
        b.add(new Book("Félix García Moriyón", "Del socialismo utópico al anarquismo", "Cincel", "1985", "Nº 17",
                "Filocont_2"));
        b.add(new Book("Rafael Jerez Mir", "Marx y Engels: el marxismo genuíno", "Cincel", "1985", "Nº 18",
                "Filocont_2"));
        b.add(new Book("Dalmacio Negro Pavón", "Comte: positivismo y revolución", "Cincel", "1985", "Nº 19",
                "Filocont_2"));
        b.add(new Book("R. Grasa Hernández", "El evolucionismo: De Darwin a la sociobiología", "Cincel", "1986",
                "Nº 20", "Filocont_2"));
        b.add(new Book("Manuel Maceiras Fafian", "Schopenhauer y Kierkegard: sentimiento y pasión", "Cincel", "1985",
                "Nº 21", "Filocont_2"));
        b.add(new Book("Luis Jiménez Moreno", "El pensamiento de Nietzche", "Cincel", "1986", "Nº 22", "Filocont_2"));
        b.add(new Book("A. Vazquez Fernández", "Freud y Jung: exploradores del inconsciente", "Cincel", "1986",
                "Nº 23", "Filocont_2"));
        b.add(new Book("A. Jiménez García", "El Krausismo: la Institución Libre de Enseñanza", "Cincel", "1986",
                "Nº 24", "Filocont_2"));
        b.add(new Book("Manuel Padilla Novoa", "Unamuno, filósofo de encrucijada", "Cincel", "1985", "Nº 25",
                "Filocont_2"));
        b.add(new Book("P. J. Chamizo Dominguez", "Ortega y la cultura española", "Cincel", "1985", "Nº 26",
                "Filocont_2"));
        b.add(new Book("Isidro Gómez Romero", "Husserl y la crisis de la razón", "Cincel", "1986", "Nº 27",
                "Filocont_2"));
        b.add(new Book("Pedro Fontán Jubero", "Los existencialismos: claves para su comprensión", "Cincel", "1985",
                "Nº 28", "Filocont_2"));
        b.add(new Book("J. Taberner G. y C. Rojas M.", "Marcuse, Fromm, Reich: el freudomarxismo", "Cincel", "1985",
                "Nº 29", "Filocont_2"));
        b.add(new Book("A. Domingo Moratalia", "Un humanismo del siglo XX: el personalismo", "Cincel", "1985", "Nº 30",
                "Filocont_2"));
        b.add(new Book("Pilar Lacasa y Concepción Pérez", "La psicología hoy: ¿organismos o máquinas?", "Cincel",
                "1985", "Nº 31", "Filocont_2"));
        b.add(new Book("Antonio Bolivar Botia", "El estructuralismo: de Levi-Strauss a Derrida", "Cincel", "1985",
                "Nº 32", "Filocont_2"));
        b.add(new Book("J.J. Acero Fernández", "Filosofía y análisis del lenguaje", "Cincel", "1985", "Nº 33",
                "Filocont_2"));
        b.add(new Book("Adela Cortina", "Crítica y utopía: la escuela de Francfort", "Cincel", "1985", "Nº 34",
                "Filocont_2"));
        b.add(new Book("A. Pérez de Laborda", "La ciencia cont. y sus implicaciones filosóficas", "Cincel", "1985",
                "Nº 35", "Filocont_2"));
        b.add(new Book("Carlos Díaz", "La última filosofía española: una crisis …", "Cincel", "1985", "Nº 36",
                "Filocont_2"));
        b.add(new Book("Jorge M. Ayala", "Gracián: vida, estilo y reflexión", "Cincel", "1987", "Nº 37", "Filocont_2"));
        b.add(new Book("A. Villar", "Pascal: ciencia y creencia", "Cincel", "1987", "Nº 38", "Filocont_2"));
        b.add(new Book("S. Rábade Romeo", "Espinoza: razón y felicidad", "Cincel", "1987", "Nº 39", "Filocont_2"));
        b.add(new Book("J. L. Villacañas", "La quiebra de la razón ilustrada: idº y romant.", "Cincel", "1988",
                "Nº 40", "Filocont_2"));
        b.add(new Book("A. Gabilondo Pujol", "Dilthey: vida, expresión e historia", "Cincel", "1988", "Nº 41",
                "Filocont_2"));
        b.add(new Book("J. Pérez de Tudela", "El pragmatismo americano: acción racional y …", "Cncel", "1988", "Nº 42",
                "Filocont_2"));
        b.add(new Book("P. Chacón Fuertes", "Bergson", "Cincel", "1988", "Nº 43", "Filocont_2"));
        b.add(new Book("J. A. Arias Muñoz", "J. P. Sartre y la dialéctica de la cosificación", "Cincel", "1987",
                "Nº 44", "Filocont_2"));
        b.add(new Book("R. Rodríguez García", "Heidegger y la crisis de la época moderna", "Cincel", "1987", "Nº 47",
                "Filocont_2"));
        b.add(new Book("A. Ferraz Fayos", "Zubiri: el realismo radical", "Cincel", "1987", "Nº 49", "Filocont_2"));
        b.add(new Book("Graciano Glez. R. Arnáiz", "E. Levinas: humanismo y ética", "Cincel", "1987", "Nº 50",
                "Filocont_2"));
        b.add(new Book("Carlos Díaz", "Nihilismo y estética Filosofía de fin de milenio", "Cincel", "1987", "Nº 52",
                "Filocont_2"));
        b.add(new Book("Eugenio Trías", "Filosofía y carnaval", "Anagrama", "1970", "Nº 4", "Filocont_2"));
        b.add(new Book("Louis Althusser/J. Lacan", "Freud y Lacan/El objeto del psicoanálisis", "Anagrama", "1970",
                "Nº 5", "Filocont_2"));
        b.add(new Book("Michel Foucault", "Nietzsche, Freud, Marx", "Anagrama", "1970", "Nº 7", "Filocont_2"));
        b.add(new Book("Stuart Hall", "Los hippies: una contra-cultura", "Anagrama", "1970", "Nº 8", "Filocont_2"));
        b.add(new Book("Ramón García", "Psicoanálisis y sociedad: apuntes de freudo-marxismo 1 y 2", "Anagrama",
                "1971", "Nº 18/19", "Filocont_2"));
        b.add(new Book("Selección de J. Jordá y J. L. Guarner", "Marilyn revisitada", "Anagrama", "1971", "Nº 20",
                "Filocont_2"));
        b.add(new Book("Marqués de Sade", "Ideas sobre la novela", "Anagrama", "1971", "Nº 21", "Filocont_2"));
        b.add(new Book("Léopold Sacher-Masoch", "Diderot y Catalina II: escenas de la corte de Rusia", "Anagrama",
                "1971", "Nº 22", "Filocont_2"));
        b.add(new Book("Robert Kalivoda", "Marx y Freud", "Anagrama", "1971", "Nº 23", "Filocont_2"));
        b.add(new Book("T. Ferrer y R. García, traducts.", "La institución del análisis", "Anagrama", "1971", "Nº 26",
                "Filocont_2"));
        b.add(new Book("Selección de Ramón García", "¿Psiquiatría o ideología de la locura?", "Anagrama", "1972",
                "Nº 33", "Filocont_2"));
        b.add(new Book("Jordi Marfá, traductor", "Althusser, método histórico e historicismo", "Anagrama", "1972",
                "Nº 34", "Filocont_2"));
        b.add(new Book("M. Foucault/Gilles Deleuze", "Theatrum Philosophicum/Repetición y diferencia", "Anagrama",
                "1972", "Nº 36", "Filocont_2"));
        b.add(new Book("Colectivo de Ciencias, traducción", "Del idealismo \"físico\" al Idealismo  \"biológico\"",
                "Anagrama", "1972", "Nº 40", "Filocont_2"));
        b.add(new Book("W. Reich, Vera Schmidt", "Psicoanálisis y educación 1 y 2", "Anagrama", "1973", "Nº 47/48",
                "Filocont_2"));
        b.add(new Book("Eduardo Subirats, traducción", "Karl Korsch o el nacimiento de una nueva época", "Anagrama",
                "1973", "Nº 49", "Filocont_2"));
        b.add(new Book("Julián Pitt-Rivers", "Tres ensayos de antropología estructural", "Anagrama", "1973", "Nº 50",
                "Filocont_2"));
        b.add(new Book("Xavier Rubert de Ventós", "Utopías de la sensualidad y métodos del sentido", "Anagrama",
                "1973", "Nº 59", "Filocont_2"));
        b.add(new Book("Varios traductores", "Polémica sobre el origen y univ. de la familia", "Anagrama", "1976",
                "Nº 68 2ª ed.", "Filocont_2"));
        b.add(new Book("Joël Bel Lassen", "Filosofía y conservación de los tomates", "Anagrama", "1974", "Nº 78",
                "Filocont_2"));
        b.add(new Book("Alan Unterman", "La sabiduría de los místicos judíos", "Lidiun", "1981", "", "Filocont_2"));
        b.add(new Book("Roger Baker", "El demonio y los exorcismos", "Lidiun", "1981", "", "Filocont_2"));
        b.add(new Book("Margaret Smith", "Introducción a las doctrinas místicas", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("Kenneth Cragg", "La sabiduría de los sufíes", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("Geoffrey Parrinder", "Hinduismo y cristianismo", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("William MacQuitty", "La sabiduría de los antiguos egipcios", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("Stephen Clissold", "La sabiduría de San Francisco y sus compañeros", "Lidiun", "1982", "",
                "Filocont_2"));
        b.add(new Book("M. Weissen-Szumlanska", "La Atlántida y los Antiguos Egipcios", "Lidiun", "1982", "",
                "Filocont_2"));
        b.add(new Book("Christmas Humphreys", "La búsqueda interior", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("Titus Burckhardt", "Principios y métodos del arte sagrado", "Lidiun", "1982", "", "Filocont_2"));
        b.add(new Book("J. C. Cooper", "El simbolismo Lenguaje universal", "Lidiun", "1988", "", "Filocont_2"));
        b.add(new Book("José Mª Valverde", "El barroco Una visión de conjunto", "Montesinos", "1980", "", "Filocont_2"));
        b.add(new Book("Javier Echeverría", "Leibniz", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Gabriel Albiac", "Pascal", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Euataquio Barjau", "Rilke", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Carlos Frigola", "Wilhelm Reich", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Mauricio Wacquez", "Sartre", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Felip Lorda", "Erasmo", "Barcanova", "1981", "", "Filocont_2"));
        b.add(new Book("Javier Esquivel", "La polémica del materialismo", "Tecnos", "1981", "", "Filocont_2"));
        b.add(new Book("H. O. Mounce", "Introducción al \"Tractatus\" de Wittgenstein", "Tecnos", "1982", "",
                "Filocont_2"));
        b.add(new Book("Mario Bunge", "Economía y filosofía", "Tecnos", "1982", "", "Filocont_2"));
        b.add(new Book("Jürgen Habermas", "Sobre Nietzsche y otros ensayos", "Tecnos", "1982", "", "Filocont_2"));
        b.add(new Book("Ramiro Ledesma Ramos", "La filosofía disciplina imperial", "Tecnos", "1982", "", "Filocont_2"));
        b.add(new Book("Paul Feyerabend", "Adiós a la razón", "Tecnos", "1984", "", "Filocont_2"));
        b.add(new Book("Félix Duque", "Filosofía de la técnica de la naturaleza", "Tecnos", "1986", "", "Filocont_2"));
        b.add(new Book("Benson Matyes", "Lógica de los estóicos", "Tecnos", "1985", "", "Filocont_2"));
        b.add(new Book("Jesús Ballesteros", "Postmodernidad: decadencia o resistencia", "Tecnos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Manuel Cruz", "Del pensar y sus objetos", "Tecnos", "1988", "", "Filocont_2"));
        b.add(new Book("Francis Bacon", "Teoría del cielo", "Tecnos", "1989", "", "Filocont_2"));
        b.add(new Book("Martin Heidegger", "La autoafirmación de la Univ. alemana …", "Tecnos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Baruch Spinoza", "Tratado de la reforma del entº y otros escritos", "Tecnos", "1989", "",
                "Filocont_2"));
        b.add(new Book("Nicolai Hartmann", "Autoexposición sistemática", "Tecnos", "1989", "", "Filocont_2"));
        b.add(new Book("Immanuel Kant", "La Metafísica de las Costumbres", "Tecnos", "1989", "", "Filocont_2"));
        b.add(new Book("Immanuel Kant", "Los pregresos de la Metafísica desde Leibniz y Wolff", "Tecnos", "1987", "",
                "Filocont_2"));
        b.add(new Book("Leszek Kolakowski", "Horror metaphysicus", "Tecnos", "1990", "", "Filocont_2"));
        b.add(new Book("Sulpicio Severo", "Obras completas", "Tecnos", "1987", "", "Filocont_2"));
        b.add(new Book("Edmund Husserl", "Meditaciones cartesianas", "Tecnos", "1986", "", "Filocont_2"));
        b.add(new Book("Varios autores", "¿Qué es la ilustración?", "Tecnos", "1988", "", "Filocont_2"));
        b.add(new Book("Tomás Moro", "Utopía", "Tecnos", "1987", "", "Filocont_2"));
        b.add(new Book("Montesquieu", "Cartas  persas", "Tecnos", "1986", "", "Filocont_2"));
        b.add(new Book("Ludwig Wittgenstein", "Ultimos  escritos sobre Filosofía de la Psicología", "Tecnos", "1987",
                "", "Filocont_2"));
        b.add(new Book("José Lorite Mena", "El animal paradójico. Fundamentos de antrop. f ilosófica", "Alianza Univ.",
                "1982", "", "Filocont_2"));
        b.add(new Book("José Luis L. Aranguren", "La  ética de Ortega Nº 1", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("Karl Jaspers", "La bomba atómica y el futuro del hombre Nº 2", "Taurus", "1958", "",
                "Filocont_2"));
        b.add(new Book("Ricardo Gullón", "Las secretas galerías de Antonio Machado Nº 3", "Taurus", "1958", "",
                "Filocont_2"));
        b.add(new Book("Claude Tresmontant", "Introducción al pensamiento de T. de Chardin Nº 4", "Taurus", "1958", "",
                "Filocont_2"));
        b.add(new Book("Emilio Brehier", "Los temas actuales de la filosofía Nº 6", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("José Mª Castellet", "La evolución espiritual de Hemingway Nº  7", "Taurus", "1958", "",
                "Filocont_2"));
        b.add(new Book("Angel del Río", "Poeta en Nueva  York Nº 8", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("Arturo Schopenhauer", "De la cuádruple raiz del pio. de razón suficiente", "Gredos", "1981",
                "", "Filocont_2"));
        b.add(new Book("Faustino Cordón", "Introducción al origen y evolución de la vida Nº 10", "Taurus", "1958", "",
                "Filocont_2"));
        b.add(new Book("José Ortega y Gasset", "Prólogo para alemanes Nº 11", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("Erwin Schrödinger", "La muerte y la materia Nº 12", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("Emmanuel Mounier", "Fe cristiana y civilización Nº 13", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("Julián Marías", "El lugar del peligro Nº 14", "Taurus", "1958", "", "Filocont_2"));
        b.add(new Book("C. F. Von Weizsaecher", "La responsabilidad de la ciencia en la edad atómica Nº 15", "Taurus",
                "1958", "", "Filocont_2"));
        b.add(new Book("Rafael Gutiérrez Girardot", "En torno a la literatura alemana actual Nº 16", "Taurus", "1959",
                "", "Filocont_2"));
        b.add(new Book("I. Fernández de Castro", "¿Unidad política de los cristianos? Nº 17", "Taurus", "1959", "",
                "Filocont_2"));
        b.add(new Book("Gottlieb Sóhngen", "El cristianismo de Goethe Nº 18", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("José Antonio Maravall", "Ortega en nuestra situación Nº 19", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Curt Paul Janz", "Friedrich Nietzsche 3.-  Los diez años del filósofo errante",
                "Alianza Univ.", "1985", "", "Filocont_2"));
        b.add(new Book("Leszek Kolakowski", "Si Dios no existe.  Sobre Dios, el pecado…", "Tecnos", "1985", "",
                "Filocont_2"));
        b.add(new Book("Jorge Mañach", "Dewey y el pensamiento americano Nº  20", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Martín Heidegger", "Carta sobre el humanismo  Nº 21", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Robert Rey", "Contra el arte abstracto Nº 22", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Sir Julian Huxley y Sir Charles Darwin", "El destino del hombre Nº 24", "Taurus", "1959", "",
                "Filocont_2"));
        b.add(new Book("Manuel Granell", "El humanismo como responsabilidad Nº 25", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Guillermo de Torre", "Clases de la literatura hispanoaméricana Nº 27", "Taurus", "1959", "",
                "Filocont_2"));
        b.add(new Book("Enrique Ruíz García", "Iberoamérica entre el bisonte y el toro Nº 28", "Taurus", "1959", "",
                "Filocont_2"));
        b.add(new Book("Miguel Crusafont Pairo", "Evolución y ascensión Nº 29", "Taurus", "1960", "", "Filocont_2"));
        b.add(new Book("María Zambrano", "La España de Galdós Nº 30", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Condesa de Campo Alange", "La mujer como mito y como ser humano Nº 33", "Taurus", "1961", "",
                "Filocont_2"));
        b.add(new Book("Michael Polanyi", "Ciencia, fe y sociedad Nº 34", "Taurus", "1961", "", "Filocont_2"));
        b.add(new Book("François Mauriac", "El hijo del hombre Nº 35", "Taurus", "1962", "", "Filocont_2"));
        b.add(new Book("Bernard Welte", "El ateismo de Nietzsche y el cristianismo NJª 37", "Taurus", "1962", "",
                "Filocont_2"));
        b.add(new Book("José Luis L. Aranguren", "Implicaciones de la Fª en la vida contemporánea Nº 47", "Taurus",
                "1963", "", "Filocont_2"));
        b.add(new Book("W. Kreiterling", "Iglesia católica y democracia Nº 48 (el 51 en música)", "Taurus", "1962", "",
                "Filocont_2"));
        b.add(new Book("Camille Bourniquel", "Actitudes políticas del escritor francés contemporáneo Nº 50", "Taurus",
                "1963", "", "Filocont_2"));
        b.add(new Book("Jean Bécarudt", "M. de Unamuno y la 2ª república Nº 62 (el 63 en música)", "Taurus", "1965",
                "", "Filocont_2"));
        b.add(new Book("Georges Bataille", "La literatura y el mal Nº 2", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("George S. Carter", "Cien años de evolución Nº 5", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Mircea Eliade", "Herreros y alquimistas Nº 6", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Alfred Foucher", "Las vidas anteriores de Buda Nº 8", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Giovanni Papini", "La logia de los bustos Nº 13", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Pedro Laín Entralgo", "Ejercicios de comprensión Nº 15", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Jacques A. Manduit", "40.000 años de arte moderno Nº 17", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Philip Bagby", "La cultura y la historia Nº 19", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("José Bergamín", "Lázaro, Don Juan y Segismundo Nº 22", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Fedor Stepum", "El teatro y el cine Nº 25", "Taurus", "1960", "", "Filocont_2"));
        b.add(new Book("Armando F. Zubizarreta", "Tras las huellas de Unamuno Nº 26", "Taurus", "1960", "",
                "Filocont_2"));
        b.add(new Book("Arnold Schoenberg", "El estilo y la idea Nº 33", "Taurus", "1963", "", "Filocont_2"));
        b.add(new Book("Segundo Serrano Poncela", "Dostoievski menor Nº 23", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("Francisco Ayala", "Tecnología y libertad  Nº 12", "Taurus", "1959", "", "Filocont_2"));
        b.add(new Book("María Angeles Galindo", "Historia de la educación", "Gredos", "1988", "2ª ed. 3ª reimp",
                "Filocont_2"));
        b.add(new Book("Miguel Morey", "Los presocráticos Del mito al logos", "Montesinos", "1981",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Carlos M. Rama", "La historiografía como conciencia histórica", "Montesinos", "1981",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Estela Ocampo", "El impresionismo. Pintura, literatura, música", "Montesinos", "1981",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Ramón Valls Plana", "La dialéctica.  Un debate histórico", "Montesinos", "1981",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Miguel Porta", "El positivismo lógico.  El círculo de Viena", "Montesinos", "1983",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("José Alsina", "Aristóteles.  De la filosofía a la ciencia", "Montesinos", "1986",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Carlos García Gual", "La mitología Interpretaciones del pensamiento mítico", "Montesinos",
                "1987", "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Victor Gómez Pin", "Proust El ocio y el mal", "Montesinos", "1985",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Menene Gras Balaguer", "Montaigne.  Del saber morir", "Montesinos", "1988",
                "ALIANZA EDITORIAL,EDITORIAL CINCEL,CUADERNOS ANAGRAMA", "Filocont_2"));
        b.add(new Book("Curt Paul Janz", "Friedrich Nietzsche 4.-  Los años de hundimiento 1989/1900", "Alianza Univ.",
                "1985", "C U A D E R N O S    T A U R U S", "Filocont_2"));
        b.add(new Book("G. E. Moore", "Defensa del sentido común  y otros ensayos", "Taurus", "1972",
                "C U A D E R N O S    T A U R U S", "Filocont_2"));
        b.add(new Book("Heródoto", "Historias  Libros V-VI", "Gredos", "1981", "C U A D E R N O S    T A U R U S",
                "Filocont_2"));
        b.add(new Book("Spinoza", "La reforma del entendimiento", "Aguilar", "1966",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar 4ª ed.", "Filocont_2"));
        b.add(new Book("José Luis L. Aranguren", "La crisis del catolicismo", "Alianza Ed.", "1969",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar", "Filocont_2"));
        b.add(new Book("Jesús Montoya/Jesús  Conill", "Aristóteles: sabiduría y felicidad", "Cincel", "1985",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar Nº 5", "Filocont_2"));
        b.add(new Book("Pedro Laín  Entralgo", "El médico en la historia Nº 9", "Taurus", "1958",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar", "Filocont_2"));
        b.add(new Book("J. C. Bermejo Barrera", "Mitología y mitos de la Hispania prerromana 2", "Akal", "1986",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar", "Filocont_2"));
        b.add(new Book("C. Lisón Tolosana", "Brujería, estructura social y simbolismo en Galicia", "Akal", "1983",
                "BIBLIOTECA DE INICIACIÓN FILOSÓFICA Aguilar 2ª ed.", "Filocont_2"));

    }

    private static void fillErrores() {
        final List<Book> b = DB.get("Errores_de_pegado");
        b.add(new Book("Francisco A. de Icaza", "Nietzsche, poeta (Interpretaciones líricas)", "Sáez Hnos.", "", "",
                "Errores_de_pegado"));
        b.add(new Book("Gunnar Ekelof", "Diwán Una trilogía", "Alianza", "1982", "", "Errores_de_pegado"));
        b.add(new Book("T. S. Elliot", "Poesías reunidas 1909-1962", "Alianza", "1979", "2ª ed.", "Errores_de_pegado"));
    }

    private static void fillBudis() {
        final List<Book> b = DB.get("Budismagibrujocult");
        b.add(new Book("Benimadhab Barua", "Hª de la filosofía india prebudista", "Visión Libros", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Piyadassi Thera", "El antiguo sendero de Buda", "Altalena", "1982", "", "Budismagibrujocult"));
        b.add(new Book("J. Forrest", " BUDA", "Libroexpress", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Zarathustra Budha S. Gantana", "Zend Avesta El Dhammapada", "Ver", "1964", "",
                "Budismagibrujocult"));
        b.add(new Book("Raul A. Ruy", "El libro de la gran extinción de Gotama el Buddha", "Hachette", "1953", "",
                "Budismagibrujocult"));
        b.add(new Book("Basilio Tatakis", "Filosofía bizantina", "Sudamericana", "1952", "", "Budismagibrujocult"));
        b.add(new Book("Adolfo P. Carpio", "El Tao Tê King de Lao Tse", "Sudamericana", "1957", "",
                "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "La importancia de comprender", "Sudamericana", "1965", "", "Budismagibrujocult"));
        b.add(new Book("Albert Scheweitzer", "Entre el agua y la selva virgen", "Hachete", "1955", "",
                "Budismagibrujocult"));
        b.add(new Book("Louis Pauwels", "Gurdjieff", "Hachete", "1955", "", "Budismagibrujocult"));
        b.add(new Book("Paul Brunton", "La india secreta", "Hachete", "1957", "", "Budismagibrujocult"));
        b.add(new Book("C. de Coster", "La leyenda de Thyl Ulenspiegel", "Hachete", "1955", "", "Budismagibrujocult"));
        b.add(new Book("Romain Rolland", "Vida de Ramakrishma", "Hachete", "1953", "", "Budismagibrujocult"));
        b.add(new Book("Erich Kahler", "La torre y el abismo", "Fabril", "1959", "", "Budismagibrujocult"));
        b.add(new Book("Romain Rolland", "Colás Breugnon", "Quetzal", "1958", "", "Budismagibrujocult"));
        b.add(new Book("Daisetz Teitarô Suzuki", "Introducción al budismo Zen", "Mundonuevo", "1960", "",
                "Budismagibrujocult"));
        b.add(new Book("Chan  Chen-Chi", "La práctica del Zen", "La pleyade", "1971", "", "Budismagibrujocult"));
        b.add(new Book("M. Antolin-Rato y A. Embid", "Introd. al budismo Zen: enseñanzas y textos", "Barral", "1972",
                "", "Budismagibrujocult"));
        b.add(new Book("Christmas Humphreys", "El Zen visto por Occidente", "Dédalo", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Alan W. Watts", "El espíritu del Zen", "Dédalo", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Alan W. Watts", "El camino del Zen", "Edhasa", "1971", "", "Budismagibrujocult"));
        b.add(new Book("Alan W. Watts", "El gran Mandala. Ensayos sobre la materialidad", "Kairós", "1971", "",
                "Budismagibrujocult"));
        b.add(new Book("Alan W. Watts", "El libro del tabú", "Kairós", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Zi Lie", "El libro de la perfecta vacuidad", "Kairós", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Jean Chevalier", "El sufismo y la tradición islámica", "Kairós", "1986", "",
                "Budismagibrujocult"));
        b.add(new Book("Martin Lings", "Qué es el sufismo", "Taurus", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Maurice Besson", "Totemismo", "Labor, S. A.", "1931", "", "Budismagibrujocult"));
        b.add(new Book("J. G. Frazer", "El totemismo", "Eyras", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Jean Riviere", "Historia de las doctrinas esotéricas", "Dédalo", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("Pedro Guirao", "Seis ensayos sobre esoterismo", "Jasón", "1931", "", "Budismagibrujocult"));
        b.add(new Book("Titus Burckhardt", "Esoterismo islámico", "Taurus", "1980", "", "Budismagibrujocult"));
        b.add(new Book("René Guénon", "Sobre el esoterismo islámico y el taoísmo", "Obelisco", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Frithjof Schuon", "El esoterismo como principio y como vía", "Taurus", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Maxime Rodinson", "La fascinación del Islám", "Júcar Univ.", "1989", "", "Budismagibrujocult"));
        b.add(new Book("M. Faltenmark", "La filosofía china", "Morata, S. A.", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Swami Vivekaranda", "Discursos sobre filosofía oriental", "A. Roch", "1920", "",
                "Budismagibrujocult"));
        b.add(new Book("Universidad de Oxford", "El legado de la India", "Pegaso", "1945", "", "Budismagibrujocult"));
        b.add(new Book("Clásico chino", "Loto dorado (Las mujeres de Men)", "Baal Editores", "1961", "",
                "Budismagibrujocult"));
        b.add(new Book("Alexandre Safrán", "La Cábala", "Mnez. Roca", "1976", "", "Budismagibrujocult"));
        b.add(new Book("Gershom Scholem", "La Cábala y su simbolismo", "Siglo XXI", "1979", "2ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Ed. de Marcos Ricardo Barnatán", "El zohar. Lecturas básicas de la Kábala", "Eds. del dragón",
                "1986", "", "Budismagibrujocult"));
        b.add(new Book("Marcos Ricardo Barnatán", "La Kábala: una mística del lenguaje", "Barral", "1974", "",
                "Budismagibrujocult"));
        b.add(new Book("Giuseppe Tucci", "Teoría y práctica del mandala", "Barral", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Mario Satz", "Jesús el Nazareno, terapeuta y kabalista", "Obelisco", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Ed. de Florentino Gª Martínez", "Textos del Qumrán", "Trotta", "1993", "3ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Tres iniciados", "El Kibalion", "Luis Cárcamo", "1978", "", "Budismagibrujocult"));
        b.add(new Book("Paul Masson Oursel", "El Yoga", "Eudeba", "1962", "", "Budismagibrujocult"));
        b.add(new Book("Swami Mukerji", "Lecciones de Yoga", "A. Roch", "1920", "", "Budismagibrujocult"));
        b.add(new Book("Patañjali", "Aforismos sobre el Yoga", "Doncel", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Ramiro A. Calle", "La sabiduría de los grandes yoguis", "C. Lectores", "1975", "",
                "Budismagibrujocult"));
        b.add(new Book("Emill Abegg", "Fuentes de psicología hindú", "Mundonuevo", "1960", "", "Budismagibrujocult"));
        b.add(new Book("Swami Akhilamanda", "Psicología hindú", "Paidos", "1959", "", "Budismagibrujocult"));
        b.add(new Book("León Dujovne", "Teoría de los valores y filosofía de la historia", "Paidos", "1959", "",
                "Budismagibrujocult"));
        b.add(new Book("E. Grassi y Th. Von Uexküll", "Las ciencias de la naturaleza y el espíritu", "L. Miracle",
                "1952", "", "Budismagibrujocult"));
        b.add(new Book("Maimónides", "Guía de descarriados", "Barath", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Abraham  Joshua Heschel", "Maimónides", "Muchnik", "1984", "", "Budismagibrujocult"));
        b.add(new Book("Herbert Le Porrier", "El médico de Córdoba Maimónides", "Grijalbo", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Heinrich Zimmer", "Filosofías de la India", "Eudeba", "1965", "", "Budismagibrujocult"));
        b.add(new Book("M. Hiriyanna", "Introducción a la filosofía de la India", "Sudamericana", "1960", "",
                "Budismagibrujocult"));
        b.add(new Book("Helmuth von Glasenapp", "La filosofía de los Hindúes", "Barral", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Fernando Tola, Traductor", "Doctrinas secretas de la India Upanishads", "Barral", "1973", "",
                "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "El médico del Tibet", "Troquel", "1960", "5ª ed.", "Budismagibrujocult"));
        b.add(new Book("Confucio Lao-tse", "Filosofía oriental", "Zeus", "1968", "", "Budismagibrujocult"));
        b.add(new Book("Agustín Rodríguez Fernández", "Diccionario de ciencias ocultas", "Caymi", "1956", "",
                "Budismagibrujocult"));
        b.add(new Book("J. Michelet", "La bruja", "Mateu, S. A.", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Margaret A. Murray", "El culto de la brujería en Europa Occidental", "Labor, S. A.", "1978",
                "", "Budismagibrujocult"));
        b.add(new Book("Margaret A. Murray", "El Dios de los brujos", "F. C. E.", "1986", "", "Budismagibrujocult"));
        b.add(new Book("Ulrico Molitor", "De las brujas y adivinas", "Jorge Alvarez", "1968", "", "Budismagibrujocult"));
        b.add(new Book("Geoffrey Parrinder", "La brujería", "Eudeba", "1963", "", "Budismagibrujocult"));
        b.add(new Book("Frank Donovan", "Historia de la brujería", "Alianza", "1978", "", "Budismagibrujocult"));
        b.add(new Book("Marvin Harris", "Vacas, cerdos, guerras y brujas", "Alianza", "1980", "", "Budismagibrujocult"));
        b.add(new Book("José Cayuela", "La confesión de las brujas", "Pomaire", "1980", "", "Budismagibrujocult"));
        b.add(new Book("Lucy Mair", "La brujería en los pueblos primitivos actuales", "Guadarrama", "1969", "",
                "Budismagibrujocult"));
        b.add(new Book("Sir Walter Scott", "Historia de los demonios y las brujas", "Glosa", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("E. E. Evans - Pritchard", "Brujería, magia y oráculos entre los azande", "Anagrama", "1976",
                "", "Budismagibrujocult"));
        b.add(new Book("A. P. Sinnett", "El buddhismo esotérico", "B. Rguez. Serra", "1931", "", "Budismagibrujocult"));
        b.add(new Book("Ananda Coomaraswamy", "Buddha y el evangelio del budismo", "Paidos", "1969", "",
                "Budismagibrujocult"));
        b.add(new Book("Daisaku Ikeda", "Budismo primer milenio", "Taurus", "1989", "1ª reimp.", "Budismagibrujocult"));
        b.add(new Book("Edward Conze", "Breve historia del budismo", "Alianza", "1983", "", "Budismagibrujocult"));
        b.add(new Book("Max Ladner", "La enseñanza de Buda", "La mandrágora", "1959", "", "Budismagibrujocult"));
        b.add(new Book("Beatrice Lane Suzuki", "Budismo Mahayana", "Fabril", "1961", "", "Budismagibrujocult"));
        b.add(new Book("Luis Bonilla", "Historia de la hechicería y de las brujas", "B. Nueva", "1962", "",
                "Budismagibrujocult"));
        b.add(new Book("Kurt Baschwitz", "Brujas y procesos de brujería", "Luis de Caralt", "1968", "",
                "Budismagibrujocult"));
        b.add(new Book("Pico della Mirandola", "Conclusiones mágicas y cabalísticas", "Obelisco", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Serge Hutin", "El amor mágico", "Roca", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Murry Hope", "Magia celta práctica", "Edaf, S. A.", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Eliphas Levi", "Curso de Fª oculta. Cartas al Barón de Spedialea", "Mascarón", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Libro de San Cipriano", "Tesoro del hechicero", "Ciencias Ocultas", "", "",
                "Budismagibrujocult"));
        b.add(new Book("G. R. Quaife", "Magia y maleficio", "Crítica", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Frank G. Ripel", "La magia de la Atlántida", "Kier", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Frank G. Ripel", "La magia roja", "Kier", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Frank G. Ripel", "La magia estelar", "Kier", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Sir James George Fraser", "La rama dorada Magia y religión", "F. C. E", "1961", "4ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Tobin Siebers", "El espejo de Medusa", "F. C. E", "1985", "", "Budismagibrujocult"));
        b.add(new Book("Claudine Brelet-Rueff", "Las medicinas sagradas", "Argos, S. A.", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Eugenio Garin", "El zodiaco de la vida", "Península", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Alain Gerber", "El Jade y la obsidiana", "Ultramar", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Marcelle Lalou", "Las religiones del Tibet", "Barral", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Jacques Soustelle", "Los aztecas", "Oikos-tau", "1980", "", "Budismagibrujocult"));
        b.add(new Book("Fco. Botello de Moraes", "Historia de las cuevas de Salamanca", "Tecnos", "1987", "",
                "Budismagibrujocult"));
        b.add(new Book("Louis Dumont", "La civilización india y nosotros", "Alianza", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Edición de Juan Gil", "El libro de Marco Polo", "Alianza", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Jack Kerouac", "Los vagabundos de Dharma", "Bruguera", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Prólogo de Antonio Ribera", "El Libro de Henoch", "B. Esotérica", "1980", "5ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("II Enoch", "El libro de los secretos de Enoch", "B. Esotérica", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Jacques Bacot", "Vida de Milarepa", "Labor, S. A.", "1975", "", "Budismagibrujocult"));
        b.add(new Book("Serge Hutin", "La alquimia", "Eudeba", "1962", "", "Budismagibrujocult"));
        b.add(new Book("Anónimo", "Siete textos de alquimia", "Kier, S. A.", "1982", "3ª ed.", "Budismagibrujocult"));
        b.add(new Book("Varios Autores", "Alquimia y ocultismo", "Barral", "1973", "", "Budismagibrujocult"));
        b.add(new Book("Jean Charles Pichon", "Hª universal de las sectas y soc. secretas T. I y II", "Bruguera",
                "1971", "", "Budismagibrujocult"));
        b.add(new Book("Bryan Wilson", "Sociología de las sectas religiosas", "Guadarrama", "1970", "",
                "Budismagibrujocult"));
        b.add(new Book("Manuel Seral Coca", "Lucifer símbolo oculto de la iniciación", "Fausí", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Sheldon B. Kopp", "Guru Metáforas de un psicoterapeuta", "Gedisa", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Victoria Sendón de León", "La España herética", "Icaria", "1986", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Claude Schmitt", "La herejía del santo lebrel", "Muchnik", "1984", "",
                "Budismagibrujocult"));
        b.add(new Book("José A. Sánchez Pérez", "Supersticiones españolas", "Saeta", "1948", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Claude Frere", "Las sociedades maléficas", "Mnez. Roca", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Fernando Schwarz", "El enigma precolombino", "Mnez. Roca", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Carlos Castaneda", "El segundo anillo de poder", "Pomaire", "1979", "", "Budismagibrujocult"));
        b.add(new Book("Carlos Castaneda", "El don del águila", "Eyras", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Teodore Roszak y otros", "Castaneda a exámen", "Kairos", "1977", "", "Budismagibrujocult"));
        b.add(new Book("Kurt E. Koch", "Ocultismo y cura de almas", "CLIE", "1968", "", "Budismagibrujocult"));
        b.add(new Book("Eliphas Levi", "Curso de filosofía oculta", "Mascarón", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Colin Wilson", "Lo oculto", "Noguer, S. A.", "1974", "", "Budismagibrujocult"));
        b.add(new Book("John Gregon Bourke", "Escatología y civilización", "Guadarrama", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("Pietro Scarduelli", "Dioses, espíritus, ancestros", "F. C. E.", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Gary ZuKar", "La danza de los maestros", "Argos Vergara", "1981", "", "Budismagibrujocult"));
        b.add(new Book("B. Malinowski", "Magia, ciencia, religión", "Ariel", "1974", "", "Budismagibrujocult"));
        b.add(new Book("B. Malinowsk", "Crimen y costumbre en la sociedad salvaje", "Ariel", "1969", "",
                "Budismagibrujocult"));
        b.add(new Book("J. Jahn", "Muntu: Las culturas de la negritud", "Guadarrama", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Gutierre Tibón", "La triade prenatal", "F. C. E.", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Michel Mourre", "Religiones y filosofías de Asia", "Zeus", "1962", "", "Budismagibrujocult"));
        b.add(new Book("M. Pereda", "Diccionario de mitología", "Casals", "1960", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Pierre Vernat", "Mito y pensamiento en la Grecia Antigua", "Ariel", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Carlos García Gual", "Prometeo mito y tragedia", "Ed. Peralta", "1979", "",
                "Budismagibrujocult"));
        b.add(new Book("C. W. Ceram", "Dioses, tumbas y sabios", "Destino", "1953", "", "Budismagibrujocult"));
        b.add(new Book("Leszek Kolakowski", "La presencia del mito", "Cátedra", "1990", "", "Budismagibrujocult"));
        b.add(new Book("Luis Gil", "Transmisión mítica", "Planeta", "1975", "", "Budismagibrujocult"));
        b.add(new Book("Lucien Levy-Bruhl", "Alma primitiva", "Sarpe", "1985", "", "Budismagibrujocult"));
        b.add(new Book("Manuel Gutiérrez Estévez", "Mito y ritual en América", "Alhambra", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Arthur M. Hocart", "Mito ritual y costumbre. Ensayos heterodoxos", "Siglo XXI", "1975", "",
                "Budismagibrujocult"));
        b.add(new Book("Mary Douglas", "Pureza y peligro", "Siglo XXI", "1973", "", "Budismagibrujocult"));
        b.add(new Book("Roland Barthes", "Mitologías", "Siglo XXI", "1980", "", "Budismagibrujocult"));
        b.add(new Book("H. D'Arbois de Jubainville", "El ciclo mitológico irlandés y la mitología céltica",
                "Visión Libros, S. L.", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Ramón Sainero", "La huella celta en España e Irlanda", "Akal", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Edic. de Ramón Sainero", "Leabhar Ghabhala El libro de las invasiones", "Akal", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("J. Bermejo Barrera", "Mitología y mitos de la hispania prerromana", "Akal", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Roger Caillois", "Instintos y sociedad", "Seix Barral", "1969", "", "Budismagibrujocult"));
        b.add(new Book("Barrows Dunham", "El hombre contra el mito", "Leviatán", "1956", "", "Budismagibrujocult"));
        b.add(new Book("Hans Hinterhäuser", "Fin de siglo Figuras y mitos", "Taurus", "1980", "", "Budismagibrujocult"));
        b.add(new Book("J. F. Lyotard", "La fenomenología", "Paidos", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Isaac Asimov", "Las palabras y los mitos", "Laia", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Varios Autores", "Textos mitológicos de las Eddas", "Miraguano", "1987", "",
                "Budismagibrujocult"));
        b.add(new Book("Josef Pieper", "Sobre los mitos platónicos", "Herder", "1984", "", "Budismagibrujocult"));
        b.add(new Book("Paul Diel", "El simbolismo en la mitología griega", "Labor, S. A", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("H. J. Rose", "Mitología griega", "Labor, S. A", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Pierre Grimal", "La mitología griega", "Paidos", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Paul Veyne", "Creyeron los griegos en sus mitos", "Granica", "1987", "", "Budismagibrujocult"));
        b.add(new Book("L. Paramio", "Mito e ideología", "A. Corazón", "1971", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Pierre Vernant", "Mito y sociedad en la Grecia antigua", "Siglo XXI", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Henri Michaux", "Miserable milagro La mescalina", "Monte Avila", "1969", "",
                "Budismagibrujocult"));
        b.add(new Book("Charles Fort", "El libro de los condenados", "Petronio, S. A.", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("René Guénon", "El reino de la cantidad y los signos de los tiempos", "Ayuso", "1976", "",
                "Budismagibrujocult"));
        b.add(new Book("René Guénon", "La gran triada", "Obelisco", "1986", "", "Budismagibrujocult"));
        b.add(new Book("P. Guirao", "Herejía y tragedia de los cátaros", "Produc. Edits.", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Frithof  Schuon", "Sobre los mundos antiguos", "Taurus", "1980", "", "Budismagibrujocult"));
        b.add(new Book("A. K. Coomaraswamy", "El tiempo y la eternidad", "Taurus", "1980", "", "Budismagibrujocult"));
        b.add(new Book("Malcolm D. Lambert", "La herejía medieval", "Taurus", "1986", "", "Budismagibrujocult"));
        b.add(new Book("Antonin Artaud", "Los tarahumara", "Barral", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Mario Satz", "Senderos en el jardín del corazón. Poética de la Kabala", "Kairos", "1989", "",
                "Budismagibrujocult"));
        b.add(new Book("Frances A. Yates", "Giordano Bruno y la tradición hermética", "Ariel", "1983", "1ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Georges Devereux", "Ensayos de etnopsiquiatría general", "Barral", "1973", "",
                "Budismagibrujocult"));
        b.add(new Book("G. S. Kirk", "El mito", "Barral", "1973", "", "Budismagibrujocult"));
        b.add(new Book("Ralph Merzner", "Las grandes metáforas de la tradición sagrada", "Kairos", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan Bergua, Traductor", "El libro de los muertos El bardo thodol", "Bergua", "1962", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "En busca de la historia perdida", "Mnez. Roca", "1979", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "Los supervivientes de la Atlántida", "Mnez. Roca", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "La meta secreta de los templarios", "Mnez. Roca", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "Guía de la España mágica", "Mnez. Roca", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "Segunda guía de la España mágica", "Mnez. Roca", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "Los santos imposibles", "Mnez. Roca", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Robert K. G. Temple", "El misterio de Sirio", "Mnez. Roca", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Joan Llareh", "El apocalipsis profético de San Juan", "Mnez. Roca", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Geza Szamosí", "Las dimensiones gemelas", "Pirámide", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Marcel Mauss", "Sociedad y ciencias sociales Obras III", "Barral", "1973", "",
                "Budismagibrujocult"));
        b.add(new Book("Carlos Valle (Editor)", "La Misna", "Edra. Nacional", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Daniel Prades", "Civilizaciones desaparecidas", "Noguer", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Pierre Honoré", "La leyenda de los dioses blancos", "Destino", "1989", "3ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Robert Graves", "La diosa blanca", "Losada", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Robert Graves", "Los mitos griegos I y II", "Losada", "1967", "", "Budismagibrujocult"));
        b.add(new Book("Robert Graves y R. Patai", "Los mitos hebreos", "Losada", "1969", "", "Budismagibrujocult"));
        b.add(new Book("Theodor H. Gaster", "Mito, leyenda y costumbre", "Barral", "1973", "", "Budismagibrujocult"));
        b.add(new Book("Juan-Eduardo Cirlot", "Diccionario de símbolos (Mitología) (Rúst.)", "Labor, S.A.", "1978", "",
                "Budismagibrujocult"));
        b.add(new Book("Varios autores", "¿Estamos sólos ante el cosmos?", "Plaza Janés", "1972", "",
                "Budismagibrujocult"));
        b.add(new Book("Carl Sagan", "La conexión cósmica", "Plaza Janés", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Eike Winkler y Josef Schweikhardt", "El conocimiento del hombre", "Planeta", "1985", "",
                "Budismagibrujocult"));
        b.add(new Book("Gordon Rattray Taylor", "El gran misterio de la evolución", "Planeta", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Hoimar von Ditfurth", "No somos sólo de este mundo", "Planeta", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Jean François Revel", "El conocimiento inútil", "Planeta", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Fred Hoyle", "El universo inteligente", "Grijalbo", "1984", "", "Budismagibrujocult"));
        b.add(new Book("Stephen W. Hawking", "Historia del tiempo", "Crítica", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Heinz R. Pagels", "La búsqueda del principio del tiempo", "Antoni  Bosch", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Steven Weinberg", "Los tres primeros minutos del universo", "Alianza", "1986", "6ª reimp.",
                "Budismagibrujocult"));
        b.add(new Book("Guy Hocquenhem y René Schérer", "El alma atómica", "Gedisa", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Jacques Ruffié", "De la biología a la cultura", "Muchnik", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Fred Hoyle", "La nube de la vida", "Crítica", "1982", "", "Budismagibrujocult"));
        b.add(new Book("A. Reinberg - N. J. Ghata", "Los ritmos biológicos", "El Ateneo", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Edgar Morin", "El método I La naturaleza de la naturaleza", "Cátedra", "1981", "",
                "Budismagibrujocult"));
        b.add(new Book("Edgar Morin", "El método II La vida de la vida", "Cátedra", "1983", "", "Budismagibrujocult"));
        b.add(new Book("Mario García", "Exp. crítica de las teorías vigentes sobre el orígen de la vida", "Anthropos",
                "1982", "", "Budismagibrujocult"));
        b.add(new Book("Faustino Cordón", "La evolución conjunta de los animales y su medio", "Anthropos", "1966", "",
                "Budismagibrujocult"));
        b.add(new Book("Jorge Blaschke", "Génesis y apocalipsis de la tierra", "Mitre", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("H. L. Shipman", "Loa agujeros negros, los cuásars y el universo", "Alhambra", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Hubert Reeves", "Paciencia en el azul del cielo", "Granica", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Estrabón", "Geografía. Prolegómenos", "Aguilar", "1980", "", "Budismagibrujocult"));
        b.add(new Book("G. Roos", "El mono degenerado", "Progensa", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Pierre Vernant", "La muerte en los ojos", "Gedisa", "1986", "", "Budismagibrujocult"));
        b.add(new Book("Thomas Hanna", "La rebelión de los muertos", "Plaza Janés", "1972", "", "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina secreta V. I Cosmogénesis", "L. Cárcamo", "1980", "6ª reimp.",
                "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina secreta V. II Símbolo arcaico universal", "L. Cárcamo", "1978",
                "", "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina secretaa V. III Antropogénesis", "L. Cárcamo", "1978", "",
                "Budismagibrujocult"));
        b.add(new Book("Herbert Wendt", "Del mono al hombre", "Bruguera", "1981", "", "Budismagibrujocult"));
        b.add(new Book("Robert Clarke", "El nacimiento del hombre", "Granica", "1983", "", "Budismagibrujocult"));
        b.add(new Book("Jean-Pierre Changeux", "El hombre neuronal", "Espasa Calpe", "1985", "", "Budismagibrujocult"));
        b.add(new Book("Alan W. Watts", "Cosmología gozosa", "Fingrat", "1979", "", "Budismagibrujocult"));
        b.add(new Book("Ignacio Puig, S. I.", "¿Qué es la física cósmica?", "Espasa Calpe", "1944", " V. Extra",
                "Budismagibrujocult"));
        b.add(new Book("Gilles C. Tannoudji- M. Spiro", "La materia - espacio - tiempo", "Espasa Calpe", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Werner Heisenberg", "Física y filosofía", "La isla", "1959", "", "Budismagibrujocult"));
        b.add(new Book("Werner Heisenberg", "La imagen de la naturaleza en la física actual", "Seix Barral", "1957",
                "", "Budismagibrujocult"));
        b.add(new Book("Redacción de Tel Quel", "Teoría del conjunto", "Seix Barral", "1971", "", "Budismagibrujocult"));
        b.add(new Book("Maurice Duguesne", "Materia y antimateria", "Oikos-tau", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Blas Cabrera", "Principio de relatividad", "Public. R. Est.", "1923", "", "Budismagibrujocult"));
        b.add(new Book("Hans Reichenbach", "Atomo y cosmos", "R. Occidente", "1931", "", "Budismagibrujocult"));
        b.add(new Book("Richard P. Flynman", "Electrodinámica  cuántica", "Alianza", "1988", "", "Budismagibrujocult"));
        b.add(new Book("S. Ramón y Cajal", "Reglas y consejos sobre la investigación científica", "Beltrán", "1940",
                "8ª ed.", "Budismagibrujocult"));
        b.add(new Book("Teodoro Wulf", "Los sillares del universo material", "Manuel Marín", "1939", "",
                "Budismagibrujocult"));
        b.add(new Book("George Sarton", "Historia de la ciencia I, II, III y IV", "Eudeba", "1965", "",
                "Budismagibrujocult"));
        b.add(new Book("Francisco Vera", "Historia de la ciencia", "J. Gil", "1937", "", "Budismagibrujocult"));
        b.add(new Book("Román Reyes (Director)", "Terminología científico-social", "Anthropos", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Mario Bunge", "Epistemología Ciencia de la ciencia", "Ariel", "1980", "", "Budismagibrujocult"));
        b.add(new Book("Werner Heisenberg", "Los nuevos fundamentos de la ciencia", "Norte y Sur", "1962", "",
                "Budismagibrujocult"));
        b.add(new Book("Guillermo Boído", "Einstein o la armonía del mundo", "Adiax, S. A.", "1980", "",
                "Budismagibrujocult"));
        b.add(new Book("Henri Laborit", "Dios juega a los dados", "Laia", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Lewis Mumford", "El mito de la máquina", "Emecé", "1969", "", "Budismagibrujocult"));
        b.add(new Book("Jean Rostand", "Ciencia falsa y falsas ciencias", "Salvat", "1971", "", "Budismagibrujocult"));
        b.add(new Book("David Bohm - David Peat", "Ciencia, orden y creatividad", "Kairos", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Eduardo Nicol", "Los principios de la ciencia", "F. C. E.", "1965", "", "Budismagibrujocult"));
        b.add(new Book("Remberto Reinhardt", "Psicología animal", "Espasa-Calpe", "1944", "", "Budismagibrujocult"));
        b.add(new Book("Paul Scheurer", "Revoluciones de la ciencia  y permanencia de lo real", "Destino", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Paul Ricoeur", "Corrientes de la invest. en las ciencias sociales", "Tecnos", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Konrad Lorenz", "El comportamiento animal y humano", "Plaza Janés", "1972", "",
                "Budismagibrujocult"));
        b.add(new Book("Konrad Lorenz", "La otra cara del espejo", "Plaza Janés", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Abraham País", "La ciencia y la vida de Albert Einstein", "Ariel", "1984", "",
                "Budismagibrujocult"));
        b.add(new Book("Desmond Morris", "El mono desnudo", "Plaza Janés", "1968", "3ª ed.", "Budismagibrujocult"));
        b.add(new Book("Desmond Morris", "El zoo humano", "Plaza Janés", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Isaac Asimov", "Introducción a la ciencia", "Plaza Janés", "1973", "", "Budismagibrujocult"));
        b.add(new Book("Gaston Bachelard", "La formación del espíritu científico", "Siglo XXI", "1972", "2ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Martin Harris", "Caníbales y Reyes. Los origenes de las culturas", "Argos, S.A.", "1978", "",
                "Budismagibrujocult"));
        b.add(new Book("Christian Jacq", "El Egipto de los grandes faraones", "Mnez. Roca", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Romain Rolland", "Vida de Vive Kananda El evangelio universal", "Hachete", "1954", "Intonso",
                "Budismagibrujocult"));
        b.add(new Book("Anónimo Edicción de Mirko Lauer", "I CHING", "Barral", "1971", "", "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "Sabiduría china", "B. Nueva", "1959", "3ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "La importancia de vivir", "Sudamericana", "1954", "17ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "De pagano a cristiano", "Sudamericana", "1960", "", "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "La sabiduría de Laotse", "Sudamericana", "1953", "2ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "El tercer ojo", "Troquel", "1960", "6ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "La sabiduría de los ancianos", "Troquel", "1966", "2ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "El cordón de plata", "Troquel", "1962", "7ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "La caverna de los antepasados", "Troquel", "1963", "3ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "El ermitaño", "Troquel", "1973", "6ª ed.", "Budismagibrujocult"));
        b.add(new Book("Lobsang Rampa", "Más allá del décimo", "Troquel", "1973", "13ª ed.", "Budismagibrujocult"));
        b.add(new Book("Helmuth  von Glasenapp", "El budismo, una religión sin Dios", "Barral", "1974", "",
                "Budismagibrujocult"));
        b.add(new Book("Birket-Smith, Kaj", "Vida e historia de las culturas I y II", "Nova", "1952", "",
                "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina secretaa V. IV Simbolismo arcaico de las religiones",
                "L. Cárcamo", "1978", "", "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina secreta V. V Ciencia, religión y filosofía", "L. Cárcamo",
                "1978", "", "Budismagibrujocult"));
        b.add(new Book("Lin Yutang", "Sabiduría hindú", "B. Nueva", "1959", "3ª ed.", "Budismagibrujocult"));
        b.add(new Book("F. J. Indurain", "Teorías unificadas y constituyentes fundamen. de la materia", "Espasa Calpe",
                "1988", "", "Budismagibrujocult"));
        b.add(new Book("Faustino Cordón", "La función de la ciencia en la sociedad", "Anthropos", "1982",
                "Ed. Correg. y aum.", "Budismagibrujocult"));
        b.add(new Book("Fritjof  Capra", "El Tao de la física", "Luis Cárcamo", "1987", "2ª ed.", "Budismagibrujocult"));
        b.add(new Book("Juan-Eduardo Cirlot", "Diccionario de símbolos (Mitología)", "Labor, S.A.", "1978", "",
                "Budismagibrujocult"));
        b.add(new Book("Philippe de Felice", "Venenos sagrados. Embriaguez divina", "Felmar", "1975", "",
                "Budismagibrujocult"));
        b.add(new Book("Ernesto de Martino", "Magia y civilización", "El Ateneo", "1965", "2 ejemplares",
                "Budismagibrujocult"));
        b.add(new Book("René Guénon", "Formas tradicionales y ciclos cósmicos", "Obelisco", "1984", "",
                "Budismagibrujocult"));
        b.add(new Book("Tomas Campanella", "La ciudad del sol", "Mondadori", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Rodolfo López y Liberato López", "El mapa cósmico de Piri-Reis", "Kier, S. A.", "1979", "",
                "Budismagibrujocult"));
        b.add(new Book("Hermann  Oldenberg", "La literatura de la antigua India", "Losada", "1956", "Intonso",
                "Budismagibrujocult"));
        b.add(new Book("Boris Kouznetsov", "Einstein Su vida, sus pensamientos, sus teorías", "CVS Eds. S.A.", "1975",
                "", "Budismagibrujocult"));
        b.add(new Book("Karl R. Popper", "La lógica de la investigación científica", "Tecnos", "1977", "",
                "Budismagibrujocult"));
        b.add(new Book("Ernest Nagel", "La lógica sin metafísica", "Tecnos", "1974", "", "Budismagibrujocult"));
        b.add(new Book("L. Leshan y H. Margenau", "El espacio de Einstein y el cielo de Van Gogh", "Gedisa", "1985",
                "", "Budismagibrujocult"));
        b.add(new Book("Juan Carlos García Borrón", "La filosofía y las ciencias", "Crítica", "1987", "",
                "Budismagibrujocult"));
        b.add(new Book("Eugenio Garín", "La filosofía y las ciencias en el siglo XX", "Icaria", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Mº de Educación y Ciencia", "Lógica, epistemología y teoría de la ciencia", "Mº Educ. y C.",
                "1981", "", "Budismagibrujocult"));
        b.add(new Book("Thomas Hunt Morgan", "La base científica de la evolución", "Espasa-Calpe", "1943", "",
                "Budismagibrujocult"));
        b.add(new Book("Carl Sagan", "El cerebro de Broca Reflex. sobre el mundo de la ciencia", "Grijalbo", "1981",
                "", "Budismagibrujocult"));
        b.add(new Book("Ignasi Terradas", "Mal natural Mal social Int. a la Tª de las CC. HH.", "Barcanova", "1988",
                "", "Budismagibrujocult"));
        b.add(new Book("Arthur March", "La física del átomo", "R. Occidente", "1934", "", "Budismagibrujocult"));
        b.add(new Book("Javier Echeverría", "Introducción a la metodología de la ciencia", "Barcanova", "1989", "",
                "Budismagibrujocult"));
        b.add(new Book("Vintila Horia", "Viaje a los centros de la tierra", "Plaza Janés", "1972", "2ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Konrad Lorenz", "Consideraciones sobre las conductas  animal y humano", "Plaza Janés", "1974",
                "", "Budismagibrujocult"));
        b.add(new Book("N. Drury & S. Skinner", "En busca de Abraxas", "Felmar", "1975", "", "Budismagibrujocult"));
        b.add(new Book("John D. Bernal", "Historia social de la ciencia 1 y 2", "Península", "1979", "5ª ed.",
                "Budismagibrujocult"));
        b.add(new Book("Albert Einstein y otros", "La teoría de la relatividad", "Alianza", "1984", "9ª reimp.",
                "Budismagibrujocult"));
        b.add(new Book("Varios autores", "Matemática, verdad, realidad", "Grijalbo", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Werner Heisenberg", "Más alla de la física", "B. A. C.", "1974", "", "Budismagibrujocult"));
        b.add(new Book("Varios autores", "Cuestiones cuánticas", "Kairos", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Norman Cohn", "En pos del milenio", "Barral", "1972", "", "Budismagibrujocult"));
        b.add(new Book("Pierre Grimal", "Diccionario de mitología griega y romana", "Paidos", "1982", "1ª reimp.",
                "Budismagibrujocult"));
        b.add(new Book("Michael Talbot", "Más allá de la teoría cuántica", "Gedisa", "1988", "", "Budismagibrujocult"));
        b.add(new Book("Edgar Morin / M. Piatelli-Palmarini", "El primate y el hombre", "Argos Vergara", "1983", "",
                "Budismagibrujocult"));
        b.add(new Book("Michel Mourre", "Religiones y filosofías de Asia", "Zeus", "1962", "", "Budismagibrujocult"));
        b.add(new Book("E. Nagel", "La estructura de la ciencia", "Paidós", "1981", "1ª reimp.", "Budismagibrujocult"));
        b.add(new Book("H. P. Blavatsky", "La doctrina oculta V. VI Objeto de los misterios y práctica de Fª ocul",
                "L. Cárcamo", "1978", "", "Budismagibrujocult"));
        b.add(new Book("Mario Muchnik", "Albert Einstein", "Lumen", "1989", "", "Budismagibrujocult"));
        b.add(new Book("Francesc Nicolau", "Introducción a la cosmología", "Encuentro E.", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Marcel Mauss", "Lo sagrado y lo profano Obras I", "Barral", "1970", "", "Budismagibrujocult"));
        b.add(new Book("Marcel Mauss", "Institución y culto Obras II", "Barral", "1971", "", "Budismagibrujocult"));
        b.add(new Book("José Manuel Alonso", "Introducción al principio antrópico", "Encuentro Eds.", "1989", "",
                "Budismagibrujocult"));
        b.add(new Book("Carl Sagan", "Cosmos", "Planeta", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Eric Chaisson", "El amanecer cósmico", "Argos Vergara", "1982", "", "Budismagibrujocult"));
        b.add(new Book("Ernest Cassier", "Mito y lenguaje", "Galatea Nueva V.", "1959", "2 ejemplares",
                "Budismagibrujocult"));
        b.add(new Book("José Luis Abellán", "Mito y cultura", "Seminarios y E.", "1971", "", "Budismagibrujocult"));
        b.add(new Book("James G. Frazer", "Mitos sobre el origen del fuego", "Alta Fulla", "1986", "",
                "Budismagibrujocult"));
        b.add(new Book("Michael Senior", "Quién es quién en la mitología", "Futuro", "1987", "", "Budismagibrujocult"));
        b.add(new Book("Wolfgang Strobl", "Introducción a la filosofía de las ciencias", "Monast. Poyo", "1963", "",
                "Budismagibrujocult"));
        b.add(new Book("J. A. Pérez Rioja", "Diccionario de símbolos y mitos", "Tecnos", "1984", "2ª reimp.",
                "Budismagibrujocult"));
        b.add(new Book("José Alsina", "Los orígenes helénicos de la medicina occidental", "Guadarrama", "1982", "",
                "Budismagibrujocult"));
        b.add(new Book("Franco Cardini", "Magia, brujería y superstición en el occidente medieval", "Península",
                "1982", "", "Budismagibrujocult"));
        b.add(new Book("Juan G. Atienza", "Guía de las brujas en España", "Arin", "1986", "", "Budismagibrujocult"));
        b.add(new Book("José Luis Morales Marín", "Diccionario de iconología y simbología", "Taurus", "1984", "",
                "Budismagibrujocult"));
        b.add(new Book("Rossell Hope Robbins", "Enciclopedia de la brujería y demonología", "Debate, S. A.", "1988",
                "", "Budismagibrujocult"));
        b.add(new Book("Fco. C. Sáinz de Robles", "Diccionario mitológico universal", "M. Aguilar", "1944", "",
                "Budismagibrujocult"));
        b.add(new Book("J. Chevalier y A. Gheerbrant", "Diccionario de los símbolos", "Herder", "1988", "",
                "Budismagibrujocult"));
        b.add(new Book("Pierre Grimal", "Diccionario de mitología griega y romana (rústica)", "Paidos", "1986",
                "3ª reimp.", "Budismagibrujocult"));
        b.add(new Book("Director Virgilio Ortega", "Historia general de las ciencias T. 1 a 18", "Orbis, S.A.", "1997",
                "", "Budismagibrujocult"));
        b.add(new Book("Roland Villeneuve", "El universo diabólico", "Felmar", "1976", "", "Budismagibrujocult"));
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

}
