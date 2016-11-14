package exceptions;

import commands.Command;
import discord.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.handle.obj.IMessage;

/**
 * Created by steve on 14/11/2016.
 */
public class NotEnoughRightsException implements Exception {

    private final static Logger LOG = LoggerFactory.getLogger(NotEnoughRightsException.class);

    @Override
    public void throwException(IMessage message, Command command) {
        Message.send(message.getChannel(), "Vous ne possédez pas les droits suffisants pour cette action : il faut être " +
                "modérateur ou administrateur pour cela.");
    }
}