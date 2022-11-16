package yama.toku.headupsampleapp

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        // Create channel for heads up
        val name = getString(R.string.channel_name)
        val descriptionText = getString(R.string.channel_description)
        val importance = NotificationManager.IMPORTANCE_HIGH // ←ここ必須
        val mChannel = NotificationChannel("CHANNEL_ID_HEAD_UP", name, importance)
        mChannel.description = descriptionText
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(mChannel)

    }
}