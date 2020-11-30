package neu.madcourse.walkwithme.NotiPet;

import neu.madcourse.walkwithme.R;

public class PetHappyState extends PetState {


    @Override
    public PetState music() {
        cHappiness = Math.min(100, cHappiness + ONE_MUSIC);
        return this;
    }

    @Override
    public PetState tip() {
        cKnowledge = Math.min(100, cKnowledge + ONE_NEWS);
        PetState newState = new PetTipState();
        return newState;
    }

    @Override
    public PetState earnMeat() {
        return null;
    }

    @Override
    public PetState timeout() {
        return new PetSleepState();
    }

    @Override
    public int getImage() {
        return R.drawable.music;
    }
}
