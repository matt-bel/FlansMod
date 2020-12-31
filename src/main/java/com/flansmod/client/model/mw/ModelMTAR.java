package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelMTAR extends ModelGun
{
	int textureX = 512;
	int textureY = 32;

	public ModelMTAR() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[42];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 23
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 25
		gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 26
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		gunModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 31
		gunModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		gunModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 33
		gunModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		gunModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 36
		gunModel[16] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 37
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 38
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 39
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		gunModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 44
		gunModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 46
		gunModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 47
		gunModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 48
		gunModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 49
		gunModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 59
		gunModel[26] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 59
		gunModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 60
		gunModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 61
		gunModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 62
		gunModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 63
		gunModel[31] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 64
		gunModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 65
		gunModel[33] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 66
		gunModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 67
		gunModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 68
		gunModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 69
		gunModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 71
		gunModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 72
		gunModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 73
		gunModel[40] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 74
		gunModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(2F, -3.2F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-5.5F, -5.2F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(3F, -4.2F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(5F, -3.2F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(5F, -3.2F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[5].setRotationPoint(-0.5F, -5.2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[6].setRotationPoint(-5.5F, -6.2F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 26
		gunModel[7].setRotationPoint(-5.5F, -6.2F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		gunModel[8].setRotationPoint(-5.5F, -6.2F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[9].setRotationPoint(-5.5F, -4.2F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.125F, 0F, -0.5F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 29
		gunModel[10].setRotationPoint(-4.5F, -5.2F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0.025F, 0F, -0.5F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.025F, 0F, 0F, 0.125F); // Box 31
		gunModel[11].setRotationPoint(-3.5F, -5.2F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, 0.025F, 0F, -0.5F, 0.025F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.025F, 0F, 0F, 0.025F); // Box 32
		gunModel[12].setRotationPoint(-2.5F, -5.2F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		gunModel[13].setRotationPoint(-0.5F, -4.2F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		gunModel[14].setRotationPoint(-2.5F, -3.2F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[15].setRotationPoint(-3.5F, -3.2F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[16].setRotationPoint(-5.5F, -3.2F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 38
		gunModel[17].setRotationPoint(2F, -4.2F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		gunModel[18].setRotationPoint(0F, -4.2F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		gunModel[19].setRotationPoint(-4.5F, -5.2F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F, -0.25F, -0.25F, 0.125F); // Box 44
		gunModel[20].setRotationPoint(-5F, -3.7F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.65F, 0F, -0.5F, -0.95F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
		gunModel[21].setRotationPoint(-6.5F, -6.2F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.95F, 0F, 0F, -0.65F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 47
		gunModel[22].setRotationPoint(-6.5F, -6.2F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 48
		gunModel[23].setRotationPoint(-6.5F, -6.2F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 49
		gunModel[24].setRotationPoint(-6.5F, -5.2F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 59
		gunModel[25].setRotationPoint(10.5F, -4.7F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 59
		gunModel[26].setRotationPoint(4F, -2.2F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.05F, -0.6F, 0F, -0.05F, -0.6F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.5F, -0.05F, -0.6F, 0.1F, -0.05F, -0.6F, 0.1F, -0.05F, 0F, 0.5F, -0.05F); // Box 60
		gunModel[27].setRotationPoint(7F, -3.2F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F); // Box 61
		gunModel[28].setRotationPoint(-0.5F, -4.2F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, -0.8F, 0F, -11.05F, -0.8F, 0F, -11.05F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -11.05F, 0F, 0F, -11.05F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[29].setRotationPoint(0F, -6.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 63
		gunModel[30].setRotationPoint(8F, -5.2F, 0F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 64
		gunModel[31].setRotationPoint(8F, -4.2F, 0F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[32].setRotationPoint(8F, -4.2F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[33].setRotationPoint(8F, -5.2F, -1F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
		gunModel[34].setRotationPoint(8F, -5.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 68
		gunModel[35].setRotationPoint(10F, -5.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, -3.05F, 0F, 0F, -3.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -3.05F, -0.8F, 0F, -3.05F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 69
		gunModel[36].setRotationPoint(8F, -3.38F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 71
		gunModel[37].setRotationPoint(0F, -5.2F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[38].setRotationPoint(0F, -5.2F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.4F, -0.125F, 0F, -0.4F, -0.125F); // Box 73
		gunModel[39].setRotationPoint(4F, -5.2F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.4F, 0.125F, 0F, -0.4F, 0.125F, 0F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F); // Box 74
		gunModel[40].setRotationPoint(7F, -5.2F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 75
		gunModel[41].setRotationPoint(0F, -5.2F, -0.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		ammoModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 42

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 41
		ammoModel[0].setRotationPoint(-3F, -3.2F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0.25F, -0.25F, -0.125F, 0.25F, -0.25F, -0.125F, -0.5F, 0F, -0.125F); // Box 42
		ammoModel[1].setRotationPoint(-2F, -1.2F, -0.5F);



		barrelAttachPoint = new Vector3f(-3.5F /16F, -0.5F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(4F /16F, 0F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(10 /16F, 3F /16F, 0F /16F);


		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}