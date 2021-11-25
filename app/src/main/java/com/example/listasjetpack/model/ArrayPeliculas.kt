package com.example.listasjetpack.model

import androidx.compose.runtime.mutableStateListOf

class ArrayPeliculas {
    companion object {
        var listaPeliculas = mutableStateListOf<Pelicula>(
        //Array peliculas
        Pelicula("Capitana Marvel","https://image.tmdb.org/t/p/w500/d3p5JuwN7dG0TvrN5h4ZY4tMOEX.jpg",
            "https://image.tmdb.org/t/p/w500/w2PMyoyLU22YvrGK3smVM9fW1jj.jpg",
            "La historia sigue a Carol Danvers mientras se convierte en uno de los héroes más poderosos del universo, cuando la Tierra se encuentra atrapada en medio de una guerra galáctica entre dos razas alienígenas. Situada en los años 90, 'Capitana Marvel' es una historia nueva de un período de tiempo nunca antes visto en la historia del Universo Cinematográfico de Marvel.",
            6.9F,"2019-03-06"),
            Pelicula("Iron Man 3","https://image.tmdb.org/t/p/w500/upQED5VfXknJDEQsc4p2w9EEaGs.jpg",
            "https://image.tmdb.org/t/p/w500/tKa1gmGKAUVYnflYcadipeL3d9h.jpg",
            "El descarado y brillante empresario Tony Stark se enfrentará a un enemigo cuyo poder no conoce límites. Cuando Stark comprende que su enemigo ha destruido su universo personal, se embarca en una angustiosa búsqueda para encontrar a los responsables. Este viaje pondrá a prueba su entereza una y otra vez. Acorralado, Stark tendrá que sobrevivir por sus propios medios, confiando en su ingenio y su instinto para proteger a las personas que quiere.",
            6.9F,"2013-04-18"),
            Pelicula("Thor","https://image.tmdb.org/t/p/w500/qFAVW4XJaxhj7PcpiUI5hhO9bOX.jpg",
            "https://image.tmdb.org/t/p/w500/239KWoUxiKT0bR3UsmsoX7GsDf9.jpg",
            "Thor es un arrogante y codicioso guerrero cuya imprudencia desata una antigua guerra. Por ese motivo, su padre Odín lo castiga desterrándolo a la Tierra para que viva entre los hombres y descubra así el verdadero sentido de la humildad. Cuando el villano más peligroso de su mundo envía a la Tierra a las fuerzas más oscuras de Asgard, Thor se dará cuenta de lo que realmente hace falta para ser un verdadero héroe.",
                6.8F,"2011-04-21"),
             Pelicula("Captain America: Civil War","https://image.tmdb.org/t/p/w500/g6UTwUVFYWI8VPWo5GylnbZVhin.jpg",
            "https://image.tmdb.org/t/p/w500/7FWlcZq3r6525LWOcvO9kNWurN1.jpg",
            "\"Capitán América: Civil War” continúa la historia de “Avengers: Age of Ultron”, con Steve Rogers liderando un nuevo equipo de Vengadores en su esfuerzo por proteger a la humanidad. Tras otro incidente internacional relacionado con los Vengadores que ocasiona daños colaterales, la presión política fuerza a crear un sistema de registro y un cuerpo gubernamental para determinar cuándo se requiere los servicios del equipo. El nuevo status quo divide a los Vengadores mientras intentan salvar al mundo de un nuevo y perverso villano.",
            7.4F,"2016-04-27"),
            Pelicula("Soy leyenda","https://image.tmdb.org/t/p/w500/pO1SrJgf5BumqcIRkYviSGIFdmX.jpg",
            "https://image.tmdb.org/t/p/w500//lhVVIWKR13khBvjFz8XyZ2GM0JS.jpg",
            "Año 2012. Robert Neville es el último hombre vivo que hay sobre la Tierra, pero no está solo. Los demás seres humanos se han convertido en unos mutantes nocturnos llamados \"Darkseekers\" y todos ansían beber su sangre. Durante el día vive en estado de alerta, como un cazador, y busca a los muertos vivientes mientras duermen; pero durante la noche debe esconderse de ellos y esperar el amanecer. Esta pesadilla empezó hace tres años: Neville era un brillante científico, pero no pudo impedir la expansión de un terrible virus creado por el hombre. Él ha sobrevivido porque es inmune al virus; todos los días envía mensajes por radio con la esperanza de que haya otros supervivientes, pero es inútil. Lo único que puede hacer es buscar una fórmula que le permita utilizar su sangre inmune para devolverles a los hombres su naturaleza. Pero está en inferioridad de condiciones y el tiempo se acaba.",
            7.2F,"2007-12-12"),
            Pelicula("Fast & Furious 9","https://image.tmdb.org/t/p/w500/vdRgVlkkw1eHOdgYKXbzj0qSLB0.jpg",
            "https://image.tmdb.org/t/p/w500/gGTCDNEvwG848u34Op1nZNALLUr.jpg",
            "Dom Toretto lleva una vida tranquila con Letty y su hijo, el pequeño Brian, pero saben que el peligro siempre acecha. Esta vez, esa amenaza obligará a Dom a enfrentarse a los pecados de su pasado si quiere salvar a quienes más quiere. El equipo se vuelve a reunir para impedir un complot a escala mundial, liderado por uno de los asesinos más peligrosos y mejor conductor a los que se han enfrentado; un hombre que además es el hermano desaparecido de Dom, Jakob. Novena entrega de la famosa franquicia.",
            7.04F,"2021-05-19"))
    }
}