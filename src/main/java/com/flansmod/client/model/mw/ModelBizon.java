package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBizon extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelBizon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[47];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 32
		gunModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 34
		gunModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 35
		gunModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 42
		gunModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 60
		gunModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 61
		gunModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 62
		gunModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 63
		gunModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 69
		gunModel[19] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 52
		gunModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 53
		gunModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 54
		gunModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 57
		gunModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 37
		gunModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 40
		gunModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 41
		gunModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 42
		gunModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 43
		gunModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 44
		gunModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 45
		gunModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 47
		gunModel[31] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 57
		gunModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 60
		gunModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 64
		gunModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 65
		gunModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 66
		gunModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 67
		gunModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 68
		gunModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		gunModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 70
		gunModel[40] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 71
		gunModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 72
		gunModel[42] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 74
		gunModel[43] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 75
		gunModel[44] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 76
		gunModel[45] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 89
		gunModel[46] = new ModelRendererTurbo(this, 248, 20, textureX, textureY); // Box 71

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

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 29
		gunModel[9].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, 0F, -0.325F, -0.5F, 0F, -0.325F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F); // Box 32
		gunModel[10].setRotationPoint(6F, -6.25F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.75F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 34
		gunModel[11].setRotationPoint(6F, -6.25F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0.25F, -0.8F, 0.5F, 0.25F, -0.8F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		gunModel[12].setRotationPoint(5F, -4.25F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 42
		gunModel[13].setRotationPoint(9F, -4.75F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 60
		gunModel[14].setRotationPoint(2.5F, -4.75F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.6F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.2F, 0.4F, -0.6F, -0.2F, 0.4F, -0.2F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, -0.2F, 0.4F, -0.2F, -0.2F); // Box 61
		gunModel[15].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.2F, 0.4F, -0.8F, -0.2F); // Box 62
		gunModel[16].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.4F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.2F, 0.4F, -0.4F, -0.2F); // Box 63
		gunModel[17].setRotationPoint(3.5F, -4.75F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, -0.5F, -0.15F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F); // Box 69
		gunModel[18].setRotationPoint(14F, -5.75F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		gunModel[19].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[20].setRotationPoint(7.5F, -5.25F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[21].setRotationPoint(5.5F, -4.25F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[22].setRotationPoint(7.5F, -6.25F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[23].setRotationPoint(7.5F, -5.25F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		gunModel[24].setRotationPoint(9.5F, -4.25F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, 0F, -0.25F, -0.875F); // Box 41
		gunModel[25].setRotationPoint(9.5F, -4.25F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, 0F, 0F, -0.875F); // Box 42
		gunModel[26].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[27].setRotationPoint(8.5F, -5.25F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.8F); // Box 44
		gunModel[28].setRotationPoint(8.5F, -5.25F, 0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[29].setRotationPoint(8.5F, -5.25F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[30].setRotationPoint(9.5F, -5.25F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 57
		gunModel[31].setRotationPoint(9.5F, -5.25F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.875F, 0F, -0.5F, -0.875F); // Box 60
		gunModel[32].setRotationPoint(9.5F, -5.25F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F); // Box 64
		gunModel[33].setRotationPoint(10.5F, -5.25F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F); // Box 65
		gunModel[34].setRotationPoint(11.5F, -5.25F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F); // Box 66
		gunModel[35].setRotationPoint(13F, -5.25F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
		gunModel[36].setRotationPoint(9.5F, -5.25F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 68
		gunModel[37].setRotationPoint(10.5F, -5.25F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.875F, 0F, -0.5F, -0.875F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 69
		gunModel[38].setRotationPoint(11.5F, -5.25F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 70
		gunModel[39].setRotationPoint(13F, -5.25F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.125F, -0.05F, -0.75F, -0.125F, -0.05F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[40].setRotationPoint(13.5F, -6.25F, -0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[41].setRotationPoint(13.5F, -5.25F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.875F, 0F, -0.25F, -0.875F); // Box 74
		gunModel[42].setRotationPoint(12.5F, -4.25F, -0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 75
		gunModel[43].setRotationPoint(12.5F, -4.25F, -0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.875F, -0.5F, -0.25F, -0.875F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 76
		gunModel[44].setRotationPoint(12.5F, -4.25F, -0.5F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 89
		gunModel[45].setRotationPoint(13.5F, -4.25F, -0.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.8F, -0.125F, -4.05F, -0.8F, -0.125F, -4.05F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, 0F, -0.125F, -4.05F, 0F, -0.125F, -4.05F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 71
		gunModel[46].setRotationPoint(1.5F, -6.5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 64
		defaultScopeModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 65
		defaultScopeModel[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 67
		defaultScopeModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 68
		defaultScopeModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 48
		defaultScopeModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 49
		defaultScopeModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 50
		defaultScopeModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 51
		defaultScopeModel[8] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 70

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.125F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, 0.125F, -0.8F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 64
		defaultScopeModel[0].setRotationPoint(8.5F, -6.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.65F, -0.925F, -0.6F, -0.65F, -0.925F, -0.6F, -0.125F, 0.125F, -0.6F, -0.125F, 0.125F, -0.2F, -0.65F, -0.925F, -0.2F, -0.65F, -0.925F, -0.2F, -0.125F, 0.125F, -0.2F, -0.125F); // Box 65
		defaultScopeModel[1].setRotationPoint(8.5F, -6.5F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.125F, -0.6F, -0.125F, -0.925F, -0.6F, -0.125F, -0.925F, -0.6F, -0.65F, 0.125F, -0.6F, -0.65F, 0.125F, -0.2F, -0.125F, -0.925F, -0.2F, -0.125F, -0.925F, -0.2F, -0.65F, 0.125F, -0.2F, -0.65F); // Box 67
		defaultScopeModel[2].setRotationPoint(8.5F, -6.5F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.125F, -0.5F, -0.6F, -0.125F, -0.5F, -0.6F, -0.65F, 0F, -0.6F, -0.65F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.65F, 0F, -0.2F, -0.65F); // Box 68
		defaultScopeModel[3].setRotationPoint(14.5F, -6.4F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.65F, -0.5F, -0.6F, -0.65F, -0.5F, -0.6F, -0.125F, 0F, -0.6F, -0.125F, 0F, -0.2F, -0.65F, -0.5F, -0.2F, -0.65F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 48
		defaultScopeModel[4].setRotationPoint(14.5F, -6.4F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, -0.65F, -0.5F, -0.3F, -0.65F, -0.5F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.4F, -0.65F, -0.5F, -0.4F, -0.65F, -0.5F, -0.4F, -0.125F, 0F, -0.4F, -0.125F); // Box 49
		defaultScopeModel[5].setRotationPoint(14.5F, -6.4F, -0.5F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.3F, -0.65F, 0F, -0.3F, -0.65F, 0F, -0.4F, -0.125F, -0.5F, -0.4F, -0.125F, -0.5F, -0.4F, -0.65F, 0F, -0.4F, -0.65F); // Box 50
		defaultScopeModel[6].setRotationPoint(14.5F, -6.4F, -0.5F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.6F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F); // Box 51
		defaultScopeModel[7].setRotationPoint(14.4F, -6.5F, -0.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.125F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, 0.125F, -0.8F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 70
		defaultScopeModel[8].setRotationPoint(8.5F, -6.5F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[3];
		defaultStockModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 77
		defaultStockModel[1] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 78
		defaultStockModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 79

		defaultStockModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0.125F, -0.125F); // Box 77
		defaultStockModel[0].setRotationPoint(-7F, -4.75F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 78
		defaultStockModel[1].setRotationPoint(-6F, -4.75F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -2.5F, -0.125F, 0F, -0.3F, -0.125F, 0F, -0.3F, -0.125F, 0F, -2.5F, -0.125F, 0F, 0F, -0.125F, 0F, -2.2F, -0.125F, 0F, -2.2F, -0.125F, 0F, 0F, -0.125F); // Box 79
		defaultStockModel[2].setRotationPoint(-6F, -4.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[12];
		ammoModel[0] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 80
		ammoModel[1] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 81
		ammoModel[2] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		ammoModel[3] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 83
		ammoModel[4] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 85
		ammoModel[5] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 86
		ammoModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 87
		ammoModel[7] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 88
		ammoModel[8] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 90
		ammoModel[9] = new ModelRendererTurbo(this, 235, 17, textureX, textureY); // Box 71
		ammoModel[10] = new ModelRendererTurbo(this, 235, 17, textureX, textureY); // Box 72
		ammoModel[11] = new ModelRendererTurbo(this, 235, 17, textureX, textureY); // Box 73

		ammoModel[0].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		ammoModel[0].setRotationPoint(5.5F, -3.25F, 0F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		ammoModel[1].setRotationPoint(5.5F, -3.25F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		ammoModel[2].setRotationPoint(5.5F, -2.25F, -1F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 83
		ammoModel[3].setRotationPoint(5.5F, -2.25F, 0F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		ammoModel[4].setRotationPoint(13.5F, -3.25F, -1F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 86
		ammoModel[5].setRotationPoint(13.5F, -3.25F, 0F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F); // Box 87
		ammoModel[6].setRotationPoint(13.5F, -2.25F, 0F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F); // Box 88
		ammoModel[7].setRotationPoint(13.5F, -2.25F, -1F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.05F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.05F, 0F, -0.125F, -0.05F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, -0.05F, 0.25F, -0.125F); // Box 90
		ammoModel[8].setRotationPoint(5.5F, -4.25F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, -0.65F, -0.25F, -0.375F, -0.65F, -0.25F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -0.25F, 0.125F, -0.65F, -0.25F, 0.125F, -0.65F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F); // Box 71
		ammoModel[9].setRotationPoint(13.5F, -4.25F, -1F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.65F, -0.25F, 0.125F, -0.65F); // Box 72
		ammoModel[10].setRotationPoint(13.5F, -4.25F, 0F);

		ammoModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, -0.25F, -0.25F, -0.375F, -0.25F, -0.25F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.65F, -0.25F, 0.125F, -0.65F); // Box 73
		ammoModel[11].setRotationPoint(13.5F, -4.25F, 0F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 30
		slideModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 31
		slideModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 36

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 30
		slideModel[0].setRotationPoint(5.5F, -5.25F, -1.3F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.875F, 0F, -0.8F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Box 31
		slideModel[1].setRotationPoint(4.5F, -6.25F, -0.3F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.225F, -0.25F, 0F, -0.225F, -0.25F, 0F, -0.225F, 0F, -0.75F, -0.225F, 0F, -0.75F, -0.45F, -0.25F, 0F, -0.45F, -0.25F, 0F, -0.45F, 0F, -0.75F, -0.45F, 0F); // Box 36
		slideModel[2].setRotationPoint(6.5F, -5.2F, -1.5F);



		barrelAttachPoint = new Vector3f(0F /16F, -0.5F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}