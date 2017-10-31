package nataliacodes.sheep;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by Waveoss on 10/31/2017.
 */

public class SoundPlayer {

    private static SoundPool soundPool;
    private static int sheep;
    private static int coin;

    public SoundPlayer(Context context) {

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        sheep = soundPool.load(context, R.raw.sheepsound, 1);
        coin = soundPool.load(context, R.raw.coin, 2);
    }

    public void playSheep() {
        soundPool.play(sheep, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCoin() {
        soundPool.play(coin, 1.0f, 1.0f, 1, 0, 1.0f);
    }

}
