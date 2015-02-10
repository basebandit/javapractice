/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.doubledispatch;

/**
 * double dispatch is a special case of multiple dispatch(multiple dispatch uses
 * all of its arguments to determine which method of that name to invoke) in
 * which the runtime types of two objects are involved in the call. Although
 * Java supports single dispatch, it doesn't support double dispatch directly.
 * But we can simulate it.
 *
 * @author mars
 */
public class DDDemo {

    /**
     * The final four lines in the main() method along with the void
     * collideWith(Asteroid inAsteroid) methods in SpaceShip and
     * ApolloSpacecraft demonstrate and simulate double dispatch.
     *
     */
    public static void main(String[] args) {
        Asteroid theAsteroid = new Asteroid();
        SpaceShip theSpaceShip = new SpaceShip();
        ApolloSpacecraft theApolloSpacecraft = new ApolloSpacecraft();
        theAsteroid.collideWith(theSpaceShip);
        theAsteroid.collideWith(theApolloSpacecraft);
        System.out.println();

        ExplodingAsteroid theExplodingAsteroid = new ExplodingAsteroid();
        theExplodingAsteroid.collideWith(theSpaceShip);
        theExplodingAsteroid.collideWith(theApolloSpacecraft);
        System.out.println();

        Asteroid theAsteroidReference = theExplodingAsteroid;
        theAsteroidReference.collideWith(theSpaceShip);
        theAsteroidReference.collideWith(theApolloSpacecraft);
        System.out.println();

        SpaceShip theSpaceShipReference = theApolloSpacecraft;
        theAsteroid.collideWith(theSpaceShipReference);
        theAsteroidReference.collideWith(theSpaceShipReference);
        System.out.println();

        //Double dispatch - one and two
        //Single dispatch - third and fourth line
        theSpaceShipReference = theApolloSpacecraft;
        theAsteroidReference = theExplodingAsteroid;
        theSpaceShipReference.collideWith(theAsteroid);
        theSpaceShipReference.collideWith(theAsteroidReference);
    }
}

class SpaceShip {

    void collideWith(Asteroid inAsteroid) {
        inAsteroid.collideWith(this);
    }
}

class ApolloSpacecraft extends SpaceShip {

    @Override
    void collideWith(Asteroid inAsteroid) {
        inAsteroid.collideWith(this);
    }
}

class Asteroid {

    void collideWith(SpaceShip s) {
        System.out.println("Asteroid hit a Spaceship");
    }

    void collideWith(ApolloSpacecraft as) {
        System.out.println("Asteroid hit an ApolloSpacecraft");
    }
}

class ExplodingAsteroid extends Asteroid {

    @Override
    void collideWith(SpaceShip s) {
        System.out.println("Exploding Asteroid hit a SpaceShip");
    }

    @Override
    void collideWith(ApolloSpacecraft as) {
        System.out.println("Exploding Asteroid hit an ApolloSpacecraft");
    }
}
