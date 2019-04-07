package players;

import java.util.ArrayList;
import java.util.List;

public class TeamsArray {

        public static Team[] findAllTeams() {

            return new Team[]{
                        new Team("Green Bay", "Packers", "NFC", "North"),
                        new Team("Atlanta", "Falcons", "NFC", "South"),
                        new Team("Seattle", "Seahawks", "NFC", "West"),
                        new Team("Dallas", "Cowboys", "NFC", "East"),
                        new Team("Pittsburgh", "Steelers", "AFC", "North"),
                        new Team("Houston", "Texans", "AFC", "South"),
                        new Team("New England", "Patriots", "AFC", "East"),
                        new Team("Las Vegas", "Raiders", "AFC", "West")
            };
        }

    }


