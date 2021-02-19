package com.letthebattlebegun.cards

abstract class EffectCard(source : Int , cardEffect : String) : Card(source) {
    abstract  fun playEffect()
}