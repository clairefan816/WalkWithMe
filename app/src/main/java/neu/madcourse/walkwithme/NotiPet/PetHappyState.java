package neu.madcourse.walkwithme.NotiPet;

import neu.madcourse.walkwithme.R;

public class PetHappyState extends PetState {

    public PetHappyState() {
        isPlayingMusic = true;
    }

    @Override
    public PetState music() {
        if (cHealth != 0){
            cHappiness = Math.min(100, cHappiness + ONE_MUSIC);
            PetState newState = new PetHappyState();
            return newState;
        } else {
            System.out.println("Feed Me first!");
            return new PetStarveState();
        }
    }

    @Override
    public PetState tip() {
        if (cHealth != 0){
            setcKnowledge(Math.min(100, cKnowledge + ONE_NEWS));
            PetState newState = new PetTipState();
            return newState;
        } else {
            System.out.println("Feed Me first!");
            return new PetStarveState();
        }
    }

    @Override
    public PetState timeout() {
        isPlayingMusic = false;
        return new PetSleepState();
    }

    @Override
    public int getImage() {
        return R.drawable.music;
    }
}
