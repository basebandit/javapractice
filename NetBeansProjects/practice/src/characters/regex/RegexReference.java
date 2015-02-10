/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters.regex;

/**
 *
 * @author mars
 */
public class RegexReference {
    /**
     * Expression                   Description
     * [wb](ad|eed)                Matches wad, weed, bad, and beed.
     * (pro|anti)-OO?              Matches pro-OOP and anti-OOP.
     * (AZ|CA|CO)[0–9]{4}          Matches AZxxxx, CAxxxx, and COxxxx, where x is a single digit.
     * 
     * Expression   StringRepresentation      Description                                      
         \d               "\\d"               A single digit. Equivalent to [0–9]. 
         \D               "\\D"               A single nondigit. Equivalent to [^0–9].
         \s               "\\s"               A white space character, such as space,tab, new line, etc.
         \S               "\\S"               A non-white-space character.                                    
         \w               "\\w"               A word character. Equivalent to [a–zA–Z_0–9].
         \W               "\\W"               A nonword character.
         \b               "\\b"               A word boundary (such as a white space and punctuation mark).               
         \B               "\\B"               A nonword boundary.
     */
}
