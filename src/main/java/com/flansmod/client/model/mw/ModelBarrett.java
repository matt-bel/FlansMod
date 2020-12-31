package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelBarrett extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelBarrett() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[45];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		gunModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		gunModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		gunModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		gunModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 48
		gunModel[23] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 49
		gunModel[24] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 51
		gunModel[25] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 47
		gunModel[26] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 55
		gunModel[27] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 56
		gunModel[28] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 57
		gunModel[29] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 58
		gunModel[30] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 59
		gunModel[31] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 60
		gunModel[32] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 61
		gunModel[33] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 62
		gunModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 63
		gunModel[35] = new ModelRendererTurbo(this, 93, 27, textureX, textureY); // Box 53
		gunModel[36] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 54
		gunModel[37] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 55
		gunModel[38] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 56
		gunModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 57
		gunModel[40] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 58
		gunModel[41] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 59
		gunModel[42] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 60
		gunModel[43] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 61
		gunModel[44] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 62

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -2.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, -3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(3F, -2.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(2F, -1.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(5F, -2.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F); // Box 6
		gunModel[5].setRotationPoint(6F, -3.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 8
		gunModel[6].setRotationPoint(-9F, -5.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[7].setRotationPoint(23F, -5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10
		gunModel[8].setRotationPoint(-9F, -5.5F, 0.6F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 11
		gunModel[9].setRotationPoint(-9F, -4.5F, 0.6F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[10].setRotationPoint(-9F, -5.5F, -1.6F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[11].setRotationPoint(-9F, -4.5F, -1.6F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, -0.05F, -0.8F, -0.05F, -20.05F, -0.8F, -0.05F, -20.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F, -0.05F, 0F, -0.05F, -20.05F, 0F, -0.05F, -20.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 14
		gunModel[12].setRotationPoint(3F, -6.5F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 69
		gunModel[13].setRotationPoint(20F, -3.5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 68
		gunModel[14].setRotationPoint(15F, -3.5F, 0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
		gunModel[15].setRotationPoint(15F, -3.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 21
		gunModel[16].setRotationPoint(13F, -3.5F, -0.5F);

		gunModel[17].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 23
		gunModel[17].setRotationPoint(-10F, -5.5F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 24
		gunModel[18].setRotationPoint(-10F, -5.5F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[19].setRotationPoint(-10F, -5.5F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[20].setRotationPoint(-9F, -1.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 27
		gunModel[21].setRotationPoint(-5F, -3.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 48
		gunModel[22].setRotationPoint(12F, -5.5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 49
		gunModel[23].setRotationPoint(3F, -4.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		gunModel[24].setRotationPoint(12F, -5.5F, -1.6F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.775F, 0F, -0.75F, -0.775F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 47
		gunModel[25].setRotationPoint(6F, -5.5F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 55
		gunModel[26].setRotationPoint(21F, -5.5F, -1.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 56
		gunModel[27].setRotationPoint(20F, -5.5F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 57
		gunModel[28].setRotationPoint(19F, -5.5F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 58
		gunModel[29].setRotationPoint(18F, -5.5F, -1.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 59
		gunModel[30].setRotationPoint(17F, -5.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 60
		gunModel[31].setRotationPoint(16F, -5.5F, -1.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 61
		gunModel[32].setRotationPoint(15F, -5.5F, -1.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 62
		gunModel[33].setRotationPoint(14F, -5.5F, -1.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 63
		gunModel[34].setRotationPoint(13F, -5.5F, -1.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Box 53
		gunModel[35].setRotationPoint(6F, -5.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 54
		gunModel[36].setRotationPoint(13F, -5.5F, 0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 55
		gunModel[37].setRotationPoint(14F, -5.5F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 56
		gunModel[38].setRotationPoint(15F, -5.5F, 0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 57
		gunModel[39].setRotationPoint(16F, -5.5F, 0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 58
		gunModel[40].setRotationPoint(17F, -5.5F, 0.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 59
		gunModel[41].setRotationPoint(18F, -5.5F, 0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 60
		gunModel[42].setRotationPoint(19F, -5.5F, 0.5F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 61
		gunModel[43].setRotationPoint(20F, -5.5F, 0.5F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, -0.7F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F); // Box 62
		gunModel[44].setRotationPoint(21F, -5.5F, 0.5F);


		defaultBarrelModel = new ModelRendererTurbo[5];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 39
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 43
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 44
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 45
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 46

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.5F); // Box 39
		defaultBarrelModel[0].setRotationPoint(38F, -5F, 0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -1F, 0.1F, -0.5F); // Box 43
		defaultBarrelModel[1].setRotationPoint(36F, -5F, -1.5F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 44
		defaultBarrelModel[2].setRotationPoint(38F, -5F, -0.5F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 45
		defaultBarrelModel[3].setRotationPoint(38F, -5F, -1.5F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -1F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, -1F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, -5F, 0.1F, -0.5F, 0F, 0.1F, -0.5F); // Box 46
		defaultBarrelModel[4].setRotationPoint(36F, -5F, -0.5F);


		defaultScopeModel = new ModelRendererTurbo[9];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 64
		defaultScopeModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 67
		defaultScopeModel[2] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 68
		defaultScopeModel[3] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 69
		defaultScopeModel[4] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 70
		defaultScopeModel[5] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 72
		defaultScopeModel[6] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 73
		defaultScopeModel[7] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 35
		defaultScopeModel[8] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 38

		defaultScopeModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		defaultScopeModel[0].setRotationPoint(2F, -7.5F, -0.5F);

		defaultScopeModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 67
		defaultScopeModel[1].setRotationPoint(4F, -7.75F, -0.5F);

		defaultScopeModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 68
		defaultScopeModel[2].setRotationPoint(8F, -7.75F, -0.5F);

		defaultScopeModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, 0F, 0F, 0F); // Box 69
		defaultScopeModel[3].setRotationPoint(9F, -7.5F, -0.5F);

		defaultScopeModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 70
		defaultScopeModel[4].setRotationPoint(4F, -7.5F, -0.5F);

		defaultScopeModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 72
		defaultScopeModel[5].setRotationPoint(6F, -7.5F, -1.4F);

		defaultScopeModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, -0.7F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 73
		defaultScopeModel[6].setRotationPoint(6F, -8.4F, -0.5F);

		defaultScopeModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.75F, 0.125F, 0.125F, 0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0.75F, 0.125F, 0.125F); // Box 35
		defaultScopeModel[7].setRotationPoint(10F, -7.5F, -0.5F);

		defaultScopeModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		defaultScopeModel[8].setRotationPoint(4F, -6.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5

		ammoModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F); // Box 5
		ammoModel[0].setRotationPoint(6F, -3.5F, -0.5F);


		slideModel = new ModelRendererTurbo[3];
		slideModel[0] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 50
		slideModel[1] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 53
		slideModel[2] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 54

		slideModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		slideModel[0].setRotationPoint(6F, -5.5F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 53
		slideModel[1].setRotationPoint(11.5F, -5.5F, -1.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 54
		slideModel[2].setRotationPoint(11.25F, -5.5F, -1.5F);



		barrelAttachPoint = new Vector3f(23.1F /16F, -0.25F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(6F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.BOTTOM_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}