
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package practice.ConditionalFlowControls;

/**
 *
 * @author mars
 */
public interface Dealable {
    void Deal(int cards);

    void StartGame(Dealable deck, String game);
}

/*private void StartGame(Dealable deck,String game){
     if(game.equalsIgnoreCase("Poker")){
      deck.Deal(5);
     }else if(game.equalsIgnoreCase("Hearts")){
      deck.Deal(13);
     }else if(game.equalsIgnoreCase("Gin")){
      deck.Deal(10);
     }
    }*/


//~ Formatted by Jindent --- http://www.jindent.com
