/* Zplet, a Z-Machine interpreter in Java */
/* Copyright 1996,2001 Matthew T. Russotto */
/* As of 23 February 2001, this code is open source and covered by the */
/* Artistic License, found within this package */

package russotto.zplet;

/**
 * A contoller interface to abstract the OS Controller dependent functions. For
 * example, the way you play sound in an Application is different from how you
 * play them in an Applet. One way is to use an if/then block in the ZMachine
 * to play sound depending which controller you use. This interface provides
 * abstraction by allowing the ZMachine to have only knowlage of this interface
 * and the Application or Applet implements this and will take care of the
 * actuall work.
 *
 * @author Devin Weaver &lt;ktohg@tritarget.com&gt;
 */
public interface Controller
{

/**
 * Plays a sound. An id of 1 will play a low beep ans an id of 2 will play a
 * high beep. Any other id will coraspond to a custom sound id. The mapping of
 * sound file to sound id is the implementor's responsability. Although the
 * defacto standard is to place your sounds in a directory called SOUNDS in
 * which is your files with the following name convention: [game_name][XX].snd
 * Where game_name is the first 6 characters of the current games file name and
 * XX is a two digit number ranging from 03 - 99.
 *
 * @param snd_id The sound id number to be play.
 * @return True if sound is now playing. False if the sound could not be played.
 */
public boolean
playSound( int snd_id );

}
