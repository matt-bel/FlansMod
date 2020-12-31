package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelAK47 extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelAK47() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[48];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 32
		gunModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 34
		gunModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		gunModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		gunModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		gunModel[15] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		gunModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 41
		gunModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 42
		gunModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		gunModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 45
		gunModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 46
		gunModel[21] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 47
		gunModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 48
		gunModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 49
		gunModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 50
		gunModel[25] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 51
		gunModel[26] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 52
		gunModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 53
		gunModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 54
		gunModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 60
		gunModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 61
		gunModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 62
		gunModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 63
		gunModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 64
		gunModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 65
		gunModel[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 67
		gunModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 68
		gunModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		gunModel[38] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 48
		gunModel[39] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		gunModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 50
		gunModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 51
		gunModel[42] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 52
		gunModel[43] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 53
		gunModel[44] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 54
		gunModel[45] = new ModelRendererTurbo(this, 272, 4, textureX, textureY); // Box 55
		gunModel[46] = new ModelRendererTurbo(this, 265, 4, textureX, textureY); // Box 56
		gunModel[47] = new ModelRendererTurbo(this, 248, 20, textureX, textureY); // Box 71

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -3.25F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(1F, -5.25F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 3
		gunModel[2].setRotationPoint(3F, -3.25F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 4
		gunModel[3].setRotationPoint(4F, -3.25F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 5
		gunModel[4].setRotationPoint(2F, -2.25F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.275F, -0.6F, 0F, -0.275F, -0.6F, 0F, -0.275F, 0F, 0F, -0.275F, 0F, -0.25F, -0.275F, -0.6F, -0.25F, -0.275F, -0.6F, -0.25F, -0.275F, 0F, -0.25F, -0.275F); // Box 6
		gunModel[5].setRotationPoint(5F, -2.25F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0.5F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 9
		gunModel[6].setRotationPoint(1F, -5.25F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 10
		gunModel[7].setRotationPoint(1F, -6.25F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F); // Box 11
		gunModel[8].setRotationPoint(1F, -5.25F, 0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 29
		gunModel[9].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F); // Box 32
		gunModel[10].setRotationPoint(6F, -6.25F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 34
		gunModel[11].setRotationPoint(6F, -6.25F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		gunModel[12].setRotationPoint(5F, -4.25F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, -0.325F, -0.25F, 0.25F, -0.325F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, -0.325F, -0.25F, -1F, -0.325F, -0.25F, -1F, 0F, 0F, -1F, 0F); // Box 38
		gunModel[13].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 39
		gunModel[14].setRotationPoint(8.5F, -4.25F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[15].setRotationPoint(9.5F, -4.25F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 41
		gunModel[16].setRotationPoint(10.5F, -4.25F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 42
		gunModel[17].setRotationPoint(14F, -4.75F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 44
		gunModel[18].setRotationPoint(8.5F, -4.25F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 45
		gunModel[19].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.575F, 0.25F, 0.25F, -0.575F, 0.25F, 0.25F, -0.575F, 0.25F, 0F, -0.575F, 0.25F, 0F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 46
		gunModel[20].setRotationPoint(10.5F, -5.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, -0.575F, 0.25F, 0F, -0.575F, 0.25F, 0F, -0.575F, 0.25F, 0.25F, -0.575F, 0.25F, 0.25F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F); // Box 47
		gunModel[21].setRotationPoint(12.5F, -5.25F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F); // Box 48
		gunModel[22].setRotationPoint(11.5F, -5.25F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F, 0F, -0.625F, 0.25F); // Box 49
		gunModel[23].setRotationPoint(10.5F, -5.25F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 50
		gunModel[24].setRotationPoint(10.5F, -6.25F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, -0.75F); // Box 51
		gunModel[25].setRotationPoint(13.5F, -5.25F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F); // Box 52
		gunModel[26].setRotationPoint(9.5F, -5.25F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 53
		gunModel[27].setRotationPoint(14F, -5.55F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 54
		gunModel[28].setRotationPoint(16F, -5.55F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 60
		gunModel[29].setRotationPoint(2.5F, -4.75F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0.4F, -0.6F, -0.2F, 0.4F, -0.2F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.2F, 0.4F, -0.2F, -0.2F); // Box 61
		gunModel[30].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F); // Box 62
		gunModel[31].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.2F, 0.4F, -0.4F, -0.2F); // Box 63
		gunModel[32].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.125F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, 0.125F, -0.8F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 64
		gunModel[33].setRotationPoint(8.5F, -6.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.65F, -0.925F, -0.6F, -0.65F, -0.925F, -0.6F, -0.125F, 0.125F, -0.6F, -0.125F, 0.125F, -0.2F, -0.65F, -0.925F, -0.2F, -0.65F, -0.925F, -0.2F, -0.125F, 0.125F, -0.2F, -0.125F); // Box 65
		gunModel[34].setRotationPoint(8.5F, -6.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.125F, -0.925F, -0.6F, -0.125F, -0.925F, -0.6F, -0.65F, 0.125F, -0.6F, -0.65F, 0.125F, -0.2F, -0.125F, -0.925F, -0.2F, -0.125F, -0.925F, -0.2F, -0.65F, 0.125F, -0.2F, -0.65F); // Box 67
		gunModel[35].setRotationPoint(8.5F, -6.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.125F, -0.5F, -0.6F, -0.125F, -0.5F, -0.6F, -0.65F, 0F, -0.6F, -0.65F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.65F, 0F, -0.2F, -0.65F); // Box 68
		gunModel[36].setRotationPoint(19.5F, -6.4F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F); // Box 69
		gunModel[37].setRotationPoint(19F, -5.75F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.65F, -0.5F, -0.6F, -0.65F, -0.5F, -0.6F, -0.125F, 0F, -0.6F, -0.125F, 0F, -0.2F, -0.65F, -0.5F, -0.2F, -0.65F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 48
		gunModel[38].setRotationPoint(19.5F, -6.4F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.65F, -0.5F, -0.3F, -0.65F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.4F, -0.65F, -0.5F, -0.4F, -0.65F, -0.5F, -0.4F, -0.125F, 0F, -0.4F, -0.125F); // Box 49
		gunModel[39].setRotationPoint(19.5F, -6.4F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.3F, -0.65F, 0F, -0.3F, -0.65F, 0F, -0.4F, -0.125F, -0.5F, -0.4F, -0.125F, -0.5F, -0.4F, -0.65F, 0F, -0.4F, -0.65F); // Box 50
		gunModel[40].setRotationPoint(19.5F, -6.4F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F); // Box 51
		gunModel[41].setRotationPoint(19.4F, -6.5F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		gunModel[42].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 53
		gunModel[43].setRotationPoint(7.5F, -4.25F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.875F, 0.25F, -0.5F, -0.875F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0.25F, 0F, -0.875F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[44].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.7F, 0F, 0.25F, -0.7F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.7F, 0F, -0.5F, -0.7F); // Box 55
		gunModel[45].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.325F, -0.25F, 0F, -0.325F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.325F, -0.25F, -0.5F, -0.325F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		gunModel[46].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.8F, -0.125F, -4.05F, -0.8F, -0.125F, -4.05F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, -4.05F, 0F, -0.125F, -4.05F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 71
		gunModel[47].setRotationPoint(1.5F, -6.5F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		defaultStockModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 56
		defaultStockModel[2] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 57
		defaultStockModel[3] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Box 54

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -1F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, 0.5F, 0F); // Box 1
		defaultStockModel[0].setRotationPoint(-7F, -5.25F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F); // Box 56
		defaultStockModel[1].setRotationPoint(-2F, -5.25F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.2F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.35F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.35F, 0F); // Box 57
		defaultStockModel[2].setRotationPoint(-3F, -5.25F, -0.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 54
		defaultStockModel[3].setRotationPoint(-8F, -4.25F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 26
		ammoModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 27
		ammoModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 28

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.75F, 0F, -0.125F, 0.75F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 26
		ammoModel[0].setRotationPoint(5.5F, -3.25F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0.5F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0.5F, 0F, -0.125F, -1.875F, -0.25F, -0.125F, 1.375F, -1.375F, -0.125F, 1.375F, -1.375F, -0.125F, -1.875F, -0.25F, -0.125F); // Box 27
		ammoModel[1].setRotationPoint(6.5F, -1.25F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 28
		ammoModel[2].setRotationPoint(5.5F, -4.25F, -0.5F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 30
		slideModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 31
		slideModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 36

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		slideModel[0].setRotationPoint(5.5F, -5.25F, -1.3F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.875F, 0F, -0.8F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 31
		slideModel[1].setRotationPoint(4.5F, -6.25F, -0.3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.225F, -0.25F, 0F, -0.225F, -0.25F, 0F, -0.225F, 0F, -0.75F, -0.225F, 0F, -0.75F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, 0F, -0.75F, -0.45F, 0F); // Box 36
		slideModel[2].setRotationPoint(7.5F, -5.2F, -1.5F);



		barrelAttachPoint = new Vector3f(5F /16F, -0.5F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
