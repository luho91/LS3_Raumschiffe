/**
 * Type of catering contract for guests on the ship.
 *
 * @see Gast
 */
public enum Verpflegungsart {
    /**
     * Eat breakfast, lunch and dinner.
     */
    VOLLPENSION,

    /**
     * Eat breakfast and lunch or breakfast and a rich dinner.
     */
    HALBPENSION,

    /**
     * Eat breakfast only.
     */
    FRUEHSTUECK,

    /**
     * Eat whatever they want whenever they want.
     */
    ALLINCLUSIVE,

    /**
     * Eat nothing.
     */
    OHNE
}
