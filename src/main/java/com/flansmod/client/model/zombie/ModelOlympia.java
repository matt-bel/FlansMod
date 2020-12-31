package com.flansmod.client.model.zombie;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelOlympia extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelOlympia() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 45
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 46
		gunModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 47
		gunModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 48
		gunModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 49
		gunModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 50
		gunModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 51
		gunModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 53
		gunModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 54
		gunModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 56
		gunModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 57
		gunModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 58
		gunModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 60
		gunModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 63
		gunModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 90
		gunModel[23] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 91
		gunModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 92
		gunModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 93
		gunModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 63
		gunModel[27] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 65
		gunModel[28] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 66
		gunModel[29] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		gunModel[33] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[0].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[1].setRotationPoint(-12F, -4F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(-12F, -3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(0F, -5.5F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 6
		gunModel[4].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Box 12
		gunModel[5].setRotationPoint(1.5F, -3.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 14
		gunModel[6].setRotationPoint(1.5F, -2.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 15
		gunModel[7].setRotationPoint(3.5F, -3.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[8].setRotationPoint(-1F, -4.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -2F, 0F, 0.2F, -2F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 46
		gunModel[9].setRotationPoint(-2F, -2.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 47
		gunModel[10].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.25F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F); // Box 48
		gunModel[11].setRotationPoint(-3F, -3.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[12].setRotationPoint(-4F, -4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 50
		gunModel[13].setRotationPoint(-1F, -4.5F, 0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[14].setRotationPoint(-1F, -4.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 53
		gunModel[15].setRotationPoint(-12F, -4F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, 0F, 0F, -0.8F); // Box 54
		gunModel[16].setRotationPoint(-12F, -3F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[17].setRotationPoint(-4F, -4F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[18].setRotationPoint(-12F, -4F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[19].setRotationPoint(-12F, -3F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 60
		gunModel[20].setRotationPoint(0.5F, -3.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.2F); // Box 63
		gunModel[21].setRotationPoint(-1F, -3.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[22].setRotationPoint(0F, -4.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 91
		gunModel[23].setRotationPoint(0F, -4.5F, 0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 92
		gunModel[24].setRotationPoint(-4F, -4F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 93
		gunModel[25].setRotationPoint(-2F, -1.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[26].setRotationPoint(-11F, -3F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[27].setRotationPoint(-11F, -3F, -1F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.75F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 66
		gunModel[28].setRotationPoint(-11F, -3F, 0F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 31
		gunModel[29].setRotationPoint(5F, -4.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 32
		gunModel[30].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, 0F, -0.8F, 0.2F); // Box 33
		gunModel[31].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 34
		gunModel[32].setRotationPoint(5F, -5.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -1.5F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F); // Box 40
		gunModel[33].setRotationPoint(2F, -6.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 41
		ammoModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 42

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -0.125F, -0.125F, -12F, -0.125F, -0.125F, -12F, -0.125F, -5.125F, 0F, -0.125F, -5.125F, 0F, -5.125F, -0.125F, -12F, -5.125F, -0.125F, -12F, -5.125F, -5.125F, 0F, -5.125F, -5.125F); // Box 41
		ammoModel[0].setRotationPoint(5F, -5.5F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -0.125F, -0.125F, -12F, -0.125F, -0.125F, -12F, -0.125F, -5.125F, 0F, -0.125F, -5.125F, 0F, -5.125F, -0.125F, -12F, -5.125F, -0.125F, -12F, -5.125F, -5.125F, 0F, -5.125F, -5.125F); // Box 42
		ammoModel[1].setRotationPoint(5F, -4.5F, -0.5F);


		breakActionModel = new ModelRendererTurbo[7];
		breakActionModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 29
		breakActionModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 30
		breakActionModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		breakActionModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		breakActionModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 38
		breakActionModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 39
		breakActionModel[6] = new ModelRendererTurbo(this, 102, 8, textureX, textureY); // Box 42

		breakActionModel[0].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, -0.05F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F); // Box 29
		breakActionModel[0].setRotationPoint(5F, -5.5F, -0.5F);

		breakActionModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F, -0.05F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.05F, -0.1F, -0.1F); // Box 30
		breakActionModel[1].setRotationPoint(5F, -4.5F, -0.5F);

		breakActionModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 35
		breakActionModel[2].setRotationPoint(9F, -4.5F, -0.5F);

		breakActionModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 36
		breakActionModel[3].setRotationPoint(9F, -3.5F, -0.5F);

		breakActionModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 38
		breakActionModel[4].setRotationPoint(9F, -5.8F, -0.5F);

		breakActionModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 39
		breakActionModel[5].setRotationPoint(8F, -4.5F, -0.5F);

		breakActionModel[6].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.25F, 0.5F, -0.9F, -0.25F, 0.5F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 42
		breakActionModel[6].setRotationPoint(5.5F, -5.5F, -0.5F);



		animationType = EnumAnimationType.BREAK_ACTION;


		numBulletsInReloadAnimation = 6F;


		pumpDelayAfterReload = 123;


		pumpDelay = 9;


		pumpTime = 3;


		barrelBreakPoint = new Vector3f(9 /16F, 3F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}