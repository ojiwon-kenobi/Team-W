package com.example.jiwon.wimbledone.data.fixtures;

/**
 * Created by Yoon on 4/20/18.
 * Source: https://github.com/stfalcon-studio/ChatKit
 */

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.UUID;

abstract class FixturesData {

    static SecureRandom rnd = new SecureRandom();

    static ArrayList<String> avatars = new ArrayList<String>() {
        {
            add("http://i.imgur.com/pv1tBmT.png");
            add("http://i.imgur.com/R3Jm1CL.png");
            add("http://i.imgur.com/ROz4Jgh.png");
            add("http://i.imgur.com/Qn9UesZ.png");
        }
    };

    static final ArrayList<String> groupChatImages = new ArrayList<String>() {
        {
            add("https://puu.sh/AevyE/ed25e159ec.png");
            add("https://puu.sh/AevxN/49e435c1a0.png");
            add("https://puu.sh/Aevx4/d56dcd3e0a.png");
        }
    };

    static final ArrayList<String> groupChatTitles = new ArrayList<String>() {
        {
            add("Bradley Lee");
            add("Francis Cooper");
            add("Julie Rogers");
        }
    };

    static final ArrayList<String> names = new ArrayList<String>() {
        {
            add("Samuel Reynolds");
            add("Kyle Hardman");
            add("Zoe Milton");
            add("Angel Ogden");
            add("Zoe Milton");
            add("Angelina Mackenzie");
            add("Kyle Oswald");
            add("Abigail Stevenson");
            add("Julia Goldman");
            add("Jordan Gill");
            add("Michelle Macey");
        }
    };

    static final ArrayList<String> messages = new ArrayList<String>() {
        {
            add("Hello!");
            add("This is my phone number - +1 (234) 567-89-01");
            add("I can't wait to play!");
            add("How have your matches been so far?");
            add("Your stats are off the charts, wow!");
            add("Aren't you glad we were matched? This app is great.");
            add("By the way, I won't go easy on you. :-)");
            add("Can't wait 'til we play.");
            add("How'd you get so good?");
            add("How long do you think it'll take me to get to your level?");
            add("Just let me know when.");
            add("Looking forward to it!");
            add("Awesome.");
        }
    };

    static final ArrayList<String> images = new ArrayList<String>() {
        {
            add("https://puu.sh/AevEp/2f3d1c336d.png");
            add("https://puu.sh/AevFm/64f9ead3b6.png");
        }
    };

    static String getRandomId() {
        return Long.toString(UUID.randomUUID().getLeastSignificantBits());
    }

    static String getRandomAvatar() {
        return avatars.get(rnd.nextInt(avatars.size()));
    }

    static String getRandomGroupChatImage() {
        return groupChatImages.get(rnd.nextInt(groupChatImages.size()));
    }

    static String getRandomGroupChatTitle() {
        return groupChatTitles.get(rnd.nextInt(groupChatTitles.size()));
    }

    static String getRandomName() {
        return names.get(rnd.nextInt(names.size()));
    }

    static String getRandomMessage() {
        return messages.get(rnd.nextInt(messages.size()));
    }

    static String getRandomImage() {
        return images.get(rnd.nextInt(images.size()));
    }

    static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }
}
