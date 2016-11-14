package controler;

import data.Guild;
import data.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.UserBanEvent;

/**
 * Created by steve on 14/07/2016.
 */
public class UserBanListener {

    private final static Logger LOG = LoggerFactory.getLogger(UserBanListener.class);

    public UserBanListener(){
        super();
    }

        @EventSubscriber
        public void onReady(UserBanEvent event) {
            User.getUsers().get(event.getGuild().getID()).get(event.getUser().getID()).removeToDatabase();
        }
}