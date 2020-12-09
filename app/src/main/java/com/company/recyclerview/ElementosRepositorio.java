package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Roadhog", "Roadhog emplea su insigne garfio para atraer a los enemigos y hacerlos trizas con los disparos de su chatarrera. Es lo bastante robusto como para aguantar cantidades ingentes de daño y puede recuperar la salud con un inhalador portátil."));
        elementos.add(new Elemento("Reinhardt", "Ataviado de una armadura potenciada y equipado con su martillo, Reinhardt realiza embestidas propulsadas por el campo de batalla y defiende a su escuadrón con un enorme campo protector."));
        elementos.add(new Elemento("Brigitte", "La especialidad de Brigitte es la armadura. Puede lanzar kits de reparación a sus compañeros o sanar de forma automática a sus aliados al dañar a los enemigos con su mangual. Puede golpear con el mangual en un arco amplio que le permite alcanzar a varios objetivos o puede ejecutar un Lanzamiento de mangual, que aturde a un enemigo a distancia. En el combate, Escudo barrera le proporciona defensa personal mientras ataca a los enemigos con Carga con escudo. Su habilidad definitiva, Formación, proporciona un aumento sustancial de velocidad a Brigitte y una armadura duradera a sus aliados cercanos."));
        elementos.add(new Elemento("Lúcio", "En el campo de batalla, el sofisticado amplificador sónico de Lúcio golpea a los enemigos con proyectiles y repele a los rivales con descargas de sonido. Sus canciones pueden curar o aumentar la velocidad de movimiento de su equipo, y puede cambiar de canción cuando quiera."));
        elementos.add(new Elemento("Reaper","Sus escopetas infernales, la fantasmal habilidad de volverse inmune al daño y el poder de desplazarse por las tinieblas hacen de Reaper uno de los seres más letales de la Tierra."));
        elementos.add(new Elemento("Soldado: 76","Provisto de armamento de alta tecnología, como un rifle de pulsos experimental capaz de lanzar espirales de potentes cohetes hélice, Soldado: 76 cuenta con la velocidad y la experiencia de un guerrero veterano."));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
