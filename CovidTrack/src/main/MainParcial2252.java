package main;

import core.Antena;
import core.CovidTrack;
import core.UsuarioAplicacion;
import core.UsuarioOperador;
import java.time.LocalDateTime;

public class MainParcial2252 {
    
    public static void main(String[] args) {
        CovidTrack covidTrack = new CovidTrack();

        covidTrack.addAntena(new Antena(8.11154, -68.16408));
        covidTrack.addAntena(new Antena(5.55067, -75.59239));
        covidTrack.addAntena(new Antena(1.32634, -77.76599));
        covidTrack.addAntena(new Antena(3.46192, -69.26800));
        covidTrack.addAntena(new Antena(6.21529, -70.11296));
        covidTrack.addAntena(new Antena(6.05545, -68.36529));
        covidTrack.addAntena(new Antena(6.71401, -69.04366));
        covidTrack.addAntena(new Antena(5.26551, -70.45042));
        covidTrack.addAntena(new Antena(-0.69216, -66.42518));
        covidTrack.addAntena(new Antena(1.19011, -69.16680));

        covidTrack.addPuntoInteres("Hospital General", "Hospital", -0.76046, -73.03121, 524.96295);
        covidTrack.addPuntoInteres("Supermercado La 14", "Supermercado", 2.90180, -69.57626, 510.84707);
        covidTrack.addPuntoInteres("Parque Central", "Parque", 4.17299, -72.48633, 623.18094);
        covidTrack.addPuntoInteres("Plaza de Bolivar", "Plaza", 3.76600, -74.39112, 928.12768);
        covidTrack.addPuntoInteres("Universidad Nacional", "Universidad", 5.88846, -71.24567, 670.04692);
        covidTrack.addPuntoInteres("Colegio San Jose", "Colegio", 5.18724, -67.55423, 701.91971);
        covidTrack.addPuntoInteres("Gimnasio Bodytech", "Gimnasio", -2.59267, -69.32570, 795.79170);
        covidTrack.addPuntoInteres("Hospital de Ninos", "Hospital", 2.26081, -71.92285, 531.29864);
        covidTrack.addPuntoInteres("Supermercado Exito", "Supermercado", 5.15413, -73.52426, 958.26336);
        covidTrack.addPuntoInteres("Parque de la 93", "Parque", -0.57312, -70.14875, 708.86618);
        covidTrack.addPuntoInteres("Plaza de Mercado", "Plaza", 5.84928, -68.64965, 994.11083);
        covidTrack.addPuntoInteres("Universidad de los Andes", "Universidad", 3.70326, -68.85402, 627.78754);
        covidTrack.addPuntoInteres("Colegio La Salle", "Colegio", 3.06067, -71.22570, 570.44043);
        covidTrack.addPuntoInteres("Gimnasio Fitness", "Gimnasio", -1.39175, -73.99685, 854.03314);
        covidTrack.addPuntoInteres("Hospital Militar", "Hospital", 5.60862, -74.48470, 757.56243);
        covidTrack.addPuntoInteres("Supermercado Olimpica", "Supermercado", 3.89686, -73.61412, 593.03017);
        covidTrack.addPuntoInteres("Parque Simon Bolivar", "Parque", 6.90367, -72.31956, 811.73377);
        covidTrack.addPuntoInteres("Plaza de la Paz", "Plaza", 8.78956, -69.32985, 997.98326);
        covidTrack.addPuntoInteres("Universidad Javeriana", "Universidad", 1.77310, -68.85677, 806.11115);
        covidTrack.addPuntoInteres("Colegio San Ignacio", "Colegio", 0.99569, -74.52784, 654.57029);
        covidTrack.addPuntoInteres("Gimnasio Smart Fit", "Gimnasio", 5.11231, -68.76690, 962.05953);
        covidTrack.addPuntoInteres("Hospital San Vicente", "Hospital", 6.05759, -71.52093, 683.56048);
        covidTrack.addPuntoInteres("Supermercado Carulla", "Supermercado", 4.28601, -75.52970, 581.26390);
        covidTrack.addPuntoInteres("Parque El Chico", "Parque", 5.14184, -70.21582, 604.22682);
        covidTrack.addPuntoInteres("Plaza de las Americas", "Plaza", 5.42242, -72.86485, 876.43070);
        covidTrack.addPuntoInteres("Universidad del Rosario", "Universidad", 3.25442, -67.09067, 854.38480);
        covidTrack.addPuntoInteres("Colegio San Antonio", "Colegio", -1.80436, -75.78212, 734.41069);
        covidTrack.addPuntoInteres("Gimnasio Golds Gym", "Gimnasio", 4.09100, -68.68702, 644.39328);
        covidTrack.addPuntoInteres("Hospital de la Mujer", "Hospital", 4.58393, -68.91197, 557.58219);
        covidTrack.addPuntoInteres("Supermercado D1", "Supermercado", 6.79185, -73.76729, 717.49961);

        covidTrack.addUsuario(new UsuarioOperador("3123841368", false));
        covidTrack.addUsuario(new UsuarioAplicacion("3133314511", false, "Juan Perez", "275480927", "Calle 64 # 45-67"));
        covidTrack.addUsuario(new UsuarioOperador("3151056159", false));
        covidTrack.addUsuario(new UsuarioAplicacion("3065096500", true, "Maria Gomez", "878042637", "Carrera 7 # 32-12"));
        covidTrack.addUsuario(new UsuarioOperador("3177759929", true));
        covidTrack.addUsuario(new UsuarioAplicacion("3018724468", true, "Carlos Sanchez", "270196514", "Avenida 1 # 10-20"));
        covidTrack.addUsuario(new UsuarioOperador("3039863291", false));
        covidTrack.addUsuario(new UsuarioAplicacion("3159543406", false, "Ana Torres", "39762345", "Transversal 5 # 15-30"));
        covidTrack.addUsuario(new UsuarioOperador("3120456957", true));
        covidTrack.addUsuario(new UsuarioAplicacion("3021042882", true, "Luis Martinez", "149699515", "Diagonal 23 # 45-67"));

        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(2), LocalDateTime.of(2021, 5, 24, 6, 2));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(5), LocalDateTime.of(2021, 5, 7, 19, 28));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(9), LocalDateTime.of(2021, 6, 14, 20, 13));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(3), LocalDateTime.of(2021, 5, 21, 6, 55));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(8), LocalDateTime.of(2021, 6, 13, 23, 34));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(0), LocalDateTime.of(2021, 5, 1, 3, 52));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(3), LocalDateTime.of(2021, 5, 20, 20, 3));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(5), LocalDateTime.of(2021, 6, 28, 8, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(9), LocalDateTime.of(2021, 5, 2, 13, 12));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(5), LocalDateTime.of(2021, 5, 19, 11, 14));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(0), LocalDateTime.of(2021, 5, 11, 0, 43));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(2), LocalDateTime.of(2021, 4, 29, 1, 53));
        covidTrack.addRegistro(covidTrack.getUsuario(0), covidTrack.getAntena(7), LocalDateTime.of(2021, 5, 24, 11, 55));

        covidTrack.addRegistro(covidTrack.getUsuario(1), -1.50926, -67.41265, LocalDateTime.of(2021, 5, 25, 11, 35));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 0.79000, -72.61770, LocalDateTime.of(2021, 5, 21, 14, 15));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.25394, -76.48747, LocalDateTime.of(2021, 6, 2, 19, 52));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.97513, -74.05875, LocalDateTime.of(2021, 4, 10, 19, 32));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 1.24461, -72.91261, LocalDateTime.of(2021, 4, 12, 10, 25));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 5.64051, -73.87313, LocalDateTime.of(2021, 5, 11, 19, 9));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 2.70983, -66.83915, LocalDateTime.of(2021, 4, 24, 5, 1));
        covidTrack.addRegistro(covidTrack.getUsuario(1), -0.78567, -70.61949, LocalDateTime.of(2021, 6, 23, 15, 57));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 1.63667, -70.63670, LocalDateTime.of(2021, 6, 10, 0, 51));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.14847, -72.07027, LocalDateTime.of(2021, 4, 22, 13, 6));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.11250, -70.02168, LocalDateTime.of(2021, 6, 12, 0, 7));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 2.01964, -67.27100, LocalDateTime.of(2021, 6, 23, 5, 1));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.61881, -71.10609, LocalDateTime.of(2021, 4, 8, 18, 50));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 8.66540, -68.87807, LocalDateTime.of(2021, 4, 3, 21, 37));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 6.01941, -75.26433, LocalDateTime.of(2021, 6, 16, 5, 53));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.20730, -70.52515, LocalDateTime.of(2021, 5, 13, 3, 0));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.91644, -70.70397, LocalDateTime.of(2021, 6, 14, 14, 25));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.40802, -71.19996, LocalDateTime.of(2021, 4, 19, 11, 55));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.44433, -70.99210, LocalDateTime.of(2021, 6, 8, 12, 15));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 6.84225, -67.37539, LocalDateTime.of(2021, 4, 20, 11, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 1.24233, -70.39299, LocalDateTime.of(2021, 4, 18, 20, 14));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.54121, -70.32547, LocalDateTime.of(2021, 5, 9, 0, 22));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 2.59309, -73.20301, LocalDateTime.of(2021, 4, 7, 21, 11));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 6.16252, -72.91594, LocalDateTime.of(2021, 6, 20, 5, 2));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 3.65742, -73.07041, LocalDateTime.of(2021, 5, 3, 5, 15));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.83816, -71.77720, LocalDateTime.of(2021, 4, 8, 17, 52));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 5.69868, -72.57615, LocalDateTime.of(2021, 4, 3, 12, 3));
        covidTrack.addRegistro(covidTrack.getUsuario(1), -0.28151, -71.20963, LocalDateTime.of(2021, 6, 25, 18, 48));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 4.24537, -71.61036, LocalDateTime.of(2021, 6, 2, 0, 43));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 7.14243, -73.83756, LocalDateTime.of(2021, 5, 15, 22, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 5.60068, -70.16552, LocalDateTime.of(2021, 4, 27, 13, 3));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 1.89666, -70.20191, LocalDateTime.of(2021, 5, 24, 20, 37));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 2.26459, -72.11053, LocalDateTime.of(2021, 4, 9, 23, 27));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 6.12156, -73.06083, LocalDateTime.of(2021, 6, 4, 13, 52));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 2.70844, -68.79054, LocalDateTime.of(2021, 6, 12, 15, 47));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 9.02863, -69.66984, LocalDateTime.of(2021, 5, 13, 5, 9));
        covidTrack.addRegistro(covidTrack.getUsuario(1), 10.08218, -75.51875, LocalDateTime.of(2021, 6, 1, 20, 31));

        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(3), LocalDateTime.of(2021, 5, 16, 13, 6));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(7), LocalDateTime.of(2021, 4, 8, 22, 15));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(6), LocalDateTime.of(2021, 5, 20, 0, 13));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(6), LocalDateTime.of(2021, 6, 27, 2, 3));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(5), LocalDateTime.of(2021, 6, 6, 1, 36));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(0), LocalDateTime.of(2021, 6, 13, 16, 29));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(9), LocalDateTime.of(2021, 5, 28, 7, 48));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(5), LocalDateTime.of(2021, 5, 14, 8, 22));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(8), LocalDateTime.of(2021, 4, 3, 16, 2));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(7), LocalDateTime.of(2021, 6, 18, 18, 22));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(8), LocalDateTime.of(2021, 5, 17, 21, 6));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(1), LocalDateTime.of(2021, 5, 29, 6, 39));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(0), LocalDateTime.of(2021, 5, 17, 8, 23));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(6), LocalDateTime.of(2021, 4, 1, 22, 2));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(9), LocalDateTime.of(2021, 4, 27, 15, 27));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(1), LocalDateTime.of(2021, 6, 24, 15, 27));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(4), LocalDateTime.of(2021, 4, 22, 22, 14));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(3), LocalDateTime.of(2021, 6, 9, 3, 0));
        covidTrack.addRegistro(covidTrack.getUsuario(2), covidTrack.getAntena(7), LocalDateTime.of(2021, 4, 9, 10, 47));

        covidTrack.addRegistro(covidTrack.getUsuario(3), 2.17841, -73.09658, LocalDateTime.of(2021, 5, 17, 19, 4));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 10.43912, -72.16783, LocalDateTime.of(2021, 6, 14, 3, 10));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 0.91507, -73.16921, LocalDateTime.of(2021, 4, 26, 1, 47));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 6.06790, -68.72294, LocalDateTime.of(2021, 6, 26, 9, 25));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.27227, -71.69293, LocalDateTime.of(2021, 4, 16, 8, 12));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.57176, -73.51193, LocalDateTime.of(2021, 5, 16, 6, 38));
        covidTrack.addRegistro(covidTrack.getUsuario(3), -0.08024, -70.80031, LocalDateTime.of(2021, 4, 6, 4, 41));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.24510, -68.10367, LocalDateTime.of(2021, 6, 28, 1, 24));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 4.42440, -73.11246, LocalDateTime.of(2021, 5, 23, 14, 21));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 10.36546, -70.93320, LocalDateTime.of(2021, 5, 25, 4, 46));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 8.10908, -71.88277, LocalDateTime.of(2021, 5, 11, 17, 24));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 3.77317, -74.44931, LocalDateTime.of(2021, 4, 6, 18, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 3.11689, -72.95408, LocalDateTime.of(2021, 5, 14, 15, 11));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 8.40835, -75.16507, LocalDateTime.of(2021, 6, 27, 21, 12));
        covidTrack.addRegistro(covidTrack.getUsuario(3), -2.06608, -68.82912, LocalDateTime.of(2021, 6, 12, 12, 56));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.67776, -70.58194, LocalDateTime.of(2021, 5, 5, 13, 46));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 4.05057, -70.38512, LocalDateTime.of(2021, 4, 28, 4, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 8.49628, -69.65840, LocalDateTime.of(2021, 6, 15, 11, 43));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 4.66455, -72.64494, LocalDateTime.of(2021, 4, 5, 9, 48));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 4.46172, -74.81257, LocalDateTime.of(2021, 4, 24, 14, 9));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 0.72783, -77.53679, LocalDateTime.of(2021, 4, 9, 21, 26));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 11.35220, -72.07814, LocalDateTime.of(2021, 4, 19, 9, 48));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 3.01486, -72.04255, LocalDateTime.of(2021, 5, 2, 11, 29));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.21372, -75.36048, LocalDateTime.of(2021, 5, 5, 11, 26));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.63788, -70.75974, LocalDateTime.of(2021, 5, 21, 6, 7));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 8.14808, -72.77494, LocalDateTime.of(2021, 6, 9, 16, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 10.23132, -73.75026, LocalDateTime.of(2021, 5, 19, 21, 5));
        covidTrack.addRegistro(covidTrack.getUsuario(3), 5.77591, -72.30348, LocalDateTime.of(2021, 6, 1, 18, 25));

        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(0), LocalDateTime.of(2021, 6, 6, 16, 22));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(8), LocalDateTime.of(2021, 6, 2, 11, 4));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(0), LocalDateTime.of(2021, 6, 1, 7, 31));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(6), LocalDateTime.of(2021, 5, 11, 3, 27));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(0), LocalDateTime.of(2021, 6, 25, 15, 47));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(6), LocalDateTime.of(2021, 4, 28, 18, 46));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(2), LocalDateTime.of(2021, 5, 30, 4, 8));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(8), LocalDateTime.of(2021, 6, 20, 6, 7));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(6), LocalDateTime.of(2021, 6, 16, 9, 56));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(2), LocalDateTime.of(2021, 4, 28, 16, 0));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(4), LocalDateTime.of(2021, 4, 7, 23, 55));
        covidTrack.addRegistro(covidTrack.getUsuario(4), covidTrack.getAntena(1), LocalDateTime.of(2021, 6, 7, 2, 26));

        covidTrack.addRegistro(covidTrack.getUsuario(5), 2.58504, -73.07342, LocalDateTime.of(2021, 5, 2, 19, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 7.46423, -70.57584, LocalDateTime.of(2021, 5, 21, 3, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 6.67614, -67.80369, LocalDateTime.of(2021, 6, 6, 21, 57));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 3.80466, -69.03676, LocalDateTime.of(2021, 6, 4, 3, 14));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 5.58940, -71.94475, LocalDateTime.of(2021, 6, 11, 18, 3));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 4.33766, -71.75749, LocalDateTime.of(2021, 6, 18, 20, 38));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 7.91240, -74.99313, LocalDateTime.of(2021, 5, 20, 15, 49));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 2.32990, -75.78820, LocalDateTime.of(2021, 6, 28, 1, 23));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 4.95207, -70.80427, LocalDateTime.of(2021, 5, 1, 8, 1));
        covidTrack.addRegistro(covidTrack.getUsuario(5), -0.73239, -73.52510, LocalDateTime.of(2021, 5, 24, 5, 20));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 9.34044, -78.34623, LocalDateTime.of(2021, 5, 13, 17, 27));
        covidTrack.addRegistro(covidTrack.getUsuario(5), 6.49548, -71.01238, LocalDateTime.of(2021, 5, 19, 22, 25));

        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(5), LocalDateTime.of(2021, 4, 4, 9, 55));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(6), LocalDateTime.of(2021, 4, 24, 2, 38));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(8), LocalDateTime.of(2021, 4, 30, 3, 6));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(3), LocalDateTime.of(2021, 4, 11, 16, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(1), LocalDateTime.of(2021, 4, 19, 5, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(2), LocalDateTime.of(2021, 4, 25, 1, 36));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(5), LocalDateTime.of(2021, 5, 19, 21, 36));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(3), LocalDateTime.of(2021, 4, 30, 10, 24));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(1), LocalDateTime.of(2021, 6, 3, 9, 16));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(0), LocalDateTime.of(2021, 4, 19, 21, 53));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(3), LocalDateTime.of(2021, 5, 11, 10, 10));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(4), LocalDateTime.of(2021, 5, 29, 13, 23));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(0), LocalDateTime.of(2021, 5, 29, 8, 29));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(4), LocalDateTime.of(2021, 4, 24, 4, 16));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(5), LocalDateTime.of(2021, 6, 16, 7, 57));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(5), LocalDateTime.of(2021, 4, 12, 8, 5));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(7), LocalDateTime.of(2021, 5, 12, 12, 39));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(5), LocalDateTime.of(2021, 5, 25, 20, 2));
        covidTrack.addRegistro(covidTrack.getUsuario(6), covidTrack.getAntena(2), LocalDateTime.of(2021, 4, 12, 23, 54));

        covidTrack.addRegistro(covidTrack.getUsuario(7), 3.63506, -71.28338, LocalDateTime.of(2021, 5, 25, 14, 16));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 4.57167, -79.25914, LocalDateTime.of(2021, 5, 16, 21, 53));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 7.13559, -71.74775, LocalDateTime.of(2021, 4, 27, 16, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 7.24817, -73.70415, LocalDateTime.of(2021, 4, 27, 11, 53));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 2.52531, -74.59673, LocalDateTime.of(2021, 6, 15, 17, 9));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 9.61493, -75.69560, LocalDateTime.of(2021, 6, 2, 3, 32));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 7.24004, -72.25012, LocalDateTime.of(2021, 6, 27, 11, 57));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 7.90166, -69.12503, LocalDateTime.of(2021, 6, 30, 12, 12));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 4.89702, -72.58095, LocalDateTime.of(2021, 5, 13, 4, 56));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 10.30251, -72.14973, LocalDateTime.of(2021, 5, 16, 3, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 1.18025, -68.20526, LocalDateTime.of(2021, 6, 8, 5, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 7.11163, -70.69255, LocalDateTime.of(2021, 5, 21, 12, 54));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 6.14819, -74.18476, LocalDateTime.of(2021, 6, 16, 5, 38));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 5.48430, -74.53053, LocalDateTime.of(2021, 4, 15, 7, 1));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 5.53379, -74.05515, LocalDateTime.of(2021, 6, 24, 20, 11));
        covidTrack.addRegistro(covidTrack.getUsuario(7), -0.12148, -74.60725, LocalDateTime.of(2021, 4, 5, 4, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 1.20637, -74.09996, LocalDateTime.of(2021, 5, 19, 1, 47));
        covidTrack.addRegistro(covidTrack.getUsuario(7), 6.40226, -68.82695, LocalDateTime.of(2021, 6, 3, 20, 45));

        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(2), LocalDateTime.of(2021, 4, 26, 22, 25));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(7), LocalDateTime.of(2021, 5, 9, 15, 46));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(3), LocalDateTime.of(2021, 6, 16, 15, 1));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(2), LocalDateTime.of(2021, 6, 21, 8, 56));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(7), LocalDateTime.of(2021, 4, 16, 7, 23));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(8), LocalDateTime.of(2021, 5, 2, 3, 4));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(1), LocalDateTime.of(2021, 4, 11, 9, 0));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(1), LocalDateTime.of(2021, 6, 19, 5, 57));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(8), LocalDateTime.of(2021, 6, 29, 17, 56));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(2), LocalDateTime.of(2021, 5, 15, 4, 49));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(7), LocalDateTime.of(2021, 6, 7, 9, 24));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(4), LocalDateTime.of(2021, 4, 18, 19, 26));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(3), LocalDateTime.of(2021, 6, 26, 7, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(4), LocalDateTime.of(2021, 5, 7, 23, 30));
        covidTrack.addRegistro(covidTrack.getUsuario(8), covidTrack.getAntena(3), LocalDateTime.of(2021, 6, 25, 13, 36));

        covidTrack.addRegistro(covidTrack.getUsuario(9), 6.05513, -75.01531, LocalDateTime.of(2021, 6, 18, 5, 59));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 2.92861, -71.02186, LocalDateTime.of(2021, 5, 17, 18, 49));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 4.42977, -73.94191, LocalDateTime.of(2021, 4, 15, 11, 16));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 4.01642, -75.67394, LocalDateTime.of(2021, 4, 1, 2, 43));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 2.76232, -73.66637, LocalDateTime.of(2021, 6, 13, 13, 46));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 5.42863, -73.74401, LocalDateTime.of(2021, 6, 16, 1, 51));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 7.22139, -68.55729, LocalDateTime.of(2021, 5, 25, 12, 17));
        covidTrack.addRegistro(covidTrack.getUsuario(9), -2.77348, -76.02526, LocalDateTime.of(2021, 5, 5, 21, 28));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 4.59789, -74.74002, LocalDateTime.of(2021, 6, 5, 21, 50));
        covidTrack.addRegistro(covidTrack.getUsuario(9), 5.06380, -72.30624, LocalDateTime.of(2021, 4, 12, 5, 7));

        for (int place = 0; place < 30; place++) {
            for (int month = 4; month < 7; month++) {
                for (int day = 1; day < 31; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        covidTrack.getPuntoInteres(place).updateUsuariosCercanos(covidTrack.getUsuarios(), LocalDateTime.of(2021, month, day, hour, 0));
                    }
                }
            }
        }

        covidTrack.showResumenPuntosIntesesPorMes();
    }
    
}

/**
------------- Resultados -------------

Punto de Interes 01
- Nombre: Hospital General
- Tipo: Hospital
- Latitud: -0.76046
- Longitud: -73.03121
- Cantidad de Usuarios Cercanos:
  - Abril: 9
  - Mayo: 13
  - Junio: 8
- Cantidad de Usuarios Infectados:
  - Abril: 2
  - Mayo: 7
  - Junio: 3

Punto de Interes 02
- Nombre: Supermercado La 14
- Tipo: Supermercado
- Latitud: 2.9018
- Longitud: -69.57626
- Cantidad de Usuarios Cercanos:
  - Abril: 33
  - Mayo: 36
  - Junio: 30
- Cantidad de Usuarios Infectados:
  - Abril: 10
  - Mayo: 14
  - Junio: 13

Punto de Interes 03
- Nombre: Parque Central
- Tipo: Parque
- Latitud: 4.17299
- Longitud: -72.48633
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 47
  - Junio: 49
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 20
  - Junio: 22

Punto de Interes 04
- Nombre: Plaza de Bolivar
- Tipo: Plaza
- Latitud: 3.766
- Longitud: -74.39112
- Cantidad de Usuarios Cercanos:
  - Abril: 51
  - Mayo: 60
  - Junio: 59
- Cantidad de Usuarios Infectados:
  - Abril: 17
  - Mayo: 26
  - Junio: 28

Punto de Interes 05
- Nombre: Universidad Nacional
- Tipo: Universidad
- Latitud: 5.88846
- Longitud: -71.24567
- Cantidad de Usuarios Cercanos:
  - Abril: 45
  - Mayo: 53
  - Junio: 55
- Cantidad de Usuarios Infectados:
  - Abril: 15
  - Mayo: 21
  - Junio: 26

Punto de Interes 06
- Nombre: Colegio San Jose
- Tipo: Colegio
- Latitud: 5.18724
- Longitud: -67.55423
- Cantidad de Usuarios Cercanos:
  - Abril: 36
  - Mayo: 47
  - Junio: 42
- Cantidad de Usuarios Infectados:
  - Abril: 9
  - Mayo: 19
  - Junio: 21

Punto de Interes 07
- Nombre: Gimnasio Bodytech
- Tipo: Gimnasio
- Latitud: -2.59267
- Longitud: -69.3257
- Cantidad de Usuarios Cercanos:
  - Abril: 16
  - Mayo: 20
  - Junio: 19
- Cantidad de Usuarios Infectados:
  - Abril: 3
  - Mayo: 8
  - Junio: 9

Punto de Interes 08
- Nombre: Hospital de Ninos
- Tipo: Hospital
- Latitud: 2.26081
- Longitud: -71.92285
- Cantidad de Usuarios Cercanos:
  - Abril: 33
  - Mayo: 32
  - Junio: 29
- Cantidad de Usuarios Infectados:
  - Abril: 13
  - Mayo: 15
  - Junio: 12

Punto de Interes 09
- Nombre: Supermercado Exito
- Tipo: Supermercado
- Latitud: 5.15413
- Longitud: -73.52426
- Cantidad de Usuarios Cercanos:
  - Abril: 51
  - Mayo: 60
  - Junio: 59
- Cantidad de Usuarios Infectados:
  - Abril: 17
  - Mayo: 26
  - Junio: 28

Punto de Interes 10
- Nombre: Parque de la 93
- Tipo: Parque
- Latitud: -0.57312
- Longitud: -70.14875
- Cantidad de Usuarios Cercanos:
  - Abril: 28
  - Mayo: 30
  - Junio: 27
- Cantidad de Usuarios Infectados:
  - Abril: 9
  - Mayo: 13
  - Junio: 13

Punto de Interes 11
- Nombre: Plaza de Mercado
- Tipo: Plaza
- Latitud: 5.84928
- Longitud: -68.64965
- Cantidad de Usuarios Cercanos:
  - Abril: 48
  - Mayo: 57
  - Junio: 62
- Cantidad de Usuarios Infectados:
  - Abril: 15
  - Mayo: 23
  - Junio: 30

Punto de Interes 12
- Nombre: Universidad de los Andes
- Tipo: Universidad
- Latitud: 3.70326
- Longitud: -68.85402
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 48
  - Junio: 45
- Cantidad de Usuarios Infectados:
  - Abril: 12
  - Mayo: 18
  - Junio: 21

Punto de Interes 13
- Nombre: Colegio La Salle
- Tipo: Colegio
- Latitud: 3.06067
- Longitud: -71.2257
- Cantidad de Usuarios Cercanos:
  - Abril: 42
  - Mayo: 45
  - Junio: 45
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 19
  - Junio: 19

Punto de Interes 14
- Nombre: Gimnasio Fitness
- Tipo: Gimnasio
- Latitud: -1.39175
- Longitud: -73.99685
- Cantidad de Usuarios Cercanos:
  - Abril: 36
  - Mayo: 35
  - Junio: 42
- Cantidad de Usuarios Infectados:
  - Abril: 13
  - Mayo: 15
  - Junio: 20

Punto de Interes 15
- Nombre: Hospital Militar
- Tipo: Hospital
- Latitud: 5.60862
- Longitud: -74.4847
- Cantidad de Usuarios Cercanos:
  - Abril: 48
  - Mayo: 57
  - Junio: 54
- Cantidad de Usuarios Infectados:
  - Abril: 17
  - Mayo: 25
  - Junio: 27

Punto de Interes 16
- Nombre: Supermercado Olimpica
- Tipo: Supermercado
- Latitud: 3.89686
- Longitud: -73.61412
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 41
  - Junio: 37
- Cantidad de Usuarios Infectados:
  - Abril: 15
  - Mayo: 20
  - Junio: 18

Punto de Interes 17
- Nombre: Parque Simon Bolivar
- Tipo: Parque
- Latitud: 6.90367
- Longitud: -72.31956
- Cantidad de Usuarios Cercanos:
  - Abril: 45
  - Mayo: 55
  - Junio: 56
- Cantidad de Usuarios Infectados:
  - Abril: 15
  - Mayo: 22
  - Junio: 26

Punto de Interes 18
- Nombre: Plaza de la Paz
- Tipo: Plaza
- Latitud: 8.78956
- Longitud: -69.32985
- Cantidad de Usuarios Cercanos:
  - Abril: 44
  - Mayo: 54
  - Junio: 54
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 22
  - Junio: 25

Punto de Interes 19
- Nombre: Universidad Javeriana
- Tipo: Universidad
- Latitud: 1.7731
- Longitud: -68.85677
- Cantidad de Usuarios Cercanos:
  - Abril: 45
  - Mayo: 49
  - Junio: 50
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 19
  - Junio: 24

Punto de Interes 20
- Nombre: Colegio San Ignacio
- Tipo: Colegio
- Latitud: 0.99569
- Longitud: -74.52784
- Cantidad de Usuarios Cercanos:
  - Abril: 31
  - Mayo: 29
  - Junio: 31
- Cantidad de Usuarios Infectados:
  - Abril: 12
  - Mayo: 13
  - Junio: 14

Punto de Interes 21
- Nombre: Gimnasio Smart Fit
- Tipo: Gimnasio
- Latitud: 5.11231
- Longitud: -68.7669
- Cantidad de Usuarios Cercanos:
  - Abril: 48
  - Mayo: 57
  - Junio: 62
- Cantidad de Usuarios Infectados:
  - Abril: 15
  - Mayo: 23
  - Junio: 30

Punto de Interes 22
- Nombre: Hospital San Vicente
- Tipo: Hospital
- Latitud: 6.05759
- Longitud: -71.52093
- Cantidad de Usuarios Cercanos:
  - Abril: 44
  - Mayo: 53
  - Junio: 55
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 21
  - Junio: 26

Punto de Interes 23
- Nombre: Supermercado Carulla
- Tipo: Supermercado
- Latitud: 4.28601
- Longitud: -75.5297
- Cantidad de Usuarios Cercanos:
  - Abril: 31
  - Mayo: 29
  - Junio: 28
- Cantidad de Usuarios Infectados:
  - Abril: 12
  - Mayo: 16
  - Junio: 14

Punto de Interes 24
- Nombre: Parque El Chico
- Tipo: Parque
- Latitud: 5.14184
- Longitud: -70.21582
- Cantidad de Usuarios Cercanos:
  - Abril: 43
  - Mayo: 49
  - Junio: 49
- Cantidad de Usuarios Infectados:
  - Abril: 13
  - Mayo: 19
  - Junio: 23

Punto de Interes 25
- Nombre: Plaza de las Americas
- Tipo: Plaza
- Latitud: 5.42242
- Longitud: -72.86485
- Cantidad de Usuarios Cercanos:
  - Abril: 51
  - Mayo: 59
  - Junio: 58
- Cantidad de Usuarios Infectados:
  - Abril: 17
  - Mayo: 25
  - Junio: 27

Punto de Interes 26
- Nombre: Universidad del Rosario
- Tipo: Universidad
- Latitud: 3.25442
- Longitud: -67.09067
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 50
  - Junio: 49
- Cantidad de Usuarios Infectados:
  - Abril: 12
  - Mayo: 19
  - Junio: 23

Punto de Interes 27
- Nombre: Colegio San Antonio
- Tipo: Colegio
- Latitud: -1.80436
- Longitud: -75.78212
- Cantidad de Usuarios Cercanos:
  - Abril: 17
  - Mayo: 12
  - Junio: 9
- Cantidad de Usuarios Infectados:
  - Abril: 8
  - Mayo: 8
  - Junio: 4

Punto de Interes 28
- Nombre: Gimnasio Golds Gym
- Tipo: Gimnasio
- Latitud: 4.091
- Longitud: -68.68702
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 48
  - Junio: 46
- Cantidad de Usuarios Infectados:
  - Abril: 12
  - Mayo: 18
  - Junio: 22

Punto de Interes 29
- Nombre: Hospital de la Mujer
- Tipo: Hospital
- Latitud: 4.58393
- Longitud: -68.91197
- Cantidad de Usuarios Cercanos:
  - Abril: 33
  - Mayo: 43
  - Junio: 37
- Cantidad de Usuarios Infectados:
  - Abril: 8
  - Mayo: 17
  - Junio: 17

Punto de Interes 30
- Nombre: Supermercado D1
- Tipo: Supermercado
- Latitud: 6.79185
- Longitud: -73.76729
- Cantidad de Usuarios Cercanos:
  - Abril: 41
  - Mayo: 53
  - Junio: 52
- Cantidad de Usuarios Infectados:
  - Abril: 14
  - Mayo: 22
  - Junio: 26

*/